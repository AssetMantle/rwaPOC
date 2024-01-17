package utilities

import schema.data.base._
import schema.id.base._
import schema.property.Property
import schema.property.base.{MesaProperty, MetaProperty}
import schema.qualified.{Immutables, Mutables}

object Asset {

  private val others = "/others/"
  private val nfts = "/nfts/"

  def getFilePath: String = utilities.FileOperations.checkAndCreateDirectory(constants.Asset.File.AllCollectionsPath + others)

  def getNFTFilePath: String = utilities.FileOperations.checkAndCreateDirectory(constants.Asset.File.AllCollectionsPath + nfts)

  def getOthersFileAwsKey(fileName: String): String = others + fileName

  def getOldNFTFileAwsKey(fileName: String): String = nfts + fileName

  def getDefaultImmutableMetaProperties(creatorId: String, registrationId: String, address: String, postalCode: String, totalArea: BigDecimal, geoLocation: String, supply: BigInt, fileHashID: HashID, fileExtension: String, serviceEndpoint: String): Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.CREATOR_ID), typeID = schema.id.constants.IdentityIDType), data = IDData(utilities.Identity.getMantlePlaceIdentityID(creatorId))),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.REGISTRATION_ID), typeID = schema.data.constants.StringDataTypeID), data = StringData(registrationId)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.ADDRESS), typeID = schema.data.constants.StringDataTypeID), data = StringData(address)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.POSTAL_CODE), typeID = schema.data.constants.StringDataTypeID), data = StringData(postalCode)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.TOTAL_AREA), typeID = schema.data.constants.DecDataTypeID), data = DecData(totalArea)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.GEO_LOCATION), typeID = schema.data.constants.StringDataTypeID), data = StringData(geoLocation)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.FILE_RESOURCE), typeID = schema.data.constants.LinkedDataTypeID), data = LinkedData(resourceID = fileHashID, extensionID = StringID(fileExtension), serviceEndpoint = serviceEndpoint)),
    schema.constants.Properties.SupplyProperty.copy(data = NumberData(supply))
  )

  def getDefaultImmutableMesaProperties(secretValue: String): Seq[MesaProperty] = Seq(
    MesaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.SECRET_VALUE), typeID = schema.data.constants.StringDataTypeID), data = StringData(secretValue)),
  )

  def getDefaultMutableMetaProperties(rented: Boolean, rentAmount: BigDecimal, rentPeriodicity: Int, documentLink: String): Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.RENTED), typeID = schema.data.constants.BooleanDataTypeID), data = BooleanData(rented)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.RENTAL_AMOUNT), typeID = schema.data.constants.DecDataTypeID), data = DecData(rentAmount)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.RENT_PERIODICITY), typeID = schema.data.constants.NumberDataTypeID), data = NumberData(rentPeriodicity)),
    MetaProperty(id = PropertyID(keyID = StringID(constants.Asset.DefaultProperty.DOCUMENT_LINK), typeID = schema.data.constants.StringDataTypeID), data = StringData(documentLink)),
    schema.constants.Properties.BondAmountProperty.copy(data = NumberData(constants.Asset.BondAmount))
  )

  def getDefaultMutableMesaProperties: Seq[MesaProperty] = Seq()

  def getImmutables(creatorId: String, registrationId: String, address: String, postalCode: String, totalArea: BigDecimal, geoLocation: String, supply: BigInt, fileHashID: HashID, fileExtension: String, serviceEndpoint: String, secretValue: String): Immutables =
    Immutables(
      getDefaultImmutableMetaProperties(creatorId = creatorId, registrationId = registrationId, address = address, postalCode = postalCode, totalArea = totalArea, geoLocation = geoLocation, supply = supply, fileHashID = fileHashID, fileExtension = fileExtension, serviceEndpoint = serviceEndpoint) ++ getDefaultImmutableMesaProperties(secretValue = secretValue)
    )

  def getMutables(rented: Boolean, rentAmount: BigDecimal, rentPeriodicity: Int, documentLink: String): Mutables = Mutables(getDefaultMutableMetaProperties(rented = rented, rentAmount = rentAmount, rentPeriodicity = rentPeriodicity, documentLink = documentLink))

  def getServiceEndPoint(id: String, fileExtension: String): String = "https://marketplace.assetmantle.one/nftResource/" + id + "." + fileExtension

  // TODO BondRate from parameters
  def getAssetID(classificationID: ClassificationID, immutables: Immutables): AssetID = schema.utilities.ID.getAssetID(classificationID, immutables)

}
