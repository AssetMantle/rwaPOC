// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package com.cosmos.bank.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled", (.gogoproto.moretags) = "yaml:&#92;"send_enabled,omitempty&#92;""];</code>
   */
  java.util.List<com.cosmos.bank.v1beta1.SendEnabled> 
      getSendEnabledList();
  /**
   * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled", (.gogoproto.moretags) = "yaml:&#92;"send_enabled,omitempty&#92;""];</code>
   */
  com.cosmos.bank.v1beta1.SendEnabled getSendEnabled(int index);
  /**
   * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled", (.gogoproto.moretags) = "yaml:&#92;"send_enabled,omitempty&#92;""];</code>
   */
  int getSendEnabledCount();
  /**
   * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled", (.gogoproto.moretags) = "yaml:&#92;"send_enabled,omitempty&#92;""];</code>
   */
  java.util.List<? extends com.cosmos.bank.v1beta1.SendEnabledOrBuilder> 
      getSendEnabledOrBuilderList();
  /**
   * <code>repeated .cosmos.bank.v1beta1.SendEnabled send_enabled = 1 [json_name = "sendEnabled", (.gogoproto.moretags) = "yaml:&#92;"send_enabled,omitempty&#92;""];</code>
   */
  com.cosmos.bank.v1beta1.SendEnabledOrBuilder getSendEnabledOrBuilder(
      int index);

  /**
   * <code>bool default_send_enabled = 2 [json_name = "defaultSendEnabled", (.gogoproto.moretags) = "yaml:&#92;"default_send_enabled,omitempty&#92;""];</code>
   * @return The defaultSendEnabled.
   */
  boolean getDefaultSendEnabled();
}
