// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classifications/genesis/genesis.proto

package com.assetmantle.modules.classifications.genesis;

public interface GenesisOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.classifications.genesis.Genesis)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .assetmantle.modules.classifications.record.Record records = 1 [json_name = "records"];</code>
   */
  java.util.List<com.assetmantle.modules.classifications.record.Record> 
      getRecordsList();
  /**
   * <code>repeated .assetmantle.modules.classifications.record.Record records = 1 [json_name = "records"];</code>
   */
  com.assetmantle.modules.classifications.record.Record getRecords(int index);
  /**
   * <code>repeated .assetmantle.modules.classifications.record.Record records = 1 [json_name = "records"];</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .assetmantle.modules.classifications.record.Record records = 1 [json_name = "records"];</code>
   */
  java.util.List<? extends com.assetmantle.modules.classifications.record.RecordOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .assetmantle.modules.classifications.record.Record records = 1 [json_name = "records"];</code>
   */
  com.assetmantle.modules.classifications.record.RecordOrBuilder getRecordsOrBuilder(
      int index);

  /**
   * <code>.assetmantle.schema.lists.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   * @return Whether the parameterList field is set.
   */
  boolean hasParameterList();
  /**
   * <code>.assetmantle.schema.lists.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   * @return The parameterList.
   */
  com.assetmantle.schema.lists.base.ParameterList getParameterList();
  /**
   * <code>.assetmantle.schema.lists.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   */
  com.assetmantle.schema.lists.base.ParameterListOrBuilder getParameterListOrBuilder();
}
