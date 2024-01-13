// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/store/v1beta1/listening.proto

package com.cosmos.base.store.v1beta1;

public interface BlockMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.store.v1beta1.BlockMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.abci.RequestBeginBlock request_begin_block = 1 [json_name = "requestBeginBlock"];</code>
   * @return Whether the requestBeginBlock field is set.
   */
  boolean hasRequestBeginBlock();
  /**
   * <code>.tendermint.abci.RequestBeginBlock request_begin_block = 1 [json_name = "requestBeginBlock"];</code>
   * @return The requestBeginBlock.
   */
  com.tendermint.abci.RequestBeginBlock getRequestBeginBlock();
  /**
   * <code>.tendermint.abci.RequestBeginBlock request_begin_block = 1 [json_name = "requestBeginBlock"];</code>
   */
  com.tendermint.abci.RequestBeginBlockOrBuilder getRequestBeginBlockOrBuilder();

  /**
   * <code>.tendermint.abci.ResponseBeginBlock response_begin_block = 2 [json_name = "responseBeginBlock"];</code>
   * @return Whether the responseBeginBlock field is set.
   */
  boolean hasResponseBeginBlock();
  /**
   * <code>.tendermint.abci.ResponseBeginBlock response_begin_block = 2 [json_name = "responseBeginBlock"];</code>
   * @return The responseBeginBlock.
   */
  com.tendermint.abci.ResponseBeginBlock getResponseBeginBlock();
  /**
   * <code>.tendermint.abci.ResponseBeginBlock response_begin_block = 2 [json_name = "responseBeginBlock"];</code>
   */
  com.tendermint.abci.ResponseBeginBlockOrBuilder getResponseBeginBlockOrBuilder();

  /**
   * <code>repeated .cosmos.base.store.v1beta1.BlockMetadata.DeliverTx deliver_txs = 3 [json_name = "deliverTxs"];</code>
   */
  java.util.List<com.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx> 
      getDeliverTxsList();
  /**
   * <code>repeated .cosmos.base.store.v1beta1.BlockMetadata.DeliverTx deliver_txs = 3 [json_name = "deliverTxs"];</code>
   */
  com.cosmos.base.store.v1beta1.BlockMetadata.DeliverTx getDeliverTxs(int index);
  /**
   * <code>repeated .cosmos.base.store.v1beta1.BlockMetadata.DeliverTx deliver_txs = 3 [json_name = "deliverTxs"];</code>
   */
  int getDeliverTxsCount();
  /**
   * <code>repeated .cosmos.base.store.v1beta1.BlockMetadata.DeliverTx deliver_txs = 3 [json_name = "deliverTxs"];</code>
   */
  java.util.List<? extends com.cosmos.base.store.v1beta1.BlockMetadata.DeliverTxOrBuilder> 
      getDeliverTxsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.store.v1beta1.BlockMetadata.DeliverTx deliver_txs = 3 [json_name = "deliverTxs"];</code>
   */
  com.cosmos.base.store.v1beta1.BlockMetadata.DeliverTxOrBuilder getDeliverTxsOrBuilder(
      int index);

  /**
   * <code>.tendermint.abci.RequestEndBlock request_end_block = 4 [json_name = "requestEndBlock"];</code>
   * @return Whether the requestEndBlock field is set.
   */
  boolean hasRequestEndBlock();
  /**
   * <code>.tendermint.abci.RequestEndBlock request_end_block = 4 [json_name = "requestEndBlock"];</code>
   * @return The requestEndBlock.
   */
  com.tendermint.abci.RequestEndBlock getRequestEndBlock();
  /**
   * <code>.tendermint.abci.RequestEndBlock request_end_block = 4 [json_name = "requestEndBlock"];</code>
   */
  com.tendermint.abci.RequestEndBlockOrBuilder getRequestEndBlockOrBuilder();

  /**
   * <code>.tendermint.abci.ResponseEndBlock response_end_block = 5 [json_name = "responseEndBlock"];</code>
   * @return Whether the responseEndBlock field is set.
   */
  boolean hasResponseEndBlock();
  /**
   * <code>.tendermint.abci.ResponseEndBlock response_end_block = 5 [json_name = "responseEndBlock"];</code>
   * @return The responseEndBlock.
   */
  com.tendermint.abci.ResponseEndBlock getResponseEndBlock();
  /**
   * <code>.tendermint.abci.ResponseEndBlock response_end_block = 5 [json_name = "responseEndBlock"];</code>
   */
  com.tendermint.abci.ResponseEndBlockOrBuilder getResponseEndBlockOrBuilder();

  /**
   * <code>.tendermint.abci.ResponseCommit response_commit = 6 [json_name = "responseCommit"];</code>
   * @return Whether the responseCommit field is set.
   */
  boolean hasResponseCommit();
  /**
   * <code>.tendermint.abci.ResponseCommit response_commit = 6 [json_name = "responseCommit"];</code>
   * @return The responseCommit.
   */
  com.tendermint.abci.ResponseCommit getResponseCommit();
  /**
   * <code>.tendermint.abci.ResponseCommit response_commit = 6 [json_name = "responseCommit"];</code>
   */
  com.tendermint.abci.ResponseCommitOrBuilder getResponseCommitOrBuilder();
}