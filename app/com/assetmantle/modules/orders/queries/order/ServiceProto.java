// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders/queries/order/service.proto

package com.assetmantle.modules.orders.queries.order;

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
      "\n\"orders/queries/order/service.proto\022(as" +
      "setmantle.modules.orders.queries.order\032\034" +
      "google/api/annotations.proto\032(orders/que" +
      "ries/order/query_request.proto\032)orders/q" +
      "ueries/order/query_response.proto2\251\001\n\005Qu" +
      "ery\022\237\001\n\006Handle\0226.assetmantle.modules.ord" +
      "ers.queries.order.QueryRequest\0327.assetma" +
      "ntle.modules.orders.queries.order.QueryR" +
      "esponse\"$\202\323\344\223\002\036\022\034/mantle/orders/v1beta1/" +
      "orderB\271\002\n,com.assetmantle.modules.orders" +
      ".queries.orderB\014ServiceProtoP\001Z5github.c" +
      "om/AssetMantle/modules/x/orders/queries/" +
      "order\242\002\005AMOQO\252\002(Assetmantle.Modules.Orde" +
      "rs.Queries.Order\312\002(Assetmantle\\Modules\\O" +
      "rders\\Queries\\Order\342\0024Assetmantle\\Module" +
      "s\\Orders\\Queries\\Order\\GPBMetadata\352\002,Ass" +
      "etmantle::Modules::Orders::Queries::Orde" +
      "rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.orders.queries.order.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.orders.queries.order.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.orders.queries.order.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.orders.queries.order.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
