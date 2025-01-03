// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package com.cosmos.bank.v1beta1;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * denom_units represents the list of DenomUnit's for a given coin
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.DenomUnit denom_units = 2 [json_name = "denomUnits"];</code>
   */
  java.util.List<com.cosmos.bank.v1beta1.DenomUnit> 
      getDenomUnitsList();
  /**
   * <pre>
   * denom_units represents the list of DenomUnit's for a given coin
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.DenomUnit denom_units = 2 [json_name = "denomUnits"];</code>
   */
  com.cosmos.bank.v1beta1.DenomUnit getDenomUnits(int index);
  /**
   * <pre>
   * denom_units represents the list of DenomUnit's for a given coin
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.DenomUnit denom_units = 2 [json_name = "denomUnits"];</code>
   */
  int getDenomUnitsCount();
  /**
   * <pre>
   * denom_units represents the list of DenomUnit's for a given coin
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.DenomUnit denom_units = 2 [json_name = "denomUnits"];</code>
   */
  java.util.List<? extends com.cosmos.bank.v1beta1.DenomUnitOrBuilder> 
      getDenomUnitsOrBuilderList();
  /**
   * <pre>
   * denom_units represents the list of DenomUnit's for a given coin
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.DenomUnit denom_units = 2 [json_name = "denomUnits"];</code>
   */
  com.cosmos.bank.v1beta1.DenomUnitOrBuilder getDenomUnitsOrBuilder(
      int index);

  /**
   * <pre>
   * base represents the base denom (should be the DenomUnit with exponent = 0).
   * </pre>
   *
   * <code>string base = 3 [json_name = "base"];</code>
   * @return The base.
   */
  java.lang.String getBase();
  /**
   * <pre>
   * base represents the base denom (should be the DenomUnit with exponent = 0).
   * </pre>
   *
   * <code>string base = 3 [json_name = "base"];</code>
   * @return The bytes for base.
   */
  com.google.protobuf.ByteString
      getBaseBytes();

  /**
   * <pre>
   * display indicates the suggested denom that should be
   * displayed in clients.
   * </pre>
   *
   * <code>string display = 4 [json_name = "display"];</code>
   * @return The display.
   */
  java.lang.String getDisplay();
  /**
   * <pre>
   * display indicates the suggested denom that should be
   * displayed in clients.
   * </pre>
   *
   * <code>string display = 4 [json_name = "display"];</code>
   * @return The bytes for display.
   */
  com.google.protobuf.ByteString
      getDisplayBytes();

  /**
   * <pre>
   * name defines the name of the token (eg: Cosmos Atom)
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name defines the name of the token (eg: Cosmos Atom)
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * symbol is the token symbol usually shown on exchanges (eg: ATOM). This can
   * be the same as the display.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>string symbol = 6 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <pre>
   * symbol is the token symbol usually shown on exchanges (eg: ATOM). This can
   * be the same as the display.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>string symbol = 6 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();
}
