// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/queries/identities/query_request.proto

package com.assetmantle.modules.identities.queries.identities;

public interface QueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.identities.queries.identities.QueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.assetmantle.modules.identities.key.Key key = 1 [json_name = "key"];</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <code>.assetmantle.modules.identities.key.Key key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  com.assetmantle.modules.identities.key.Key getKey();
  /**
   * <code>.assetmantle.modules.identities.key.Key key = 1 [json_name = "key"];</code>
   */
  com.assetmantle.modules.identities.key.KeyOrBuilder getKeyOrBuilder();

  /**
   * <code>int32 limit = 2 [json_name = "limit"];</code>
   * @return The limit.
   */
  int getLimit();
}