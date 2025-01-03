// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package com.cosmos.distribution.v1beta1;

public final class DistributionProto {
  private DistributionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_FeePool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_FeePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.cosmos/distribution/v1beta1/distributi" +
      "on.proto\022\033cosmos.distribution.v1beta1\032\024g" +
      "ogoproto/gogo.proto\032\036cosmos/base/v1beta1" +
      "/coin.proto\"\327\003\n\006Params\022k\n\rcommunity_tax\030" +
      "\001 \001(\tBF\310\336\037\000\332\336\037&github.com/cosmos/cosmos-" +
      "sdk/types.Dec\362\336\037\024yaml:\"community_tax\"R\014c" +
      "ommunityTax\022\177\n\024base_proposer_reward\030\002 \001(" +
      "\tBM\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.Dec\362\336\037\033yaml:\"base_proposer_reward\"" +
      "R\022baseProposerReward\022\202\001\n\025bonus_proposer_" +
      "reward\030\003 \001(\tBN\310\336\037\000\332\336\037&github.com/cosmos/" +
      "cosmos-sdk/types.Dec\362\336\037\034yaml:\"bonus_prop" +
      "oser_reward\"R\023bonusProposerReward\022T\n\025wit" +
      "hdraw_addr_enabled\030\004 \001(\010B \362\336\037\034yaml:\"with" +
      "draw_addr_enabled\"R\023withdrawAddrEnabled:" +
      "\004\230\240\037\000\"\217\002\n\032ValidatorHistoricalRewards\022\253\001\n" +
      "\027cumulative_reward_ratio\030\001 \003(\0132\034.cosmos." +
      "base.v1beta1.DecCoinBU\310\336\037\000\362\336\037\036yaml:\"cumu" +
      "lative_reward_ratio\"\252\337\037+github.com/cosmo" +
      "s/cosmos-sdk/types.DecCoinsR\025cumulativeR" +
      "ewardRatio\022C\n\017reference_count\030\002 \001(\rB\032\362\336\037" +
      "\026yaml:\"reference_count\"R\016referenceCount\"" +
      "\236\001\n\027ValidatorCurrentRewards\022k\n\007rewards\030\001" +
      " \003(\0132\034.cosmos.base.v1beta1.DecCoinB3\310\336\037\000" +
      "\252\337\037+github.com/cosmos/cosmos-sdk/types.D" +
      "ecCoinsR\007rewards\022\026\n\006period\030\002 \001(\004R\006period" +
      "\"\223\001\n\036ValidatorAccumulatedCommission\022q\n\nc" +
      "ommission\030\001 \003(\0132\034.cosmos.base.v1beta1.De" +
      "cCoinB3\310\336\037\000\252\337\037+github.com/cosmos/cosmos-" +
      "sdk/types.DecCoinsR\ncommission\"\234\001\n\033Valid" +
      "atorOutstandingRewards\022}\n\007rewards\030\001 \003(\0132" +
      "\034.cosmos.base.v1beta1.DecCoinBE\310\336\037\000\362\336\037\016y" +
      "aml:\"rewards\"\252\337\037+github.com/cosmos/cosmo" +
      "s-sdk/types.DecCoinsR\007rewards\"\251\001\n\023Valida" +
      "torSlashEvent\022F\n\020validator_period\030\001 \001(\004B" +
      "\033\362\336\037\027yaml:\"validator_period\"R\017validatorP" +
      "eriod\022J\n\010fraction\030\002 \001(\tB.\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.DecR\010fractio" +
      "n\"\254\001\n\024ValidatorSlashEvents\022\215\001\n\026validator" +
      "_slash_events\030\001 \003(\01320.cosmos.distributio" +
      "n.v1beta1.ValidatorSlashEventB%\310\336\037\000\362\336\037\035y" +
      "aml:\"validator_slash_events\"R\024validatorS" +
      "lashEvents:\004\230\240\037\000\"\235\001\n\007FeePool\022\221\001\n\016communi" +
      "ty_pool\030\001 \003(\0132\034.cosmos.base.v1beta1.DecC" +
      "oinBL\310\336\037\000\362\336\037\025yaml:\"community_pool\"\252\337\037+gi" +
      "thub.com/cosmos/cosmos-sdk/types.DecCoin" +
      "sR\rcommunityPool\"\345\001\n\032CommunityPoolSpendP" +
      "roposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descrip" +
      "tion\030\002 \001(\tR\013description\022\034\n\trecipient\030\003 \001" +
      "(\tR\trecipient\022c\n\006amount\030\004 \003(\0132\031.cosmos.b" +
      "ase.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com/cos" +
      "mos/cosmos-sdk/types.CoinsR\006amount:\014\210\240\037\000" +
      "\230\240\037\000\350\240\037\000\"\371\001\n\025DelegatorStartingInfo\022C\n\017pr" +
      "evious_period\030\001 \001(\004B\032\362\336\037\026yaml:\"previous_" +
      "period\"R\016previousPeriod\022T\n\005stake\030\002 \001(\tB>" +
      "\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/typ" +
      "es.Dec\362\336\037\014yaml:\"stake\"R\005stake\022E\n\006height\030" +
      "\003 \001(\004B-\352\336\037\017creation_height\362\336\037\026yaml:\"crea" +
      "tion_height\"R\006height\"\333\001\n\031DelegationDeleg" +
      "atorReward\022I\n\021validator_address\030\001 \001(\tB\034\362" +
      "\336\037\030yaml:\"validator_address\"R\020validatorAd" +
      "dress\022i\n\006reward\030\002 \003(\0132\034.cosmos.base.v1be" +
      "ta1.DecCoinB3\310\336\037\000\252\337\037+github.com/cosmos/c" +
      "osmos-sdk/types.DecCoinsR\006reward:\010\210\240\037\000\230\240" +
      "\037\001\"\240\002\n%CommunityPoolSpendProposalWithDep" +
      "osit\022&\n\005title\030\001 \001(\tB\020\362\336\037\014yaml:\"title\"R\005t" +
      "itle\0228\n\013description\030\002 \001(\tB\026\362\336\037\022yaml:\"des" +
      "cription\"R\013description\0222\n\trecipient\030\003 \001(" +
      "\tB\024\362\336\037\020yaml:\"recipient\"R\trecipient\022)\n\006am" +
      "ount\030\004 \001(\tB\021\362\336\037\ryaml:\"amount\"R\006amount\022,\n" +
      "\007deposit\030\005 \001(\tB\022\362\336\037\016yaml:\"deposit\"R\007depo" +
      "sit:\010\210\240\037\000\230\240\037\001B\371\001\n\037com.cosmos.distributio" +
      "n.v1beta1B\021DistributionProtoP\001Z1github.c" +
      "om/cosmos/cosmos-sdk/x/distribution/type" +
      "s\242\002\003CDX\252\002\033Cosmos.Distribution.V1beta1\312\002\033" +
      "Cosmos\\Distribution\\V1beta1\342\002\'Cosmos\\Dis" +
      "tribution\\V1beta1\\GPBMetadata\352\002\035Cosmos::" +
      "Distribution::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_cosmos_distribution_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_distribution_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_Params_descriptor,
        new java.lang.String[] { "CommunityTax", "BaseProposerReward", "BonusProposerReward", "WithdrawAddrEnabled", });
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_descriptor,
        new java.lang.String[] { "CumulativeRewardRatio", "ReferenceCount", });
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_descriptor,
        new java.lang.String[] { "Rewards", "Period", });
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor,
        new java.lang.String[] { "Commission", });
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_descriptor,
        new java.lang.String[] { "Rewards", });
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_descriptor,
        new java.lang.String[] { "ValidatorPeriod", "Fraction", });
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_descriptor,
        new java.lang.String[] { "ValidatorSlashEvents", });
    internal_static_cosmos_distribution_v1beta1_FeePool_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_distribution_v1beta1_FeePool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_FeePool_descriptor,
        new java.lang.String[] { "CommunityPool", });
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Recipient", "Amount", });
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_descriptor,
        new java.lang.String[] { "PreviousPeriod", "Stake", "Height", });
    internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_descriptor,
        new java.lang.String[] { "ValidatorAddress", "Reward", });
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "Recipient", "Amount", "Deposit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
