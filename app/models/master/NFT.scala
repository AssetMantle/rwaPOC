package models.master

import models.master.NFTs.NFTTable
import models.traits._
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import schema.id.base.{AssetID, HashID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.qualified.{Immutables, Mutables}
import slick.jdbc.H2Profile.api._

import javax.inject.{Inject, Singleton}
import javax.xml.bind.DatatypeConverter
import scala.concurrent.{ExecutionContext, Future}

case class NFT(id: String, assetId: String, creatorId: String, totalSupply: BigInt, verified: Option[Boolean], isMinted: Option[Boolean], fileExtension: String, registrationId: String, description: String, address: String, postalCode: String, totalArea: BigDecimal, geoLocation: String, secretValue: String, rented: Boolean, rentalAmount: BigDecimal, rentPeriodicity: Int, documentLink: String, featured: Boolean, ranking: Int) {

  def getFileHash: String = this.id

  def getExplorerUrl = s"${constants.CommonConfig.ExplorerUrl}/document/${this.getAssetID.asString}"

  def getFileHashID: HashID = HashID(DatatypeConverter.parseHexBinary(this.id))

  def getFileName: String = this.id + "." + this.fileExtension

  def getAssetID: AssetID = AssetID(HashID(utilities.Secrets.base64URLDecode(this.assetId)))

  def getAwsKey: String = utilities.NFT.getAWSKey(this.getFileName)

  def getS3Url: String = constants.CommonConfig.AmazonS3.s3BucketURL + this.getAwsKey

  def getServiceEndPoint: String = utilities.Asset.getServiceEndPoint(id = this.id, fileExtension = this.fileExtension)

  def getImmutableMetaProperties: Seq[MetaProperty] = utilities.Asset.getDefaultImmutableMetaProperties(registrationId = this.registrationId, creatorId = this.creatorId, address = this.address, postalCode = this.postalCode, totalArea = this.totalArea, geoLocation = this.geoLocation, supply = this.totalSupply, fileHashID = this.getFileHashID, fileExtension = this.fileExtension, serviceEndpoint = this.getServiceEndPoint)

  def getImmutableProperties: Seq[MesaProperty] = utilities.Asset.getDefaultImmutableMesaProperties(this.secretValue)

  def getMutableMetaProperties: Seq[MetaProperty] = utilities.Asset.getDefaultMutableMetaProperties(rented = this.rented, rentAmount = this.rentalAmount, this.rentPeriodicity, this.documentLink)

  def getMutableProperties: Seq[MesaProperty] = utilities.Asset.getDefaultMutableMesaProperties

  def getImmutables: Immutables = Immutables(PropertyList(this.getImmutableMetaProperties ++ this.getImmutableProperties))

  def getMutables: Mutables = Mutables(PropertyList(this.getMutableMetaProperties ++ this.getMutableProperties))

  def serialize: NFTs.NFTSerialized = NFTs.NFTSerialized(
    id = this.id,
    assetId = this.assetId,
    creatorId = this.creatorId,
    totalSupply = BigDecimal(this.totalSupply),
    verified = this.verified,
    isMinted = this.isMinted,
    fileExtension = this.fileExtension.toLowerCase,
    registrationId = this.registrationId,
    description = this.description,
    address = this.address,
    postalCode = this.postalCode,
    totalArea = this.totalArea,
    geoLocation = this.geoLocation,
    secretValue = this.secretValue,
    rented = this.rented,
    rentalAmount = this.rentalAmount,
    rentPeriodicity = this.rentPeriodicity,
    documentLink = this.documentLink,
    featured = this.featured,
    ranking = this.ranking,
  )

  def isImageType: Boolean = constants.File.ALL_IMAGES_WITH_GIF.contains(this.fileExtension)

  def isAudioType: Boolean = constants.File.ALL_AUDIO.contains(this.fileExtension)

}

private[master] object NFTs {

  case class NFTSerialized(id: String, assetId: String, creatorId: String, totalSupply: BigDecimal, verified: Option[Boolean], isMinted: Option[Boolean], fileExtension: String, registrationId: String, description: String, address: String, postalCode: String, totalArea: BigDecimal, geoLocation: String, secretValue: String, rented: Boolean, rentalAmount: BigDecimal, rentPeriodicity: Int, documentLink: String, featured: Boolean, ranking: Int) extends Entity[String] {

    def deserialize()(implicit module: String, logger: Logger): NFT = NFT(
      id = this.id,
      assetId = this.assetId,
      creatorId = this.creatorId,
      totalSupply = this.totalSupply.toBigInt,
      isMinted = this.isMinted,
      verified = this.verified,
      fileExtension = this.fileExtension,
      registrationId = this.registrationId,
      description = this.description,
      address = this.address,
      postalCode = this.postalCode,
      totalArea = this.totalArea,
      geoLocation = this.geoLocation,
      secretValue = this.secretValue,
      rented = this.rented,
      rentalAmount = this.rentalAmount,
      rentPeriodicity = this.rentPeriodicity,
      documentLink = this.documentLink,
      featured = this.featured,
      ranking = this.ranking
    )
  }

  class NFTTable(tag: Tag) extends Table[NFTSerialized](tag, "NFT") with ModelTable[String] {

    def * = (id, assetId, creatorId, totalSupply, verified.?, isMinted.?, fileExtension, registrationId, description, address, postalCode, totalArea, geoLocation, secretValue, rented, rentalAmount, rentPeriodicity, documentLink, featured, ranking) <> (NFTSerialized.tupled, NFTSerialized.unapply)

    def id = column[String]("id", O.PrimaryKey)

    def assetId = column[String]("assetId")

    def creatorId = column[String]("creatorId")

    def totalSupply = column[BigDecimal]("totalSupply")

    def verified = column[Boolean]("verified")

    def isMinted = column[Boolean]("isMinted")

    def fileExtension = column[String]("fileExtension")

    def registrationId = column[String]("registrationId")

    def description = column[String]("description")

    def address = column[String]("address")

    def postalCode = column[String]("postalCode")

    def totalArea = column[BigDecimal]("totalArea")

    def geoLocation = column[String]("geoLocation")

    def secretValue = column[String]("secretValue")

    def rented = column[Boolean]("rented")

    def rentalAmount = column[BigDecimal]("rentalAmount")

    def rentPeriodicity = column[Int]("rentPeriodicity")

    def documentLink = column[String]("documentLink")

    def featured = column[Boolean]("featured")

    def ranking = column[Int]("ranking")
  }
}

@Singleton
class NFTs @Inject()(
                      protected val dbConfigProvider: DatabaseConfigProvider,
                    )(implicit val executionContext: ExecutionContext)
  extends GenericDaoImpl[NFTs.NFTTable, NFTs.NFTSerialized, String]() {

  implicit val module: String = constants.Module.MASTER_NFT

  implicit val logger: Logger = Logger(this.getClass)

  val tableQuery = new TableQuery(tag => new NFTTable(tag))

  object Service {
    def add(nft: NFT): Future[String] = create(nft.serialize).map(_.id)

    def tryGet(nftId: String): Future[NFT] = tryGetById(nftId).map(_.deserialize)

    def getByPageNumber(pageNumber: Int): Future[Seq[NFT]] = sortWithPagination(_.ranking)(offset = (pageNumber - 1) * constants.CommonConfig.Pagination.NFTsPerPage, limit = constants.CommonConfig.Pagination.NFTsPerPage).map(_.map(_.deserialize))

    def getByPageNumber(creatorId: String, pageNumber: Int): Future[Seq[NFT]] = filterAndSortWithPagination(_.creatorId === creatorId)(_.ranking)(offset = (pageNumber - 1) * constants.CommonConfig.Pagination.NFTsPerPage, limit = constants.CommonConfig.Pagination.NFTsPerPage).map(_.map(_.deserialize))

    def checkExists(id: String): Future[Boolean] = exists(id)

    def getByIds(ids: Seq[String]): Future[Seq[NFT]] = filter(_.id.inSet(ids)).map(_.map(_.deserialize))

    def getForMinting: Future[Seq[NFT]] = filter(x => x.verified && !x.isMinted).map(_.take(300)).map(_.map(_.deserialize))

    def update(nft: NFT): Future[Unit] = updateById(nft.serialize)

    def markNFTsMintPending(ids: Seq[String]): Future[Int] = customUpdate(tableQuery.filter(_.id.inSet(ids)).map(_.isMinted.?).update(null))

    def markNFTsMinted(ids: Seq[String]): Future[Int] = customUpdate(tableQuery.filter(_.id.inSet(ids)).map(_.isMinted).update(true))

    def markNFTsMintFailed(ids: Seq[String]): Future[Int] = customUpdate(tableQuery.filter(_.id.inSet(ids)).map(_.isMinted).update(false))

    def updateAssetID(id: String, assetID: AssetID): Future[Int] = customUpdate(tableQuery.filter(_.id === id).map(_.assetId).update(assetID.asString))

    def fetchAllWithNullAssetID(): Future[Seq[NFT]] = filter(_.assetId.?.isEmpty).map(_.map(_.deserialize))

    def getUnmintedNFTIDs: Future[Seq[String]] = customQuery(tableQuery.filter(x => (!x.isMinted.?.getOrElse(true)) || !x.verified).map(_.id).result)

    def getByAssetId(assetId: AssetID): Future[Option[NFT]] = filter(_.assetId === assetId.asString).map(_.headOption).map(_.map(_.deserialize))

    def getByAssetId(assetId: String): Future[Option[NFT]] = filter(_.assetId === assetId).map(_.headOption).map(_.map(_.deserialize))

    def delete(id: String): Future[Int] = deleteById(id)

    def markReadyForMint(ids: Seq[String]): Future[Int] = if (ids.nonEmpty) customUpdate(tableQuery.filter(_.id.inSet(ids)).map(_.verified).update(true)) else Future(0)

    def getAllNFTs: Future[Seq[NFT]] = getAll.map(_.map(_.deserialize))
  }
}