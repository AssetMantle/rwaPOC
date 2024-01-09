// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * QueryDelegatorValidatorResponse response type for the
 * Query/DelegatorValidator RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.QueryDelegatorValidatorResponse}
 */
public final class QueryDelegatorValidatorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
    QueryDelegatorValidatorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegatorValidatorResponse.newBuilder() to construct.
  private QueryDelegatorValidatorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegatorValidatorResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegatorValidatorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.class, com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.Builder.class);
  }

  public static final int VALIDATOR_FIELD_NUMBER = 1;
  private com.cosmos.staking.v1beta1.Validator validator_;
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return Whether the validator field is set.
   */
  @java.lang.Override
  public boolean hasValidator() {
    return validator_ != null;
  }
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return The validator.
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.Validator getValidator() {
    return validator_ == null ? com.cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
  }
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.ValidatorOrBuilder getValidatorOrBuilder() {
    return validator_ == null ? com.cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
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
    if (validator_ != null) {
      output.writeMessage(1, getValidator());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getValidator());
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
    if (!(obj instanceof com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)) {
      return super.equals(obj);
    }
    com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse other = (com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse) obj;

    if (hasValidator() != other.hasValidator()) return false;
    if (hasValidator()) {
      if (!getValidator()
          .equals(other.getValidator())) return false;
    }
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
    if (hasValidator()) {
      hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
      hash = (53 * hash) + getValidator().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse prototype) {
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
   * QueryDelegatorValidatorResponse response type for the
   * Query/DelegatorValidator RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.QueryDelegatorValidatorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.class, com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.newBuilder()
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
      validator_ = null;
      if (validatorBuilder_ != null) {
        validatorBuilder_.dispose();
        validatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse getDefaultInstanceForType() {
      return com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse build() {
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse buildPartial() {
      com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse result = new com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.validator_ = validatorBuilder_ == null
            ? validator_
            : validatorBuilder_.build();
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
      if (other instanceof com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse) {
        return mergeFrom((com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse other) {
      if (other == com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.getDefaultInstance()) return this;
      if (other.hasValidator()) {
        mergeValidator(other.getValidator());
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
              input.readMessage(
                  getValidatorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.cosmos.staking.v1beta1.Validator validator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.staking.v1beta1.Validator, com.cosmos.staking.v1beta1.Validator.Builder, com.cosmos.staking.v1beta1.ValidatorOrBuilder> validatorBuilder_;
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return Whether the validator field is set.
     */
    public boolean hasValidator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return The validator.
     */
    public com.cosmos.staking.v1beta1.Validator getValidator() {
      if (validatorBuilder_ == null) {
        return validator_ == null ? com.cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
      } else {
        return validatorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setValidator(com.cosmos.staking.v1beta1.Validator value) {
      if (validatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validator_ = value;
      } else {
        validatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setValidator(
        com.cosmos.staking.v1beta1.Validator.Builder builderForValue) {
      if (validatorBuilder_ == null) {
        validator_ = builderForValue.build();
      } else {
        validatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeValidator(com.cosmos.staking.v1beta1.Validator value) {
      if (validatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          validator_ != null &&
          validator_ != com.cosmos.staking.v1beta1.Validator.getDefaultInstance()) {
          getValidatorBuilder().mergeFrom(value);
        } else {
          validator_ = value;
        }
      } else {
        validatorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearValidator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      validator_ = null;
      if (validatorBuilder_ != null) {
        validatorBuilder_.dispose();
        validatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.Validator.Builder getValidatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValidatorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.ValidatorOrBuilder getValidatorOrBuilder() {
      if (validatorBuilder_ != null) {
        return validatorBuilder_.getMessageOrBuilder();
      } else {
        return validator_ == null ?
            com.cosmos.staking.v1beta1.Validator.getDefaultInstance() : validator_;
      }
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.staking.v1beta1.Validator, com.cosmos.staking.v1beta1.Validator.Builder, com.cosmos.staking.v1beta1.ValidatorOrBuilder> 
        getValidatorFieldBuilder() {
      if (validatorBuilder_ == null) {
        validatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.staking.v1beta1.Validator, com.cosmos.staking.v1beta1.Validator.Builder, com.cosmos.staking.v1beta1.ValidatorOrBuilder>(
                getValidator(),
                getParentForChildren(),
                isClean());
        validator_ = null;
      }
      return validatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
  private static final com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse();
  }

  public static com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegatorValidatorResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegatorValidatorResponse>() {
    @java.lang.Override
    public QueryDelegatorValidatorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegatorValidatorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegatorValidatorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

