package models.master

import models.master.BurntNFTs.BurntNFTTable
import models.traits._
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.H2Profile.api._

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

case class BurntNFT(nftId: String, txHash: String, assetId: String, classificationId: String, supply: BigInt, name: String, description: String, fileExtension: String, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Logging {

  def serialize(): BurntNFTs.BurntNFTSerialized = BurntNFTs.BurntNFTSerialized(
    nftId = this.nftId,
    txHash = this.txHash,
    assetId = this.assetId,
    classificationId = this.classificationId,
    supply = BigDecimal(this.supply),
    name = this.name,
    description = this.description,
    fileExtension = this.fileExtension,
    createdBy = this.createdBy,
    createdOnMillisEpoch = this.createdOnMillisEpoch,
    updatedBy = this.updatedBy,
    updatedOnMillisEpoch = this.updatedOnMillisEpoch)
}

private[master] object BurntNFTs {
  case class BurntNFTSerialized(nftId: String, txHash: String, assetId: String, classificationId: String, supply: BigDecimal, name: String, description: String, fileExtension: String, createdBy: Option[String], createdOnMillisEpoch: Option[Long], updatedBy: Option[String], updatedOnMillisEpoch: Option[Long]) extends Entity2[String, String] {
    def deserialize()(implicit module: String, logger: Logger): BurntNFT = BurntNFT(nftId = nftId, assetId = assetId, classificationId = classificationId, supply = supply.toBigInt, txHash = txHash, name = name, description = description, fileExtension = fileExtension, createdBy = createdBy, createdOnMillisEpoch = createdOnMillisEpoch, updatedBy = updatedBy, updatedOnMillisEpoch = updatedOnMillisEpoch)

    def id1 = nftId

    def id2 = txHash
  }

  class BurntNFTTable(tag: Tag) extends Table[BurntNFTSerialized](tag, "BurntNFT") with ModelTable2[String, String] {

    def * = (nftId, txHash, assetId, classificationId, supply, name, description, fileExtension, createdBy.?, createdOnMillisEpoch.?, updatedBy.?, updatedOnMillisEpoch.?) <> (BurntNFTSerialized.tupled, BurntNFTSerialized.unapply)

    def nftId = column[String]("nftId", O.PrimaryKey)

    def txHash = column[String]("txHash", O.PrimaryKey)

    def assetId = column[String]("assetId")

    def classificationId = column[String]("classificationId")

    def supply = column[BigDecimal]("supply")

    def name = column[String]("name")

    def description = column[String]("description")

    def fileExtension = column[String]("fileExtension")

    def createdBy = column[String]("createdBy")

    def createdOnMillisEpoch = column[Long]("createdOnMillisEpoch")

    def updatedBy = column[String]("updatedBy")

    def updatedOnMillisEpoch = column[Long]("updatedOnMillisEpoch")

    def id1 = nftId

    def id2 = txHash

  }
}

@Singleton
class BurntNFTs @Inject()(
                           protected val dbConfigProvider: DatabaseConfigProvider,
                         )(implicit val executionContext: ExecutionContext)
  extends GenericDaoImpl2[BurntNFTs.BurntNFTTable, BurntNFTs.BurntNFTSerialized, String, String]() {

  implicit val module: String = constants.Module.MASTER_BURNT_NFT

  implicit val logger: Logger = Logger(this.getClass)

  val tableQuery = new TableQuery(tag => new BurntNFTTable(tag))

  object Service {

    def add(nftId: String, txHash: String, assetId: String, classificationId: String, supply: BigInt, name: String, description: String, fileExtension: String): Future[String] = {
      val burntNFT = BurntNFT(nftId = nftId, txHash = txHash, assetId = assetId, classificationId = classificationId, supply = supply, name = name, description = description, fileExtension = fileExtension)
      create(burntNFT.serialize()).map(_.nftId)
    }

    def checkExists(nftId: String): Future[Boolean] = filterAndExists(_.nftId === nftId)

  }
}