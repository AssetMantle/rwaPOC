// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/genesis.proto

package com.cosmos.auth.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.auth.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.cosmos.auth.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.cosmos.auth.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.cosmos.auth.v1beta1.Params getParams();
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.cosmos.auth.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.auth.v1beta1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * accounts are the accounts present at genesis.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 2 [json_name = "accounts"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getAccountsList();
  /**
   * <pre>
   * accounts are the accounts present at genesis.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 2 [json_name = "accounts"];</code>
   */
  com.google.protobuf.Any getAccounts(int index);
  /**
   * <pre>
   * accounts are the accounts present at genesis.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 2 [json_name = "accounts"];</code>
   */
  int getAccountsCount();
  /**
   * <pre>
   * accounts are the accounts present at genesis.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 2 [json_name = "accounts"];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <pre>
   * accounts are the accounts present at genesis.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 2 [json_name = "accounts"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAccountsOrBuilder(
      int index);
}