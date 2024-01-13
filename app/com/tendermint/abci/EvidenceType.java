// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

/**
 * Protobuf enum {@code tendermint.abci.EvidenceType}
 */
public enum EvidenceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>DUPLICATE_VOTE = 1;</code>
   */
  DUPLICATE_VOTE(1),
  /**
   * <code>LIGHT_CLIENT_ATTACK = 2;</code>
   */
  LIGHT_CLIENT_ATTACK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>DUPLICATE_VOTE = 1;</code>
   */
  public static final int DUPLICATE_VOTE_VALUE = 1;
  /**
   * <code>LIGHT_CLIENT_ATTACK = 2;</code>
   */
  public static final int LIGHT_CLIENT_ATTACK_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EvidenceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EvidenceType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return DUPLICATE_VOTE;
      case 2: return LIGHT_CLIENT_ATTACK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EvidenceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EvidenceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EvidenceType>() {
          public EvidenceType findValueByNumber(int number) {
            return EvidenceType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.tendermint.abci.TypesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EvidenceType[] VALUES = values();

  public static EvidenceType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EvidenceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tendermint.abci.EvidenceType)
}
