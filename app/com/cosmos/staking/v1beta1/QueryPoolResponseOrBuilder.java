// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryPoolResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryPoolResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pool defines the pool info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Pool pool = 1 [json_name = "pool", (.gogoproto.nullable) = false];</code>
   * @return Whether the pool field is set.
   */
  boolean hasPool();
  /**
   * <pre>
   * pool defines the pool info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Pool pool = 1 [json_name = "pool", (.gogoproto.nullable) = false];</code>
   * @return The pool.
   */
  com.cosmos.staking.v1beta1.Pool getPool();
  /**
   * <pre>
   * pool defines the pool info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Pool pool = 1 [json_name = "pool", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.staking.v1beta1.PoolOrBuilder getPoolOrBuilder();
}
