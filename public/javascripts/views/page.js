function viewSecondaryMarketCollections() {
    componentResource('centerContent', jsRoutes.controllers.SecondaryMarketController.marketNFTs());
    checkAndPushState(jsRoutes.controllers.SecondaryMarketController.view().url, "", "secondaryMarket");
    $('#leftContent').html('');
    $('#rightContent').html('');
}

function viewNFT(lastPart) {
    let nftId = lastPart.split("/")[0];
    let activeTab = lastPart.split("/")[1];
    if (activeTab !== undefined) {
        componentResource('centerContent', jsRoutes.controllers.NFTController.overview(nftId, activeTab));
    } else {
        componentResource('centerContent', jsRoutes.controllers.NFTController.overview(nftId, 'OVERVIEW'));
    }
    $('#bannerContent').html('');
    componentResource('leftContent', jsRoutes.controllers.NFTController.detailViewLeftCards(nftId));
    componentResource('rightContent', jsRoutes.controllers.NFTController.detailViewRightCards(nftId));
    // checkAndPushState(jsRoutes.controllers.NFTController.viewNFT(nftId).url, nftId, "nft");
}

function viewSetting() {
    $('#bannerContent').html('');
    componentResource('centerContent', jsRoutes.controllers.SettingController.settings());
    checkAndPushState(jsRoutes.controllers.SettingController.viewSettings().url, '', "setting");
    $('#leftContent').html('');
    $('#rightContent').html('');
}

function viewProfile(lastPart) {
    let accountId = lastPart.split("/")[0];
    let activeTab = lastPart.split("/")[1];
    $('#bannerContent').html('');
    componentResource('leftContent', jsRoutes.controllers.ProfileController.profileInfoCard(accountId));
    componentResource('centerContent', jsRoutes.controllers.ProfileController.profile(accountId, activeTab));
    componentResource('rightContent', jsRoutes.controllers.ProfileController.profileAnalysisCard(accountId));
}

function changeProfileStateOnSwitcher(accountId, section) {
    checkAndPushState(jsRoutes.controllers.ProfileController.viewProfile(accountId, section).url, (accountId + '/' + section), 'profile');
}

function changeNFTStateOnSwitcher(nftId, section) {
    checkAndPushState(jsRoutes.controllers.NFTController.viewNFT(nftId, section).url, (nftId + '/' + section), 'nft');
}