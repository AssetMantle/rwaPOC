// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package com.cosmos.auth.v1beta1;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.auth.v1beta1.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.cosmos.auth.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.cosmos.auth.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.cosmos.auth.v1beta1.Params getParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.cosmos.auth.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.auth.v1beta1.ParamsOrBuilder getParamsOrBuilder();
}