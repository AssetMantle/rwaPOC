// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/transfer.proto

package com.ibc.applications.transfer.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.transfer.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * send_enabled enables or disables all cross-chain token transfers from this
   * chain.
   * </pre>
   *
   * <code>bool send_enabled = 1 [json_name = "sendEnabled", (.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
   * @return The sendEnabled.
   */
  boolean getSendEnabled();

  /**
   * <pre>
   * receive_enabled enables or disables all cross-chain token transfers to this
   * chain.
   * </pre>
   *
   * <code>bool receive_enabled = 2 [json_name = "receiveEnabled", (.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
   * @return The receiveEnabled.
   */
  boolean getReceiveEnabled();
}
