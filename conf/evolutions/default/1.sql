# --- !Ups

CREATE SCHEMA IF NOT EXISTS BLOCKCHAIN_TRANSACTION
    AUTHORIZATION "rwaPOC";
CREATE SCHEMA IF NOT EXISTS HISTORY
    AUTHORIZATION "rwaPOC";
CREATE SCHEMA IF NOT EXISTS MASTER
    AUTHORIZATION "rwaPOC";
CREATE SCHEMA IF NOT EXISTS MASTER_TRANSACTION
    AUTHORIZATION "rwaPOC";

CREATE TABLE IF NOT EXISTS BLOCKCHAIN_TRANSACTION."AdminTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "fromAddress"          VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "timeoutHeight"        INTEGER NOT NULL,
    "log"                  VARCHAR,
    "txHeight"             INTEGER,
    "txType"               VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS BLOCKCHAIN_TRANSACTION."UserTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "fromAddress"          VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "timeoutHeight"        INTEGER NOT NULL,
    "log"                  VARCHAR,
    "txHeight"             INTEGER,
    "txType"               VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash"),
    UNIQUE ("accountId", "txHash")
);


CREATE TABLE IF NOT EXISTS HISTORY."MasterSecondaryMarket"
(
    "id"                   VARCHAR NOT NULL,
    "orderId"              VARCHAR UNIQUE,
    "nftId"                VARCHAR NOT NULL,
    "sellerId"             VARCHAR NOT NULL,
    "quantity"             NUMERIC NOT NULL,
    "price"                NUMERIC NOT NULL,
    "endHours"             INTEGER NOT NULL,
    "completed"            BOOLEAN NOT NULL,
    "cancelled"            BOOLEAN NOT NULL,
    "expired"              BOOLEAN NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    "deletedBy"            VARCHAR,
    "deletedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);


CREATE TABLE IF NOT EXISTS MASTER."Account"
(
    "id"                   VARCHAR NOT NULL,
    "lowercaseId"          VARCHAR NOT NULL,
    "email"                VARCHAR NOT NULL UNIQUE,
    "emailVerified"        BOOLEAN DEFAULT FALSE,
    "accountType"          INTEGER,
    "language"             VARCHAR,
    "identityId"           VARCHAR NOT NULL UNIQUE,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS MASTER."BurntNFT"
(
    "nftId"                VARCHAR NOT NULL,
    "txHash"               VARCHAR NOT NULL UNIQUE,
    "assetId"              VARCHAR NOT NULL,
    "classificationId"     VARCHAR NOT NULL,
    "supply"               NUMERIC NOT NULL,
    "name"                 VARCHAR NOT NULL,
    "description"          VARCHAR NOT NULL,
    "fileExtension"        VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("nftId", "txHash"),
    UNIQUE ("assetId", "txHash")
);

CREATE TABLE IF NOT EXISTS MASTER."Key"
(
    "accountId"            VARCHAR NOT NULL,
    "address"              VARCHAR NOT NULL,
    "lowercaseId"          VARCHAR NOT NULL,
    "passwordHash"         BYTEA,
    "salt"                 BYTEA   NOT NULL,
    "iterations"           INTEGER NOT NULL,
    "encryptedPrivateKey"  BYTEA,
    "partialMnemonics"     VARCHAR,
    "name"                 VARCHAR,
    "retryCounter"         INTEGER NOT NULL,
    "active"               BOOLEAN NOT NULL,
    "backupUsed"           BOOLEAN NOT NULL,
    "verified"             BOOLEAN,
    "identityIssued"       BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("accountId", "address")
);

CREATE TABLE IF NOT EXISTS MASTER."NFT"
(
    "id"              VARCHAR NOT NULL,
    "assetId"         VARCHAR NOT NULL,
    "creatorId"       VARCHAR NOT NULL,
    "totalSupply"     NUMERIC NOT NULL,
    "verified"        BOOLEAN,
    "isMinted"        BOOLEAN,
    "fileExtension"   VARCHAR NOT NULL,
    "registrationId"  VARCHAR NOT NULL UNIQUE,
    "description"     VARCHAR NOT NULL,
    "address"         VARCHAR NOT NULL,
    "postalCode"      VARCHAR NOT NULL,
    "totalArea"       NUMERIC NOT NULL,
    "geoLocation"     VARCHAR NOT NULL,
    "secretValue"     VARCHAR NOT NULL,
    "rented"          BOOLEAN NOT NULL,
    "rentalAmount"    NUMERIC NOT NULL,
    "rentPeriodicity" INTEGER NOT NULL,
    "documentLink"    VARCHAR NOT NULL,
    "featured"        BOOLEAN NOT NULL DEFAULT False,
    "ranking"         INTEGER NOT NULL DEFAULT 2147483647,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS MASTER."NFTOwner"
(
    "nftId"                VARCHAR NOT NULL,
    "ownerId"              VARCHAR NOT NULL,
    "creatorId"            VARCHAR NOT NULL,
    "quantity"             BIGINT  NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("nftId", "ownerId")
);

CREATE TABLE IF NOT EXISTS MASTER."SecondaryMarket"
(
    "id"                   VARCHAR NOT NULL,
    "orderId"              VARCHAR NOT NULL UNIQUE,
    "nftId"                VARCHAR NOT NULL,
    "sellerId"             VARCHAR NOT NULL,
    "quantity"             NUMERIC NOT NULL,
    "price"                NUMERIC NOT NULL,
    "endHours"             INTEGER NOT NULL,
    "completed"            BOOLEAN NOT NULL,
    "cancelled"            BOOLEAN NOT NULL,
    "expired"              BOOLEAN NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id"),
    UNIQUE ("nftId", "id"),
    UNIQUE ("sellerId", "id")
);

CREATE TABLE IF NOT EXISTS MASTER."Secret"
(
    "id"                   VARCHAR NOT NULL,
    "secret"               VARCHAR NOT NULL,
    "salt"                 VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS MASTER."WishList"
(
    "accountId"            VARCHAR NOT NULL,
    "nftId"                VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("accountId", "nftId")
);


CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."CancelOrderTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "secondaryMarketId"    VARCHAR NOT NULL,
    "sellerId"             VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."IssueIdentityTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash", "accountId")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."MintAssetTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "nftId"                VARCHAR NOT NULL,
    "toAccountID"          VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash", "nftId")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."NFTDraft"
(
    "id"                   VARCHAR NOT NULL,
    "creatorId"            VARCHAR NOT NULL,
    "properties"           VARCHAR,
    "fileExtension"        VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."NFTTransferTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "nftId"                VARCHAR NOT NULL,
    "fromId"               VARCHAR NOT NULL,
    "quantity"             NUMERIC NOT NULL,
    "toIdentityId"         VARCHAR NOT NULL,
    "toAccountId"          VARCHAR,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."Notification"
(
    "id"                   VARCHAR NOT NULL,
    "accountID"            VARCHAR,
    "title"                VARCHAR NOT NULL,
    "messageParameters"    VARCHAR NOT NULL,
    "jsRoute"              VARCHAR,
    "read"                 BOOLEAN NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."ProvisionAddressTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "toAddress"            VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."PushNotificationToken"
(
    "accountId"            VARCHAR NOT NULL,
    "token"                VARCHAR NOT NULL,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("accountId")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."RevealPropertyTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "data"                 VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."SecondaryMarketBuyTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "nftId"                VARCHAR NOT NULL,
    "buyerId"              VARCHAR NOT NULL,
    "secondaryMarketId"    VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."SecondaryMarketSellTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "nftId"                VARCHAR NOT NULL,
    "sellerId"             VARCHAR NOT NULL,
    "secondaryMarketId"    VARCHAR NOT NULL UNIQUE,
    "quantity"             NUMERIC NOT NULL,
    "expiryHeight"         BIGINT  NOT NULL,
    "denom"                VARCHAR NOT NULL,
    "receiveAmount"        NUMERIC NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash"),
    UNIQUE ("nftId", "secondaryMarketId"),
    UNIQUE ("sellerId", "secondaryMarketId"),
    UNIQUE ("txHash", "secondaryMarketId")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."SessionToken"
(
    "accountId"            VARCHAR NOT NULL,
    "sessionTokenHash"     VARCHAR NOT NULL,
    "sessionTokenTime"     BIGINT  NOT NULL,
    "language"             VARCHAR,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("accountId")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."UnprovisionAddressTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "toAddress"            VARCHAR NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."UnwrapTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "assetId"              VARCHAR NOT NULL,
    "amount"               NUMERIC NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

CREATE TABLE IF NOT EXISTS MASTER_TRANSACTION."WrapTransaction"
(
    "txHash"               VARCHAR NOT NULL,
    "accountId"            VARCHAR NOT NULL,
    "denom"                VARCHAR NOT NULL,
    "amount"               NUMERIC NOT NULL,
    "status"               BOOLEAN,
    "createdBy"            VARCHAR,
    "createdOnMillisEpoch" BIGINT,
    "updatedBy"            VARCHAR,
    "updatedOnMillisEpoch" BIGINT,
    PRIMARY KEY ("txHash")
);

ALTER TABLE MASTER."Key"
    ADD CONSTRAINT Key_Account_Id FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER."NFT"
    ADD CONSTRAINT NFT_Creator_Id FOREIGN KEY ("creatorId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER."NFTOwner"
    ADD CONSTRAINT NFTOwner_NFT_Id FOREIGN KEY ("nftId") REFERENCES MASTER."NFT" ("id");
ALTER TABLE MASTER."NFTOwner"
    ADD CONSTRAINT NFTOwner_Creator_Id FOREIGN KEY ("creatorId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER."NFTOwner"
    ADD CONSTRAINT NFTOwner_Owner_Id FOREIGN KEY ("ownerId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER."SecondaryMarket"
    ADD CONSTRAINT SecondaryMarket_nftId FOREIGN KEY ("nftId") REFERENCES MASTER."NFT" ("id");
ALTER TABLE MASTER."SecondaryMarket"
    ADD CONSTRAINT SecondaryMarket_sellerId FOREIGN KEY ("sellerId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER."WishList"
    ADD CONSTRAINT WishList_Account_Id FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER."WishList"
    ADD CONSTRAINT WishList_NFT_Id FOREIGN KEY ("nftId") REFERENCES MASTER."NFT" ("id");

ALTER TABLE MASTER_TRANSACTION."Notification"
    ADD CONSTRAINT Notification_Account_Id FOREIGN KEY ("accountID") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."SessionToken"
    ADD CONSTRAINT Wallet_Account_Id FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."PushNotificationToken"
    ADD CONSTRAINT PushNotificationToken_Account_Id FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE BLOCKCHAIN_TRANSACTION."UserTransaction"
    ADD CONSTRAINT UserTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."CancelOrderTransaction"
    ADD CONSTRAINT CancelOrderTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");
ALTER TABLE MASTER_TRANSACTION."CancelOrderTransaction"
    ADD CONSTRAINT CancelOrderTransaction_SellerId FOREIGN KEY ("sellerId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."IssueIdentityTransaction"
    ADD CONSTRAINT IssueIdentityTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."AdminTransaction" ("txHash");
ALTER TABLE MASTER_TRANSACTION."IssueIdentityTransaction"
    ADD CONSTRAINT IssueIdentityTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."MintAssetTransaction"
    ADD CONSTRAINT MintAssetTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."AdminTransaction" ("txHash");
ALTER TABLE MASTER_TRANSACTION."MintAssetTransaction"
    ADD CONSTRAINT MintAssetTransaction_NFTId FOREIGN KEY ("nftId") REFERENCES MASTER."NFT" ("id");
ALTER TABLE MASTER_TRANSACTION."MintAssetTransaction"
    ADD CONSTRAINT MintAssetTransaction_ToAccountID FOREIGN KEY ("toAccountID") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."ProvisionAddressTransaction"
    ADD CONSTRAINT ProvisionAddressTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");
ALTER TABLE MASTER_TRANSACTION."ProvisionAddressTransaction"
    ADD CONSTRAINT ProvisionAddressTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."RevealPropertyTransaction"
    ADD CONSTRAINT RevealPropertyTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");
ALTER TABLE MASTER_TRANSACTION."RevealPropertyTransaction"
    ADD CONSTRAINT RevealPropertyTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."UnprovisionAddressTransaction"
    ADD CONSTRAINT UnprovisionAddressTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");
ALTER TABLE MASTER_TRANSACTION."UnprovisionAddressTransaction"
    ADD CONSTRAINT UnprovisionAddressTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");

ALTER TABLE MASTER_TRANSACTION."SecondaryMarketSellTransaction"
    ADD CONSTRAINT SecondaryMarketSellTransaction_sellerId FOREIGN KEY ("sellerId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."SecondaryMarketSellTransaction"
    ADD CONSTRAINT SecondaryMarketSellTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");

ALTER TABLE MASTER_TRANSACTION."NFTTransferTransaction"
    ADD CONSTRAINT NFTTransferTransaction_OwnerId FOREIGN KEY ("fromId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."NFTTransferTransaction"
    ADD CONSTRAINT NFTTransferTransaction_ToAccountId FOREIGN KEY ("toAccountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."NFTTransferTransaction"
    ADD CONSTRAINT NFTTransferTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");

ALTER TABLE MASTER_TRANSACTION."SecondaryMarketBuyTransaction"
    ADD CONSTRAINT SecondaryMarketBuyTransaction_BuyerAccountId FOREIGN KEY ("buyerId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."SecondaryMarketBuyTransaction"
    ADD CONSTRAINT SecondaryMarketBuyTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");

ALTER TABLE MASTER_TRANSACTION."UnwrapTransaction"
    ADD CONSTRAINT UnwrapTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."UnwrapTransaction"
    ADD CONSTRAINT UnwrapTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");

ALTER TABLE MASTER_TRANSACTION."WrapTransaction"
    ADD CONSTRAINT WrapTransaction_AccountId FOREIGN KEY ("accountId") REFERENCES MASTER."Account" ("id");
ALTER TABLE MASTER_TRANSACTION."WrapTransaction"
    ADD CONSTRAINT WrapTransaction_TxHash FOREIGN KEY ("txHash") REFERENCES BLOCKCHAIN_TRANSACTION."UserTransaction" ("txHash");

/*Triggers*/

CREATE OR REPLACE FUNCTION PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG() RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'INSERT') THEN
        new."createdOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM NOW()) * 1000);;
        new."createdBy" = CURRENT_USER;;
    ELSEIF (TG_OP = 'UPDATE') THEN
--         values of created needs to be set here otherwise insertOrUpdate of slick will omit created details
        new."createdOnMillisEpoch" = old."createdOnMillisEpoch";;
        new."createdBy" = old."createdBy";;
        new."updatedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM NOW()) * 1000);;
        new."updatedBy" = CURRENT_USER;;
    END IF;;
    RETURN NEW;;
END;;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION PUBLIC.INSERT_OR_UPDATE_HISTORY_EPOCH_LOG() RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'INSERT') THEN
        new."deletedOnMillisEpoch" = FLOOR(EXTRACT(EPOCH FROM NOW()) * 1000);;
        new."deletedBy" = CURRENT_USER;;
    END IF;;
    RETURN NEW;;
END;;
$$ LANGUAGE PLPGSQL;

CREATE TRIGGER BT_ADMIN_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON BLOCKCHAIN_TRANSACTION."AdminTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER BT_USER_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON BLOCKCHAIN_TRANSACTION."UserTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

CREATE TRIGGER SECONDARY_MARKET_HISTORY_LOG
    BEFORE INSERT OR UPDATE
    ON HISTORY."MasterSecondaryMarket"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_HISTORY_EPOCH_LOG();

CREATE TRIGGER ACCOUNT_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Account"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER BURNT_NFT_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."BurntNFT"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER KEY_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Key"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER NFT_OWNER_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."NFTOwner"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER SECONDARY_MARKET_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."SecondaryMarket"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER SECRET_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."Secret"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER WISHLIST_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER."WishList"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

CREATE TRIGGER CANCEL_ORDER_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."CancelOrderTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER ISSUE_IDENTITY_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."IssueIdentityTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER MINT_ASSET_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."MintAssetTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER NFT_DRAFT_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."NFTDraft"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER NFT_TRANSFER_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."NFTTransferTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER NOTIFICATION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."Notification"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER PROVISION_ADDRESS_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."ProvisionAddressTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER PUSH_NOTIFICATION_TOKEN_TOKEN_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."PushNotificationToken"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER REVEAL_PROPERTY_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."RevealPropertyTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER SESSION_TOKEN_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."SessionToken"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER SECONDARY_MARKET_SELL_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."SecondaryMarketSellTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER SECONDARY_MARKET_BUY_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."SecondaryMarketBuyTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER UNPROVISION_ADDRESS_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."UnprovisionAddressTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER UNWRAP_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."UnwrapTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();
CREATE TRIGGER WRAP_TRANSACTION_LOG
    BEFORE INSERT OR UPDATE
    ON MASTER_TRANSACTION."WrapTransaction"
    FOR EACH ROW
EXECUTE PROCEDURE PUBLIC.INSERT_OR_UPDATE_EPOCH_LOG();

CREATE OR REPLACE FUNCTION MASTER.KEY_VALIDATE() RETURNS TRIGGER AS
$$
BEGIN
    IF (TG_OP = 'INSERT') THEN
        IF (new."active" = true AND
            EXISTS(SELECT * FROM MASTER."Key" WHERE "accountId" = new."accountId" AND "active" = true)) THEN
            RAISE EXCEPTION 'MULTIPLE_ACTIVE_KEYS';;
        END IF;;
    ELSEIF (TG_OP = 'UPDATE') THEN
        -- allow all keys to be in false state to change active state
        IF (new."active" = true AND
            EXISTS(SELECT *
                   FROM MASTER."Key"
                   WHERE "accountId" = new."accountId"
                     AND "address" != new."address"
                     AND "active" = true)) THEN
            RAISE EXCEPTION 'MULTIPLE_ACTIVE_KEYS';;
        END IF;;
    END IF;;
    RETURN NEW;;
END;;
$$ LANGUAGE PLPGSQL;

CREATE TRIGGER KEY_VALID
    BEFORE INSERT OR UPDATE
    ON MASTER."Key"
    FOR EACH ROW
EXECUTE PROCEDURE MASTER.KEY_VALIDATE();


INSERT INTO MASTER."Secret" ("id", "secret", "salt")
VALUES ('MEMO_SIGNER',
        '6MSNoTkLjY4uDONEIzGkvScwI7a6Et5P7QGIayQOBXjiwGDVHoUIdeYR3ow6fFTOE/dnXquNvShPy1FrSnkaeOtlG1lpUPe1Xxi105JybO+eiN4/eCTqNpUR2mA6NHPypGCozfnjlXgmIk4hMzfGGZbPwHDcrhjSMwYD6u5AHhDJwoRzMtS2izEUj/Wq/Dih/nIepC5NnUhcQMFLKwxDOs24q4b49J4VZOrwQcNRKi4=',
        'YSFEa1dvQE4qUl54akY2dkNAbkFMQHphRDI0V3FIZmJUWg==');

INSERT INTO MASTER."Secret" ("id", "secret", "salt")
VALUES ('MANTLE_PLACE',
        '6MSNoTkLjY4uDONEIzGkvScwI7a6Et5P7QGIayQOBXjiwGDVHoUIdeYR3ow6fFTOE/dnXquNvShPy1FrSnkaeOtlG1lpUPe1Xxi105JybO+eiN4/eCTqNpUR2mA6NHPypGCozfnjlXgmIk4hMzfGGZbPwHDcrhjSMwYD6u5AHhDJwoRzMtS2izEUj/Wq/Dih/nIepC5NnUhcQMFLKwxDOs24q4b49J4VZOrwQcNRKi4=',
        'YSFEa1dvQE4qUl54akY2dkNAbkFMQHphRDI0V3FIZmJUWg==');


# --- !Downs

DROP TRIGGER IF EXISTS BT_ADMIN_TRANSACTION_LOG ON BLOCKCHAIN_TRANSACTION."AdminTransaction" CASCADE;
DROP TRIGGER IF EXISTS BT_USER_TRANSACTION_LOG ON BLOCKCHAIN_TRANSACTION."UserTransaction" CASCADE;

DROP TRIGGER IF EXISTS SECONDARY_MARKET_HISTORY_LOG ON HISTORY."MasterSecondaryMarket" CASCADE;

DROP TRIGGER IF EXISTS ACCOUNT_LOG ON MASTER."Account" CASCADE;
DROP TRIGGER IF EXISTS BURNT_NFT_LOG ON MASTER."BurntNFT" CASCADE;
DROP TRIGGER IF EXISTS KEY_LOG ON MASTER."Key" CASCADE;
DROP TRIGGER IF EXISTS NFT_OWNER_LOG ON MASTER."NFTOwner" CASCADE;
DROP TRIGGER IF EXISTS SECONDARY_MARKET_LOG ON MASTER."SecondaryMarket" CASCADE;
DROP TRIGGER IF EXISTS SECRET_LOG ON MASTER."Secret" CASCADE;
DROP TRIGGER IF EXISTS WISHLIST_LOG ON MASTER."WishList" CASCADE;

DROP TRIGGER IF EXISTS NOTIFICATION_LOG ON MASTER_TRANSACTION."Notification" CASCADE;
DROP TRIGGER IF EXISTS NFT_DRAFT_LOG ON MASTER_TRANSACTION."NFTDraft" CASCADE;

DROP TRIGGER IF EXISTS PUSH_NOTIFICATION_TOKEN_TOKEN_LOG ON MASTER_TRANSACTION."PushNotificationToken" CASCADE;
DROP TRIGGER IF EXISTS SESSION_TOKEN_LOG ON MASTER_TRANSACTION."SessionToken" CASCADE;

DROP TRIGGER IF EXISTS DEFINE_ASSET_TRANSACTION_LOG ON MASTER_TRANSACTION."CancelOrderTransaction" CASCADE;
DROP TRIGGER IF EXISTS ISSUE_IDENTITY_TRANSACTION_LOG ON MASTER_TRANSACTION."IssueIdentityTransaction" CASCADE;
DROP TRIGGER IF EXISTS MINT_ASSET_TRANSACTION_LOG ON MASTER_TRANSACTION."MintAssetTransaction" CASCADE;
DROP TRIGGER IF EXISTS NFT_TRANSFER_TRANSACTION_LOG ON MASTER_TRANSACTION."NFTTransferTransaction" CASCADE;
DROP TRIGGER IF EXISTS PROVISION_ADDRESS_TRANSACTION_LOG ON MASTER_TRANSACTION."ProvisionAddressTransaction" CASCADE;
DROP TRIGGER IF EXISTS REVEAL_PROPERTY_TRANSACTION_LOG ON MASTER_TRANSACTION."RevealPropertyTransaction" CASCADE;
DROP TRIGGER IF EXISTS UNPROVISION_ADDRESS_TRANSACTION_LOG ON MASTER_TRANSACTION."UnprovisionAddressTransaction" CASCADE;
DROP TRIGGER IF EXISTS SECONDARY_MARKET_BUY_TRANSACTION_LOG ON MASTER_TRANSACTION."SecondaryMarketBuyTransaction" CASCADE;
DROP TRIGGER IF EXISTS SECONDARY_MARKET_SELL_TRANSACTION_LOG ON MASTER_TRANSACTION."SecondaryMarketSellTransaction" CASCADE;
DROP TRIGGER IF EXISTS UNWRAP_TRANSACTION_LOG ON MASTER_TRANSACTION."UnwrapTransaction" CASCADE;
DROP TRIGGER IF EXISTS WRAP_TRANSACTION_LOG ON MASTER_TRANSACTION."WrapTransaction" CASCADE;

DROP TABLE IF EXISTS BLOCKCHAIN_TRANSACTION."AdminTransaction" CASCADE;
DROP TABLE IF EXISTS BLOCKCHAIN_TRANSACTION."UserTransaction" CASCADE;

DROP TABLE IF EXISTS HISTORY."MasterSecondaryMarket" CASCADE;

DROP TABLE IF EXISTS MASTER."Account" CASCADE;
DROP TABLE IF EXISTS MASTER."BurntNFT" CASCADE;
DROP TABLE IF EXISTS MASTER."Key" CASCADE;
DROP TABLE IF EXISTS MASTER."NFT" CASCADE;
DROP TABLE IF EXISTS MASTER."NFTOwner" CASCADE;
DROP TABLE IF EXISTS MASTER."SecondaryMarket" CASCADE;
DROP TABLE IF EXISTS MASTER."Secret" CASCADE;
DROP TABLE IF EXISTS MASTER."WishList" CASCADE;

DROP TABLE IF EXISTS MASTER_TRANSACTION."CancelOrderTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."IssueIdentityTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."MintAssetTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."NFTDraft" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."NFTTransferTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."Notification" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."ProvisionAddressTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."PushNotificationToken" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."RevealPropertyTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."SecondaryMarketBuyTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."SecondaryMarketSellTransaction" CASCADE;
\DROP TABLE IF EXISTS MASTER_TRANSACTION."SessionToken" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."UnprovisionAddressTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."UnwrapTransaction" CASCADE;
DROP TABLE IF EXISTS MASTER_TRANSACTION."WrapTransaction" CASCADE;

DROP SCHEMA IF EXISTS BLOCKCHAIN_TRANSACTION CASCADE;
DROP SCHEMA IF EXISTS HISTORY CASCADE;
DROP SCHEMA IF EXISTS MASTER CASCADE;
DROP SCHEMA IF EXISTS MASTER_TRANSACTION CASCADE;