// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/privval/types.proto

package com.tendermint.privval;

public interface PubKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.privval.PubKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey", (.gogoproto.nullable) = false];</code>
   * @return Whether the pubKey field is set.
   */
  boolean hasPubKey();
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey", (.gogoproto.nullable) = false];</code>
   * @return The pubKey.
   */
  com.tendermint.crypto.PublicKey getPubKey();
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.crypto.PublicKeyOrBuilder getPubKeyOrBuilder();

  /**
   * <code>.tendermint.privval.RemoteSignerError error = 2 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.tendermint.privval.RemoteSignerError error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  com.tendermint.privval.RemoteSignerError getError();
  /**
   * <code>.tendermint.privval.RemoteSignerError error = 2 [json_name = "error"];</code>
   */
  com.tendermint.privval.RemoteSignerErrorOrBuilder getErrorOrBuilder();
}
