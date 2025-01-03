// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package com.ibc.core.client.v1;

public interface ClientConsensusStatesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.ClientConsensusStates)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * consensus states and their heights associated with the client
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 2 [json_name = "consensusStates", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_states&#92;""];</code>
   */
  java.util.List<com.ibc.core.client.v1.ConsensusStateWithHeight> 
      getConsensusStatesList();
  /**
   * <pre>
   * consensus states and their heights associated with the client
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 2 [json_name = "consensusStates", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_states&#92;""];</code>
   */
  com.ibc.core.client.v1.ConsensusStateWithHeight getConsensusStates(int index);
  /**
   * <pre>
   * consensus states and their heights associated with the client
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 2 [json_name = "consensusStates", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_states&#92;""];</code>
   */
  int getConsensusStatesCount();
  /**
   * <pre>
   * consensus states and their heights associated with the client
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 2 [json_name = "consensusStates", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_states&#92;""];</code>
   */
  java.util.List<? extends com.ibc.core.client.v1.ConsensusStateWithHeightOrBuilder> 
      getConsensusStatesOrBuilderList();
  /**
   * <pre>
   * consensus states and their heights associated with the client
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 2 [json_name = "consensusStates", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_states&#92;""];</code>
   */
  com.ibc.core.client.v1.ConsensusStateWithHeightOrBuilder getConsensusStatesOrBuilder(
      int index);
}
