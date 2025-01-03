// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package com.ibc.core.client.v1;

public interface MsgSubmitMisbehaviourOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.MsgSubmitMisbehaviour)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * misbehaviour used for freezing the light client
   * </pre>
   *
   * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour"];</code>
   * @return Whether the misbehaviour field is set.
   */
  boolean hasMisbehaviour();
  /**
   * <pre>
   * misbehaviour used for freezing the light client
   * </pre>
   *
   * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour"];</code>
   * @return The misbehaviour.
   */
  com.google.protobuf.Any getMisbehaviour();
  /**
   * <pre>
   * misbehaviour used for freezing the light client
   * </pre>
   *
   * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour"];</code>
   */
  com.google.protobuf.AnyOrBuilder getMisbehaviourOrBuilder();

  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
