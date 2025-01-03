// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/query.proto

package com.cosmos.authz.v1beta1;

public interface QueryGrantsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.authz.v1beta1.QueryGrantsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The granter.
   */
  java.lang.String getGranter();
  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The bytes for granter.
   */
  com.google.protobuf.ByteString
      getGranterBytes();

  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The grantee.
   */
  java.lang.String getGrantee();
  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The bytes for grantee.
   */
  com.google.protobuf.ByteString
      getGranteeBytes();

  /**
   * <pre>
   * Optional, msg_type_url, when set, will query only grants matching given msg type.
   * </pre>
   *
   * <code>string msg_type_url = 3 [json_name = "msgTypeUrl"];</code>
   * @return The msgTypeUrl.
   */
  java.lang.String getMsgTypeUrl();
  /**
   * <pre>
   * Optional, msg_type_url, when set, will query only grants matching given msg type.
   * </pre>
   *
   * <code>string msg_type_url = 3 [json_name = "msgTypeUrl"];</code>
   * @return The bytes for msgTypeUrl.
   */
  com.google.protobuf.ByteString
      getMsgTypeUrlBytes();

  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
