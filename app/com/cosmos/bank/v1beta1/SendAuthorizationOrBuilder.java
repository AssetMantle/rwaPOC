// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/authz.proto

package com.cosmos.bank.v1beta1;

public interface SendAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.SendAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getSpendLimitList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getSpendLimit(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getSpendLimitCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getSpendLimitOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getSpendLimitOrBuilder(
      int index);
}
