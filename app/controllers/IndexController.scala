package controllers

import akka.actor.CoordinatedShutdown
import controllers.actions._
import controllers.result.WithUsernameToken
import models._
import models.blockchainTransaction.{AdminTransactions, UserTransactions}
import play.api.Logger
import play.api.cache.Cached
import play.api.i18n.I18nSupport
import play.api.mvc._

import javax.inject._
import scala.concurrent.duration.{DAYS, Duration}
import scala.concurrent.{Await, ExecutionContext, Future}

@Singleton
class IndexController @Inject()(
                                 messagesControllerComponents: MessagesControllerComponents,
                                 cached: Cached,
                                 withoutLoginActionAsync: WithoutLoginActionAsync,
                                 withoutLoginAction: WithoutLoginAction,
                                 withUsernameToken: WithUsernameToken,
                                 blockchainBlocks: blockchain.Blocks,
                                 coordinatedShutdown: CoordinatedShutdown,
                                 historyMasterSecondaryMarkets: history.MasterSecondaryMarkets,
                                 mintAssetTransactions: masterTransaction.MintAssetTransactions,
                                 nftTransferTransactions: masterTransaction.NFTTransferTransactions,
                                 masterTransactionSessionTokens: masterTransaction.SessionTokens,
                                 issueIdentityTransactions: masterTransaction.IssueIdentityTransactions,
                                 secondaryMarketSellTransactions: masterTransaction.SecondaryMarketSellTransactions,
                                 secondaryMarketBuyTransactions: masterTransaction.SecondaryMarketBuyTransactions,
                                 cancelOrderTransactions: masterTransaction.CancelOrderTransactions,
                                 unwrapTransactions: masterTransaction.UnwrapTransactions,
                                 wrapTransactions: masterTransaction.WrapTransactions,
                                 provisionAddressTransactions: masterTransaction.ProvisionAddressTransactions,
                                 unprovisionAddressTransactions: masterTransaction.UnprovisionAddressTransactions,
                                 revealPropertyTransactions: masterTransaction.RevealPropertyTransactions,
                                 userTransactions: UserTransactions,
                                 adminTransactions: AdminTransactions,
                                 masterSecrets: master.Secrets,
                               )(implicit executionContext: ExecutionContext) extends AbstractController(messagesControllerComponents) with I18nSupport {

  implicit val logger: Logger = Logger(this.getClass)

  implicit val module: String = constants.Module.INDEX_CONTROLLER

  implicit val callbackOnSessionTimeout: Call = routes.SecondaryMarketController.view()

  Await.result(masterSecrets.Utility.setAll(), Duration.Inf)

  def index: Action[AnyContent] = withoutLoginActionAsync { implicit loginState =>
    implicit request =>
      Future(Ok(views.html.index()))
  }

  def sitemap: EssentialAction = cached(req => utilities.Session.getSessionCachingKey(req), Duration(7, DAYS)) {
    withoutLoginAction { implicit request =>
      Ok(utilities.Sitemap.generate).as("application/xml; charset=utf-8")
    }
  }

  // Starts in given order wise
  utilities.Scheduler.startSchedulers(
    masterTransactionSessionTokens.Utility.scheduler,
    //    blockchainBlocks.Utility.scheduler,
    adminTransactions.Utility.scheduler,
    userTransactions.Utility.scheduler,
    // history
    historyMasterSecondaryMarkets.Utility.scheduler,
    // masterTransaction
    issueIdentityTransactions.Utility.scheduler,
    mintAssetTransactions.Utility.scheduler,
    secondaryMarketBuyTransactions.Utility.scheduler,
    secondaryMarketSellTransactions.Utility.scheduler,
    //    cancelOrderTransactions.Utility.scheduler,
    //    nftTransferTransactions.Utility.scheduler,
    provisionAddressTransactions.Utility.scheduler,
    unprovisionAddressTransactions.Utility.scheduler,
    unwrapTransactions.Utility.scheduler,
    wrapTransactions.Utility.scheduler,
    revealPropertyTransactions.Utility.scheduler,
  )

  coordinatedShutdown.addTask(CoordinatedShutdown.PhaseBeforeServiceUnbind, "ThreadShutdown")(utilities.Scheduler.shutdownListener())
}
