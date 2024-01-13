package models.masterTransaction

import models.common.Asset._
import models.master._
import models.masterTransaction.NFTDrafts.NFTDraftTable
import models.traits._
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json.Json
import schema.id.base.HashID
import slick.jdbc.H2Profile.api._

import javax.inject.{Inject, Singleton}
import javax.xml.bind.DatatypeConverter
import scala.concurrent.{ExecutionContext, Future}


case class NFTDraft(id: String, creatorId: String, properties: Option[Properties], fileExtension: String, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Logging {

  def getFileHashID: HashID = HashID(DatatypeConverter.parseHexBinary(this.id))

  def getSupply: Long = this.properties.fold(0L)(_.totalSupply.toLong)

  def getBondAmount: Long = constants.Asset.BondAmount

  def getFileHash: String = id

  def getFileName: String = this.id + "." + this.fileExtension

  def getServiceEndPoint: String = utilities.Asset.getServiceEndPoint(id = this.id, fileExtension = this.fileExtension)

  def getRegistrationId: String = this.properties.fold("")(_.registrationId)

  def getDescription: String = this.properties.fold("")(_.description)

  def getAddress: String = this.properties.fold("")(_.address)

  def getPostalCode: String = this.properties.fold("")(_.postalCode)

  def getTotalArea: BigDecimal = this.properties.fold(BigDecimal(0.0))(_.totalArea)

  def getGeoLocation: String = this.properties.fold("")(_.geoLocation)

  def getSecretValue: String = this.properties.fold("")(_.secretValue)

  def getRented: Boolean = this.properties.fold(false)(_.rented)

  def getRentalAmt: BigDecimal = this.properties.fold(BigDecimal(0.0))(_.rentalAmount)

  def getRentPeriod: Int = this.properties.fold(0)(_.rentPeriodicity)

  def getDocumentLink: String = this.properties.fold("")(_.documentLink)

  def toNFT: NFT = {
    NFT(
      id = id,
      assetId = if (this.properties.isDefined) utilities.Asset.getAssetID(
        constants.Asset.ClassificationId,
        utilities.Asset.getImmutables(
          registrationId = this.getRegistrationId,
          creatorId = this.creatorId,
          address = this.getAddress,
          postalCode = this.getPostalCode,
          totalArea = this.getTotalArea,
          geoLocation = this.getGeoLocation,
          supply = this.getSupply,
          fileHashID = this.getFileHashID,
          fileExtension = this.fileExtension,
          serviceEndpoint = this.getServiceEndPoint,
          secretValue = this.getSecretValue,
        )).asString else "",
      creatorId = this.creatorId,
      totalSupply = this.getSupply,
      verified = Option(true),
      isMinted = Option(false),
      fileExtension = fileExtension,
      description = this.getDescription,
      registrationId = this.getRegistrationId,
      address = this.getAddress,
      postalCode = this.getPostalCode,
      totalArea = this.getTotalArea,
      geoLocation = this.getGeoLocation,
      secretValue = this.getSecretValue,
      rented = this.getRented,
      rentalAmount = this.getRentalAmt,
      rentPeriodicity = this.getRentPeriod,
      documentLink = this.getDocumentLink,
      featured = false,
      ranking = Int.MaxValue
    )
  }

  def toNFTOwner(ownerID: String, creatorId: String): NFTOwner = NFTOwner(nftId = id, ownerId = ownerID, creatorId = creatorId, quantity = this.getSupply)

  def serialize(): NFTDrafts.NFTDraftSerialized = NFTDrafts.NFTDraftSerialized(
    id = this.id,
    creatorId = this.creatorId,
    fileExtension = this.fileExtension.toLowerCase,
    properties = this.properties.map(x => Json.toJson(x).toString()),
    createdBy = this.createdBy,
    createdOnMillisEpoch = this.createdOnMillisEpoch,
    updatedBy = this.updatedBy,
    updatedOnMillisEpoch = this.updatedOnMillisEpoch)
}

private[masterTransaction] object NFTDrafts {

  case class NFTDraftSerialized(id: String, creatorId: String, properties: Option[String], fileExtension: String, createdBy: Option[String], createdOnMillisEpoch: Option[Long], updatedBy: Option[String], updatedOnMillisEpoch: Option[Long]) extends Entity[String] {
    def deserialize()(implicit module: String, logger: Logger): NFTDraft = NFTDraft(id = id, creatorId = creatorId, fileExtension = fileExtension, properties = properties.map(x => utilities.JSON.convertJsonStringToObject[Properties](x)), createdBy = createdBy, createdOnMillisEpoch = createdOnMillisEpoch, updatedBy = updatedBy, updatedOnMillisEpoch = updatedOnMillisEpoch)
  }

  class NFTDraftTable(tag: Tag) extends Table[NFTDraftSerialized](tag, "NFTDraft") with ModelTable[String] {

    def * = (id, creatorId, properties.?, fileExtension, createdBy.?, createdOnMillisEpoch.?, updatedBy.?, updatedOnMillisEpoch.?) <> (NFTDraftSerialized.tupled, NFTDraftSerialized.unapply)

    def id = column[String]("id", O.PrimaryKey)

    def creatorId = column[String]("creatorId")

    def properties = column[String]("properties")

    def fileExtension = column[String]("fileExtension")

    def createdBy = column[String]("createdBy")

    def createdOnMillisEpoch = column[Long]("createdOnMillisEpoch")

    def updatedBy = column[String]("updatedBy")

    def updatedOnMillisEpoch = column[Long]("updatedOnMillisEpoch")

  }
}

@Singleton
class NFTDrafts @Inject()(
                           protected val dbConfigProvider: DatabaseConfigProvider,
                         )(implicit val executionContext: ExecutionContext)
  extends GenericDaoImpl[NFTDrafts.NFTDraftTable, NFTDrafts.NFTDraftSerialized, String]() {

  implicit val module: String = constants.Module.MASTER_TRANSACTION_NFT_DRAFT

  implicit val logger: Logger = Logger(this.getClass)

  val tableQuery = new TableQuery(tag => new NFTDraftTable(tag))

  object Service {

    def add(id: String, fileExtension: String, creatorId: String): Future[String] = {
      create(NFTDraft(
        id = id,
        fileExtension = fileExtension,
        creatorId = creatorId,
        properties = None
      ).serialize()).map(_.id)
    }

    def tryGet(id: String): Future[NFTDraft] = tryGetById(id).map(_.deserialize)

    def getByPageNumber(pageNumber: Int): Future[Seq[NFTDraft]] = sortWithPagination(_.updatedOnMillisEpoch.desc)(offset = (pageNumber - 1) * constants.CommonConfig.Pagination.NFTsPerPage, limit = constants.CommonConfig.Pagination.NFTsPerPage).map(_.map(_.deserialize))

    def get(id: String): Future[Option[NFTDraft]] = getById(id).map(_.map(_.deserialize))

    def countAll: Future[Int] = countTotal()

    def checkExists(id: String): Future[Boolean] = exists(id)

    def deleteNFT(id: String): Future[Int] = filterAndDelete(_.id === id)

    def getByIds(ids: Seq[String]): Future[Seq[NFTDraft]] = filter(_.id.inSet(ids)).map(_.map(_.deserialize))

    def update(id: String, properties: Properties): Future[NFTDraft] = {
      val draft = tryGet(id)
      for {
        draft <- draft
        _ <- updateById(draft.copy(properties = Option(properties)).serialize())
      } yield draft.copy(properties = Option(properties))
    }

    def delete(id: String): Future[Int] = deleteById(id)

    def getAllNFTs(accountId: String): Future[Seq[NFTDraft]] = filter(_.creatorId === accountId).map(_.map(_.deserialize()))

    def countForCreator(creatorId: String): Future[Int] = filterAndCount(_.creatorId === creatorId)
  }
}