package models.common

import play.api.libs.json.{Json, OWrites, Reads}

object Asset {

  case class Properties(registrationId: String, description: String, address: String, postalCode: String, totalArea: BigDecimal, geoLocation: String, secretValue: String, rented: Boolean, rentalAmount: BigDecimal, rentPeriodicity: Int, documentLink: String, totalSupply: BigInt)

  implicit val PropertiesReads: Reads[Properties] = Json.reads[Properties]

  implicit val PropertiesWrites: OWrites[Properties] = Json.writes[Properties]

}
