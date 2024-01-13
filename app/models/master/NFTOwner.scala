package models.master

import models.master.NFTOwners.NFTOwnerTable
import models.traits._
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import schema.id.base.IdentityID
import slick.jdbc.H2Profile.api._

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

case class NFTOwner(nftId: String, ownerId: String, creatorId: String, quantity: BigInt, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Logging {

  def getOwnerIdentityID: IdentityID = utilities.Identity.getMantlePlaceIdentityID(this.ownerId)

  def serialize: NFTOwners.NFTOwnerSerialized = NFTOwners.NFTOwnerSerialized(nftId = this.nftId, ownerId = this.ownerId, creatorId = this.creatorId, quantity = BigDecimal(this.quantity), createdBy = this.createdBy, createdOnMillisEpoch = this.createdOnMillisEpoch, updatedBy = this.updatedBy, updatedOnMillisEpoch = this.updatedOnMillisEpoch)

}

private[master] object NFTOwners {
  case class NFTOwnerSerialized(nftId: String, ownerId: String, creatorId: String, quantity: BigDecimal, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Entity2[String, String] {
    def id1: String = nftId

    def id2: String = ownerId

    def deserialize()(implicit module: String, logger: Logger): NFTOwner = NFTOwner(nftId = this.nftId, ownerId = this.ownerId, creatorId = this.creatorId, quantity = this.quantity.toBigInt, createdBy = this.createdBy, createdOnMillisEpoch = this.createdOnMillisEpoch, updatedBy = this.updatedBy, updatedOnMillisEpoch = this.updatedOnMillisEpoch)
  }

  class NFTOwnerTable(tag: Tag) extends Table[NFTOwners.NFTOwnerSerialized](tag, "NFTOwner") with ModelTable2[String, String] {

    def * = (nftId, ownerId, creatorId, quantity, createdBy.?, createdOnMillisEpoch.?, updatedBy.?, updatedOnMillisEpoch.?) <> (NFTOwners.NFTOwnerSerialized.tupled, NFTOwners.NFTOwnerSerialized.unapply)

    def nftId = column[String]("nftId", O.PrimaryKey)

    def ownerId = column[String]("ownerId", O.PrimaryKey)

    def creatorId = column[String]("creatorId")

    def quantity = column[BigDecimal]("quantity")

    def createdBy = column[String]("createdBy")

    def createdOnMillisEpoch = column[Long]("createdOnMillisEpoch")

    def updatedBy = column[String]("updatedBy")

    def updatedOnMillisEpoch = column[Long]("updatedOnMillisEpoch")

    def id1 = nftId

    def id2 = ownerId
  }
}

@Singleton
class NFTOwners @Inject()(
                           masterNFTs: NFTs,
                           protected val dbConfigProvider: DatabaseConfigProvider,
                         )(implicit val executionContext: ExecutionContext)
  extends GenericDaoImpl2[NFTOwners.NFTOwnerTable, NFTOwners.NFTOwnerSerialized, String, String]() {

  implicit val module: String = constants.Module.MASTER_NFT_OWNER

  implicit val logger: Logger = Logger(this.getClass)

  val tableQuery = new TableQuery(tag => new NFTOwnerTable(tag))

  object Service {

    def add(nftOwner: NFTOwner): Future[String] = create(nftOwner.serialize).map(_.nftId)

    def add(nftOwners: Seq[NFTOwner]): Future[Int] = create(nftOwners.map(_.serialize))

    def update(NFTOwner: NFTOwner): Future[Int] = updateById1AndId2(NFTOwner.serialize)

    def onSecondaryMarket(nftId: String, ownerId: String, sellQuantity: BigInt): Future[Int] = {
      val nftOwner = tryGet(nftId = nftId, ownerId = ownerId)

      def checkAndUpdate(nftOwner: NFTOwner) = if (nftOwner.quantity > sellQuantity) update(nftOwner.copy(quantity = nftOwner.quantity - sellQuantity))
      else if (nftOwner.quantity == sellQuantity) delete(nftId = nftId, ownerId = ownerId)
      else constants.Response.INVALID_QUANTITY_FOR_NFT_SECONDARY_MARKET.throwBaseException()

      for {
        nftOwner <- nftOwner
        result <- checkAndUpdate(nftOwner)
      } yield result
    }

    def delete(nftId: String, ownerId: String): Future[Int] = deleteById1AndId2(id1 = nftId, id2 = ownerId)

    def deleteByNFT(nftId: String): Future[Int] = filterAndDelete(_.nftId === nftId)

    def onSuccessfulBuyFromSecondaryMarket(nftId: String, totalSold: BigInt, buyerId: String): Future[Unit] = {
      val oldNFTOwner = get(nftId = nftId, ownerId = buyerId)
      val nft = masterNFTs.Service.tryGet(nftId)

      def verifyAndUpdate(oldNFTOwner: Option[NFTOwner], nft: NFT) = if (oldNFTOwner.isDefined) {
        for {
          _ <- update(oldNFTOwner.get.copy(quantity = oldNFTOwner.get.quantity + totalSold))
        } yield ()
      } else {
        for {
          _ <- add(NFTOwner(nftId = nftId, ownerId = buyerId, creatorId = nft.creatorId, quantity = totalSold))
        } yield ()
      }

      for {
        oldNFTOwner <- oldNFTOwner
        nft <- nft
        _ <- verifyAndUpdate(oldNFTOwner, nft)
      } yield ()
    }

    def tryGet(nftId: String, ownerId: String): Future[NFTOwner] = tryGetById1AndId2(id1 = nftId, id2 = ownerId).map(_.deserialize)

    def get(nftId: String, ownerId: String): Future[Option[NFTOwner]] = getById(id1 = nftId, id2 = ownerId).map(_.map(_.deserialize))

    def getOwners(nftId: String): Future[Seq[NFTOwner]] = filter(_.id1 === nftId).map(_.map(_.deserialize))

    def checkExists(nftId: String, ownerId: String): Future[Boolean] = exists(id1 = nftId, id2 = ownerId)

    def unlistFromSecondaryMarket(nft: NFT, ownerId: String, sellQuantity: BigInt): Future[Unit] = {
      val nftOwner = get(nftId = nft.id, ownerId = ownerId)

      def checkAndUpdate(nftOwner: Option[NFTOwner]) = if (nftOwner.isEmpty) {
        add(NFTOwner(nftId = nft.id, ownerId = ownerId, creatorId = nft.creatorId, quantity = sellQuantity))
      } else update(nftOwner.get.copy(quantity = nftOwner.get.quantity + sellQuantity))

      for {
        nftOwner <- nftOwner
        _ <- checkAndUpdate(nftOwner)
      } yield ()
    }

    def countOwnedNFTs(accountId: String): Future[Int] = filterAndCount(x => x.ownerId === accountId && x.creatorId =!= accountId)

    def getByPageNumber(accountId: String, pageNumber: Int): Future[Seq[NFTOwner]] = filterAndSortWithPagination(x => x.ownerId === accountId && x.creatorId =!= accountId)(_.updatedOnMillisEpoch)(offset = (pageNumber - 1) * constants.CommonConfig.Pagination.NFTsPerPage, limit = constants.CommonConfig.Pagination.NFTsPerPage).map(_.map(_.deserialize()))

    def getByIds(nftIDs: Seq[String]): Future[Seq[NFTOwner]] = filter(_.nftId.inSet(nftIDs)).map(_.map(_.deserialize))

    def getByOwnerAndIds(ownerId: String, nftIDs: Seq[String]): Future[Seq[NFTOwner]] = filter(x => x.ownerId === ownerId && x.nftId.inSet(nftIDs)).map(_.map(_.deserialize))

    def countOwners(nftId: String): Future[Int] = filterAndCount(_.nftId === nftId)

    def getByNFTID(nftId: String): Future[NFTOwner] = filterHead(_.nftId === nftId).map(_.deserialize)

    def onSuccessfulNFTTransfer(nftId: String, fromOwnerID: String, quantity: Long, toOwnerID: String): Future[Unit] = {
      val fromNFTOwner = tryGet(nftId = nftId, ownerId = fromOwnerID)
      val toNFTOwner = get(nftId = nftId, ownerId = toOwnerID)

      def fromUpdate(fromOwner: NFTOwner) = if (fromOwner.quantity - quantity >= 0) {
        if (fromOwner.quantity - quantity == 0) delete(nftId = nftId, ownerId = fromOwnerID) else update(fromOwner.copy(quantity = fromOwner.quantity - quantity))
      } else constants.Response.INSUFFICIENT_NFT_BALANCE.throwBaseException()

      def toUpdate(fromOwner: NFTOwner, toOwner: Option[NFTOwner]) = if (toOwner.isDefined) update(toOwner.get.copy(quantity = toOwner.get.quantity + quantity)) else add(fromOwner.copy(ownerId = toOwnerID, quantity = quantity))

      for {
        fromNFTOwner <- fromNFTOwner
        toNFTOwner <- toNFTOwner
        _ <- fromUpdate(fromNFTOwner)
        _ <- toUpdate(fromNFTOwner, toNFTOwner)
      } yield ()
    }

  }
}