package controllers

import controllers.actions._
import exceptions.BaseException
import models.master
import play.api.Logger
import play.api.cache.Cached
import play.api.i18n.I18nSupport
import play.api.mvc._

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CollectedController @Inject()(
                                     messagesControllerComponents: MessagesControllerComponents,
                                     cached: Cached,
                                     withoutLoginActionAsync: WithoutLoginActionAsync,
                                     withLoginAction: WithLoginAction,
                                     withLoginActionAsync: WithLoginActionAsync,
                                     withoutLoginAction: WithoutLoginAction,
                                     masterAccounts: master.Accounts,
                                     masterNFTs: master.NFTs,
                                     masterNFTOwners: master.NFTOwners,
                                     masterWishLists: master.WishLists,
                                     masterSecondaryMarkets: master.SecondaryMarkets,
                                   )(implicit executionContext: ExecutionContext) extends AbstractController(messagesControllerComponents) with I18nSupport {

  implicit val logger: Logger = Logger(this.getClass)

  implicit val module: String = constants.Module.COLLECTED_CONTROLLER

  implicit val callbackOnSessionTimeout: Call = routes.ProfileController.viewDefaultProfile()

  def collectedSection(accountId: String): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        Future(Ok(views.html.profile.collected.collectedSection(accountId)))
    }
  }

  def nftsPerPage(accountId: String, pageNumber: Int): EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), constants.CommonConfig.WebAppCacheDuration) {
    withoutLoginActionAsync { implicit loginState =>
      implicit request =>
        val nftOwners = masterNFTOwners.Service.getByPageNumber(accountId = accountId, pageNumber = pageNumber)

        def getNFTs(nftIds: Seq[String]) = masterNFTs.Service.getByIds(nftIds)

        def secondaryMarkets(nftIds: Seq[String]) = masterSecondaryMarkets.Service.getBySortedNFTIDs(nftIds)

        def getNFTsLiked(nftIds: Seq[String]) = if (nftIds.nonEmpty) masterWishLists.Service.getByNFTIds(accountId = accountId, nftIDs = nftIds) else Future(Seq())

        (for {
          nftOwners <- nftOwners
          nfts <- getNFTs(nftOwners.map(_.nftId))
          nftsLiked <- getNFTsLiked(nftOwners.map(_.nftId))
          secondaryMarkets <- secondaryMarkets(nftOwners.map(_.nftId))
        } yield Ok(views.html.base.commonNFTsPerPage(nfts, Option(accountId), nftOwners, nftsLiked, Seq(), pageNumber, secondaryMarkets, showCreatorSection = false))
          ).recover {
          case baseException: BaseException => InternalServerError(baseException.failure.message)
        }
    }
  }

  def sectionTopRightCard(accountID: String): Action[AnyContent] = withoutLoginActionAsync { implicit optionalLoginState =>
    implicit request =>
      val totalOwned = masterNFTOwners.Service.countOwnedNFTs(accountId = accountID)

      (for {
        totalOwned <- totalOwned
      } yield Ok(views.html.profile.collected.topRightCard(totalOwned = totalOwned))
        ).recover {
        case baseException: BaseException => BadRequest(baseException.failure.message)
      }
  }

}
