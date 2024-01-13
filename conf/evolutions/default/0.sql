-- Create database and user scripts. To be run before evolutions are started.

CREATE USER "rwaPOC" WITH PASSWORD 'rwaPOC';

CREATE DATABASE "rwaPOC" WITH OWNER = "rwaPOC";

ALTER USER "rwaPOC" SET SEARCH_PATH = "$user", MASTER, MASTER_TRANSACTION, BLOCKCHAIN, BLOCKCHAIN_TRANSACTION, ANALYTICS, HISTORY, CAMPAIGN;
