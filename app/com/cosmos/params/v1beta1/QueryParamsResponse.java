// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/params/v1beta1/query.proto

package com.cosmos.params.v1beta1;

/**
 * <pre>
 * QueryParamsResponse is response type for the Query/Params RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.params.v1beta1.QueryParamsResponse}
 */
public final class QueryParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.params.v1beta1.QueryParamsResponse)
    QueryParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryParamsResponse.newBuilder() to construct.
  private QueryParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryParamsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryParamsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.params.v1beta1.QueryProto.internal_static_cosmos_params_v1beta1_QueryParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.params.v1beta1.QueryProto.internal_static_cosmos_params_v1beta1_QueryParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.params.v1beta1.QueryParamsResponse.class, com.cosmos.params.v1beta1.QueryParamsResponse.Builder.class);
  }

  public static final int PARAM_FIELD_NUMBER = 1;
  private com.cosmos.params.v1beta1.ParamChange param_;
  /**
   * <pre>
   * param defines the queried parameter.
   * </pre>
   *
   * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
   * @return Whether the param field is set.
   */
  @java.lang.Override
  public boolean hasParam() {
    return param_ != null;
  }
  /**
   * <pre>
   * param defines the queried parameter.
   * </pre>
   *
   * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
   * @return The param.
   */
  @java.lang.Override
  public com.cosmos.params.v1beta1.ParamChange getParam() {
    return param_ == null ? com.cosmos.params.v1beta1.ParamChange.getDefaultInstance() : param_;
  }
  /**
   * <pre>
   * param defines the queried parameter.
   * </pre>
   *
   * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.params.v1beta1.ParamChangeOrBuilder getParamOrBuilder() {
    return param_ == null ? com.cosmos.params.v1beta1.ParamChange.getDefaultInstance() : param_;
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
    if (param_ != null) {
      output.writeMessage(1, getParam());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (param_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParam());
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
    if (!(obj instanceof com.cosmos.params.v1beta1.QueryParamsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.params.v1beta1.QueryParamsResponse other = (com.cosmos.params.v1beta1.QueryParamsResponse) obj;

    if (hasParam() != other.hasParam()) return false;
    if (hasParam()) {
      if (!getParam()
          .equals(other.getParam())) return false;
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
    if (hasParam()) {
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.params.v1beta1.QueryParamsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.params.v1beta1.QueryParamsResponse prototype) {
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
   * QueryParamsResponse is response type for the Query/Params RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.params.v1beta1.QueryParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.params.v1beta1.QueryParamsResponse)
      com.cosmos.params.v1beta1.QueryParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.params.v1beta1.QueryProto.internal_static_cosmos_params_v1beta1_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.params.v1beta1.QueryProto.internal_static_cosmos_params_v1beta1_QueryParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.params.v1beta1.QueryParamsResponse.class, com.cosmos.params.v1beta1.QueryParamsResponse.Builder.class);
    }

    // Construct using com.cosmos.params.v1beta1.QueryParamsResponse.newBuilder()
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
      param_ = null;
      if (paramBuilder_ != null) {
        paramBuilder_.dispose();
        paramBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.params.v1beta1.QueryProto.internal_static_cosmos_params_v1beta1_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.params.v1beta1.QueryParamsResponse getDefaultInstanceForType() {
      return com.cosmos.params.v1beta1.QueryParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.params.v1beta1.QueryParamsResponse build() {
      com.cosmos.params.v1beta1.QueryParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.params.v1beta1.QueryParamsResponse buildPartial() {
      com.cosmos.params.v1beta1.QueryParamsResponse result = new com.cosmos.params.v1beta1.QueryParamsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.params.v1beta1.QueryParamsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.param_ = paramBuilder_ == null
            ? param_
            : paramBuilder_.build();
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
      if (other instanceof com.cosmos.params.v1beta1.QueryParamsResponse) {
        return mergeFrom((com.cosmos.params.v1beta1.QueryParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.params.v1beta1.QueryParamsResponse other) {
      if (other == com.cosmos.params.v1beta1.QueryParamsResponse.getDefaultInstance()) return this;
      if (other.hasParam()) {
        mergeParam(other.getParam());
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
                  getParamFieldBuilder().getBuilder(),
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

    private com.cosmos.params.v1beta1.ParamChange param_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.params.v1beta1.ParamChange, com.cosmos.params.v1beta1.ParamChange.Builder, com.cosmos.params.v1beta1.ParamChangeOrBuilder> paramBuilder_;
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     * @return Whether the param field is set.
     */
    public boolean hasParam() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     * @return The param.
     */
    public com.cosmos.params.v1beta1.ParamChange getParam() {
      if (paramBuilder_ == null) {
        return param_ == null ? com.cosmos.params.v1beta1.ParamChange.getDefaultInstance() : param_;
      } else {
        return paramBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParam(com.cosmos.params.v1beta1.ParamChange value) {
      if (paramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        param_ = value;
      } else {
        paramBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParam(
        com.cosmos.params.v1beta1.ParamChange.Builder builderForValue) {
      if (paramBuilder_ == null) {
        param_ = builderForValue.build();
      } else {
        paramBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParam(com.cosmos.params.v1beta1.ParamChange value) {
      if (paramBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          param_ != null &&
          param_ != com.cosmos.params.v1beta1.ParamChange.getDefaultInstance()) {
          getParamBuilder().mergeFrom(value);
        } else {
          param_ = value;
        }
      } else {
        paramBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParam() {
      bitField0_ = (bitField0_ & ~0x00000001);
      param_ = null;
      if (paramBuilder_ != null) {
        paramBuilder_.dispose();
        paramBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.params.v1beta1.ParamChange.Builder getParamBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.params.v1beta1.ParamChangeOrBuilder getParamOrBuilder() {
      if (paramBuilder_ != null) {
        return paramBuilder_.getMessageOrBuilder();
      } else {
        return param_ == null ?
            com.cosmos.params.v1beta1.ParamChange.getDefaultInstance() : param_;
      }
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [json_name = "param", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.params.v1beta1.ParamChange, com.cosmos.params.v1beta1.ParamChange.Builder, com.cosmos.params.v1beta1.ParamChangeOrBuilder> 
        getParamFieldBuilder() {
      if (paramBuilder_ == null) {
        paramBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.params.v1beta1.ParamChange, com.cosmos.params.v1beta1.ParamChange.Builder, com.cosmos.params.v1beta1.ParamChangeOrBuilder>(
                getParam(),
                getParentForChildren(),
                isClean());
        param_ = null;
      }
      return paramBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.params.v1beta1.QueryParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.params.v1beta1.QueryParamsResponse)
  private static final com.cosmos.params.v1beta1.QueryParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.params.v1beta1.QueryParamsResponse();
  }

  public static com.cosmos.params.v1beta1.QueryParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryParamsResponse>() {
    @java.lang.Override
    public QueryParamsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryParamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryParamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.params.v1beta1.QueryParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

