// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assets/transactions/send/message.proto

package com.assetmantle.modules.assets.transactions.send;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_assets_transactions_send_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_assets_transactions_send_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&assets/transactions/send/message.proto" +
      "\022,assetmantle.modules.assets.transaction" +
      "s.send\032\032ids/base/identity_id.proto\032\027ids/" +
      "base/asset_id.proto\"\367\001\n\007Message\022\022\n\004from\030" +
      "\001 \001(\tR\004from\022A\n\010from_i_d\030\002 \001(\0132\'.assetman" +
      "tle.schema.ids.base.IdentityIDR\006fromID\022=" +
      "\n\006to_i_d\030\003 \001(\0132\'.assetmantle.schema.ids." +
      "base.IdentityIDR\004toID\022@\n\tasset_i_d\030\004 \001(\013" +
      "2$.assetmantle.schema.ids.base.AssetIDR\007" +
      "assetID\022\024\n\005value\030\005 \001(\tR\005valueB\321\002\n0com.as" +
      "setmantle.modules.assets.transactions.se" +
      "ndB\014MessageProtoP\001Z9github.com/AssetMant" +
      "le/modules/x/assets/transactions/send\242\002\005" +
      "AMATS\252\002,Assetmantle.Modules.Assets.Trans" +
      "actions.Send\312\002,Assetmantle\\Modules\\Asset" +
      "s\\Transactions\\Send\342\0028Assetmantle\\Module" +
      "s\\Assets\\Transactions\\Send\\GPBMetadata\352\002" +
      "0Assetmantle::Modules::Assets::Transacti" +
      "ons::Sendb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
          com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_assets_transactions_send_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_assets_transactions_send_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_assets_transactions_send_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "ToID", "AssetID", "Value", });
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
    com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
