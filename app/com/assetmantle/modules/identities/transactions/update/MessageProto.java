// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/transactions/update/message.proto

package com.assetmantle.modules.identities.transactions.update;

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
    internal_static_assetmantle_modules_identities_transactions_update_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_identities_transactions_update_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,identities/transactions/update/message" +
      ".proto\0222assetmantle.modules.identities.t" +
      "ransactions.update\032\032ids/base/identity_id" +
      ".proto\032\036lists/base/property_list.proto\"\354" +
      "\002\n\007Message\022\022\n\004from\030\001 \001(\tR\004from\022A\n\010from_i" +
      "_d\030\002 \001(\0132\'.assetmantle.schema.ids.base.I" +
      "dentityIDR\006fromID\022I\n\014identity_i_d\030\003 \001(\0132" +
      "\'.assetmantle.schema.ids.base.IdentityID" +
      "R\nidentityID\022c\n\027mutable_meta_properties\030" +
      "\004 \001(\0132+.assetmantle.schema.lists.base.Pr" +
      "opertyListR\025mutableMetaProperties\022Z\n\022mut" +
      "able_properties\030\005 \001(\0132+.assetmantle.sche" +
      "ma.lists.base.PropertyListR\021mutablePrope" +
      "rtiesB\365\002\n6com.assetmantle.modules.identi" +
      "ties.transactions.updateB\014MessageProtoP\001" +
      "Z?github.com/AssetMantle/modules/x/ident" +
      "ities/transactions/update\242\002\005AMITU\252\0022Asse" +
      "tmantle.Modules.Identities.Transactions." +
      "Update\312\0022Assetmantle\\Modules\\Identities\\" +
      "Transactions\\Update\342\002>Assetmantle\\Module" +
      "s\\Identities\\Transactions\\Update\\GPBMeta" +
      "data\352\0026Assetmantle::Modules::Identities:" +
      ":Transactions::Updateb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
          com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_identities_transactions_update_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_identities_transactions_update_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_identities_transactions_update_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "IdentityID", "MutableMetaProperties", "MutableProperties", });
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
    com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
