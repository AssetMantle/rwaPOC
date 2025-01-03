// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * Height is a monotonically increasing data type
 * that can be compared against another Height for the purposes of updating and
 * freezing clients
 *
 * Normally the RevisionHeight is incremented at each height while keeping
 * RevisionNumber the same. However some consensus algorithms may choose to
 * reset the height in certain conditions e.g. hard forks, state-machine
 * breaking changes In these cases, the RevisionNumber is incremented so that
 * height continues to be monitonically increasing even as the RevisionHeight
 * gets reset
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.Height}
 */
public final class Height extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.Height)
    HeightOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Height.newBuilder() to construct.
  private Height(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Height() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Height();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_Height_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_Height_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.client.v1.Height.class, com.ibc.core.client.v1.Height.Builder.class);
  }

  public static final int REVISION_NUMBER_FIELD_NUMBER = 1;
  private long revisionNumber_ = 0L;
  /**
   * <pre>
   * the revision that the client is currently on
   * </pre>
   *
   * <code>uint64 revision_number = 1 [json_name = "revisionNumber", (.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
   * @return The revisionNumber.
   */
  @java.lang.Override
  public long getRevisionNumber() {
    return revisionNumber_;
  }

  public static final int REVISION_HEIGHT_FIELD_NUMBER = 2;
  private long revisionHeight_ = 0L;
  /**
   * <pre>
   * the height within the given revision
   * </pre>
   *
   * <code>uint64 revision_height = 2 [json_name = "revisionHeight", (.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
   * @return The revisionHeight.
   */
  @java.lang.Override
  public long getRevisionHeight() {
    return revisionHeight_;
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
    if (revisionNumber_ != 0L) {
      output.writeUInt64(1, revisionNumber_);
    }
    if (revisionHeight_ != 0L) {
      output.writeUInt64(2, revisionHeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (revisionNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, revisionNumber_);
    }
    if (revisionHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, revisionHeight_);
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
    if (!(obj instanceof com.ibc.core.client.v1.Height)) {
      return super.equals(obj);
    }
    com.ibc.core.client.v1.Height other = (com.ibc.core.client.v1.Height) obj;

    if (getRevisionNumber()
        != other.getRevisionNumber()) return false;
    if (getRevisionHeight()
        != other.getRevisionHeight()) return false;
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
    hash = (37 * hash) + REVISION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevisionNumber());
    hash = (37 * hash) + REVISION_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevisionHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.client.v1.Height parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.Height parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.Height parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.Height parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.Height parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.Height parseFrom(
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
  public static Builder newBuilder(com.ibc.core.client.v1.Height prototype) {
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
   * Height is a monotonically increasing data type
   * that can be compared against another Height for the purposes of updating and
   * freezing clients
   *
   * Normally the RevisionHeight is incremented at each height while keeping
   * RevisionNumber the same. However some consensus algorithms may choose to
   * reset the height in certain conditions e.g. hard forks, state-machine
   * breaking changes In these cases, the RevisionNumber is incremented so that
   * height continues to be monitonically increasing even as the RevisionHeight
   * gets reset
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.Height}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.Height)
      com.ibc.core.client.v1.HeightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_Height_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_Height_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.client.v1.Height.class, com.ibc.core.client.v1.Height.Builder.class);
    }

    // Construct using com.ibc.core.client.v1.Height.newBuilder()
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
      revisionNumber_ = 0L;
      revisionHeight_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_Height_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.Height getDefaultInstanceForType() {
      return com.ibc.core.client.v1.Height.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.client.v1.Height build() {
      com.ibc.core.client.v1.Height result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.Height buildPartial() {
      com.ibc.core.client.v1.Height result = new com.ibc.core.client.v1.Height(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.client.v1.Height result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.revisionNumber_ = revisionNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.revisionHeight_ = revisionHeight_;
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
      if (other instanceof com.ibc.core.client.v1.Height) {
        return mergeFrom((com.ibc.core.client.v1.Height)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.client.v1.Height other) {
      if (other == com.ibc.core.client.v1.Height.getDefaultInstance()) return this;
      if (other.getRevisionNumber() != 0L) {
        setRevisionNumber(other.getRevisionNumber());
      }
      if (other.getRevisionHeight() != 0L) {
        setRevisionHeight(other.getRevisionHeight());
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
              revisionNumber_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              revisionHeight_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long revisionNumber_ ;
    /**
     * <pre>
     * the revision that the client is currently on
     * </pre>
     *
     * <code>uint64 revision_number = 1 [json_name = "revisionNumber", (.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
     * @return The revisionNumber.
     */
    @java.lang.Override
    public long getRevisionNumber() {
      return revisionNumber_;
    }
    /**
     * <pre>
     * the revision that the client is currently on
     * </pre>
     *
     * <code>uint64 revision_number = 1 [json_name = "revisionNumber", (.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
     * @param value The revisionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionNumber(long value) {

      revisionNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the revision that the client is currently on
     * </pre>
     *
     * <code>uint64 revision_number = 1 [json_name = "revisionNumber", (.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevisionNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      revisionNumber_ = 0L;
      onChanged();
      return this;
    }

    private long revisionHeight_ ;
    /**
     * <pre>
     * the height within the given revision
     * </pre>
     *
     * <code>uint64 revision_height = 2 [json_name = "revisionHeight", (.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
     * @return The revisionHeight.
     */
    @java.lang.Override
    public long getRevisionHeight() {
      return revisionHeight_;
    }
    /**
     * <pre>
     * the height within the given revision
     * </pre>
     *
     * <code>uint64 revision_height = 2 [json_name = "revisionHeight", (.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
     * @param value The revisionHeight to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionHeight(long value) {

      revisionHeight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the height within the given revision
     * </pre>
     *
     * <code>uint64 revision_height = 2 [json_name = "revisionHeight", (.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevisionHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      revisionHeight_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.Height)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.Height)
  private static final com.ibc.core.client.v1.Height DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.client.v1.Height();
  }

  public static com.ibc.core.client.v1.Height getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Height>
      PARSER = new com.google.protobuf.AbstractParser<Height>() {
    @java.lang.Override
    public Height parsePartialFrom(
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

  public static com.google.protobuf.Parser<Height> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Height> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.client.v1.Height getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

