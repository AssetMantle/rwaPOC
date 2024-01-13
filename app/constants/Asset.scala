package constants

import schema.id.base.{ClassificationID, HashID}

object Asset {

  val BondAmount = 2225L

  val Commission: BigDecimal = 0.02

  object PROPERTY_TYPE {
    val COMMERCIAL = "COMMERCIAL"
    val APARTMENT = "APARTMENT"
    val BUNGALOW = "BUNGALOW"
  }

  val ClassificationId: ClassificationID = ClassificationID("zM48pJAU-qkdIPQmg3qdPw-w3nUVZwxaEF_qLcH1Rb0=")

  def getClassificationId: ClassificationID = schema.utilities.ID.getClassificationID(
    immutables = utilities.Asset.getImmutables(registrationId = "", creatorId = "", address = "", postalCode = "", totalArea = 0.0, geoLocation = "", supply = 0, fileHashID = HashID(Array[Byte]()), fileExtension = "", serviceEndpoint = "", secretValue = ""),
    mutables = utilities.Asset.getMutables(rented = false, 0.0, 0, ""))

  object File {
    val PROFILE = "PROFILE"
    val COVER = "COVER"

    val AllCollectionsPath: String = constants.CommonConfig.Files.CollectionPath + "/"
  }

  object SocialProfile {
    val WEBSITE = "WEBSITE"
    val TWITTER = "TWITTER"
    val INSTAGRAM = "INSTAGRAM"
  }

  object Category {
    val ART = "ART"
    val PHOTOGRAPHY = "PHOTOGRAPHY"
    val MISCELLANEOUS = "MISCELLANEOUS"
  }

  case class CollectionStatus(name: String, id: Int)

  object Status {
    val NO_STATUS: CollectionStatus = CollectionStatus("NO_STATUS", 0)
    val PUBLIC_LISTED: CollectionStatus = CollectionStatus("PUBLIC_LISTED", 1)
    val WHITELIST_SALE: CollectionStatus = CollectionStatus("WHITELIST_SALE", 2)
    val MARKET: CollectionStatus = CollectionStatus("MARKET", 3)
  }

  object DefaultProperty {
    // Should be kept in lower case otherwise change in form constraints
    val REGISTRATION_ID = "registrationId"
    val ADDRESS = "address"
    val POSTAL_CODE = "postalCode"
    val TOTAL_AREA = "totalArea"
    val CREATOR_ID = "creatorId"
    val FILE_RESOURCE = "fileResource"
    val GEO_LOCATION = "geoLocation"
    val SECRET_VALUE = "secretValue"

    val RENTED = "rented"
    val RENTAL_AMOUNT = "rentalAmount"
    val RENT_PERIODICITY = "rentPeriodicity"
    val DOCUMENT_LINK = "documentLink"
  }
}
