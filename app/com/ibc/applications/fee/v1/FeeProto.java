// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/fee.proto

package com.ibc.applications.fee.v1;

public final class FeeProto {
  private FeeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_Fee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_Fee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_PacketFee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_PacketFee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_PacketFees_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_PacketFees_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_fee_v1_IdentifiedPacketFees_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_fee_v1_IdentifiedPacketFees_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ibc/applications/fee/v1/fee.proto\022\027ibc" +
      ".applications.fee.v1\032\036cosmos/base/v1beta" +
      "1/coin.proto\032\024gogoproto/gogo.proto\032!ibc/" +
      "core/channel/v1/channel.proto\"\375\002\n\003Fee\022y\n" +
      "\010recv_fee\030\001 \003(\0132\031.cosmos.base.v1beta1.Co" +
      "inBC\310\336\037\000\362\336\037\017yaml:\"recv_fee\"\252\337\037(github.co" +
      "m/cosmos/cosmos-sdk/types.CoinsR\007recvFee" +
      "\022v\n\007ack_fee\030\002 \003(\0132\031.cosmos.base.v1beta1." +
      "CoinBB\310\336\037\000\362\336\037\016yaml:\"ack_fee\"\252\337\037(github.c" +
      "om/cosmos/cosmos-sdk/types.CoinsR\006ackFee" +
      "\022\202\001\n\013timeout_fee\030\003 \003(\0132\031.cosmos.base.v1b" +
      "eta1.CoinBF\310\336\037\000\362\336\037\022yaml:\"timeout_fee\"\252\337\037" +
      "(github.com/cosmos/cosmos-sdk/types.Coin" +
      "sR\ntimeoutFee\"\237\001\n\tPacketFee\0224\n\003fee\030\001 \001(\013" +
      "2\034.ibc.applications.fee.v1.FeeB\004\310\336\037\000R\003fe" +
      "e\022@\n\016refund_address\030\002 \001(\tB\031\362\336\037\025yaml:\"ref" +
      "und_address\"R\rrefundAddress\022\032\n\010relayers\030" +
      "\003 \003(\tR\010relayers\"m\n\nPacketFees\022_\n\013packet_" +
      "fees\030\001 \003(\0132\".ibc.applications.fee.v1.Pac" +
      "ketFeeB\032\310\336\037\000\362\336\037\022yaml:\"packet_fees\"R\npack" +
      "etFees\"\315\001\n\024IdentifiedPacketFees\022T\n\tpacke" +
      "t_id\030\001 \001(\0132\035.ibc.core.channel.v1.PacketI" +
      "dB\030\310\336\037\000\362\336\037\020yaml:\"packet_id\"R\010packetId\022_\n" +
      "\013packet_fees\030\002 \003(\0132\".ibc.applications.fe" +
      "e.v1.PacketFeeB\032\310\336\037\000\362\336\037\022yaml:\"packet_fee" +
      "s\"R\npacketFeesB\335\001\n\033com.ibc.applications." +
      "fee.v1B\010FeeProtoP\001Z5github.com/cosmos/ib" +
      "c-go/v4/modules/apps/29-fee/types\242\002\003IAF\252" +
      "\002\027Ibc.Applications.Fee.V1\312\002\027Ibc\\Applicat" +
      "ions\\Fee\\V1\342\002#Ibc\\Applications\\Fee\\V1\\GP" +
      "BMetadata\352\002\032Ibc::Applications::Fee::V1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.ibc.core.channel.v1.ChannelProto.getDescriptor(),
        });
    internal_static_ibc_applications_fee_v1_Fee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_fee_v1_Fee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_Fee_descriptor,
        new java.lang.String[] { "RecvFee", "AckFee", "TimeoutFee", });
    internal_static_ibc_applications_fee_v1_PacketFee_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_fee_v1_PacketFee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_PacketFee_descriptor,
        new java.lang.String[] { "Fee", "RefundAddress", "Relayers", });
    internal_static_ibc_applications_fee_v1_PacketFees_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_applications_fee_v1_PacketFees_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_PacketFees_descriptor,
        new java.lang.String[] { "PacketFees", });
    internal_static_ibc_applications_fee_v1_IdentifiedPacketFees_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_applications_fee_v1_IdentifiedPacketFees_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_fee_v1_IdentifiedPacketFees_descriptor,
        new java.lang.String[] { "PacketId", "PacketFees", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.ibc.core.channel.v1.ChannelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
