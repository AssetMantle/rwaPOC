// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/authz.proto

package com.cosmos.authz.v1beta1;

public interface GrantAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.authz.v1beta1.GrantAuthorization)
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
   * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "Authorization"];</code>
   * @return Whether the authorization field is set.
   */
  boolean hasAuthorization();
  /**
   * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "Authorization"];</code>
   * @return The authorization.
   */
  com.google.protobuf.Any getAuthorization();
  /**
   * <code>.google.protobuf.Any authorization = 3 [json_name = "authorization", (.cosmos_proto.accepts_interface) = "Authorization"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAuthorizationOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the expiration field is set.
   */
  boolean hasExpiration();
  /**
   * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The expiration.
   */
  com.google.protobuf.Timestamp getExpiration();
  /**
   * <code>.google.protobuf.Timestamp expiration = 4 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationOrBuilder();
}
