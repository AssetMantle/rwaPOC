// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assets/transactions/define/transaction_response.proto

package com.assetmantle.modules.assets.transactions.define;

public final class TransactionResponseProto {
  private TransactionResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_assets_transactions_define_TransactionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_assets_transactions_define_TransactionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5assets/transactions/define/transaction" +
      "_response.proto\022.assetmantle.modules.ass" +
      "ets.transactions.define\032 ids/base/classi" +
      "fication_id.proto\"r\n\023TransactionResponse" +
      "\022[\n\022classification_i_d\030\001 \001(\0132-.assetmant" +
      "le.schema.ids.base.ClassificationIDR\020cla" +
      "ssificationIDB\351\002\n2com.assetmantle.module" +
      "s.assets.transactions.defineB\030Transactio" +
      "nResponseProtoP\001Z;github.com/AssetMantle" +
      "/modules/x/assets/transactions/define\242\002\005" +
      "AMATD\252\002.Assetmantle.Modules.Assets.Trans" +
      "actions.Define\312\002.Assetmantle\\Modules\\Ass" +
      "ets\\Transactions\\Define\342\002:Assetmantle\\Mo" +
      "dules\\Assets\\Transactions\\Define\\GPBMeta" +
      "data\352\0022Assetmantle::Modules::Assets::Tra" +
      "nsactions::Defineb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_assets_transactions_define_TransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_assets_transactions_define_TransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_assets_transactions_define_TransactionResponse_descriptor,
        new java.lang.String[] { "ClassificationID", });
    com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
