// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assets/transactions/define/message.proto

package com.assetmantle.modules.assets.transactions.define;

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
    internal_static_assetmantle_modules_assets_transactions_define_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_assets_transactions_define_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(assets/transactions/define/message.pro" +
      "to\022.assetmantle.modules.assets.transacti" +
      "ons.define\032\032ids/base/identity_id.proto\032\036" +
      "lists/base/property_list.proto\"\352\003\n\007Messa" +
      "ge\022\022\n\004from\030\001 \001(\tR\004from\022A\n\010from_i_d\030\002 \001(\013" +
      "2\'.assetmantle.schema.ids.base.IdentityI" +
      "DR\006fromID\022g\n\031immutable_meta_properties\030\003" +
      " \001(\0132+.assetmantle.schema.lists.base.Pro" +
      "pertyListR\027immutableMetaProperties\022^\n\024im" +
      "mutable_properties\030\004 \001(\0132+.assetmantle.s" +
      "chema.lists.base.PropertyListR\023immutable" +
      "Properties\022c\n\027mutable_meta_properties\030\005 " +
      "\001(\0132+.assetmantle.schema.lists.base.Prop" +
      "ertyListR\025mutableMetaProperties\022Z\n\022mutab" +
      "le_properties\030\006 \001(\0132+.assetmantle.schema" +
      ".lists.base.PropertyListR\021mutablePropert" +
      "iesB\335\002\n2com.assetmantle.modules.assets.t" +
      "ransactions.defineB\014MessageProtoP\001Z;gith" +
      "ub.com/AssetMantle/modules/x/assets/tran" +
      "sactions/define\242\002\005AMATD\252\002.Assetmantle.Mo" +
      "dules.Assets.Transactions.Define\312\002.Asset" +
      "mantle\\Modules\\Assets\\Transactions\\Defin" +
      "e\342\002:Assetmantle\\Modules\\Assets\\Transacti" +
      "ons\\Define\\GPBMetadata\352\0022Assetmantle::Mo" +
      "dules::Assets::Transactions::Defineb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
          com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_assets_transactions_define_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_assets_transactions_define_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_assets_transactions_define_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "ImmutableMetaProperties", "ImmutableProperties", "MutableMetaProperties", "MutableProperties", });
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
    com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
