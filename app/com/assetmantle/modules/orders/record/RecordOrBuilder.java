// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders/record/record.proto

package com.assetmantle.modules.orders.record;

public interface RecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.orders.record.Record)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.assetmantle.modules.orders.key.Key key = 1 [json_name = "key"];</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <code>.assetmantle.modules.orders.key.Key key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  com.assetmantle.modules.orders.key.Key getKey();
  /**
   * <code>.assetmantle.modules.orders.key.Key key = 1 [json_name = "key"];</code>
   */
  com.assetmantle.modules.orders.key.KeyOrBuilder getKeyOrBuilder();

  /**
   * <code>.assetmantle.modules.orders.mappable.Mappable mappable = 2 [json_name = "mappable"];</code>
   * @return Whether the mappable field is set.
   */
  boolean hasMappable();
  /**
   * <code>.assetmantle.modules.orders.mappable.Mappable mappable = 2 [json_name = "mappable"];</code>
   * @return The mappable.
   */
  com.assetmantle.modules.orders.mappable.Mappable getMappable();
  /**
   * <code>.assetmantle.modules.orders.mappable.Mappable mappable = 2 [json_name = "mappable"];</code>
   */
  com.assetmantle.modules.orders.mappable.MappableOrBuilder getMappableOrBuilder();
}
