// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/params/v1beta1/params.proto

package com.cosmos.params.v1beta1;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_ParameterChangeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_ParameterChangeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_ParamChange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_ParamChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"cosmos/params/v1beta1/params.proto\022\025co" +
      "smos.params.v1beta1\032\024gogoproto/gogo.prot" +
      "o\"\237\001\n\027ParameterChangeProposal\022\024\n\005title\030\001" +
      " \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descri" +
      "ption\022B\n\007changes\030\003 \003(\0132\".cosmos.params.v" +
      "1beta1.ParamChangeB\004\310\336\037\000R\007changes:\010\210\240\037\000\230" +
      "\240\037\000\"W\n\013ParamChange\022\032\n\010subspace\030\001 \001(\tR\010su" +
      "bspace\022\020\n\003key\030\002 \001(\tR\003key\022\024\n\005value\030\003 \001(\tR" +
      "\005value:\004\230\240\037\000B\330\001\n\031com.cosmos.params.v1bet" +
      "a1B\013ParamsProtoP\001Z4github.com/cosmos/cos" +
      "mos-sdk/x/params/types/proposal\242\002\003CPX\252\002\025" +
      "Cosmos.Params.V1beta1\312\002\025Cosmos\\Params\\V1" +
      "beta1\342\002!Cosmos\\Params\\V1beta1\\GPBMetadat" +
      "a\352\002\027Cosmos::Params::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cosmos_params_v1beta1_ParameterChangeProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_params_v1beta1_ParameterChangeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_ParameterChangeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Changes", });
    internal_static_cosmos_params_v1beta1_ParamChange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_params_v1beta1_ParamChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_ParamChange_descriptor,
        new java.lang.String[] { "Subspace", "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
