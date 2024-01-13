// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package com.ibc.core.channel.v1;

public interface CounterpartyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.Counterparty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * port on the counterparty chain which owns the other end of the channel.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The portId.
   */
  java.lang.String getPortId();
  /**
   * <pre>
   * port on the counterparty chain which owns the other end of the channel.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The bytes for portId.
   */
  com.google.protobuf.ByteString
      getPortIdBytes();

  /**
   * <pre>
   * channel end on the counterparty chain
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * channel end on the counterparty chain
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();
}