package models.masterTransaction

import models.common.Collection._
import models.master.Collection
import models.masterTransaction.CollectionDrafts.CollectionDraftTable
import models.traits._
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json.Json
import slick.jdbc.H2Profile.api._

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

case class CollectionDraft(id: String, creatorId: String, name: String, description: String, socialProfiles: Seq[SocialProfile], nsfw: Boolean, properties: Seq[Property], profileFileName: Option[String], coverFileName: Option[String], royalty: BigDecimal, createdBy: Option[String] = None, createdOnMillisEpoch: Option[Long] = None, updatedBy: Option[String] = None, updatedOnMillisEpoch: Option[Long] = None) extends Logging {

  def getWebsite: Option[String] = this.socialProfiles.find(_.name == constants.Collection.SocialProfile.WEBSITE).map(_.url)

  def getTwitter: Option[String] = this.socialProfiles.find(_.name == constants.Collection.SocialProfile.TWITTER).map(_.url)

  def getInstagram: Option[String] = this.socialProfiles.find(_.name == constants.Collection.SocialProfile.INSTAGRAM).map(_.url)

  def toCollection(public: Boolean = false): Collection = {
    Collection(
      id = id,
      creatorId = creatorId,
      classificationId = None,
      name = name,
      description = description,
      socialProfiles = socialProfiles,
      nsfw = nsfw,
      properties = Option(this.properties),
      profileFileName = this.profileFileName,
      coverFileName = this.coverFileName,
      public = public,
      royalty = royalty,
      isDefined = Option(false),
      defineAsset = false,
      rank = Int.MaxValue,
      onSecondaryMarket = false,
      showAll = false)
  }

  def getProfileFileURL: Option[String] = this.profileFileName.map(x => constants.CommonConfig.AmazonS3.s3BucketURL + utilities.Collection.getOthersFileAwsKey(collectionId = this.id, fileName = x))

  def getCoverFileURL: Option[String] = this.coverFileName.map(x => constants.CommonConfig.AmazonS3.s3BucketURL + utilities.Collection.getOthersFileAwsKey(collectionId = this.id, fileName = x))

  def serialize(): CollectionDrafts.CollectionDraftSerialized = CollectionDrafts.CollectionDraftSerialized(
    id = this.id,
    creatorId = creatorId,
    name = this.name,
    description = this.description,
    socialProfiles = Json.toJson(this.socialProfiles).toString(),
    nsfw = this.nsfw,
    properties = Json.toJson(this.properties).toString(),
    profileFileName = this.profileFileName,
    coverFileName = this.coverFileName,
    royalty = this.royalty,
    createdBy = this.createdBy, createdOnMillisEpoch = this.createdOnMillisEpoch, updatedBy = this.updatedBy, updatedOnMillisEpoch = this.updatedOnMillisEpoch)

  def isFractionalized: Boolean = this.getSupply.isDefined

  lazy val getSupply: Option[Property] = this.properties.find(_.name == schema.constants.Properties.SupplyProperty.id.keyID.value)

  def isLockable: Boolean = this.getLockable.isDefined

  lazy val getLockable: Option[Property] = this.properties.find(_.name == schema.constants.Properties.LockHeightProperty.id.keyID.value)

  def customBurnEnabled: Boolean = this.getBurnHeight.isDefined

  lazy val getBurnHeight: Option[Property] = this.properties.find(_.name == schema.constants.Properties.BurnHeightProperty.id.keyID.value)

  def customBondAmountEnabled: Boolean = this.getCustomBondAmount.isDefined

  lazy val getCustomBondAmount: Option[Property] = this.properties.find(_.name == schema.constants.Properties.BondAmountProperty.id.keyID.value)

  lazy val getCapabilities: Seq[Property] = Seq(this.getSupply, this.getLockable, this.getBurnHeight, this.getCustomBondAmount).flatten

  lazy val getPropertiesWithoutCapabilities: Seq[Property] = this.properties.filterNot(x => this.getCapabilities.map(_.name).contains(x.name))
}

private[masterTransaction] object CollectionDrafts {

  case class CollectionDraftSerialized(id: String, creatorId: String, name: String, description: String, socialProfiles: String, nsfw: Boolean, properties: String, profileFileName: Option[String], coverFileName: Option[String], royalty: BigDecimal, createdBy: Option[String], createdOnMillisEpoch: Option[Long], updatedBy: Option[String], updatedOnMillisEpoch: Option[Long]) extends Entity[String] {
    def deserialize()(implicit module: String, logger: Logger): CollectionDraft = CollectionDraft(
      id = id,
      creatorId = creatorId,
      name = name,
      description = description,
      socialProfiles = utilities.JSON.convertJsonStringToObject[Seq[SocialProfile]](socialProfiles),
      nsfw = nsfw,
      properties = utilities.JSON.convertJsonStringToObject[Seq[Property]](properties),
      profileFileName = profileFileName,
      coverFileName = coverFileName,
      royalty = royalty,
      createdBy = createdBy, createdOnMillisEpoch = createdOnMillisEpoch, updatedBy = updatedBy, updatedOnMillisEpoch = updatedOnMillisEpoch)
  }

  class CollectionDraftTable(tag: Tag) extends Table[CollectionDraftSerialized](tag, "CollectionDraft") with ModelTable[String] {

    def * = (id, creatorId, name, description, socialProfiles, nsfw, properties, profileFileName.?, coverFileName.?, royalty, createdBy.?, createdOnMillisEpoch.?, updatedBy.?, updatedOnMillisEpoch.?) <> (CollectionDraftSerialized.tupled, CollectionDraftSerialized.unapply)

    def id = column[String]("id", O.PrimaryKey)

    def creatorId = column[String]("creatorId")

    def name = column[String]("name")

    def description = column[String]("description")

    def socialProfiles = column[String]("socialProfiles")

    def nsfw = column[Boolean]("nsfw")

    def properties = column[String]("properties")

    def profileFileName = column[String]("profileFileName")

    def coverFileName = column[String]("coverFileName")

    def royalty = column[BigDecimal]("royalty")

    def createdBy = column[String]("createdBy")

    def createdOnMillisEpoch = column[Long]("createdOnMillisEpoch")

    def updatedBy = column[String]("updatedBy")

    def updatedOnMillisEpoch = column[Long]("updatedOnMillisEpoch")
  }
}

@Singleton
class CollectionDrafts @Inject()(
                                  protected val dbConfigProvider: DatabaseConfigProvider,
                                )(implicit val executionContext: ExecutionContext)
  extends GenericDaoImpl[CollectionDrafts.CollectionDraftTable, CollectionDrafts.CollectionDraftSerialized, String]() {


  implicit val module: String = constants.Module.MASTER_TRANSACTION_COLLECTION_DRAFT

  implicit val logger: Logger = Logger(this.getClass)

  val tableQuery = new TableQuery(tag => new CollectionDraftTable(tag))

  object Service {

    def add(name: String, creatorId: String, description: String, socialProfiles: Seq[SocialProfile], nsfw: Boolean, royalty: BigDecimal): Future[CollectionDraft] = {
      val id = utilities.IdGenerator.getRandomHexadecimal
      val collection = CollectionDraft(
        id = id,
        creatorId = creatorId,
        name = name,
        description = description,
        socialProfiles = socialProfiles,
        nsfw = nsfw,
        properties = Seq(),
        profileFileName = None,
        coverFileName = None,
        royalty = royalty)
      for {
        _ <- create(collection.serialize())
      } yield collection
    }

    def tryGet(id: String): Future[CollectionDraft] = tryGetById(id).map(_.deserialize)

    def checkOwnerAndUpdate(id: String, creatorId: String, name: String, description: String, socialProfiles: Seq[SocialProfile], nsfw: Boolean, royalty: BigDecimal): Future[CollectionDraft] = {
      val collectionDraft = tryGet(id)

      def validateAndUpdate(collectionDraft: CollectionDraft) = if (collectionDraft.creatorId == creatorId) {
        updateById(collectionDraft.copy(name = name, description = description, socialProfiles = socialProfiles, nsfw = nsfw, royalty = royalty).serialize())
      } else constants.Response.NOT_COLLECTION_OWNER.throwBaseException()

      for {
        collectionDraft <- collectionDraft
        _ <- validateAndUpdate(collectionDraft)
      } yield collectionDraft.copy(name = name, description = description, socialProfiles = socialProfiles, nsfw = nsfw)
    }

    def isOwner(id: String, accountId: String): Future[Boolean] = filterAndExists(x => x.id === id && x.creatorId === accountId)

    def updateProfile(id: String, fileName: String): Future[Unit] = {
      val collectionDraft = tryGet(id)
      for {
        collectionDraft <- collectionDraft
        _ <- updateById(collectionDraft.copy(profileFileName = Option(fileName)).serialize())
      } yield ()
    }

    def updateCover(id: String, fileName: String): Future[Unit] = {
      val collectionDraft = tryGet(id)
      for {
        collectionDraft <- collectionDraft
        _ <- updateById(collectionDraft.copy(coverFileName = Option(fileName)).serialize())
      } yield ()
    }

    def addProperties(collectionDraft: CollectionDraft, properties: Seq[Property]): Future[Unit] = updateById(collectionDraft.copy(properties = collectionDraft.properties ++ properties).serialize())

    def totalDrafts(creatorId: String): Future[Int] = filterAndCount(_.creatorId === creatorId)

    def getByCreatorAndPage(creatorId: String, pageNumber: Int): Future[Seq[CollectionDraft]] = filterAndSortWithPagination(_.creatorId === creatorId)(_.createdOnMillisEpoch)(offset = (pageNumber - 1) * constants.CommonConfig.Pagination.CollectionsPerPage, limit = constants.CommonConfig.Pagination.CollectionsPerPage).map(_.map(_.deserialize))

    def delete(id: String): Future[Int] = deleteById(id)

    def checkOwnerAndDelete(id: String, accountId: String): Future[Unit] = {
      val draft = tryGet(id)

      for {
        draft <- draft
        _ <- if (draft.creatorId == accountId) delete(id) else constants.Response.NOT_COLLECTION_OWNER.throwBaseException()
      } yield ()
    }

  }
}