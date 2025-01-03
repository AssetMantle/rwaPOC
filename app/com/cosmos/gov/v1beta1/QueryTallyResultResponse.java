// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryTallyResultResponse is the response type for the Query/Tally RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryTallyResultResponse}
 */
public final class QueryTallyResultResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryTallyResultResponse)
    QueryTallyResultResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTallyResultResponse.newBuilder() to construct.
  private QueryTallyResultResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTallyResultResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTallyResultResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.gov.v1beta1.QueryTallyResultResponse.class, com.cosmos.gov.v1beta1.QueryTallyResultResponse.Builder.class);
  }

  public static final int TALLY_FIELD_NUMBER = 1;
  private com.cosmos.gov.v1beta1.TallyResult tally_;
  /**
   * <pre>
   * tally defines the requested tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
   * @return Whether the tally field is set.
   */
  @java.lang.Override
  public boolean hasTally() {
    return tally_ != null;
  }
  /**
   * <pre>
   * tally defines the requested tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
   * @return The tally.
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.TallyResult getTally() {
    return tally_ == null ? com.cosmos.gov.v1beta1.TallyResult.getDefaultInstance() : tally_;
  }
  /**
   * <pre>
   * tally defines the requested tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.TallyResultOrBuilder getTallyOrBuilder() {
    return tally_ == null ? com.cosmos.gov.v1beta1.TallyResult.getDefaultInstance() : tally_;
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
    if (tally_ != null) {
      output.writeMessage(1, getTally());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tally_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTally());
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
    if (!(obj instanceof com.cosmos.gov.v1beta1.QueryTallyResultResponse)) {
      return super.equals(obj);
    }
    com.cosmos.gov.v1beta1.QueryTallyResultResponse other = (com.cosmos.gov.v1beta1.QueryTallyResultResponse) obj;

    if (hasTally() != other.hasTally()) return false;
    if (hasTally()) {
      if (!getTally()
          .equals(other.getTally())) return false;
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
    if (hasTally()) {
      hash = (37 * hash) + TALLY_FIELD_NUMBER;
      hash = (53 * hash) + getTally().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.gov.v1beta1.QueryTallyResultResponse prototype) {
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
   * QueryTallyResultResponse is the response type for the Query/Tally RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryTallyResultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryTallyResultResponse)
      com.cosmos.gov.v1beta1.QueryTallyResultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.gov.v1beta1.QueryTallyResultResponse.class, com.cosmos.gov.v1beta1.QueryTallyResultResponse.Builder.class);
    }

    // Construct using com.cosmos.gov.v1beta1.QueryTallyResultResponse.newBuilder()
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
      tally_ = null;
      if (tallyBuilder_ != null) {
        tallyBuilder_.dispose();
        tallyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryTallyResultResponse getDefaultInstanceForType() {
      return com.cosmos.gov.v1beta1.QueryTallyResultResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryTallyResultResponse build() {
      com.cosmos.gov.v1beta1.QueryTallyResultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryTallyResultResponse buildPartial() {
      com.cosmos.gov.v1beta1.QueryTallyResultResponse result = new com.cosmos.gov.v1beta1.QueryTallyResultResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.gov.v1beta1.QueryTallyResultResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tally_ = tallyBuilder_ == null
            ? tally_
            : tallyBuilder_.build();
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
      if (other instanceof com.cosmos.gov.v1beta1.QueryTallyResultResponse) {
        return mergeFrom((com.cosmos.gov.v1beta1.QueryTallyResultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.gov.v1beta1.QueryTallyResultResponse other) {
      if (other == com.cosmos.gov.v1beta1.QueryTallyResultResponse.getDefaultInstance()) return this;
      if (other.hasTally()) {
        mergeTally(other.getTally());
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
                  getTallyFieldBuilder().getBuilder(),
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

    private com.cosmos.gov.v1beta1.TallyResult tally_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.TallyResult, com.cosmos.gov.v1beta1.TallyResult.Builder, com.cosmos.gov.v1beta1.TallyResultOrBuilder> tallyBuilder_;
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     * @return Whether the tally field is set.
     */
    public boolean hasTally() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     * @return The tally.
     */
    public com.cosmos.gov.v1beta1.TallyResult getTally() {
      if (tallyBuilder_ == null) {
        return tally_ == null ? com.cosmos.gov.v1beta1.TallyResult.getDefaultInstance() : tally_;
      } else {
        return tallyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTally(com.cosmos.gov.v1beta1.TallyResult value) {
      if (tallyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tally_ = value;
      } else {
        tallyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTally(
        com.cosmos.gov.v1beta1.TallyResult.Builder builderForValue) {
      if (tallyBuilder_ == null) {
        tally_ = builderForValue.build();
      } else {
        tallyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTally(com.cosmos.gov.v1beta1.TallyResult value) {
      if (tallyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tally_ != null &&
          tally_ != com.cosmos.gov.v1beta1.TallyResult.getDefaultInstance()) {
          getTallyBuilder().mergeFrom(value);
        } else {
          tally_ = value;
        }
      } else {
        tallyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearTally() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tally_ = null;
      if (tallyBuilder_ != null) {
        tallyBuilder_.dispose();
        tallyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.gov.v1beta1.TallyResult.Builder getTallyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTallyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.gov.v1beta1.TallyResultOrBuilder getTallyOrBuilder() {
      if (tallyBuilder_ != null) {
        return tallyBuilder_.getMessageOrBuilder();
      } else {
        return tally_ == null ?
            com.cosmos.gov.v1beta1.TallyResult.getDefaultInstance() : tally_;
      }
    }
    /**
     * <pre>
     * tally defines the requested tally.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.gov.v1beta1.TallyResult, com.cosmos.gov.v1beta1.TallyResult.Builder, com.cosmos.gov.v1beta1.TallyResultOrBuilder> 
        getTallyFieldBuilder() {
      if (tallyBuilder_ == null) {
        tallyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.gov.v1beta1.TallyResult, com.cosmos.gov.v1beta1.TallyResult.Builder, com.cosmos.gov.v1beta1.TallyResultOrBuilder>(
                getTally(),
                getParentForChildren(),
                isClean());
        tally_ = null;
      }
      return tallyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryTallyResultResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryTallyResultResponse)
  private static final com.cosmos.gov.v1beta1.QueryTallyResultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.gov.v1beta1.QueryTallyResultResponse();
  }

  public static com.cosmos.gov.v1beta1.QueryTallyResultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTallyResultResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTallyResultResponse>() {
    @java.lang.Override
    public QueryTallyResultResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTallyResultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTallyResultResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.gov.v1beta1.QueryTallyResultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

