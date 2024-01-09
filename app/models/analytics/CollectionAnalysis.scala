package models.analytics

import models.master._
import models.traits._
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.H2Profile.api._
import utilities.MicroNumber

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

case class CollectionAnalysis(id: String, totalNFTs: Long, totalMinted: Long, totalBurnt: Long, totalSold: Long, totalTraded: Long, floorPrice: MicroNumber, salePrice: MicroNumber, publicListingPrice: MicroNumber, totalVolumeTraded: MicroNumber, bestOffer: MicroNumber, listed: Long, owners: Long, uniqueOwners: Long, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Entity[String] with Logging {

  def serialize: CollectionsAnalysis.CollectionAnalysisSerialized = CollectionsAnalysis.CollectionAnalysisSerialized(
    id = this.id,
    totalNFTs = this.totalNFTs,
    totalMinted = this.totalMinted,
    totalBurnt = this.totalBurnt,
    totalSold = this.totalSold,
    totalTraded = this.totalTraded,
    floorPrice = this.floorPrice.toBigDecimal,
    salePrice = this.salePrice.toBigDecimal,
    publicListingPrice = this.publicListingPrice.toBigDecimal,
    totalVolumeTraded = this.totalVolumeTraded.toBigDecimal,
    bestOffer = this.bestOffer.toBigDecimal,
    listed = this.listed,
    owners = this.owners,
    uniqueOwners = this.uniqueOwners,
    createdBy = this.createdBy,
    createdOnMillisEpoch = this.createdOnMillisEpoch,
    updatedBy = this.updatedBy,
    updatedOnMillisEpoch = this.updatedOnMillisEpoch
  )

}

private[analytics] object CollectionsAnalysis {

  case class CollectionAnalysisSerialized(id: String, totalNFTs: Long, totalMinted: Long, totalBurnt: Long, totalSold: Long, totalTraded: Long, floorPrice: BigDecimal, salePrice: BigDecimal, publicListingPrice: BigDecimal, totalVolumeTraded: BigDecimal, bestOffer: BigDecimal, listed: Long, owners: Long, uniqueOwners: Long, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Entity[String] with Logging {

    def deserialize()(implicit module: String, logger: Logger): CollectionAnalysis = CollectionAnalysis(
      id = this.id,
      totalNFTs = this.totalNFTs,
      totalMinted = this.totalMinted,
      totalBurnt = this.totalBurnt,
      totalSold = this.totalSold,
      totalTraded = this.totalTraded,
      floorPrice = MicroNumber(this.floorPrice),
      salePrice = MicroNumber(this.salePrice),
      publicListingPrice = MicroNumber(this.publicListingPrice),
      totalVolumeTraded = MicroNumber(this.totalVolumeTraded),
      bestOffer = MicroNumber(this.bestOffer),
      listed = this.listed,
      owners = this.owners,
      uniqueOwners = this.uniqueOwners,
      createdBy = this.createdBy,
      createdOnMillisEpoch = this.createdOnMillisEpoch,
      updatedBy = this.updatedBy,
      updatedOnMillisEpoch = this.updatedOnMillisEpoch
    )

  }

  class CollectionAnalysisTable(tag: Tag) extends Table[CollectionAnalysisSerialized](tag, "CollectionAnalysis") with ModelTable[String] {

    def * = (id, totalNFTs, totalMinted, totalBurnt, totalSold, totalTraded, floorPrice, salePrice, publicListingPrice, totalVolumeTraded, bestOffer, listed, owners, uniqueOwners, createdBy.?, createdOnMillisEpoch.?, updatedBy.?, updatedOnMillisEpoch.?) <> (CollectionAnalysisSerialized.tupled, CollectionAnalysisSerialized.unapply)

    def id = column[String]("id", O.PrimaryKey)

    def totalNFTs = column[Long]("totalNFTs")

    def totalMinted = column[Long]("totalMinted")

    def totalBurnt = column[Long]("totalBurnt")

    def totalSold = column[Long]("totalSold")

    def totalTraded = column[Long]("totalTraded")

    def floorPrice = column[BigDecimal]("floorPrice")

    def salePrice = column[BigDecimal]("salePrice")

    def publicListingPrice = column[BigDecimal]("publicListingPrice")

    def totalVolumeTraded = column[BigDecimal]("totalVolumeTraded")

    def bestOffer = column[BigDecimal]("bestOffer")

    def listed = column[Long]("listed")

    def owners = column[Long]("owners")

    def uniqueOwners = column[Long]("uniqueOwners")

    def createdBy = column[String]("createdBy")

    def createdOnMillisEpoch = column[Long]("createdOnMillisEpoch")

    def updatedBy = column[String]("updatedBy")

    def updatedOnMillisEpoch = column[Long]("updatedOnMillisEpoch")

  }
}

@Singleton
class CollectionsAnalysis @Inject()(
                                     masterCollections: Collections,
                                     masterNFTs: NFTs,
                                     masterSecondaryMarkets: SecondaryMarkets,
                                     protected val dbConfigProvider: DatabaseConfigProvider,
                                   )(implicit val executionContext: ExecutionContext)
  extends GenericDaoImpl[CollectionsAnalysis.CollectionAnalysisTable, CollectionsAnalysis.CollectionAnalysisSerialized, String]() {

  implicit val module: String = constants.Module.ANALYTICS_COLLECTION

  implicit val logger: Logger = Logger(this.getClass)

  val tableQuery = new TableQuery(tag => new CollectionsAnalysis.CollectionAnalysisTable(tag))

  object Service {

    def add(collectionAnalysis: CollectionAnalysis): Future[String] = create(collectionAnalysis.serialize).map(_.id)

    def add(collectionsAnalysis: Seq[CollectionAnalysis]): Future[Int] = create(collectionsAnalysis.map(_.serialize))

    def tryGet(id: String): Future[CollectionAnalysis] = filterHead(_.id === id).map(_.deserialize)

    def update(collectionAnalysis: CollectionAnalysis): Future[Unit] = updateById(collectionAnalysis.serialize)

    def delete(ids: Seq[String]): Future[Int] = filterAndDelete(_.id.inSet(ids))
  }

  object Utility {

    def onNewCollection(id: String): Future[String] = Service.add(CollectionAnalysis(id = id, totalNFTs = 0, totalSold = 0, totalTraded = 0, floorPrice = 0, salePrice = 0, publicListingPrice = 0, totalVolumeTraded = 0, bestOffer = 0, listed = 0, owners = 0, uniqueOwners = 0, totalMinted = 0, totalBurnt = 0))

    def onNewNFT(collectionId: String): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(totalNFTs = collectionAnalysis.totalNFTs + 1))
      } yield ()
    }

    def onCreateSale(collectionId: String, salePrice: MicroNumber): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(salePrice = salePrice))
      } yield ()
    }

    def onCreatePublicListing(collectionId: String, listingPrice: MicroNumber): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(publicListingPrice = listingPrice))
      } yield ()
    }

    def onCreateSecondaryMarket(collectionId: String, totalListed: Int, listingPrice: MicroNumber): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      def update(collectionAnalysis: CollectionAnalysis) = {
        val newFloorPrice = if (collectionAnalysis.floorPrice > MicroNumber.zero) Seq(listingPrice, collectionAnalysis.floorPrice).min else listingPrice
        Service.update(collectionAnalysis.copy(listed = collectionAnalysis.listed + totalListed, floorPrice = newFloorPrice))
      }

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- update(collectionAnalysis)
      } yield ()
    }

    def onSuccessfulBuyFromMarket(collectionId: String, price: MicroNumber, quantity: Int): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)
      val floorPrice = masterSecondaryMarkets.Service.getFloorPriceForCollection(collectionId)
      for {
        collectionAnalysis <- collectionAnalysis
        floorPrice <- floorPrice
        _ <- Service.update(collectionAnalysis.copy(listed = collectionAnalysis.listed - 1, floorPrice = floorPrice, totalTraded = collectionAnalysis.totalTraded + quantity, totalSold = collectionAnalysis.totalSold + quantity, totalVolumeTraded = collectionAnalysis.totalVolumeTraded + (price * quantity)))
      } yield ()
    }

    def onCancelSecondaryMarket(collectionId: String, totalRemoved: Int): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)
      val floorPrice = masterSecondaryMarkets.Service.getFloorPriceForCollection(collectionId)

      def update(collectionAnalysis: CollectionAnalysis, floorPrice: MicroNumber) = {
        Service.update(collectionAnalysis.copy(listed = collectionAnalysis.listed - totalRemoved, floorPrice = floorPrice))
      }

      for {
        collectionAnalysis <- collectionAnalysis
        floorPrice <- floorPrice
        _ <- update(collectionAnalysis, floorPrice)
      } yield ()
    }

    def onSuccessfulSellFromSale(collectionId: String, price: MicroNumber, quantity: Int): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(listed = collectionAnalysis.listed - 1, totalTraded = collectionAnalysis.totalTraded + quantity, totalSold = collectionAnalysis.totalSold + quantity, totalVolumeTraded = collectionAnalysis.totalVolumeTraded + (price * quantity)))
      } yield ()
    }

    def onBurn(collectionId: String): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(totalBurnt = collectionAnalysis.totalBurnt + 1))
      } yield ()
    }

    def onMint(collectionId: String): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(totalMinted = collectionAnalysis.totalMinted + 1))
      } yield ()
    }

    def onMintAndSale(collectionId: String, price: MicroNumber): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(totalMinted = collectionAnalysis.totalMinted + 1, listed = collectionAnalysis.listed - 1, totalTraded = collectionAnalysis.totalTraded, totalVolumeTraded = collectionAnalysis.totalVolumeTraded + price))
      } yield ()
    }

    def onSaleExpiry(collectionId: String): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(salePrice = MicroNumber.zero))
      } yield ()
    }

    def onPublicListingExpiry(collectionId: String): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(publicListingPrice = MicroNumber.zero))
      } yield ()
    }

    def addMinted(collectionId: String, minted: Long): Future[Unit] = {
      val collectionAnalysis = Service.tryGet(collectionId)

      for {
        collectionAnalysis <- collectionAnalysis
        _ <- Service.update(collectionAnalysis.copy(totalMinted = collectionAnalysis.totalMinted + minted))
      } yield ()
    }
  }
}