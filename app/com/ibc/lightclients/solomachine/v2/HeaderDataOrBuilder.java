// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

public interface HeaderDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v2.HeaderData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * header public key
   * </pre>
   *
   * <code>.google.protobuf.Any new_pub_key = 1 [json_name = "newPubKey", (.gogoproto.moretags) = "yaml:&#92;"new_pub_key&#92;""];</code>
   * @return Whether the newPubKey field is set.
   */
  boolean hasNewPubKey();
  /**
   * <pre>
   * header public key
   * </pre>
   *
   * <code>.google.protobuf.Any new_pub_key = 1 [json_name = "newPubKey", (.gogoproto.moretags) = "yaml:&#92;"new_pub_key&#92;""];</code>
   * @return The newPubKey.
   */
  com.google.protobuf.Any getNewPubKey();
  /**
   * <pre>
   * header public key
   * </pre>
   *
   * <code>.google.protobuf.Any new_pub_key = 1 [json_name = "newPubKey", (.gogoproto.moretags) = "yaml:&#92;"new_pub_key&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getNewPubKeyOrBuilder();

  /**
   * <pre>
   * header diversifier
   * </pre>
   *
   * <code>string new_diversifier = 2 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
   * @return The newDiversifier.
   */
  java.lang.String getNewDiversifier();
  /**
   * <pre>
   * header diversifier
   * </pre>
   *
   * <code>string new_diversifier = 2 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
   * @return The bytes for newDiversifier.
   */
  com.google.protobuf.ByteString
      getNewDiversifierBytes();
}
