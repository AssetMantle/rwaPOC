// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package com.ibc.core.connection.v1;

public interface ConnectionEndOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.ConnectionEnd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client associated with this connection.
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * client associated with this connection.
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * IBC version which can be utilised to determine encodings or protocols for
   * channels or packets utilising this connection.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.Version versions = 2 [json_name = "versions"];</code>
   */
  java.util.List<com.ibc.core.connection.v1.Version> 
      getVersionsList();
  /**
   * <pre>
   * IBC version which can be utilised to determine encodings or protocols for
   * channels or packets utilising this connection.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.Version versions = 2 [json_name = "versions"];</code>
   */
  com.ibc.core.connection.v1.Version getVersions(int index);
  /**
   * <pre>
   * IBC version which can be utilised to determine encodings or protocols for
   * channels or packets utilising this connection.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.Version versions = 2 [json_name = "versions"];</code>
   */
  int getVersionsCount();
  /**
   * <pre>
   * IBC version which can be utilised to determine encodings or protocols for
   * channels or packets utilising this connection.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.Version versions = 2 [json_name = "versions"];</code>
   */
  java.util.List<? extends com.ibc.core.connection.v1.VersionOrBuilder> 
      getVersionsOrBuilderList();
  /**
   * <pre>
   * IBC version which can be utilised to determine encodings or protocols for
   * channels or packets utilising this connection.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.Version versions = 2 [json_name = "versions"];</code>
   */
  com.ibc.core.connection.v1.VersionOrBuilder getVersionsOrBuilder(
      int index);

  /**
   * <pre>
   * current state of the connection end.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.State state = 3 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * current state of the connection end.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.State state = 3 [json_name = "state"];</code>
   * @return The state.
   */
  com.ibc.core.connection.v1.State getState();

  /**
   * <pre>
   * counterparty chain associated with this connection.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return Whether the counterparty field is set.
   */
  boolean hasCounterparty();
  /**
   * <pre>
   * counterparty chain associated with this connection.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return The counterparty.
   */
  com.ibc.core.connection.v1.Counterparty getCounterparty();
  /**
   * <pre>
   * counterparty chain associated with this connection.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.connection.v1.CounterpartyOrBuilder getCounterpartyOrBuilder();

  /**
   * <pre>
   * delay period that must pass before a consensus state can be used for
   * packet-verification NOTE: delay period logic is only implemented by some
   * clients.
   * </pre>
   *
   * <code>uint64 delay_period = 5 [json_name = "delayPeriod", (.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
   * @return The delayPeriod.
   */
  long getDelayPeriod();
}
