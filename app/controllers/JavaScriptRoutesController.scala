package controllers

import play.api.mvc._
import play.api.routing._
import play.api.{Configuration, Logger}

import javax.inject.{Inject, Singleton}

@Singleton
class JavaScriptRoutesController @Inject()(messagesControllerComponents: MessagesControllerComponents)(implicit configuration: Configuration) extends AbstractController(messagesControllerComponents) {

  implicit val logger: Logger = Logger(this.getClass)

  def javascriptRoutes: Action[AnyContent] = Action { implicit request =>
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.Assets.versioned,
        routes.javascript.PublicResourceController.versioned,

        routes.javascript.IndexController.index,

        routes.javascript.AccountController.signUpForm,
        routes.javascript.AccountController.signInWithCallbackForm,
        routes.javascript.AccountController.verifyWalletMnemonicsForm,
        routes.javascript.AccountController.checkUsernameAvailable,
        routes.javascript.AccountController.signOutForm,
        routes.javascript.AccountController.forgetPasswordForm,
        routes.javascript.AccountController.changePasswordForm,
        routes.javascript.AccountController.changeActiveKeyForm,


        routes.javascript.CollectedController.collectedSection,
        routes.javascript.CollectedController.nftsPerPage,
        routes.javascript.CollectedController.sectionTopRightCard,

        routes.javascript.WishlistController.wishlistSection,
        routes.javascript.WishlistController.nftsPerPage,
        routes.javascript.WishlistController.add,
        routes.javascript.WishlistController.delete,

        routes.javascript.NFTController.viewNFT,
        routes.javascript.NFTController.details,
        routes.javascript.NFTController.detailViewLeftCards,
        routes.javascript.NFTController.detailViewRightCards,
        routes.javascript.NFTController.info,
        routes.javascript.NFTController.likesCounter,
        routes.javascript.NFTController.uploadNFTFileForm,
        routes.javascript.NFTController.storeNFTFile,
        routes.javascript.NFTController.uploadNFTFile,
        routes.javascript.NFTController.basicDetailsForm,
        routes.javascript.NFTController.deleteDraftForm,
        routes.javascript.NFTController.deleteDraft,
        routes.javascript.NFTController.transferForm,
        routes.javascript.NFTController.overview,
        routes.javascript.NFTController.trade,
        routes.javascript.NFTController.sellOrders,
        routes.javascript.NFTController.sellOrdersPerPage,
        routes.javascript.NFTController.yourOrders,
        routes.javascript.NFTController.yourOrdersPerPage,
        routes.javascript.NFTController.revealPropertyForm,
        routes.javascript.NFTController.createdSection,
        routes.javascript.NFTController.createdNFTsPerPage,

        routes.javascript.SettingController.viewSettings,
        routes.javascript.SettingController.settings,
        routes.javascript.SettingController.addNewKey,
        routes.javascript.SettingController.addManagedKeyForm,
        routes.javascript.SettingController.addUnmanagedKeyForm,
        routes.javascript.SettingController.changeKeyNameForm,
        routes.javascript.SettingController.viewMnemonicsForm,
        routes.javascript.SettingController.deleteKeyForm,
        routes.javascript.SettingController.provisionAddressForm,

        //        routes.javascript.ProfileController.viewOffers,
        //        routes.javascript.ProfileController.offers,

        routes.javascript.ProfileController.viewProfile,
        routes.javascript.ProfileController.profile,
        routes.javascript.ProfileController.notificationPopup,
        routes.javascript.ProfileController.loadMoreNotifications,
        routes.javascript.ProfileController.markNotificationsRead,
        routes.javascript.ProfileController.countUnreadNotification,
        routes.javascript.ProfileController.profileInfoCard,
        routes.javascript.ProfileController.profileActivityCard,
        routes.javascript.ProfileController.profileAnalysisCard,
        routes.javascript.ProfileController.transactionsSection,
        routes.javascript.ProfileController.transactionsPerPage,

        routes.javascript.SecondaryMarketController.view,
        routes.javascript.SecondaryMarketController.marketNFTs,
        routes.javascript.SecondaryMarketController.nftsPerPage,
        routes.javascript.SecondaryMarketController.createForm,
        routes.javascript.SecondaryMarketController.cancelForm,
        routes.javascript.SecondaryMarketController.buyForm,
        routes.javascript.SecondaryMarketController.listedSection,
        routes.javascript.SecondaryMarketController.listedNFTsPerPage,

        routes.javascript.WalletController.walletPopup,
        routes.javascript.WalletController.wrappedTokenBalance,
        routes.javascript.WalletController.walletPopupKeys,
        routes.javascript.WalletController.unwrapTokenForm,
        routes.javascript.WalletController.wrapCoinForm,
        routes.javascript.WalletController.balance,

      )
    ).as("text/javascript")

  }
}
