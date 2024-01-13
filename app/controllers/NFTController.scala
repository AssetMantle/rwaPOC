package controllers

import controllers.actions._
import exceptions.BaseException
import models.common.Asset.Properties
import models.master._
import models.masterTransaction.NFTDraft
import models.{blockchain, master, masterTransaction}
import org.bitcoinj.core.ECKey
import play.api.Logger
import play.api.cache.Cached
import play.api.i18n.I18nSupport
import play.api.mvc._
import schema.data.Data
import utilities.MicroNumber
import views.base.companion.UploadFile
import views.nft.companion._

import java.nio.file.Files
import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class NFTController @Inject()(
                               messagesControllerComponents: MessagesControllerComponents,
                               cached: Cached,
                               withoutLoginActionAsync: WithoutLoginActionAsync,
                               withLoginActionAsync: WithLoginActionAsync,
                               withoutLoginAction: WithoutLoginAction,
                               withLoginAction: WithLoginAction,
                               masterAccounts: master.Accounts,
                               masterKeys: master.Keys,
                               blockchainBalances: blockchain.Balances,
                               blockchainBlocks: blockchain.Blocks,
                               blockchainOrders: blockchain.Orders,
                               blockchainAssets: blockchain.Assets,
                               blockchainMetas: blockchain.Metas,
                               masterNFTs: master.NFTs,
                               masterNFTOwners: master.NFTOwners,
                               masterWishLists: master.WishLists,
                               masterSecondaryMarkets: master.SecondaryMarkets,
                               utilitiesNotification: utilities.Notification,
                               masterTransactionNFTDrafts: masterTransaction.NFTDrafts,
                               masterTransactionNFTTransferTransactions: masterTransaction.NFTTransferTransactions,
                               masterTransactionRevealPropertyTransactions: masterTransaction.RevealPropertyTransactions,
                             )(implicit executionContext: ExecutionContext) extends AbstractController(messagesControllerComponents) with I18nSupport {

  implicit val logger: Logger = Logger(this.getClass)

  implicit val module: String = constants.Module.NFT_CONTROLLER

  implicit val callbackOnSessionTimeout: Call = routes.SecondaryMarketController.view()

  def viewNFT(nftId: String, activeTab: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val nft = masterNFTs.Service.tryGet(nftId)
        (for {
          nft <- nft
        } yield Ok(views.html.nft.viewNft(nft, activeTab))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def overview(nftId: String, activeTab: String): Action[AnyContent] = withoutLoginActionAsync { implicit loginState =>
    implicit request =>
      val nft = masterNFTs.Service.tryGet(nftId)
      (for {
        nft <- nft
      } yield Ok(views.html.nft.detail.view(nftId = nftId, totalSupply = nft.totalSupply, activeTab = activeTab))
        ).recover {
        case baseException: BaseException => InternalServerError(baseException.failure.message)
      }
  }

  def details(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val nft = masterNFTs.Service.tryGet(nftId)
        val liked = loginState.fold[Future[Option[Boolean]]](Future(None))(x => masterWishLists.Service.checkExists(accountId = x.username, nftId = nftId).map(Option(_)))

        (for {
          nft <- nft
          liked <- liked
        } yield Ok(views.html.nft.detail.overview(nft, liked))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def trade(nftId: String): Action[AnyContent] = withoutLoginActionAsync { implicit loginState =>
    implicit request =>
      Future(Ok(views.html.nft.detail.trade(nftId = nftId)))
  }

  def sellOrders(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val totalOrders = masterSecondaryMarkets.Service.totalForNFT(nftId)

        for {
          totalOrders <- totalOrders
        } yield Ok(views.html.nft.detail.sellOrders(nftId, totalOrders))
    }
  }

  def sellOrdersPerPage(nftId: String, pageNumber: Int): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val secondaryMarkets = masterSecondaryMarkets.Service.getByNFTIdAndPageNumber(nftId = nftId, pageNumber = pageNumber)

        def orders(secondaryMarkets: Seq[SecondaryMarket]) = blockchainOrders.Service.get(secondaryMarkets.map(_.orderId))

        (for {
          secondaryMarkets <- secondaryMarkets
          orders <- orders(secondaryMarkets)
        } yield Ok(views.html.nft.detail.sellOrdersPerPage(secondaryMarkets.sortBy(_.price), orders, blockchainBlocks.Service.getLatestHeight, pageNumber))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def yourOrders(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withLoginActionAsync { implicit loginState =>
      implicit request =>
        implicit val optionalLoginState: Option[LoginState] = Option(loginState)
        val totalOrders = masterSecondaryMarkets.Service.totalYourOrders(nftId = nftId, sellerId = loginState.username)
        for {
          totalOrders <- totalOrders
        } yield Ok(views.html.nft.detail.yourOrders(nftId, totalOrders))
    }
  }

  def yourOrdersPerPage(nftId: String, pageNumber: Int): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withLoginActionAsync { implicit loginState =>
      implicit request =>
        val secondaryMarkets = masterSecondaryMarkets.Service.getByNFTIdAndSellerIdAndPageNumber(nftId = nftId, sellerId = loginState.username, pageNumber = pageNumber)

        def orders(secondaryMarkets: Seq[SecondaryMarket]) = blockchainOrders.Service.get(secondaryMarkets.map(_.orderId))

        (for {
          secondaryMarkets <- secondaryMarkets
          orders <- orders(secondaryMarkets)
        } yield Ok(views.html.nft.detail.yourOrdersPerPage(secondaryMarkets.sortBy(_.price), orders, blockchainBlocks.Service.getLatestHeight, pageNumber))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def detailViewLeftCards(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginAction {
      implicit request =>
        Ok(views.html.nft.detail.leftCards(nftId))
    }
  }

  def info(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val nft = masterNFTs.Service.tryGet(nftId)
        val liked = loginState.fold[Future[Option[Boolean]]](Future(None))(x => masterWishLists.Service.checkExists(accountId = x.username, nftId = nftId).map(Option(_)))

        (for {
          nft <- nft
          liked <- liked
        } yield Ok(views.html.nft.detail.info(nft, liked))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def detailViewRightCards(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val lowestPriceSecondaryMarket = masterSecondaryMarkets.Service.getByNFTIdAndLowestPrice(nftId)
        val totalOwners = masterNFTOwners.Service.countOwners(nftId)
        val userSecondaryMarket = if (loginState.isDefined) masterSecondaryMarkets.Service.getByNFTIdAndSellerId(nftId = nftId, sellerId = loginState.get.username).map(_.sortBy(_.price)) else Future(Seq())
        val nft = masterNFTs.Service.tryGet(nftId)
        val nftOwner: Future[Option[NFTOwner]] = if (loginState.isDefined) masterNFTOwners.Service.get(nftId = nftId, ownerId = loginState.get.username) else Future(None)

        (for {
          nft <- nft
          lowestPriceSecondaryMarket <- lowestPriceSecondaryMarket
          userSecondaryMarket <- userSecondaryMarket
          totalOwners <- totalOwners
          nftOwner <- nftOwner
        } yield Ok(views.html.nft.detail.rightCards(nft, userNFTOwner = nftOwner, lowestPriceSecondaryMarket = lowestPriceSecondaryMarket, userSecondaryMarket = userSecondaryMarket.headOption, totalOwners = totalOwners))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def likesCounter(nftId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val countLikes = masterWishLists.Service.countLikes(nftId)
        (for {
          countLikes <- countLikes
        } yield Ok(countLikes.toString)
          ).recover {
          case baseException: BaseException => BadRequest(baseException.failure.message)
        }
    }
  }

  def uploadNFTFileForm(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      val totalNftDrafts = masterTransactionNFTDrafts.Service.countForCreator(loginState.username)
      (for {
        totalNftDrafts <- totalNftDrafts
      } yield if (loginState.isCreator) Ok(views.html.nft.upload(totalNftDrafts))
      else constants.Response.NOT_VERIFIED_CREATOR.throwBaseException()
        ).recover {
        case baseException: BaseException => BadRequest(baseException.failure.message)
      }
  }

  def storeNFTFile(documentType: String) = withLoginAction.applyMultipartFormData { implicit loginState =>
    implicit request =>
      UploadFile.form.bindFromRequest().fold(
        formWithErrors => {
          BadRequest(constants.View.BAD_REQUEST)
        },
        fileUploadInfo => {
          try {
            request.body.file(constants.File.KEY_FILE) match {
              case None => BadRequest(constants.View.BAD_REQUEST)
              case Some(file) => if (fileUploadInfo.resumableTotalSize <= constants.File.NFT_FILE_FORM.maxFileSize) {
                utilities.FileOperations.savePartialFile(Files.readAllBytes(file.ref.path), fileUploadInfo, utilities.Asset.getNFTFilePath)
                Ok
              } else constants.Response.NOT_COLLECTION_OWNER.throwBaseException()
            }
          } catch {
            case baseException: BaseException => BadRequest(baseException.failure.message)
          }
        }
      )
  }

  def uploadNFTFile(documentType: String, name: String): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      val oldFilePath = utilities.Asset.getNFTFilePath + name
      val nftId = utilities.FileOperations.getFileHash(oldFilePath)
      val fileExtension = utilities.FileOperations.fileExtensionFromName(name).toLowerCase
      val newFileName = nftId + "." + fileExtension
      val awsKey = utilities.NFT.getAWSKey(fileName = newFileName)

      val uploadToAws = if (loginState.isCreator) Future(utilities.AmazonS3.uploadFile(objectKey = awsKey, filePath = oldFilePath))
      else {
        utilities.FileOperations.deleteFile(oldFilePath)
        constants.Response.NOT_COLLECTION_OWNER.throwBaseException()
      }

      def deleteLocalFile() = Future(utilities.FileOperations.deleteFile(oldFilePath))

      def add() = masterTransactionNFTDrafts.Service.add(id = nftId, fileExtension = utilities.FileOperations.fileExtensionFromName(name), creatorId = loginState.username)

      (for {
        _ <- uploadToAws
        _ <- deleteLocalFile()
        _ <- add()
      } yield Ok(constants.CommonConfig.AmazonS3.s3BucketURL + awsKey)
        ).recover {
        case baseException: BaseException => BadRequest(messagesApi(baseException.failure.message)(request.lang))
      }
  }

  def basicDetailsForm(nftId: String): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>

      val optionalNFTDraft = masterTransactionNFTDrafts.Service.get(nftId)

      (for {
        optionalNFTDraft <- optionalNFTDraft
      } yield Ok(views.html.nft.nftBasicDetail(nftId = nftId, optionalNFTDraft = optionalNFTDraft))
        ).recover {
        case baseException: BaseException => BadRequest(baseException.failure.message)
      }
  }

  def basicDetails(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      NFTBasicDetail.form.bindFromRequest().fold(
        formWithErrors => {
          val nftId = formWithErrors.data.getOrElse(constants.FormField.NFT_ID.name, "")
          val optionalNFTDraft = masterTransactionNFTDrafts.Service.get(nftId)

          (for {
            optionalNFTDraft <- optionalNFTDraft
          } yield BadRequest(views.html.nft.nftBasicDetail(formWithErrors, nftId, optionalNFTDraft))
            ).recover {
            case baseException: BaseException => BadRequest(baseException.failure.message)
          }

        },
        basicDetailsData => {
          val nftDraft = masterTransactionNFTDrafts.Service.tryGet(basicDetailsData.nftId)

          def update(nftDraft: NFTDraft) = if (loginState.isCreator && nftDraft.creatorId == loginState.username) {
            val properties = Properties(registrationId = basicDetailsData.registrationId, description = basicDetailsData.description, address = basicDetailsData.address, postalCode = basicDetailsData.postalCode, totalArea = basicDetailsData.totalArea, geoLocation = basicDetailsData.geoLocation, secretValue = basicDetailsData.secretValue, totalSupply = basicDetailsData.totalUnits, rented = basicDetailsData.rented, rentPeriodicity = basicDetailsData.rentPeriod, rentalAmount = basicDetailsData.rentalAmount, documentLink = basicDetailsData.documentLink)
            masterTransactionNFTDrafts.Service.update(basicDetailsData.nftId, properties)
          } else constants.Response.NOT_NFT_OWNER.throwFutureBaseException()

          def addToNFT(nftDraft: NFTDraft) = if (!basicDetailsData.saveNFTDraft) {
            val add = masterNFTs.Service.add(nftDraft.toNFT)

            def addOwner(nftOwner: master.NFTOwner) = masterNFTOwners.Service.add(nftOwner)

            def deleteDraft() = masterTransactionNFTDrafts.Service.deleteNFT(nftDraft.id)

            for {
              _ <- add
              _ <- addOwner(nftDraft.toNFTOwner(ownerID = loginState.username, creatorId = loginState.username))
              _ <- deleteDraft()
              _ <- utilitiesNotification.send(accountID = loginState.username, notification = constants.Notification.NFT_CREATED)(s"'${nftDraft.id}'")
            } yield ()
          } else Future()

          (for {
            nftDraft <- nftDraft
            updatedNFTDraft <- update(nftDraft)
            _ <- addToNFT(updatedNFTDraft)
          } yield PartialContent(views.html.nft.createSuccessful(basicDetailsData.saveNFTDraft))
            ).recover {
            case baseException: BaseException => BadRequest(views.html.nft.nftBasicDetail(NFTBasicDetail.form.withGlobalError(baseException.failure.message), nftId = basicDetailsData.nftId, None))
          }
        }
      )
  }

  def deleteDraftForm(nftId: String, fileHash: String): Action[AnyContent] = withoutLoginAction { implicit request =>
    Ok(views.html.nft.deleteDraft(nftId, fileHash))
  }

  def deleteDraft(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      DeleteDraft.form.bindFromRequest().fold(
        formWithErrors => {
          Future(BadRequest)
        },
        deleteDraftData => {
          val nftDraft = masterTransactionNFTDrafts.Service.tryGet(deleteDraftData.nftFileName)

          def delete(nftDraft: NFTDraft) = if (nftDraft.creatorId == loginState.username) {
            utilities.AmazonS3.deleteObject(utilities.NFT.getAWSKey(nftDraft.getFileName))
            masterTransactionNFTDrafts.Service.delete(deleteDraftData.nftFileName)
          } else constants.Response.NOT_NFT_OWNER.throwBaseException()

          (for {
            nftDraft <- nftDraft
            _ <- delete(nftDraft)
          } yield Ok
            ).recover {
            case baseException: BaseException => BadRequest(baseException.failure.message)
          }
        }
      )
  }

  def transferForm(nftId: String): Action[AnyContent] = withoutLoginAction { implicit request =>
    Ok(views.html.nft.transfer(nftId = nftId))
  }

  def transfer(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      Transfer.form.bindFromRequest().fold(
        formWithErrors => {
          Future(BadRequest(views.html.nft.transfer(formWithErrors, formWithErrors.data.getOrElse(constants.FormField.NFT_ID.name, ""))))
        },
        transferData => {
          val nft = masterNFTs.Service.tryGet(transferData.nftId)
          val nftOwner = masterNFTOwners.Service.tryGet(nftId = transferData.nftId, ownerId = loginState.username)
          val verifyPassword = masterKeys.Service.validateActiveKeyUsernamePasswordAndGet(username = loginState.username, password = transferData.password)
          val balance = blockchainBalances.Service.getTokenBalance(loginState.address)
          val toAccountExists = masterKeys.Service.checkVerifiedKeyExists(transferData.toAccountId)

          def verifyAndTx(verifyPassword: Boolean, balance: MicroNumber, key: Key, nft: NFT, nftOwner: NFTOwner, toAccountExists: Boolean) = {
            val errors = Seq(
              if (nftOwner.ownerId != loginState.username) Option(constants.Response.NOT_NFT_OWNER) else None,
              if (balance == MicroNumber.zero) Option(constants.Response.INSUFFICIENT_BALANCE) else None,
              if (!verifyPassword) Option(constants.Response.INVALID_PASSWORD) else None,
              if (!nft.isMinted.getOrElse(false)) Option(constants.Response.NFT_NOT_MINTED) else None,
              if (transferData.amount > nftOwner.quantity) Option(constants.Response.INSUFFICIENT_NFT_BALANCE) else None,
              if (!toAccountExists) Option(constants.Response.TO_ACCOUNT_ID_DOES_NOT_EXISTS) else None,
              if (transferData.toAccountId == loginState.username) Option(constants.Response.CANNOT_SEND_TO_YOURSELF) else None,
            ).flatten

            if (errors.isEmpty) {
              masterTransactionNFTTransferTransactions.Utility.transaction(
                nft = nft,
                fromId = loginState.username,
                quantity = transferData.amount,
                fromAddress = key.address,
                toAccountId = transferData.toAccountId,
                gasPrice = constants.Transaction.DefaultGasPrice,
                ecKey = ECKey.fromPrivate(utilities.Secrets.decryptData(key.encryptedPrivateKey, transferData.password))
              )
            } else errors.head.throwBaseException()
          }

          (for {
            nft <- nft
            (verified, key) <- verifyPassword
            balance <- balance
            nftOwner <- nftOwner
            toAccountExists <- toAccountExists
            blockchainTransaction <- verifyAndTx(verifyPassword = verified, balance = balance, key = key, nft = nft, nftOwner = nftOwner, toAccountExists = toAccountExists)
          } yield PartialContent(views.html.transactionSuccessful(blockchainTransaction))
            ).recover {
            case baseException: BaseException => BadRequest(views.html.nft.transfer(Transfer.form.withGlobalError(baseException.failure.message), transferData.nftId))
          }
        }
      )
  }

  def revealPropertyForm(): Action[AnyContent] = withLoginAction { implicit loginState =>
    implicit request =>
      Ok(views.html.nft.reveal())
  }

  def revealProperty(): Action[AnyContent] = withLoginActionAsync { implicit loginState =>
    implicit request =>
      RevealProperty.form.bindFromRequest().fold(
        formWithErrors => {
          Future(BadRequest(views.html.nft.reveal(formWithErrors)))
        },
        revealPropertyData => {
          val data = Future(revealPropertyData.getData())

          def checkPropertyExists(data: Data) = blockchainMetas.Service.get(data.getDataID)

          val verifyPassword = masterKeys.Service.validateActiveKeyUsernamePasswordAndGet(username = loginState.username, password = revealPropertyData.password)
          val balance = blockchainBalances.Service.getTokenBalance(loginState.address)

          def verifyAndTx(verifyPassword: Boolean, balance: MicroNumber, key: Key, propertyExists: Boolean) = {
            val errors = Seq(
              if (balance == MicroNumber.zero) Option(constants.Response.INSUFFICIENT_BALANCE) else None,
              if (!verifyPassword) Option(constants.Response.INVALID_PASSWORD) else None,
              if (propertyExists) Option(constants.Response.PROPERTY_ALREADY_REVEALED) else None,
            ).flatten

            if (errors.isEmpty) {
              masterTransactionRevealPropertyTransactions.Utility.transaction(
                fromAddress = key.address,
                accountId = loginState.username,
                data = revealPropertyData.getData(),
                gasPrice = constants.Transaction.DefaultGasPrice,
                ecKey = ECKey.fromPrivate(utilities.Secrets.decryptData(key.encryptedPrivateKey, revealPropertyData.password))
              )
            } else errors.head.throwBaseException()
          }

          (for {
            data <- data
            checkPropertyExists <- checkPropertyExists(data)
            (verified, key) <- verifyPassword
            balance <- balance
            blockchainTransaction <- verifyAndTx(verifyPassword = verified, balance = balance, key = key, checkPropertyExists.isDefined)
          } yield PartialContent(views.html.transactionSuccessful(blockchainTransaction))
            ).recover {
            case baseException: BaseException => BadRequest(views.html.nft.reveal(RevealProperty.form.withGlobalError(baseException.failure.message)))
          }
        }
      )
  }

  def resource(id: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginAction { implicit request =>
      Redirect(constants.CommonConfig.AmazonS3.s3BucketURL + utilities.NFT.getAWSKey(id))
    }
  }

  def createdSection(accountId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        Future(Ok(views.html.profile.created.createdSection(accountId)))
    }
  }

  def createdNFTsPerPage(accountId: String, pageNumber: Int): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val nfts = masterNFTs.Service.getByPageNumber(creatorId = accountId, pageNumber = pageNumber)
        val nftDrafts = if (loginState.fold("")(_.username) == accountId) masterTransactionNFTDrafts.Service.getAllNFTs(accountId) else Future(Seq())

        def getNFTOwners(nftIds: Seq[String]) = masterNFTOwners.Service.getByIds(nftIds)

        def getLikedNFTs(nftIds: Seq[String]) = masterWishLists.Service.getByNFTIds(accountId, nftIds)

        def secondaryMarkets(nftIds: Seq[String]) = masterSecondaryMarkets.Service.getBySortedNFTIDs(nftIds)

        (for {
          nfts <- nfts
          nftDrafts <- nftDrafts
          nftOwners <- getNFTOwners(nfts.map(_.id))
          likedNFTs <- getLikedNFTs(nfts.map(_.id))
          secondaryMarkets <- secondaryMarkets(nfts.map(_.id))
        } yield Ok(views.html.base.commonNFTsPerPage(nfts, Option(accountId), nftOwners, likedNFTs, nftDrafts = nftDrafts, pageNumber, secondaryMarkets, showCreatorSection = true))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }
}