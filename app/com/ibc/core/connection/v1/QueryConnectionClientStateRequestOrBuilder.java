// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package com.ibc.core.connection.v1;

public interface QueryConnectionClientStateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.QueryConnectionClientStateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * connection identifier
   * </pre>
   *
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * connection identifier
   * </pre>
   *
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
