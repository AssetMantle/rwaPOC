// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/params.proto

package com.tendermint.types;

/**
 * <pre>
 * ValidatorParams restrict the public key types validators can use.
 * NOTE: uses ABCI pubkey naming, not Amino names.
 * </pre>
 *
 * Protobuf type {@code tendermint.types.ValidatorParams}
 */
public final class ValidatorParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.ValidatorParams)
    ValidatorParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorParams.newBuilder() to construct.
  private ValidatorParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorParams() {
    pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidatorParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.types.ParamsProto.internal_static_tendermint_types_ValidatorParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.types.ParamsProto.internal_static_tendermint_types_ValidatorParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.types.ValidatorParams.class, com.tendermint.types.ValidatorParams.Builder.class);
  }

  public static final int PUB_KEY_TYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList pubKeyTypes_;
  /**
   * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
   * @return A list containing the pubKeyTypes.
   */
  public com.google.protobuf.ProtocolStringList
      getPubKeyTypesList() {
    return pubKeyTypes_;
  }
  /**
   * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
   * @return The count of pubKeyTypes.
   */
  public int getPubKeyTypesCount() {
    return pubKeyTypes_.size();
  }
  /**
   * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
   * @param index The index of the element to return.
   * @return The pubKeyTypes at the given index.
   */
  public java.lang.String getPubKeyTypes(int index) {
    return pubKeyTypes_.get(index);
  }
  /**
   * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the pubKeyTypes at the given index.
   */
  public com.google.protobuf.ByteString
      getPubKeyTypesBytes(int index) {
    return pubKeyTypes_.getByteString(index);
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
    for (int i = 0; i < pubKeyTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubKeyTypes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < pubKeyTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(pubKeyTypes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPubKeyTypesList().size();
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
    if (!(obj instanceof com.tendermint.types.ValidatorParams)) {
      return super.equals(obj);
    }
    com.tendermint.types.ValidatorParams other = (com.tendermint.types.ValidatorParams) obj;

    if (!getPubKeyTypesList()
        .equals(other.getPubKeyTypesList())) return false;
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
    if (getPubKeyTypesCount() > 0) {
      hash = (37 * hash) + PUB_KEY_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getPubKeyTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.types.ValidatorParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.ValidatorParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.types.ValidatorParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.ValidatorParams parseFrom(
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
  public static Builder newBuilder(com.tendermint.types.ValidatorParams prototype) {
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
   * ValidatorParams restrict the public key types validators can use.
   * NOTE: uses ABCI pubkey naming, not Amino names.
   * </pre>
   *
   * Protobuf type {@code tendermint.types.ValidatorParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.ValidatorParams)
      com.tendermint.types.ValidatorParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.types.ParamsProto.internal_static_tendermint_types_ValidatorParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.types.ParamsProto.internal_static_tendermint_types_ValidatorParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.types.ValidatorParams.class, com.tendermint.types.ValidatorParams.Builder.class);
    }

    // Construct using com.tendermint.types.ValidatorParams.newBuilder()
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
      pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.types.ParamsProto.internal_static_tendermint_types_ValidatorParams_descriptor;
    }

    @java.lang.Override
    public com.tendermint.types.ValidatorParams getDefaultInstanceForType() {
      return com.tendermint.types.ValidatorParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.types.ValidatorParams build() {
      com.tendermint.types.ValidatorParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.types.ValidatorParams buildPartial() {
      com.tendermint.types.ValidatorParams result = new com.tendermint.types.ValidatorParams(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tendermint.types.ValidatorParams result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        pubKeyTypes_ = pubKeyTypes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pubKeyTypes_ = pubKeyTypes_;
    }

    private void buildPartial0(com.tendermint.types.ValidatorParams result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tendermint.types.ValidatorParams) {
        return mergeFrom((com.tendermint.types.ValidatorParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.types.ValidatorParams other) {
      if (other == com.tendermint.types.ValidatorParams.getDefaultInstance()) return this;
      if (!other.pubKeyTypes_.isEmpty()) {
        if (pubKeyTypes_.isEmpty()) {
          pubKeyTypes_ = other.pubKeyTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePubKeyTypesIsMutable();
          pubKeyTypes_.addAll(other.pubKeyTypes_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensurePubKeyTypesIsMutable();
              pubKeyTypes_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringList pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePubKeyTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pubKeyTypes_ = new com.google.protobuf.LazyStringArrayList(pubKeyTypes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @return A list containing the pubKeyTypes.
     */
    public com.google.protobuf.ProtocolStringList
        getPubKeyTypesList() {
      return pubKeyTypes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @return The count of pubKeyTypes.
     */
    public int getPubKeyTypesCount() {
      return pubKeyTypes_.size();
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param index The index of the element to return.
     * @return The pubKeyTypes at the given index.
     */
    public java.lang.String getPubKeyTypes(int index) {
      return pubKeyTypes_.get(index);
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the pubKeyTypes at the given index.
     */
    public com.google.protobuf.ByteString
        getPubKeyTypesBytes(int index) {
      return pubKeyTypes_.getByteString(index);
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param index The index to set the value at.
     * @param value The pubKeyTypes to set.
     * @return This builder for chaining.
     */
    public Builder setPubKeyTypes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePubKeyTypesIsMutable();
      pubKeyTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param value The pubKeyTypes to add.
     * @return This builder for chaining.
     */
    public Builder addPubKeyTypes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePubKeyTypesIsMutable();
      pubKeyTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param values The pubKeyTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllPubKeyTypes(
        java.lang.Iterable<java.lang.String> values) {
      ensurePubKeyTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, pubKeyTypes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKeyTypes() {
      pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1 [json_name = "pubKeyTypes"];</code>
     * @param value The bytes of the pubKeyTypes to add.
     * @return This builder for chaining.
     */
    public Builder addPubKeyTypesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePubKeyTypesIsMutable();
      pubKeyTypes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.ValidatorParams)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.ValidatorParams)
  private static final com.tendermint.types.ValidatorParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.types.ValidatorParams();
  }

  public static com.tendermint.types.ValidatorParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorParams>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorParams>() {
    @java.lang.Override
    public ValidatorParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidatorParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.types.ValidatorParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

