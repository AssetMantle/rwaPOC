// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/tx.proto

package com.ibc.applications.fee.v1;

public interface MsgPayPacketFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.fee.v1.MsgPayPacketFee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * fee encapsulates the recv, ack and timeout fees associated with an IBC packet
   * </pre>
   *
   * <code>.ibc.applications.fee.v1.Fee fee = 1 [json_name = "fee", (.gogoproto.nullable) = false];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <pre>
   * fee encapsulates the recv, ack and timeout fees associated with an IBC packet
   * </pre>
   *
   * <code>.ibc.applications.fee.v1.Fee fee = 1 [json_name = "fee", (.gogoproto.nullable) = false];</code>
   * @return The fee.
   */
  com.ibc.applications.fee.v1.Fee getFee();
  /**
   * <pre>
   * fee encapsulates the recv, ack and timeout fees associated with an IBC packet
   * </pre>
   *
   * <code>.ibc.applications.fee.v1.Fee fee = 1 [json_name = "fee", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.applications.fee.v1.FeeOrBuilder getFeeOrBuilder();

  /**
   * <pre>
   * the source port unique identifier
   * </pre>
   *
   * <code>string source_port_id = 2 [json_name = "sourcePortId", (.gogoproto.moretags) = "yaml:&#92;"source_port_id&#92;""];</code>
   * @return The sourcePortId.
   */
  java.lang.String getSourcePortId();
  /**
   * <pre>
   * the source port unique identifier
   * </pre>
   *
   * <code>string source_port_id = 2 [json_name = "sourcePortId", (.gogoproto.moretags) = "yaml:&#92;"source_port_id&#92;""];</code>
   * @return The bytes for sourcePortId.
   */
  com.google.protobuf.ByteString
      getSourcePortIdBytes();

  /**
   * <pre>
   * the source channel unique identifer
   * </pre>
   *
   * <code>string source_channel_id = 3 [json_name = "sourceChannelId", (.gogoproto.moretags) = "yaml:&#92;"source_channel_id&#92;""];</code>
   * @return The sourceChannelId.
   */
  java.lang.String getSourceChannelId();
  /**
   * <pre>
   * the source channel unique identifer
   * </pre>
   *
   * <code>string source_channel_id = 3 [json_name = "sourceChannelId", (.gogoproto.moretags) = "yaml:&#92;"source_channel_id&#92;""];</code>
   * @return The bytes for sourceChannelId.
   */
  com.google.protobuf.ByteString
      getSourceChannelIdBytes();

  /**
   * <pre>
   * account address to refund fee if necessary
   * </pre>
   *
   * <code>string signer = 4 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * account address to refund fee if necessary
   * </pre>
   *
   * <code>string signer = 4 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();

  /**
   * <pre>
   * optional list of relayers permitted to the receive packet fees
   * </pre>
   *
   * <code>repeated string relayers = 5 [json_name = "relayers"];</code>
   * @return A list containing the relayers.
   */
  java.util.List<java.lang.String>
      getRelayersList();
  /**
   * <pre>
   * optional list of relayers permitted to the receive packet fees
   * </pre>
   *
   * <code>repeated string relayers = 5 [json_name = "relayers"];</code>
   * @return The count of relayers.
   */
  int getRelayersCount();
  /**
   * <pre>
   * optional list of relayers permitted to the receive packet fees
   * </pre>
   *
   * <code>repeated string relayers = 5 [json_name = "relayers"];</code>
   * @param index The index of the element to return.
   * @return The relayers at the given index.
   */
  java.lang.String getRelayers(int index);
  /**
   * <pre>
   * optional list of relayers permitted to the receive packet fees
   * </pre>
   *
   * <code>repeated string relayers = 5 [json_name = "relayers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the relayers at the given index.
   */
  com.google.protobuf.ByteString
      getRelayersBytes(int index);
}