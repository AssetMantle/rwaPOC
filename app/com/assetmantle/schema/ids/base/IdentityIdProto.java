// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/identity_id.proto

package com.assetmantle.schema.ids.base;

public final class IdentityIdProto {
  private IdentityIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_IdentityID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_IdentityID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ids/base/identity_id.proto\022\033assetmantl" +
      "e.schema.ids.base\032\024gogoproto/gogo.proto\032" +
      "\026ids/base/hash_id.proto\"Q\n\nIdentityID\022=\n" +
      "\010hash_i_d\030\001 \001(\0132#.assetmantle.schema.ids" +
      ".base.HashIDR\006hashID:\004\210\240\037\000B\355\001\n\037com.asset" +
      "mantle.schema.ids.baseB\017IdentityIdProtoP" +
      "\001Z)github.com/AssetMantle/schema/go/ids/" +
      "base\242\002\004ASIB\252\002\033Assetmantle.Schema.Ids.Bas" +
      "e\312\002\033Assetmantle\\Schema\\Ids\\Base\342\002\'Assetm" +
      "antle\\Schema\\Ids\\Base\\GPBMetadata\352\002\036Asse" +
      "tmantle::Schema::Ids::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.HashIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_IdentityID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_IdentityID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_IdentityID_descriptor,
        new java.lang.String[] { "HashID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.HashIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
