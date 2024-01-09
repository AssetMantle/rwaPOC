// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

/**
 * Protobuf type {@code tendermint.abci.ResponseOfferSnapshot}
 */
public final class ResponseOfferSnapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.abci.ResponseOfferSnapshot)
    ResponseOfferSnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseOfferSnapshot.newBuilder() to construct.
  private ResponseOfferSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseOfferSnapshot() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResponseOfferSnapshot();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_ResponseOfferSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_ResponseOfferSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.abci.ResponseOfferSnapshot.class, com.tendermint.abci.ResponseOfferSnapshot.Builder.class);
  }

  /**
   * Protobuf enum {@code tendermint.abci.ResponseOfferSnapshot.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown result, abort all snapshot restoration
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <pre>
     * Snapshot accepted, apply chunks
     * </pre>
     *
     * <code>ACCEPT = 1;</code>
     */
    ACCEPT(1),
    /**
     * <pre>
     * Abort all snapshot restoration
     * </pre>
     *
     * <code>ABORT = 2;</code>
     */
    ABORT(2),
    /**
     * <pre>
     * Reject this specific snapshot, try others
     * </pre>
     *
     * <code>REJECT = 3;</code>
     */
    REJECT(3),
    /**
     * <pre>
     * Reject all snapshots of this format, try others
     * </pre>
     *
     * <code>REJECT_FORMAT = 4;</code>
     */
    REJECT_FORMAT(4),
    /**
     * <pre>
     * Reject all snapshots from the sender(s), try others
     * </pre>
     *
     * <code>REJECT_SENDER = 5;</code>
     */
    REJECT_SENDER(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unknown result, abort all snapshot restoration
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * Snapshot accepted, apply chunks
     * </pre>
     *
     * <code>ACCEPT = 1;</code>
     */
    public static final int ACCEPT_VALUE = 1;
    /**
     * <pre>
     * Abort all snapshot restoration
     * </pre>
     *
     * <code>ABORT = 2;</code>
     */
    public static final int ABORT_VALUE = 2;
    /**
     * <pre>
     * Reject this specific snapshot, try others
     * </pre>
     *
     * <code>REJECT = 3;</code>
     */
    public static final int REJECT_VALUE = 3;
    /**
     * <pre>
     * Reject all snapshots of this format, try others
     * </pre>
     *
     * <code>REJECT_FORMAT = 4;</code>
     */
    public static final int REJECT_FORMAT_VALUE = 4;
    /**
     * <pre>
     * Reject all snapshots from the sender(s), try others
     * </pre>
     *
     * <code>REJECT_SENDER = 5;</code>
     */
    public static final int REJECT_SENDER_VALUE = 5;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return ACCEPT;
        case 2: return ABORT;
        case 3: return REJECT;
        case 4: return REJECT_FORMAT;
        case 5: return REJECT_SENDER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return com.tendermint.abci.ResponseOfferSnapshot.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tendermint.abci.ResponseOfferSnapshot.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_ = 0;
  /**
   * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override public com.tendermint.abci.ResponseOfferSnapshot.Result getResult() {
    com.tendermint.abci.ResponseOfferSnapshot.Result result = com.tendermint.abci.ResponseOfferSnapshot.Result.forNumber(result_);
    return result == null ? com.tendermint.abci.ResponseOfferSnapshot.Result.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (result_ != com.tendermint.abci.ResponseOfferSnapshot.Result.UNKNOWN.getNumber()) {
      output.writeEnum(1, result_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != com.tendermint.abci.ResponseOfferSnapshot.Result.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tendermint.abci.ResponseOfferSnapshot)) {
      return super.equals(obj);
    }
    com.tendermint.abci.ResponseOfferSnapshot other = (com.tendermint.abci.ResponseOfferSnapshot) obj;

    if (result_ != other.result_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.abci.ResponseOfferSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tendermint.abci.ResponseOfferSnapshot prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tendermint.abci.ResponseOfferSnapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.abci.ResponseOfferSnapshot)
      com.tendermint.abci.ResponseOfferSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_ResponseOfferSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_ResponseOfferSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.abci.ResponseOfferSnapshot.class, com.tendermint.abci.ResponseOfferSnapshot.Builder.class);
    }

    // Construct using com.tendermint.abci.ResponseOfferSnapshot.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      result_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_ResponseOfferSnapshot_descriptor;
    }

    @java.lang.Override
    public com.tendermint.abci.ResponseOfferSnapshot getDefaultInstanceForType() {
      return com.tendermint.abci.ResponseOfferSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.abci.ResponseOfferSnapshot build() {
      com.tendermint.abci.ResponseOfferSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.abci.ResponseOfferSnapshot buildPartial() {
      com.tendermint.abci.ResponseOfferSnapshot result = new com.tendermint.abci.ResponseOfferSnapshot(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.abci.ResponseOfferSnapshot result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = result_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tendermint.abci.ResponseOfferSnapshot) {
        return mergeFrom((com.tendermint.abci.ResponseOfferSnapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.abci.ResponseOfferSnapshot other) {
      if (other == com.tendermint.abci.ResponseOfferSnapshot.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              result_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int result_ = 0;
    /**
     * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
     * @return The result.
     */
    @java.lang.Override
    public com.tendermint.abci.ResponseOfferSnapshot.Result getResult() {
      com.tendermint.abci.ResponseOfferSnapshot.Result result = com.tendermint.abci.ResponseOfferSnapshot.Result.forNumber(result_);
      return result == null ? com.tendermint.abci.ResponseOfferSnapshot.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(com.tendermint.abci.ResponseOfferSnapshot.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.abci.ResponseOfferSnapshot.Result result = 1 [json_name = "result"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tendermint.abci.ResponseOfferSnapshot)
  }

  // @@protoc_insertion_point(class_scope:tendermint.abci.ResponseOfferSnapshot)
  private static final com.tendermint.abci.ResponseOfferSnapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.abci.ResponseOfferSnapshot();
  }

  public static com.tendermint.abci.ResponseOfferSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseOfferSnapshot>
      PARSER = new com.google.protobuf.AbstractParser<ResponseOfferSnapshot>() {
    @java.lang.Override
    public ResponseOfferSnapshot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ResponseOfferSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseOfferSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.abci.ResponseOfferSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

