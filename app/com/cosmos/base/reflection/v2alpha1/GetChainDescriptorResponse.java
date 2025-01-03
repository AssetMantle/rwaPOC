// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

/**
 * <pre>
 * GetChainDescriptorResponse is the response returned by the GetChainDescriptor RPC
 * </pre>
 *
 * Protobuf type {@code cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse}
 */
public final class GetChainDescriptorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse)
    GetChainDescriptorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetChainDescriptorResponse.newBuilder() to construct.
  private GetChainDescriptorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetChainDescriptorResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetChainDescriptorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.base.reflection.v2alpha1.ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetChainDescriptorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.base.reflection.v2alpha1.ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetChainDescriptorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.class, com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.Builder.class);
  }

  public static final int CHAIN_FIELD_NUMBER = 1;
  private com.cosmos.base.reflection.v2alpha1.ChainDescriptor chain_;
  /**
   * <pre>
   * chain describes application chain information
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
   * @return Whether the chain field is set.
   */
  @java.lang.Override
  public boolean hasChain() {
    return chain_ != null;
  }
  /**
   * <pre>
   * chain describes application chain information
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
   * @return The chain.
   */
  @java.lang.Override
  public com.cosmos.base.reflection.v2alpha1.ChainDescriptor getChain() {
    return chain_ == null ? com.cosmos.base.reflection.v2alpha1.ChainDescriptor.getDefaultInstance() : chain_;
  }
  /**
   * <pre>
   * chain describes application chain information
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.reflection.v2alpha1.ChainDescriptorOrBuilder getChainOrBuilder() {
    return chain_ == null ? com.cosmos.base.reflection.v2alpha1.ChainDescriptor.getDefaultInstance() : chain_;
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
    if (chain_ != null) {
      output.writeMessage(1, getChain());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (chain_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getChain());
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
    if (!(obj instanceof com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse)) {
      return super.equals(obj);
    }
    com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse other = (com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse) obj;

    if (hasChain() != other.hasChain()) return false;
    if (hasChain()) {
      if (!getChain()
          .equals(other.getChain())) return false;
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
    if (hasChain()) {
      hash = (37 * hash) + CHAIN_FIELD_NUMBER;
      hash = (53 * hash) + getChain().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse prototype) {
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
   * GetChainDescriptorResponse is the response returned by the GetChainDescriptor RPC
   * </pre>
   *
   * Protobuf type {@code cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse)
      com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.base.reflection.v2alpha1.ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetChainDescriptorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.base.reflection.v2alpha1.ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetChainDescriptorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.class, com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.Builder.class);
    }

    // Construct using com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.newBuilder()
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
      chain_ = null;
      if (chainBuilder_ != null) {
        chainBuilder_.dispose();
        chainBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.base.reflection.v2alpha1.ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetChainDescriptorResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse getDefaultInstanceForType() {
      return com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse build() {
      com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse buildPartial() {
      com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse result = new com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chain_ = chainBuilder_ == null
            ? chain_
            : chainBuilder_.build();
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
      if (other instanceof com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse) {
        return mergeFrom((com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse other) {
      if (other == com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse.getDefaultInstance()) return this;
      if (other.hasChain()) {
        mergeChain(other.getChain());
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
                  getChainFieldBuilder().getBuilder(),
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

    private com.cosmos.base.reflection.v2alpha1.ChainDescriptor chain_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.reflection.v2alpha1.ChainDescriptor, com.cosmos.base.reflection.v2alpha1.ChainDescriptor.Builder, com.cosmos.base.reflection.v2alpha1.ChainDescriptorOrBuilder> chainBuilder_;
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     * @return Whether the chain field is set.
     */
    public boolean hasChain() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     * @return The chain.
     */
    public com.cosmos.base.reflection.v2alpha1.ChainDescriptor getChain() {
      if (chainBuilder_ == null) {
        return chain_ == null ? com.cosmos.base.reflection.v2alpha1.ChainDescriptor.getDefaultInstance() : chain_;
      } else {
        return chainBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    public Builder setChain(com.cosmos.base.reflection.v2alpha1.ChainDescriptor value) {
      if (chainBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chain_ = value;
      } else {
        chainBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    public Builder setChain(
        com.cosmos.base.reflection.v2alpha1.ChainDescriptor.Builder builderForValue) {
      if (chainBuilder_ == null) {
        chain_ = builderForValue.build();
      } else {
        chainBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    public Builder mergeChain(com.cosmos.base.reflection.v2alpha1.ChainDescriptor value) {
      if (chainBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          chain_ != null &&
          chain_ != com.cosmos.base.reflection.v2alpha1.ChainDescriptor.getDefaultInstance()) {
          getChainBuilder().mergeFrom(value);
        } else {
          chain_ = value;
        }
      } else {
        chainBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    public Builder clearChain() {
      bitField0_ = (bitField0_ & ~0x00000001);
      chain_ = null;
      if (chainBuilder_ != null) {
        chainBuilder_.dispose();
        chainBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    public com.cosmos.base.reflection.v2alpha1.ChainDescriptor.Builder getChainBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getChainFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    public com.cosmos.base.reflection.v2alpha1.ChainDescriptorOrBuilder getChainOrBuilder() {
      if (chainBuilder_ != null) {
        return chainBuilder_.getMessageOrBuilder();
      } else {
        return chain_ == null ?
            com.cosmos.base.reflection.v2alpha1.ChainDescriptor.getDefaultInstance() : chain_;
      }
    }
    /**
     * <pre>
     * chain describes application chain information
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 1 [json_name = "chain"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.reflection.v2alpha1.ChainDescriptor, com.cosmos.base.reflection.v2alpha1.ChainDescriptor.Builder, com.cosmos.base.reflection.v2alpha1.ChainDescriptorOrBuilder> 
        getChainFieldBuilder() {
      if (chainBuilder_ == null) {
        chainBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.reflection.v2alpha1.ChainDescriptor, com.cosmos.base.reflection.v2alpha1.ChainDescriptor.Builder, com.cosmos.base.reflection.v2alpha1.ChainDescriptorOrBuilder>(
                getChain(),
                getParentForChildren(),
                isClean());
        chain_ = null;
      }
      return chainBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse)
  private static final com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse();
  }

  public static com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetChainDescriptorResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetChainDescriptorResponse>() {
    @java.lang.Override
    public GetChainDescriptorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetChainDescriptorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetChainDescriptorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

