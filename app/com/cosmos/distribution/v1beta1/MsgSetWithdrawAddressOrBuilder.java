// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package com.cosmos.distribution.v1beta1;

public interface MsgSetWithdrawAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.MsgSetWithdrawAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   * @return The delegatorAddress.
   */
  java.lang.String getDelegatorAddress();
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   * @return The bytes for delegatorAddress.
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   * @return The withdrawAddress.
   */
  java.lang.String getWithdrawAddress();
  /**
   * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   * @return The bytes for withdrawAddress.
   */
  com.google.protobuf.ByteString
      getWithdrawAddressBytes();
}