// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/string_id.proto

package com.assetmantle.schema.ids.base;

public final class StringIdProto {
  private StringIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_StringID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_StringID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ids/base/string_id.proto\022\033assetmantle." +
      "schema.ids.base\032\024gogoproto/gogo.proto\".\n" +
      "\010StringID\022\034\n\ni_d_string\030\001 \001(\tR\010iDString:" +
      "\004\210\240\037\000B\353\001\n\037com.assetmantle.schema.ids.bas" +
      "eB\rStringIdProtoP\001Z)github.com/AssetMant" +
      "le/schema/go/ids/base\242\002\004ASIB\252\002\033Assetmant" +
      "le.Schema.Ids.Base\312\002\033Assetmantle\\Schema\\" +
      "Ids\\Base\342\002\'Assetmantle\\Schema\\Ids\\Base\\G" +
      "PBMetadata\352\002\036Assetmantle::Schema::Ids::B" +
      "aseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_StringID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_StringID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_StringID_descriptor,
        new java.lang.String[] { "IDString", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
