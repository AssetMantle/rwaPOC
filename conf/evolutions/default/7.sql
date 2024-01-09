# --- !Ups

ALTER TABLE MASTER."Account"
    ADD COLUMN IF NOT EXISTS "createdOnMillisEpoch" BIGINT DEFAULT null;
ALTER TABLE MASTER."Account"
    ADD COLUMN IF NOT EXISTS "updatedOnMillisEpoch" BIGINT DEFAULT null;
DROP TRIGGER IF EXISTS ACCOUNT_LOG ON MASTER."Account";
UPDATE MASTER."Account"
SET "createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "createdOn" AT TIME ZONE "createdOnTimeZone") * 1000)
WHERE "createdOn" IS NOT NULL;
UPDATE MASTER."Account"
SET "updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "updatedOn" AT TIME ZONE "updatedOnTimeZone") * 1000)
WHERE "updatedOn" IS NOT NULL;
ALTER TABLE MASTER."Account"
    DROP COLUMN IF EXISTS "createdOn";
ALTER TABLE MASTER."Account"
    DROP COLUMN IF EXISTS "createdOnTimeZone";
ALTER TABLE MASTER."Account"
    DROP COLUMN IF EXISTS "updatedOn";
ALTER TABLE MASTER."Account"
    DROP COLUMN IF EXISTS "updatedOnTimeZone";
CREATE TRIGGER ACCOUNT_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Account"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

ALTER TABLE MASTER."Key"
    ADD COLUMN IF NOT EXISTS "createdOnMillisEpoch" BIGINT DEFAULT null;
ALTER TABLE MASTER."Key"
    ADD COLUMN IF NOT EXISTS "updatedOnMillisEpoch" BIGINT DEFAULT null;
DROP TRIGGER IF EXISTS KEY_LOG ON MASTER."Key";
UPDATE MASTER."Key"
SET "createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "createdOn" AT TIME ZONE "createdOnTimeZone") * 1000)
WHERE "createdOn" IS NOT NULL;
UPDATE MASTER."Key"
SET "updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "updatedOn" AT TIME ZONE "updatedOnTimeZone") * 1000)
WHERE "updatedOn" IS NOT NULL;
ALTER TABLE MASTER."Key"
    DROP COLUMN IF EXISTS "createdOn";
ALTER TABLE MASTER."Key"
    DROP COLUMN IF EXISTS "createdOnTimeZone";
ALTER TABLE MASTER."Key"
    DROP COLUMN IF EXISTS "updatedOn";
ALTER TABLE MASTER."Key"
    DROP COLUMN IF EXISTS "updatedOnTimeZone";
CREATE TRIGGER KEY_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Key"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

ALTER TABLE MASTER."Wallet"
    ADD COLUMN IF NOT EXISTS "createdOnMillisEpoch" BIGINT DEFAULT null;
ALTER TABLE MASTER."Wallet"
    ADD COLUMN IF NOT EXISTS "updatedOnMillisEpoch" BIGINT DEFAULT null;
DROP TRIGGER IF EXISTS WALLET_LOG ON MASTER."Wallet";
UPDATE MASTER."Wallet"
SET "createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "createdOn" AT TIME ZONE "createdOnTimeZone") * 1000)
WHERE "createdOn" IS NOT NULL;
UPDATE MASTER."Wallet"
SET "updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "updatedOn" AT TIME ZONE "updatedOnTimeZone") * 1000)
WHERE "updatedOn" IS NOT NULL;
ALTER TABLE MASTER."Wallet"
    DROP COLUMN IF EXISTS "createdOn";
ALTER TABLE MASTER."Wallet"
    DROP COLUMN IF EXISTS "createdOnTimeZone";
ALTER TABLE MASTER."Wallet"
    DROP COLUMN IF EXISTS "updatedOn";
ALTER TABLE MASTER."Wallet"
    DROP COLUMN IF EXISTS "updatedOnTimeZone";
CREATE TRIGGER WALLET_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Wallet"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

ALTER TABLE MASTER."WishList"
    ADD COLUMN IF NOT EXISTS "createdOnMillisEpoch" BIGINT DEFAULT null;
ALTER TABLE MASTER."WishList"
    ADD COLUMN IF NOT EXISTS "updatedOnMillisEpoch" BIGINT DEFAULT null;
DROP TRIGGER IF EXISTS WISHLIST_LOG ON MASTER."WishList";
UPDATE MASTER."WishList"
SET "createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "createdOn" AT TIME ZONE "createdOnTimeZone") * 1000)
WHERE "createdOn" IS NOT NULL;
UPDATE MASTER."WishList"
SET "updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "updatedOn" AT TIME ZONE "updatedOnTimeZone") * 1000)
WHERE "updatedOn" IS NOT NULL;
ALTER TABLE MASTER."WishList"
    DROP COLUMN IF EXISTS "createdOn";
ALTER TABLE MASTER."WishList"
    DROP COLUMN IF EXISTS "createdOnTimeZone";
ALTER TABLE MASTER."WishList"
    DROP COLUMN IF EXISTS "updatedOn";
ALTER TABLE MASTER."WishList"
    DROP COLUMN IF EXISTS "updatedOnTimeZone";
CREATE TRIGGER WISHLIST_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."WishList"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

ALTER TABLE MASTER."WhitelistMember"
    ADD COLUMN IF NOT EXISTS "createdOnMillisEpoch" BIGINT DEFAULT null;
ALTER TABLE MASTER."WhitelistMember"
    ADD COLUMN IF NOT EXISTS "updatedOnMillisEpoch" BIGINT DEFAULT null;
DROP TRIGGER IF EXISTS WHITE_LIST_MEMBER_LOG ON MASTER."WhitelistMember";
UPDATE MASTER."WhitelistMember"
SET "createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "createdOn" AT TIME ZONE "createdOnTimeZone") * 1000)
WHERE "createdOn" IS NOT NULL;
UPDATE MASTER."WhitelistMember"
SET "updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "updatedOn" AT TIME ZONE "updatedOnTimeZone") * 1000)
WHERE "updatedOn" IS NOT NULL;
ALTER TABLE MASTER."WhitelistMember"
    DROP COLUMN IF EXISTS "createdOn";
ALTER TABLE MASTER."WhitelistMember"
    DROP COLUMN IF EXISTS "createdOnTimeZone";
ALTER TABLE MASTER."WhitelistMember"
    DROP COLUMN IF EXISTS "updatedOn";
ALTER TABLE MASTER."WhitelistMember"
    DROP COLUMN IF EXISTS "updatedOnTimeZone";
CREATE TRIGGER WHITE_LIST_MEMBER_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."WhitelistMember"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

ALTER TABLE MASTER."Whitelist"
    ADD COLUMN IF NOT EXISTS "createdOnMillisEpoch" BIGINT DEFAULT null;
ALTER TABLE MASTER."Whitelist"
    ADD COLUMN IF NOT EXISTS "updatedOnMillisEpoch" BIGINT DEFAULT null;
DROP TRIGGER IF EXISTS WHITE_LIST_LOG ON MASTER."Whitelist";
UPDATE MASTER."Whitelist"
SET "createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "createdOn" AT TIME ZONE "createdOnTimeZone") * 1000)
WHERE "createdOn" IS NOT NULL;
UPDATE MASTER."Whitelist"
SET "updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM "updatedOn" AT TIME ZONE "updatedOnTimeZone") * 1000)
WHERE "updatedOn" IS NOT NULL;
ALTER TABLE MASTER."Whitelist"
    DROP COLUMN IF EXISTS "createdOn";
ALTER TABLE MASTER."Whitelist"
    DROP COLUMN IF EXISTS "createdOnTimeZone";
ALTER TABLE MASTER."Whitelist"
    DROP COLUMN IF EXISTS "updatedOn";
ALTER TABLE MASTER."Whitelist"
    DROP COLUMN IF EXISTS "updatedOnTimeZone";
CREATE TRIGGER WHITE_LIST_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Whitelist"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

DROP TRIGGER IF EXISTS COLLECTION_FILE_LOG ON MASTER."CollectionFile";
DROP TABLE IF EXISTS MASTER."CollectionFile";

CREATE TABLE IF NOT EXISTS MASTER."PublicListing"
(
    "id"                   VARCHAR NOT NULL,
    "collectionId"         VARCHAR NOT NULL UNIQUE,
    "numberOfNFTs"         BIGINT  NOT NULL,
    "maxMintPerAccount"    BIGINT  NOT NULL,
    "price"                NUMERIC NOT NULL,
    "denom"                VARCHAR NOT NULL,
    "startTimeEpoch"       BIGINT  NOT NULL,
    "endTimeEpoch"         BIGINT  NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS BLOCKCHAIN_TRANSACTION."NFTPublicListing"
(
    "txHash"               VARCHAR NOT NULL,
    "txRawBytes"           BYTEA   NOT NULL,
    "fromAddress"          VARCHAR NOT NULL,
    "toAddress"            VARCHAR NOT NULL,
    "amount"               VARCHAR NOT NULL,
    "broadcasted"          BOOLEAN NOT NULL,
    "status"               BOOLEAN,
    "memo"                 VARCHAR,
    "log"                  VARCHAR,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS HISTORY."MasterPublicListing"
(
    "id"                   VARCHAR NOT NULL,
    "collectionId"         VARCHAR NOT NULL,
    "numberOfNFTs"         BIGINT  NOT NULL,
    "maxMintPerAccount"    BIGINT  NOT NULL,
    "price"                NUMERIC NOT NULL,
    "denom"                VARCHAR NOT NULL,
    "startTimeEpoch"       BIGINT  NOT NULL,
    "endTimeEpoch"         BIGINT  NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    "deletedBy"            VARCHAR,
    "deletedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."PublicListingNFTTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "nftId"                VARCHAR NOT NULL,
    "buyerAccountId"       VARCHAR NOT NULL,
    "sellerAccountId"      VARCHAR NOT NULL,
    "publicListingId"      VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash", "nftId"),
    UNIQUE ("buyerAccountId", "sellerAccountId", "txHash", "nftId")
);

ALTER TABLE ANALYTICS."CollectionAnalysis"
    ADD COLUMN IF NOT EXISTS "publicListingPrice" NUMERIC NOT NULL DEFAULT 0;

ALTER TABLE MASTER."NFTOwner"
    ADD COLUMN IF NOT EXISTS "publicListingId" VARCHAR DEFAULT null;
ALTER TABLE MASTER."NFTOwner"
    ADD CONSTRAINT ONE_SELL_PER_NFT CHECK ( NUM_NONNULLS("saleId", "publicListingId") <= 1 );

ALTER TABLE MASTER."PublicListing"
    ADD CONSTRAINT PublicListing_Collection FOREIGN KEY ("collectionId") REFERENCES MASTER."Collection" ("id");

ALTER TABLE MASTER_TRANSACTION."PublicListingNFTTransaction"
    ADD CONSTRAINT PublicListingNFTTransaction_BuyerAccountId FOREIGN KEY ("buyerAccountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."PublicListingNFTTransaction"
    ADD CONSTRAINT PublicListingNFTTransaction_SellerAccountId FOREIGN KEY ("sellerAccountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."PublicListingNFTTransaction"
    ADD CONSTRAINT PublicListingNFTTransaction_NFTId FOREIGN KEY ("nftId") REFERENCES MASTER."NFT" ("id");
ALTER TABLE MASTER_TRANSACTION."PublicListingNFTTransaction"
    ADD CONSTRAINT PublicListingNFTTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."NFTPublicListing" ("txHash");

ALTER TABLE MASTER_TRANSACTION."BuyNFTTransaction"
    RENAME TO "SaleNFTTransaction";
ALTER TABLE BLOCKCHAIN_TRANSACTION."BuyNFT"
    RENAME TO "NFTSale";

CREATE TRIGGER BT_NFT_PUBLIC_LISTING_LOG
    BEFORE INSERT OR UPDATE
    ON BLOCKCHAIN_TRANSACTION."NFTPublicListing"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

CREATE TRIGGER PUBLIC_LISTING_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."PublicListing"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

CREATE TRIGGER MT_PUBLIC_LISTING_NFT_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."PublicListingNFTTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

CREATE TRIGGER PUBLIC_LISTING_HISTORY_LOG
    BEFORE INSERT OR UPDATE
    ON HISTORY."MasterPublicListing"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_HISTORY_EPOCH_LOG();

# --- !Downs

DROP TRIGGER IF EXISTS BT_NFT_PUBLIC_LISTING_LOG ON BLOCKCHAIN_TRANSACTION."NFTPublicListing" CASCADE;
DROP TRIGGER IF EXISTS PUBLIC_LISTING_LOG ON MASTER."PublicListing" CASCADE;
DROP TRIGGER IF EXISTS MT_PUBLIC_LISTING_NFT_TRANSACTION_LOG ON MASTER_TRANSACTION."PublicListingNFTTransaction" CASCADE;
DROP TRIGGER IF EXISTS SALE_HISTORY_LOG ON HISTORY."MasterPublicListing" CASCADE;

DROP TABLE IF EXISTS BLOCKCHAIN_TRANSACTION."NFTPublicListing" CASCADE;
DROP TABLE IF EXISTS MASTER."PublicListing" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."PublicListingNFTTransaction" CASCADE;
DROP TABLE IF EXISTS HISTORY."MasterPublicListing" CASCADE;