// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/query.proto

package com.cosmos.evidence.v1beta1;

/**
 * <pre>
 * QueryEvidenceResponse is the response type for the Query/Evidence RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.evidence.v1beta1.QueryEvidenceResponse}
 */
public final class QueryEvidenceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.evidence.v1beta1.QueryEvidenceResponse)
    QueryEvidenceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryEvidenceResponse.newBuilder() to construct.
  private QueryEvidenceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryEvidenceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryEvidenceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.evidence.v1beta1.QueryProto.internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.evidence.v1beta1.QueryProto.internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.evidence.v1beta1.QueryEvidenceResponse.class, com.cosmos.evidence.v1beta1.QueryEvidenceResponse.Builder.class);
  }

  public static final int EVIDENCE_FIELD_NUMBER = 1;
  private com.google.protobuf.Any evidence_;
  /**
   * <pre>
   * evidence returns the requested evidence.
   * </pre>
   *
   * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
   * @return Whether the evidence field is set.
   */
  @java.lang.Override
  public boolean hasEvidence() {
    return evidence_ != null;
  }
  /**
   * <pre>
   * evidence returns the requested evidence.
   * </pre>
   *
   * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
   * @return The evidence.
   */
  @java.lang.Override
  public com.google.protobuf.Any getEvidence() {
    return evidence_ == null ? com.google.protobuf.Any.getDefaultInstance() : evidence_;
  }
  /**
   * <pre>
   * evidence returns the requested evidence.
   * </pre>
   *
   * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getEvidenceOrBuilder() {
    return evidence_ == null ? com.google.protobuf.Any.getDefaultInstance() : evidence_;
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
    if (evidence_ != null) {
      output.writeMessage(1, getEvidence());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (evidence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEvidence());
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
    if (!(obj instanceof com.cosmos.evidence.v1beta1.QueryEvidenceResponse)) {
      return super.equals(obj);
    }
    com.cosmos.evidence.v1beta1.QueryEvidenceResponse other = (com.cosmos.evidence.v1beta1.QueryEvidenceResponse) obj;

    if (hasEvidence() != other.hasEvidence()) return false;
    if (hasEvidence()) {
      if (!getEvidence()
          .equals(other.getEvidence())) return false;
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
    if (hasEvidence()) {
      hash = (37 * hash) + EVIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + getEvidence().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.evidence.v1beta1.QueryEvidenceResponse prototype) {
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
   * QueryEvidenceResponse is the response type for the Query/Evidence RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.evidence.v1beta1.QueryEvidenceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.evidence.v1beta1.QueryEvidenceResponse)
      com.cosmos.evidence.v1beta1.QueryEvidenceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.evidence.v1beta1.QueryProto.internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.evidence.v1beta1.QueryProto.internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.evidence.v1beta1.QueryEvidenceResponse.class, com.cosmos.evidence.v1beta1.QueryEvidenceResponse.Builder.class);
    }

    // Construct using com.cosmos.evidence.v1beta1.QueryEvidenceResponse.newBuilder()
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
      evidence_ = null;
      if (evidenceBuilder_ != null) {
        evidenceBuilder_.dispose();
        evidenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.evidence.v1beta1.QueryProto.internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.evidence.v1beta1.QueryEvidenceResponse getDefaultInstanceForType() {
      return com.cosmos.evidence.v1beta1.QueryEvidenceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.evidence.v1beta1.QueryEvidenceResponse build() {
      com.cosmos.evidence.v1beta1.QueryEvidenceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.evidence.v1beta1.QueryEvidenceResponse buildPartial() {
      com.cosmos.evidence.v1beta1.QueryEvidenceResponse result = new com.cosmos.evidence.v1beta1.QueryEvidenceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.evidence.v1beta1.QueryEvidenceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evidence_ = evidenceBuilder_ == null
            ? evidence_
            : evidenceBuilder_.build();
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
      if (other instanceof com.cosmos.evidence.v1beta1.QueryEvidenceResponse) {
        return mergeFrom((com.cosmos.evidence.v1beta1.QueryEvidenceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.evidence.v1beta1.QueryEvidenceResponse other) {
      if (other == com.cosmos.evidence.v1beta1.QueryEvidenceResponse.getDefaultInstance()) return this;
      if (other.hasEvidence()) {
        mergeEvidence(other.getEvidence());
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
                  getEvidenceFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Any evidence_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> evidenceBuilder_;
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @return Whether the evidence field is set.
     */
    public boolean hasEvidence() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @return The evidence.
     */
    public com.google.protobuf.Any getEvidence() {
      if (evidenceBuilder_ == null) {
        return evidence_ == null ? com.google.protobuf.Any.getDefaultInstance() : evidence_;
      } else {
        return evidenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    public Builder setEvidence(com.google.protobuf.Any value) {
      if (evidenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evidence_ = value;
      } else {
        evidenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    public Builder setEvidence(
        com.google.protobuf.Any.Builder builderForValue) {
      if (evidenceBuilder_ == null) {
        evidence_ = builderForValue.build();
      } else {
        evidenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    public Builder mergeEvidence(com.google.protobuf.Any value) {
      if (evidenceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          evidence_ != null &&
          evidence_ != com.google.protobuf.Any.getDefaultInstance()) {
          getEvidenceBuilder().mergeFrom(value);
        } else {
          evidence_ = value;
        }
      } else {
        evidenceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    public Builder clearEvidence() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evidence_ = null;
      if (evidenceBuilder_ != null) {
        evidenceBuilder_.dispose();
        evidenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    public com.google.protobuf.Any.Builder getEvidenceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEvidenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getEvidenceOrBuilder() {
      if (evidenceBuilder_ != null) {
        return evidenceBuilder_.getMessageOrBuilder();
      } else {
        return evidence_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : evidence_;
      }
    }
    /**
     * <pre>
     * evidence returns the requested evidence.
     * </pre>
     *
     * <code>.google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getEvidenceFieldBuilder() {
      if (evidenceBuilder_ == null) {
        evidenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getEvidence(),
                getParentForChildren(),
                isClean());
        evidence_ = null;
      }
      return evidenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.evidence.v1beta1.QueryEvidenceResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.evidence.v1beta1.QueryEvidenceResponse)
  private static final com.cosmos.evidence.v1beta1.QueryEvidenceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.evidence.v1beta1.QueryEvidenceResponse();
  }

  public static com.cosmos.evidence.v1beta1.QueryEvidenceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryEvidenceResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryEvidenceResponse>() {
    @java.lang.Override
    public QueryEvidenceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryEvidenceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryEvidenceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.evidence.v1beta1.QueryEvidenceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

