// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package com.cosmos.auth.v1beta1;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryAccountsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryAccountsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037cosmos/auth/v1beta1/query.proto\022\023cosmo" +
      "s.auth.v1beta1\032*cosmos/base/query/v1beta" +
      "1/pagination.proto\032\024gogoproto/gogo.proto" +
      "\032\031google/protobuf/any.proto\032\034google/api/" +
      "annotations.proto\032\036cosmos/auth/v1beta1/a" +
      "uth.proto\032\031cosmos_proto/cosmos.proto\"^\n\024" +
      "QueryAccountsRequest\022F\n\npagination\030\001 \001(\013" +
      "2&.cosmos.base.query.v1beta1.PageRequest" +
      "R\npagination\"\240\001\n\025QueryAccountsResponse\022>" +
      "\n\010accounts\030\001 \003(\0132\024.google.protobuf.AnyB\014" +
      "\312\264-\010AccountIR\010accounts\022G\n\npagination\030\002 \001" +
      "(\0132\'.cosmos.base.query.v1beta1.PageRespo" +
      "nseR\npagination\"9\n\023QueryAccountRequest\022\030" +
      "\n\007address\030\001 \001(\tR\007address:\010\210\240\037\000\350\240\037\000\"T\n\024Qu" +
      "eryAccountResponse\022<\n\007account\030\001 \001(\0132\024.go" +
      "ogle.protobuf.AnyB\014\312\264-\010AccountIR\007account" +
      "\"\024\n\022QueryParamsRequest\"P\n\023QueryParamsRes" +
      "ponse\0229\n\006params\030\001 \001(\0132\033.cosmos.auth.v1be" +
      "ta1.ParamsB\004\310\336\037\000R\006params\"5\n\037QueryModuleA" +
      "ccountByNameRequest\022\022\n\004name\030\001 \001(\tR\004name\"" +
      "f\n QueryModuleAccountByNameResponse\022B\n\007a" +
      "ccount\030\001 \001(\0132\024.google.protobuf.AnyB\022\312\264-\016" +
      "ModuleAccountIR\007account2\341\004\n\005Query\022\210\001\n\010Ac" +
      "counts\022).cosmos.auth.v1beta1.QueryAccoun" +
      "tsRequest\032*.cosmos.auth.v1beta1.QueryAcc" +
      "ountsResponse\"%\202\323\344\223\002\037\022\035/cosmos/auth/v1be" +
      "ta1/accounts\022\217\001\n\007Account\022(.cosmos.auth.v" +
      "1beta1.QueryAccountRequest\032).cosmos.auth" +
      ".v1beta1.QueryAccountResponse\"/\202\323\344\223\002)\022\'/" +
      "cosmos/auth/v1beta1/accounts/{address}\022\200" +
      "\001\n\006Params\022\'.cosmos.auth.v1beta1.QueryPar" +
      "amsRequest\032(.cosmos.auth.v1beta1.QueryPa" +
      "ramsResponse\"#\202\323\344\223\002\035\022\033/cosmos/auth/v1bet" +
      "a1/params\022\267\001\n\023ModuleAccountByName\0224.cosm" +
      "os.auth.v1beta1.QueryModuleAccountByName" +
      "Request\0325.cosmos.auth.v1beta1.QueryModul" +
      "eAccountByNameResponse\"3\202\323\344\223\002-\022+/cosmos/" +
      "auth/v1beta1/module_accounts/{name}B\276\001\n\027" +
      "com.cosmos.auth.v1beta1B\nQueryProtoP\001Z)g" +
      "ithub.com/cosmos/cosmos-sdk/x/auth/types" +
      "\242\002\003CAX\252\002\023Cosmos.Auth.V1beta1\312\002\023Cosmos\\Au" +
      "th\\V1beta1\342\002\037Cosmos\\Auth\\V1beta1\\GPBMeta" +
      "data\352\002\025Cosmos::Auth::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.auth.v1beta1.AuthProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_cosmos_auth_v1beta1_QueryAccountsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_auth_v1beta1_QueryAccountsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryAccountsRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_descriptor,
        new java.lang.String[] { "Accounts", "Pagination", });
    internal_static_cosmos_auth_v1beta1_QueryAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_auth_v1beta1_QueryAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryAccountRequest_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_cosmos_auth_v1beta1_QueryAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_auth_v1beta1_QueryAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryAccountResponse_descriptor,
        new java.lang.String[] { "Account", });
    internal_static_cosmos_auth_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_auth_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_auth_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_auth_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse_descriptor,
        new java.lang.String[] { "Account", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.auth.v1beta1.AuthProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}