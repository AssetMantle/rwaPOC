// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/params/v1beta1/query.proto

package com.cosmos.params.v1beta1;

public interface QueryParamsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.params.v1beta1.QueryParamsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * subspace defines the module to query the parameter for.
   * </pre>
   *
   * <code>string subspace = 1 [json_name = "subspace"];</code>
   * @return The subspace.
   */
  java.lang.String getSubspace();
  /**
   * <pre>
   * subspace defines the module to query the parameter for.
   * </pre>
   *
   * <code>string subspace = 1 [json_name = "subspace"];</code>
   * @return The bytes for subspace.
   */
  com.google.protobuf.ByteString
      getSubspaceBytes();

  /**
   * <pre>
   * key defines the key of the parameter in the subspace.
   * </pre>
   *
   * <code>string key = 2 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * key defines the key of the parameter in the subspace.
   * </pre>
   *
   * <code>string key = 2 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
