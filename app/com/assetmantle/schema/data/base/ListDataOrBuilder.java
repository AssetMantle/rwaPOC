// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data/base/list_data.proto

package com.assetmantle.schema.data.base;

public interface ListDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.schema.data.base.ListData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .assetmantle.schema.data.base.AnyListableData value = 1 [json_name = "value"];</code>
   */
  java.util.List<com.assetmantle.schema.data.base.AnyListableData> 
      getValueList();
  /**
   * <code>repeated .assetmantle.schema.data.base.AnyListableData value = 1 [json_name = "value"];</code>
   */
  com.assetmantle.schema.data.base.AnyListableData getValue(int index);
  /**
   * <code>repeated .assetmantle.schema.data.base.AnyListableData value = 1 [json_name = "value"];</code>
   */
  int getValueCount();
  /**
   * <code>repeated .assetmantle.schema.data.base.AnyListableData value = 1 [json_name = "value"];</code>
   */
  java.util.List<? extends com.assetmantle.schema.data.base.AnyListableDataOrBuilder> 
      getValueOrBuilderList();
  /**
   * <code>repeated .assetmantle.schema.data.base.AnyListableData value = 1 [json_name = "value"];</code>
   */
  com.assetmantle.schema.data.base.AnyListableDataOrBuilder getValueOrBuilder(
      int index);
}
