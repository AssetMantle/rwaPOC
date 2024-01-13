package views.nft.companion

import play.api.data.Form
import play.api.data.Forms.mapping

object NFTBasicDetail {

  val form: Form[Data] = Form(
    mapping(
      constants.FormField.REGISTRATION_ID.mapping,
      constants.FormField.NFT_DESCRIPTION.mapping,
      constants.FormField.ADDRESS.mapping,
      constants.FormField.POSTAL_CODE.mapping,
      constants.FormField.TOTAL_AREA.mapping,
      constants.FormField.GEO_LOCATION.mapping,
      constants.FormField.SECRET_VALUE.mapping,
      constants.FormField.TOTAL_UNITS.mapping,
      constants.FormField.RENTED.mapping,
      constants.FormField.RENTAL_AMOUNT.mapping,
      constants.FormField.RENT_PERIOD.mapping,
      constants.FormField.DOCUMENT_LINK.mapping,
      constants.FormField.NFT_ID.mapping,
      constants.FormField.SAVE_NFT_DRAFT.mapping,
    )(Data.apply)(Data.unapply))

  case class Data(registrationId: String, description: String, address: String, postalCode: String, totalArea: BigDecimal, geoLocation: String, secretValue: String, totalUnits: Long, rented: Boolean, rentalAmount: BigDecimal, rentPeriod: Int, documentLink: String, nftId: String, saveNFTDraft: Boolean)

}
