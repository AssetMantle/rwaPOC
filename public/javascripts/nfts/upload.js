let hashData = "";

function onSuccessfulUpload(fileHash) {
    $('#nftFileHashName').text(fileHash);
    const index = fileHash.lastIndexOf('/');
    hashData = fileHash.slice(index + 1);
    setFileName();
}

function setFileName() {
    if (hashData !== "") {
        const nftId = hashData.split(".")[0];
        $("#uploadNftNextButton").removeClass("disable");
        $("#uploadNftNextButton").attr("onclick", `getForm(jsRoutes.controllers.NFTController.basicDetailsForm("${nftId}"))`);
    }
}