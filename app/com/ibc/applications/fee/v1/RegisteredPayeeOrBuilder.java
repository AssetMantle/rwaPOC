// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/genesis.proto

package com.ibc.applications.fee.v1;

public interface RegisteredPayeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.fee.v1.RegisteredPayee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * the relayer address
   * </pre>
   *
   * <code>string relayer = 2 [json_name = "relayer"];</code>
   * @return The relayer.
   */
  java.lang.String getRelayer();
  /**
   * <pre>
   * the relayer address
   * </pre>
   *
   * <code>string relayer = 2 [json_name = "relayer"];</code>
   * @return The bytes for relayer.
   */
  com.google.protobuf.ByteString
      getRelayerBytes();

  /**
   * <pre>
   * the payee address
   * </pre>
   *
   * <code>string payee = 3 [json_name = "payee"];</code>
   * @return The payee.
   */
  java.lang.String getPayee();
  /**
   * <pre>
   * the payee address
   * </pre>
   *
   * <code>string payee = 3 [json_name = "payee"];</code>
   * @return The bytes for payee.
   */
  com.google.protobuf.ByteString
      getPayeeBytes();
}
