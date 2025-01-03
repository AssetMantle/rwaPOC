// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/query.proto

package com.cosmos.upgrade.v1beta1;

/**
 * <pre>
 * QueryModuleVersionsResponse is the response type for the Query/ModuleVersions
 * RPC method.
 *
 * Since: cosmos-sdk 0.43
 * </pre>
 *
 * Protobuf type {@code cosmos.upgrade.v1beta1.QueryModuleVersionsResponse}
 */
public final class QueryModuleVersionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.upgrade.v1beta1.QueryModuleVersionsResponse)
    QueryModuleVersionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryModuleVersionsResponse.newBuilder() to construct.
  private QueryModuleVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryModuleVersionsResponse() {
    moduleVersions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryModuleVersionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.upgrade.v1beta1.QueryProto.internal_static_cosmos_upgrade_v1beta1_QueryModuleVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.upgrade.v1beta1.QueryProto.internal_static_cosmos_upgrade_v1beta1_QueryModuleVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.class, com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.Builder.class);
  }

  public static final int MODULE_VERSIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.upgrade.v1beta1.ModuleVersion> moduleVersions_;
  /**
   * <pre>
   * module_versions is a list of module names with their consensus versions.
   * </pre>
   *
   * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.upgrade.v1beta1.ModuleVersion> getModuleVersionsList() {
    return moduleVersions_;
  }
  /**
   * <pre>
   * module_versions is a list of module names with their consensus versions.
   * </pre>
   *
   * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder> 
      getModuleVersionsOrBuilderList() {
    return moduleVersions_;
  }
  /**
   * <pre>
   * module_versions is a list of module names with their consensus versions.
   * </pre>
   *
   * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
   */
  @java.lang.Override
  public int getModuleVersionsCount() {
    return moduleVersions_.size();
  }
  /**
   * <pre>
   * module_versions is a list of module names with their consensus versions.
   * </pre>
   *
   * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
   */
  @java.lang.Override
  public com.cosmos.upgrade.v1beta1.ModuleVersion getModuleVersions(int index) {
    return moduleVersions_.get(index);
  }
  /**
   * <pre>
   * module_versions is a list of module names with their consensus versions.
   * </pre>
   *
   * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
   */
  @java.lang.Override
  public com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder getModuleVersionsOrBuilder(
      int index) {
    return moduleVersions_.get(index);
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
    for (int i = 0; i < moduleVersions_.size(); i++) {
      output.writeMessage(1, moduleVersions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < moduleVersions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, moduleVersions_.get(i));
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
    if (!(obj instanceof com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse other = (com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse) obj;

    if (!getModuleVersionsList()
        .equals(other.getModuleVersionsList())) return false;
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
    if (getModuleVersionsCount() > 0) {
      hash = (37 * hash) + MODULE_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getModuleVersionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse prototype) {
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
   * QueryModuleVersionsResponse is the response type for the Query/ModuleVersions
   * RPC method.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * Protobuf type {@code cosmos.upgrade.v1beta1.QueryModuleVersionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.upgrade.v1beta1.QueryModuleVersionsResponse)
      com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.upgrade.v1beta1.QueryProto.internal_static_cosmos_upgrade_v1beta1_QueryModuleVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.upgrade.v1beta1.QueryProto.internal_static_cosmos_upgrade_v1beta1_QueryModuleVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.class, com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.Builder.class);
    }

    // Construct using com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.newBuilder()
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
      if (moduleVersionsBuilder_ == null) {
        moduleVersions_ = java.util.Collections.emptyList();
      } else {
        moduleVersions_ = null;
        moduleVersionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.upgrade.v1beta1.QueryProto.internal_static_cosmos_upgrade_v1beta1_QueryModuleVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse getDefaultInstanceForType() {
      return com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse build() {
      com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse buildPartial() {
      com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse result = new com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse result) {
      if (moduleVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          moduleVersions_ = java.util.Collections.unmodifiableList(moduleVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.moduleVersions_ = moduleVersions_;
      } else {
        result.moduleVersions_ = moduleVersionsBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse result) {
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
      if (other instanceof com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse) {
        return mergeFrom((com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse other) {
      if (other == com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse.getDefaultInstance()) return this;
      if (moduleVersionsBuilder_ == null) {
        if (!other.moduleVersions_.isEmpty()) {
          if (moduleVersions_.isEmpty()) {
            moduleVersions_ = other.moduleVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModuleVersionsIsMutable();
            moduleVersions_.addAll(other.moduleVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.moduleVersions_.isEmpty()) {
          if (moduleVersionsBuilder_.isEmpty()) {
            moduleVersionsBuilder_.dispose();
            moduleVersionsBuilder_ = null;
            moduleVersions_ = other.moduleVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            moduleVersionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getModuleVersionsFieldBuilder() : null;
          } else {
            moduleVersionsBuilder_.addAllMessages(other.moduleVersions_);
          }
        }
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
              com.cosmos.upgrade.v1beta1.ModuleVersion m =
                  input.readMessage(
                      com.cosmos.upgrade.v1beta1.ModuleVersion.parser(),
                      extensionRegistry);
              if (moduleVersionsBuilder_ == null) {
                ensureModuleVersionsIsMutable();
                moduleVersions_.add(m);
              } else {
                moduleVersionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.cosmos.upgrade.v1beta1.ModuleVersion> moduleVersions_ =
      java.util.Collections.emptyList();
    private void ensureModuleVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        moduleVersions_ = new java.util.ArrayList<com.cosmos.upgrade.v1beta1.ModuleVersion>(moduleVersions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.upgrade.v1beta1.ModuleVersion, com.cosmos.upgrade.v1beta1.ModuleVersion.Builder, com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder> moduleVersionsBuilder_;

    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public java.util.List<com.cosmos.upgrade.v1beta1.ModuleVersion> getModuleVersionsList() {
      if (moduleVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(moduleVersions_);
      } else {
        return moduleVersionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public int getModuleVersionsCount() {
      if (moduleVersionsBuilder_ == null) {
        return moduleVersions_.size();
      } else {
        return moduleVersionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public com.cosmos.upgrade.v1beta1.ModuleVersion getModuleVersions(int index) {
      if (moduleVersionsBuilder_ == null) {
        return moduleVersions_.get(index);
      } else {
        return moduleVersionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder setModuleVersions(
        int index, com.cosmos.upgrade.v1beta1.ModuleVersion value) {
      if (moduleVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModuleVersionsIsMutable();
        moduleVersions_.set(index, value);
        onChanged();
      } else {
        moduleVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder setModuleVersions(
        int index, com.cosmos.upgrade.v1beta1.ModuleVersion.Builder builderForValue) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        moduleVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder addModuleVersions(com.cosmos.upgrade.v1beta1.ModuleVersion value) {
      if (moduleVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(value);
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder addModuleVersions(
        int index, com.cosmos.upgrade.v1beta1.ModuleVersion value) {
      if (moduleVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(index, value);
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder addModuleVersions(
        com.cosmos.upgrade.v1beta1.ModuleVersion.Builder builderForValue) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(builderForValue.build());
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder addModuleVersions(
        int index, com.cosmos.upgrade.v1beta1.ModuleVersion.Builder builderForValue) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        moduleVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder addAllModuleVersions(
        java.lang.Iterable<? extends com.cosmos.upgrade.v1beta1.ModuleVersion> values) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, moduleVersions_);
        onChanged();
      } else {
        moduleVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder clearModuleVersions() {
      if (moduleVersionsBuilder_ == null) {
        moduleVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        moduleVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public Builder removeModuleVersions(int index) {
      if (moduleVersionsBuilder_ == null) {
        ensureModuleVersionsIsMutable();
        moduleVersions_.remove(index);
        onChanged();
      } else {
        moduleVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public com.cosmos.upgrade.v1beta1.ModuleVersion.Builder getModuleVersionsBuilder(
        int index) {
      return getModuleVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder getModuleVersionsOrBuilder(
        int index) {
      if (moduleVersionsBuilder_ == null) {
        return moduleVersions_.get(index);  } else {
        return moduleVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public java.util.List<? extends com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder> 
         getModuleVersionsOrBuilderList() {
      if (moduleVersionsBuilder_ != null) {
        return moduleVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(moduleVersions_);
      }
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public com.cosmos.upgrade.v1beta1.ModuleVersion.Builder addModuleVersionsBuilder() {
      return getModuleVersionsFieldBuilder().addBuilder(
          com.cosmos.upgrade.v1beta1.ModuleVersion.getDefaultInstance());
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public com.cosmos.upgrade.v1beta1.ModuleVersion.Builder addModuleVersionsBuilder(
        int index) {
      return getModuleVersionsFieldBuilder().addBuilder(
          index, com.cosmos.upgrade.v1beta1.ModuleVersion.getDefaultInstance());
    }
    /**
     * <pre>
     * module_versions is a list of module names with their consensus versions.
     * </pre>
     *
     * <code>repeated .cosmos.upgrade.v1beta1.ModuleVersion module_versions = 1 [json_name = "moduleVersions"];</code>
     */
    public java.util.List<com.cosmos.upgrade.v1beta1.ModuleVersion.Builder> 
         getModuleVersionsBuilderList() {
      return getModuleVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.upgrade.v1beta1.ModuleVersion, com.cosmos.upgrade.v1beta1.ModuleVersion.Builder, com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder> 
        getModuleVersionsFieldBuilder() {
      if (moduleVersionsBuilder_ == null) {
        moduleVersionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.upgrade.v1beta1.ModuleVersion, com.cosmos.upgrade.v1beta1.ModuleVersion.Builder, com.cosmos.upgrade.v1beta1.ModuleVersionOrBuilder>(
                moduleVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        moduleVersions_ = null;
      }
      return moduleVersionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.upgrade.v1beta1.QueryModuleVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.upgrade.v1beta1.QueryModuleVersionsResponse)
  private static final com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse();
  }

  public static com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryModuleVersionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryModuleVersionsResponse>() {
    @java.lang.Override
    public QueryModuleVersionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryModuleVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryModuleVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.upgrade.v1beta1.QueryModuleVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

