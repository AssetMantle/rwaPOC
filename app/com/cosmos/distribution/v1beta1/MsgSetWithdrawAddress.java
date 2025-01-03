// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package com.cosmos.distribution.v1beta1;

/**
 * <pre>
 * MsgSetWithdrawAddress sets the withdraw address for
 * a delegator (or validator self-delegation).
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.MsgSetWithdrawAddress}
 */
public final class MsgSetWithdrawAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.MsgSetWithdrawAddress)
    MsgSetWithdrawAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSetWithdrawAddress.newBuilder() to construct.
  private MsgSetWithdrawAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSetWithdrawAddress() {
    delegatorAddress_ = "";
    withdrawAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSetWithdrawAddress();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.distribution.v1beta1.TxProto.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.distribution.v1beta1.TxProto.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.class, com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.Builder.class);
  }

  public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegatorAddress_ = "";
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   * @return The delegatorAddress.
   */
  @java.lang.Override
  public java.lang.String getDelegatorAddress() {
    java.lang.Object ref = delegatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegatorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   * @return The bytes for delegatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegatorAddressBytes() {
    java.lang.Object ref = delegatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITHDRAW_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object withdrawAddress_ = "";
  /**
   * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   * @return The withdrawAddress.
   */
  @java.lang.Override
  public java.lang.String getWithdrawAddress() {
    java.lang.Object ref = withdrawAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      withdrawAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
   * @return The bytes for withdrawAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWithdrawAddressBytes() {
    java.lang.Object ref = withdrawAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      withdrawAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegatorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, withdrawAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegatorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, withdrawAddress_);
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
    if (!(obj instanceof com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress)) {
      return super.equals(obj);
    }
    com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress other = (com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress) obj;

    if (!getDelegatorAddress()
        .equals(other.getDelegatorAddress())) return false;
    if (!getWithdrawAddress()
        .equals(other.getWithdrawAddress())) return false;
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
    hash = (37 * hash) + DELEGATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDelegatorAddress().hashCode();
    hash = (37 * hash) + WITHDRAW_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getWithdrawAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress parseFrom(
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
  public static Builder newBuilder(com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress prototype) {
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
   * <pre>
   * MsgSetWithdrawAddress sets the withdraw address for
   * a delegator (or validator self-delegation).
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.MsgSetWithdrawAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.MsgSetWithdrawAddress)
      com.cosmos.distribution.v1beta1.MsgSetWithdrawAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.distribution.v1beta1.TxProto.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.distribution.v1beta1.TxProto.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.class, com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.Builder.class);
    }

    // Construct using com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.newBuilder()
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
      delegatorAddress_ = "";
      withdrawAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.distribution.v1beta1.TxProto.internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_descriptor;
    }

    @java.lang.Override
    public com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress getDefaultInstanceForType() {
      return com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress build() {
      com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress buildPartial() {
      com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress result = new com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delegatorAddress_ = delegatorAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withdrawAddress_ = withdrawAddress_;
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
      if (other instanceof com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress) {
        return mergeFrom((com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress other) {
      if (other == com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress.getDefaultInstance()) return this;
      if (!other.getDelegatorAddress().isEmpty()) {
        delegatorAddress_ = other.delegatorAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWithdrawAddress().isEmpty()) {
        withdrawAddress_ = other.withdrawAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10: {
              delegatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              withdrawAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object delegatorAddress_ = "";
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     * @return The delegatorAddress.
     */
    public java.lang.String getDelegatorAddress() {
      java.lang.Object ref = delegatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     * @return The bytes for delegatorAddress.
     */
    public com.google.protobuf.ByteString
        getDelegatorAddressBytes() {
      java.lang.Object ref = delegatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     * @param value The delegatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegatorAddress() {
      delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     * @param value The bytes for delegatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object withdrawAddress_ = "";
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @return The withdrawAddress.
     */
    public java.lang.String getWithdrawAddress() {
      java.lang.Object ref = withdrawAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        withdrawAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @return The bytes for withdrawAddress.
     */
    public com.google.protobuf.ByteString
        getWithdrawAddressBytes() {
      java.lang.Object ref = withdrawAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        withdrawAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @param value The withdrawAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      withdrawAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithdrawAddress() {
      withdrawAddress_ = getDefaultInstance().getWithdrawAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     * @param value The bytes for withdrawAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      withdrawAddress_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.MsgSetWithdrawAddress)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.MsgSetWithdrawAddress)
  private static final com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress();
  }

  public static com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSetWithdrawAddress>
      PARSER = new com.google.protobuf.AbstractParser<MsgSetWithdrawAddress>() {
    @java.lang.Override
    public MsgSetWithdrawAddress parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSetWithdrawAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSetWithdrawAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.distribution.v1beta1.MsgSetWithdrawAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

