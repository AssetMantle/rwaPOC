// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package com.ibc.core.connection.v1;

/**
 * <pre>
 * ConnectionPaths define all the connection paths for a given client state.
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.ConnectionPaths}
 */
public final class ConnectionPaths extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.ConnectionPaths)
    ConnectionPathsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectionPaths.newBuilder() to construct.
  private ConnectionPaths(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectionPaths() {
    clientId_ = "";
    paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectionPaths();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.connection.v1.ConnectionProto.internal_static_ibc_core_connection_v1_ConnectionPaths_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.connection.v1.ConnectionProto.internal_static_ibc_core_connection_v1_ConnectionPaths_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.connection.v1.ConnectionPaths.class, com.ibc.core.connection.v1.ConnectionPaths.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <pre>
   * client state unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * client state unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATHS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList paths_;
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2 [json_name = "paths"];</code>
   * @return A list containing the paths.
   */
  public com.google.protobuf.ProtocolStringList
      getPathsList() {
    return paths_;
  }
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2 [json_name = "paths"];</code>
   * @return The count of paths.
   */
  public int getPathsCount() {
    return paths_.size();
  }
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2 [json_name = "paths"];</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  public java.lang.String getPaths(int index) {
    return paths_.get(index);
  }
  /**
   * <pre>
   * list of connection paths
   * </pre>
   *
   * <code>repeated string paths = 2 [json_name = "paths"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  public com.google.protobuf.ByteString
      getPathsBytes(int index) {
    return paths_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    for (int i = 0; i < paths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paths_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < paths_.size(); i++) {
        dataSize += computeStringSizeNoTag(paths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPathsList().size();
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
    if (!(obj instanceof com.ibc.core.connection.v1.ConnectionPaths)) {
      return super.equals(obj);
    }
    com.ibc.core.connection.v1.ConnectionPaths other = (com.ibc.core.connection.v1.ConnectionPaths) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getPathsList()
        .equals(other.getPathsList())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    if (getPathsCount() > 0) {
      hash = (37 * hash) + PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getPathsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.connection.v1.ConnectionPaths parseFrom(
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
  public static Builder newBuilder(com.ibc.core.connection.v1.ConnectionPaths prototype) {
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
   * ConnectionPaths define all the connection paths for a given client state.
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.ConnectionPaths}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.ConnectionPaths)
      com.ibc.core.connection.v1.ConnectionPathsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.connection.v1.ConnectionProto.internal_static_ibc_core_connection_v1_ConnectionPaths_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.connection.v1.ConnectionProto.internal_static_ibc_core_connection_v1_ConnectionPaths_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.connection.v1.ConnectionPaths.class, com.ibc.core.connection.v1.ConnectionPaths.Builder.class);
    }

    // Construct using com.ibc.core.connection.v1.ConnectionPaths.newBuilder()
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
      clientId_ = "";
      paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.connection.v1.ConnectionProto.internal_static_ibc_core_connection_v1_ConnectionPaths_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.connection.v1.ConnectionPaths getDefaultInstanceForType() {
      return com.ibc.core.connection.v1.ConnectionPaths.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.connection.v1.ConnectionPaths build() {
      com.ibc.core.connection.v1.ConnectionPaths result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.connection.v1.ConnectionPaths buildPartial() {
      com.ibc.core.connection.v1.ConnectionPaths result = new com.ibc.core.connection.v1.ConnectionPaths(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ibc.core.connection.v1.ConnectionPaths result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        paths_ = paths_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.paths_ = paths_;
    }

    private void buildPartial0(com.ibc.core.connection.v1.ConnectionPaths result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
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
      if (other instanceof com.ibc.core.connection.v1.ConnectionPaths) {
        return mergeFrom((com.ibc.core.connection.v1.ConnectionPaths)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.connection.v1.ConnectionPaths other) {
      if (other == com.ibc.core.connection.v1.ConnectionPaths.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.paths_.isEmpty()) {
        if (paths_.isEmpty()) {
          paths_ = other.paths_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePathsIsMutable();
          paths_.addAll(other.paths_);
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePathsIsMutable();
              paths_.add(s);
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

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePathsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        paths_ = new com.google.protobuf.LazyStringArrayList(paths_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @return A list containing the paths.
     */
    public com.google.protobuf.ProtocolStringList
        getPathsList() {
      return paths_.getUnmodifiableView();
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @return The count of paths.
     */
    public int getPathsCount() {
      return paths_.size();
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @param index The index of the element to return.
     * @return The paths at the given index.
     */
    public java.lang.String getPaths(int index) {
      return paths_.get(index);
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the paths at the given index.
     */
    public com.google.protobuf.ByteString
        getPathsBytes(int index) {
      return paths_.getByteString(index);
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @param index The index to set the value at.
     * @param value The paths to set.
     * @return This builder for chaining.
     */
    public Builder setPaths(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePathsIsMutable();
      paths_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @param value The paths to add.
     * @return This builder for chaining.
     */
    public Builder addPaths(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePathsIsMutable();
      paths_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @param values The paths to add.
     * @return This builder for chaining.
     */
    public Builder addAllPaths(
        java.lang.Iterable<java.lang.String> values) {
      ensurePathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, paths_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPaths() {
      paths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of connection paths
     * </pre>
     *
     * <code>repeated string paths = 2 [json_name = "paths"];</code>
     * @param value The bytes of the paths to add.
     * @return This builder for chaining.
     */
    public Builder addPathsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePathsIsMutable();
      paths_.add(value);
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.ConnectionPaths)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.ConnectionPaths)
  private static final com.ibc.core.connection.v1.ConnectionPaths DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.connection.v1.ConnectionPaths();
  }

  public static com.ibc.core.connection.v1.ConnectionPaths getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectionPaths>
      PARSER = new com.google.protobuf.AbstractParser<ConnectionPaths>() {
    @java.lang.Override
    public ConnectionPaths parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectionPaths> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionPaths> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.connection.v1.ConnectionPaths getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

