// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/v1beta1/capability.proto

package com.cosmos.capability.v1beta1;

public final class CapabilityProto {
  private CapabilityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_Capability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_Capability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_Owner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_Owner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_CapabilityOwners_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_CapabilityOwners_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*cosmos/capability/v1beta1/capability.p" +
      "roto\022\031cosmos.capability.v1beta1\032\024gogopro" +
      "to/gogo.proto\":\n\nCapability\022&\n\005index\030\001 \001" +
      "(\004B\020\362\336\037\014yaml:\"index\"R\005index:\004\230\240\037\000\"a\n\005Own" +
      "er\022)\n\006module\030\001 \001(\tB\021\362\336\037\ryaml:\"module\"R\006m" +
      "odule\022#\n\004name\030\002 \001(\tB\017\362\336\037\013yaml:\"name\"R\004na" +
      "me:\010\210\240\037\000\230\240\037\000\"R\n\020CapabilityOwners\022>\n\006owne" +
      "rs\030\001 \003(\0132 .cosmos.capability.v1beta1.Own" +
      "erB\004\310\336\037\000R\006ownersB\347\001\n\035com.cosmos.capabili" +
      "ty.v1beta1B\017CapabilityProtoP\001Z/github.co" +
      "m/cosmos/cosmos-sdk/x/capability/types\242\002" +
      "\003CCX\252\002\031Cosmos.Capability.V1beta1\312\002\031Cosmo" +
      "s\\Capability\\V1beta1\342\002%Cosmos\\Capability" +
      "\\V1beta1\\GPBMetadata\352\002\033Cosmos::Capabilit" +
      "y::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cosmos_capability_v1beta1_Capability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_capability_v1beta1_Capability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_Capability_descriptor,
        new java.lang.String[] { "Index", });
    internal_static_cosmos_capability_v1beta1_Owner_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_capability_v1beta1_Owner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_Owner_descriptor,
        new java.lang.String[] { "Module", "Name", });
    internal_static_cosmos_capability_v1beta1_CapabilityOwners_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_capability_v1beta1_CapabilityOwners_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_CapabilityOwners_descriptor,
        new java.lang.String[] { "Owners", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
