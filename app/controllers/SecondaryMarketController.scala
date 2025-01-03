package controllers

import controllers.actions._
import exceptions.BaseException
import models.blockchain.Split
import models.master._
import models.masterTransaction.SecondaryMarketSellTransaction
import models.{blockchain, master, masterTransaction}
import org.bitcoinj.core.ECKey
import play.api.Logger
import play.api.cache.Cached
import play.api.i18n.I18nSupport
import play.api.mvc._
import queries.blockchain.GetABCIInfo
import utilities.MicroNumber
import views.secondaryMarket.companion.{Buy, Cancel, CreateSecondaryMarket}

import javax.inject.{Inject, Singleton}
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

@Singleton
class SecondaryMarketController @Inject()(
                                           messagesControllerComponents: MessagesControllerComponents,
                                           cached: Cached,
                                           withoutLoginActionAsync: WithoutLoginActionAsync,
                                           withLoginAction: WithLoginAction,
                                           withLoginActionAsync: WithLoginActionAsync,
                                           withoutLoginAction: WithoutLoginAction,
                                           blockchainBalances: blockchain.Balances,
                                           blockchainSplits: blockchain.Splits,
                                           masterAccounts: master.Accounts,
                                           masterKeys: master.Keys,
                                           masterWishLists: master.WishLists,
                                           masterNFTs: master.NFTs,
                                           masterSecondaryMarkets: master.SecondaryMarkets,
                                           masterNFTOwners: master.NFTOwners,
                                           secondaryMarketSellTxs: masterTransaction.SecondaryMarketSellTransactions,
                                           secondaryMarketBuyTxs: masterTransaction.SecondaryMarketBuyTransactions,
                                           masterTransactionCancelOrderTransactions: masterTransaction.CancelOrderTransactions,
                                           utilitiesNotification: utilities.Notification,
                                           utilitiesOperations: utilities.Operations,
                                           getAbciInfo: GetABCIInfo,
                                         )(implicit executionContext: ExecutionContext) extends AbstractController(messagesControllerComponents) with I18nSupport {

  implicit val logger: Logger = Logger(this.getClass)

  implicit val module: String = constants.Module.SECONDARY_MARKET_CONTROLLER

  implicit val callbackOnSessionTimeout: Call = routes.SecondaryMarketController.view()

  def view(): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        Future(Ok(views.html.secondaryMarket.view()))
    }
  }

  def marketNFTs(): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        Future(Ok(views.html.secondaryMarket.marketNFTs()))
    }
  }

  def nftsPerPage(pageNumber: Int): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit optionalLoginState =>
      implicit request =>
        val secondaryMarkets = masterSecondaryMarkets.Service.getByPageNumber(pageNumber).map(_.sortBy(_.price))

        def nfts(nftIds: Seq[String]) = masterNFTs.Service.getByIds(nftIds)

        def getOwnersAndLiked(nftIds: Seq[String]) = if (optionalLoginState.isDefined && nftIds.nonEmpty) {
          val nftOwners = masterNFTOwners.Service.getByOwnerAndIds(ownerId = optionalLoginState.get.username, nftIDs = nftIds)
          val nftLiked = masterWishLists.Service.getByNFTIds(accountId = optionalLoginState.get.username, nftIDs = nftIds)

          for {
            nftOwners <- nftOwners
            nftLiked <- nftLiked
          } yield (nftOwners, nftLiked)
        } else Future(Seq(), Seq())

        (for {
          secondaryMarkets <- secondaryMarkets
          nfts <- nfts(secondaryMarkets.map(_.nftId))
          (nftOwners, likedNFTs) <- getOwnersAndLiked(secondaryMarkets.map(_.nftId))
        } yield Ok(views.html.base.commonNFTsPerPage(nfts, optionalLoginState.map(_.username), nftOwners, likedNFTs, Seq(), pageNumber, secondaryMarkets, showCreatorSection = false))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def createForm(nftId: String): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      val nftOwner = masterNFTOwners.Service.tryGet(nftId = nftId, ownerId = loginState.username)
      (for {
        nftOwner <- nftOwner
      } yield Ok(views.html.secondaryMarket.createSecondaryMarket(nftId = nftId, totalOwned = nftOwner.quantity))
        ).recover {
        case baseException: BaseException => BadRequest(baseException.failure.message)
      }
  }

  def create(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      CreateSecondaryMarket.form.bindFromRequest().fold(
        formWithErrors => {
          val nftID = formWithErrors.data.getOrElse(constants.FormField.NFT_ID.name, "")
          val nftOwner = masterNFTOwners.Service.tryGet(nftId = nftID, ownerId = loginState.username)
          (for {
            nftOwner <- nftOwner
          } yield BadRequest(views.html.secondaryMarket.createSecondaryMarket(formWithErrors, nftID, totalOwned = nftOwner.quantity))
            ).recover {
            case baseException: BaseException => BadRequest(baseException.failure.message)
          }
        },
        createData => {
          val nft = masterNFTs.Service.tryGet(createData.nftId)
          val nftOwner = masterNFTOwners.Service.tryGet(nftId = createData.nftId, ownerId = loginState.username)
          val activeKey = masterKeys.Service.tryGetActive(loginState.username)

          def addToSecondaryMarket(nft: NFT, nftOwner: NFTOwner, activeKey: Key) = {
            val errors = Seq(
              if (!nft.isMinted.getOrElse(false)) Option(constants.Response.NFT_NOT_MINTED) else None,
              if (nftOwner.ownerId != loginState.username) Option(constants.Response.NOT_NFT_OWNER) else None,
              if (createData.sellQuantity > nftOwner.quantity) Option(constants.Response.NOT_ENOUGH_QUANTITY) else None,
            ).flatten
            if (errors.isEmpty) {
              val secondaryMarketId = utilities.IdGenerator.getRandomHexadecimal
              val abciInfo = getAbciInfo.Service.get

              for {
                abciInfo <- abciInfo
                // This can throw failed to create failed to create SecondaryMarketSellTx due to unique order id constraint, key already exists only when node connected is not generating blocks
                (tx, orderId) <- secondaryMarketSellTxs.Utility.transaction(secondaryMarketId = secondaryMarketId, nft = nft, nftOwner = nftOwner, fromAddress = loginState.address, quantity = createData.sellQuantity, endHours = createData.endHours, price = createData.price, gasPrice = constants.Transaction.DefaultGasPrice, ecKey = activeKey.getECKey(createData.password).get, latestHeight = abciInfo.result.response.last_block_height.toLong)
                _ <- masterSecondaryMarkets.Service.add(createData.toNewSecondaryMarket(id = secondaryMarketId, sellerId = loginState.username, orderId = orderId.asString))
              } yield tx
            } else errors.head.throwBaseException()
          }

          (for {
            nft <- nft
            nftOwner <- nftOwner
            activeKey <- activeKey
            tx <- addToSecondaryMarket(nft = nft, nftOwner = nftOwner, activeKey = activeKey)
          } yield PartialContent(views.html.transactionSuccessful(tx))
            ).recover {
            case baseException: BaseException => try {
              val NFTOwner = Await.result(nftOwner, Duration.Inf)
              BadRequest(views.html.secondaryMarket.createSecondaryMarket(CreateSecondaryMarket.form.withGlobalError(baseException.failure.message), createData.nftId, NFTOwner.quantity))
            } catch {
              case baseException: BaseException => BadRequest(baseException.failure.message)
            }
          }
        }
      )
  }

  def cancelForm(nftId: String, secondaryMarketId: String): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      Future(Ok(views.html.secondaryMarket.cancel(nftId = nftId, secondaryMarketId = secondaryMarketId)))
  }

  def cancel(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      Cancel.form.bindFromRequest().fold(
        formWithErrors => {
          Future(BadRequest(views.html.secondaryMarket.cancel(formWithErrors, nftId = formWithErrors.data.getOrElse(constants.FormField.NFT_ID.name, ""), secondaryMarketId = formWithErrors.data.getOrElse(constants.FormField.SECONDARY_MARKET_ID.name, ""))))
        },
        cancelData => {
          val secondaryMarket = masterSecondaryMarkets.Service.tryGet(cancelData.secondaryMarketId)
          val verifyPassword = masterKeys.Service.validateActiveKeyUsernamePasswordAndGet(username = loginState.username, password = cancelData.password)

          def secondaryMarketSellTx(secondaryMarket: SecondaryMarket) = secondaryMarketSellTxs.Service.tryGetByNFTAndSecondaryMarketId(nftId = cancelData.nftId, secondaryMarketId = secondaryMarket.id)

          def checkAlreadySold(secondaryMarket: SecondaryMarket) = secondaryMarketBuyTxs.Utility.checkAlreadySold(nftId = cancelData.nftId, secondaryMarket = secondaryMarket)

          def validateAndTransfer(secondaryMarketSellTx: SecondaryMarketSellTransaction, verifyPassword: Boolean, secondaryMarket: SecondaryMarket, buyerKey: Key, checkAlreadySold: Boolean) = {
            val errors = Seq(
              if (secondaryMarket.sellerId != loginState.username) Option(constants.Response.NOT_NFT_OWNER) else None,
              if (!verifyPassword) Option(constants.Response.INVALID_PASSWORD) else None,
              if (checkAlreadySold) Option(constants.Response.NFT_ALREADY_SOLD) else None,
              if (secondaryMarket.orderId.isEmpty || !secondaryMarketSellTx.status.getOrElse(false)) Option(constants.Response.ORDER_NOT_CREATED_ON_BLOCKCHAIN) else None,
              if (secondaryMarketSellTx.nftId != cancelData.nftId || secondaryMarketSellTx.sellerId != secondaryMarket.sellerId || secondaryMarket.sellerId != loginState.username) Option(constants.Response.INVALID_ORDER) else None,
            ).flatten
            if (errors.isEmpty) {
              masterTransactionCancelOrderTransactions.Utility.transaction(
                secondaryMarket = secondaryMarket,
                fromAddress = buyerKey.address,
                gasPrice = constants.Transaction.DefaultGasPrice,
                ecKey = ECKey.fromPrivate(utilities.Secrets.decryptData(buyerKey.encryptedPrivateKey, cancelData.password))
              )
            } else errors.head.throwBaseException()
          }

          (for {
            secondaryMarket <- secondaryMarket
            (verifyPassword, buyerKey) <- verifyPassword
            secondaryMarketSellTx <- secondaryMarketSellTx(secondaryMarket)
            checkAlreadySold <- checkAlreadySold(secondaryMarket)
            blockchainTransaction <- validateAndTransfer(secondaryMarketSellTx = secondaryMarketSellTx, verifyPassword = verifyPassword, secondaryMarket = secondaryMarket, buyerKey = buyerKey, checkAlreadySold = checkAlreadySold)
          } yield PartialContent(views.html.transactionSuccessful(blockchainTransaction))
            ).recover {
            case baseException: BaseException => BadRequest(views.html.secondaryMarket.cancel(Cancel.form.withGlobalError(baseException.failure.message), nftId = cancelData.nftId, secondaryMarketId = cancelData.secondaryMarketId))
          }
        }
      )
  }

  def buyForm(secondaryMarketId: String): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      val secondaryMarket = masterSecondaryMarkets.Service.tryGet(secondaryMarketId)

      (for {
        secondaryMarket <- secondaryMarket
      } yield Ok(views.html.secondaryMarket.buy(secondaryMarket = secondaryMarket))
        ).recover {
        case baseException: BaseException => BadRequest(baseException.failure.message)
      }
  }

  def buy(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      Buy.form.bindFromRequest().fold(
        formWithErrors => {
          val secondaryMarket = masterSecondaryMarkets.Service.tryGet(formWithErrors.data.getOrElse(constants.FormField.SECONDARY_MARKET_ID.name, ""))

          (for {
            secondaryMarket <- secondaryMarket
          } yield BadRequest(views.html.secondaryMarket.buy(formWithErrors, secondaryMarket = secondaryMarket))
            ).recover {
            case _: BaseException => BadRequest
          }
        },
        buyData => {
          val secondaryMarket = masterSecondaryMarkets.Service.tryGet(buyData.secondaryMarketId)
          val verifyPassword = masterKeys.Service.validateActiveKeyUsernamePasswordAndGet(username = loginState.username, password = buyData.password)
          val balance = blockchainBalances.Service.getTokenBalance(loginState.address)
          val split = blockchainSplits.Service.getByOwnerIDAndAssetID(ownerId = utilities.Identity.getMantlePlaceIdentityID(loginState.username), assetID = constants.Blockchain.StakingTokenAssetID)

          def nft(id: String) = masterNFTs.Service.tryGet(id)

          def secondaryMarketSellTx(secondaryMarket: SecondaryMarket) = secondaryMarketSellTxs.Service.tryGetByNFTAndSecondaryMarketId(nftId = buyData.nftId, secondaryMarketId = secondaryMarket.id)

          def creatorAddress(accountId: String) = masterKeys.Service.tryGetActive(accountId).map(_.address)

          def checkAlreadySold(secondaryMarket: SecondaryMarket) = secondaryMarketBuyTxs.Utility.checkAlreadySold(nftId = buyData.nftId, secondaryMarket = secondaryMarket)

          def validateAndTransfer(secondaryMarketSellTx: SecondaryMarketSellTransaction, verifyPassword: Boolean, secondaryMarket: SecondaryMarket, buyerKey: Key, balance: MicroNumber, split: Option[Split], checkAlreadySold: Boolean, creatorAddress: String) = {
            val royaltyFees = MicroNumber(constants.Asset.Commission * secondaryMarket.getTotal.toBigDecimal)
            val errors = Seq(
              if (secondaryMarket.sellerId == loginState.username) Option(constants.Response.CANNOT_SELL_TO_YOURSELF) else None,
              if (balance == MicroNumber.zero || balance <= (secondaryMarket.getTotal - split.fold(MicroNumber.zero)(_.getBalanceAsMicroNumber) + royaltyFees)) Option(constants.Response.INSUFFICIENT_BALANCE) else None,
              if (!verifyPassword) Option(constants.Response.INVALID_PASSWORD) else None,
              if (checkAlreadySold) Option(constants.Response.NFT_ALREADY_SOLD) else None,
              if (secondaryMarket.orderId.isEmpty || !secondaryMarketSellTx.status.getOrElse(false)) Option(constants.Response.ORDER_NOT_CREATED_ON_BLOCKCHAIN) else None,
              if (secondaryMarketSellTx.nftId != buyData.nftId || secondaryMarketSellTx.sellerId != secondaryMarket.sellerId) Option(constants.Response.INVALID_ORDER) else None,
            ).flatten
            if (errors.isEmpty) {
              secondaryMarketBuyTxs.Utility.transaction(
                nftID = buyData.nftId,
                buyerId = loginState.username,
                fromAddress = buyerKey.address,
                secondaryMarket = secondaryMarket,
                gasPrice = constants.Transaction.DefaultGasPrice,
                ecKey = ECKey.fromPrivate(utilities.Secrets.decryptData(buyerKey.encryptedPrivateKey, buyData.password)),
                split = split,
                royaltyFees = royaltyFees,
                creatorAddress = creatorAddress
              )
            } else errors.head.throwBaseException()
          }

          (for {
            secondaryMarket <- secondaryMarket
            (verifyPassword, buyerKey) <- verifyPassword
            secondaryMarketSellTx <- secondaryMarketSellTx(secondaryMarket)
            balance <- balance
            split <- split
            nft <- nft(secondaryMarket.nftId)
            creatorAddress <- creatorAddress(nft.creatorId)
            checkAlreadySold <- checkAlreadySold(secondaryMarket)
            blockchainTransaction <- validateAndTransfer(secondaryMarketSellTx = secondaryMarketSellTx, verifyPassword = verifyPassword, secondaryMarket = secondaryMarket, buyerKey = buyerKey, balance = balance, split = split, checkAlreadySold = checkAlreadySold, creatorAddress = creatorAddress)
          } yield PartialContent(views.html.transactionSuccessful(blockchainTransaction))
            ).recover {
            case baseException: BaseException => {
              val badResult = {
                val secondaryMarket = masterSecondaryMarkets.Service.tryGet(buyData.secondaryMarketId)

                (for {
                  secondaryMarket <- secondaryMarket
                } yield BadRequest(views.html.secondaryMarket.buy(Buy.form.withGlobalError(baseException.failure.message), secondaryMarket))
                  ).recover {
                  case _: BaseException => BadRequest
                }
              }
              Await.result(badResult, Duration.Inf)
            }
          }
        }
      )
  }

  def listedSection(accountId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        Future(Ok(views.html.profile.listed.section(accountId)))
    }
  }

  def listedNFTsPerPage(accountId: String, pageNumber: Int): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val secondaryMarkets = masterSecondaryMarkets.Service.getBySellerAndPageNumber(sellerId = accountId, pageNumber = pageNumber).map(_.sortBy(_.price))

        def getNFTs(nftIds: Seq[String]) = masterNFTs.Service.getByIds(nftIds)

        def getNFTsLiked(nftIds: Seq[String]) = if (nftIds.nonEmpty) masterWishLists.Service.getByNFTIds(accountId = accountId, nftIDs = nftIds) else Future(Seq())

        (for {
          secondaryMarkets <- secondaryMarkets
          nfts <- getNFTs(secondaryMarkets.map(_.nftId))
          nftsLiked <- getNFTsLiked(secondaryMarkets.map(_.nftId))
        } yield Ok(views.html.base.commonNFTsPerPage(nfts, Option(accountId), Seq(), nftsLiked, Seq(), pageNumber, secondaryMarkets, showCreatorSection = false))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }


}
