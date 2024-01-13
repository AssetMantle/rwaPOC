// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package com.ibc.core.client.v1;

public interface QueryConsensusStatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.QueryConsensusStatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * consensus states associated with the identifier
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.ibc.core.client.v1.ConsensusStateWithHeight> 
      getConsensusStatesList();
  /**
   * <pre>
   * consensus states associated with the identifier
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.ConsensusStateWithHeight getConsensusStates(int index);
  /**
   * <pre>
   * consensus states associated with the identifier
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
   */
  int getConsensusStatesCount();
  /**
   * <pre>
   * consensus states associated with the identifier
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.ibc.core.client.v1.ConsensusStateWithHeightOrBuilder> 
      getConsensusStatesOrBuilderList();
  /**
   * <pre>
   * consensus states associated with the identifier
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.ConsensusStateWithHeight consensus_states = 1 [json_name = "consensusStates", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.ConsensusStateWithHeightOrBuilder getConsensusStatesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}