// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assets/transactions/deputize/service.proto

package com.assetmantle.modules.assets.transactions.deputize;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*assets/transactions/deputize/service.p" +
      "roto\0220assetmantle.modules.assets.transac" +
      "tions.deputize\032\034google/api/annotations.p" +
      "roto\032*assets/transactions/deputize/messa" +
      "ge.proto\0327assets/transactions/deputize/t" +
      "ransaction_response.proto2\263\001\n\003Msg\022\253\001\n\006Ha" +
      "ndle\0229.assetmantle.modules.assets.transa" +
      "ctions.deputize.Message\032E.assetmantle.mo" +
      "dules.assets.transactions.deputize.Trans" +
      "actionResponse\"\037\202\323\344\223\002\031\"\027/mantle/assets/d" +
      "eputizeB\351\002\n4com.assetmantle.modules.asse" +
      "ts.transactions.deputizeB\014ServiceProtoP\001" +
      "Z=github.com/AssetMantle/modules/x/asset" +
      "s/transactions/deputize\242\002\005AMATD\252\0020Assetm" +
      "antle.Modules.Assets.Transactions.Deputi" +
      "ze\312\0020Assetmantle\\Modules\\Assets\\Transact" +
      "ions\\Deputize\342\002<Assetmantle\\Modules\\Asse" +
      "ts\\Transactions\\Deputize\\GPBMetadata\352\0024A" +
      "ssetmantle::Modules::Assets::Transaction" +
      "s::Deputizeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.assets.transactions.deputize.MessageProto.getDescriptor(),
          com.assetmantle.modules.assets.transactions.deputize.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.assets.transactions.deputize.MessageProto.getDescriptor();
    com.assetmantle.modules.assets.transactions.deputize.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
