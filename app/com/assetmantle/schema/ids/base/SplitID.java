// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/split_id.proto

package com.assetmantle.schema.ids.base;

/**
 * Protobuf type {@code assetmantle.schema.ids.base.SplitID}
 */
public final class SplitID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:assetmantle.schema.ids.base.SplitID)
    SplitIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SplitID.newBuilder() to construct.
  private SplitID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SplitID() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SplitID();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assetmantle.schema.ids.base.SplitIdProto.internal_static_assetmantle_schema_ids_base_SplitID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assetmantle.schema.ids.base.SplitIdProto.internal_static_assetmantle_schema_ids_base_SplitID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assetmantle.schema.ids.base.SplitID.class, com.assetmantle.schema.ids.base.SplitID.Builder.class);
  }

  public static final int ASSET_I_D_FIELD_NUMBER = 1;
  private com.assetmantle.schema.ids.base.AssetID assetID_;
  /**
   * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
   * @return Whether the assetID field is set.
   */
  @java.lang.Override
  public boolean hasAssetID() {
    return assetID_ != null;
  }
  /**
   * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
   * @return The assetID.
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.AssetID getAssetID() {
    return assetID_ == null ? com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
  }
  /**
   * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.AssetIDOrBuilder getAssetIDOrBuilder() {
    return assetID_ == null ? com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
  }

  public static final int OWNER_I_D_FIELD_NUMBER = 2;
  private com.assetmantle.schema.ids.base.IdentityID ownerID_;
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
   * @return Whether the ownerID field is set.
   */
  @java.lang.Override
  public boolean hasOwnerID() {
    return ownerID_ != null;
  }
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
   * @return The ownerID.
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.IdentityID getOwnerID() {
    return ownerID_ == null ? com.assetmantle.schema.ids.base.IdentityID.getDefaultInstance() : ownerID_;
  }
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.IdentityIDOrBuilder getOwnerIDOrBuilder() {
    return ownerID_ == null ? com.assetmantle.schema.ids.base.IdentityID.getDefaultInstance() : ownerID_;
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
    if (assetID_ != null) {
      output.writeMessage(1, getAssetID());
    }
    if (ownerID_ != null) {
      output.writeMessage(2, getOwnerID());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAssetID());
    }
    if (ownerID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOwnerID());
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
    if (!(obj instanceof com.assetmantle.schema.ids.base.SplitID)) {
      return super.equals(obj);
    }
    com.assetmantle.schema.ids.base.SplitID other = (com.assetmantle.schema.ids.base.SplitID) obj;

    if (hasAssetID() != other.hasAssetID()) return false;
    if (hasAssetID()) {
      if (!getAssetID()
          .equals(other.getAssetID())) return false;
    }
    if (hasOwnerID() != other.hasOwnerID()) return false;
    if (hasOwnerID()) {
      if (!getOwnerID()
          .equals(other.getOwnerID())) return false;
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
    if (hasAssetID()) {
      hash = (37 * hash) + ASSET_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getAssetID().hashCode();
    }
    if (hasOwnerID()) {
      hash = (37 * hash) + OWNER_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerID().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.schema.ids.base.SplitID parseFrom(
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
  public static Builder newBuilder(com.assetmantle.schema.ids.base.SplitID prototype) {
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
   * Protobuf type {@code assetmantle.schema.ids.base.SplitID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:assetmantle.schema.ids.base.SplitID)
      com.assetmantle.schema.ids.base.SplitIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.schema.ids.base.SplitIdProto.internal_static_assetmantle_schema_ids_base_SplitID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.schema.ids.base.SplitIdProto.internal_static_assetmantle_schema_ids_base_SplitID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.schema.ids.base.SplitID.class, com.assetmantle.schema.ids.base.SplitID.Builder.class);
    }

    // Construct using com.assetmantle.schema.ids.base.SplitID.newBuilder()
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
      assetID_ = null;
      if (assetIDBuilder_ != null) {
        assetIDBuilder_.dispose();
        assetIDBuilder_ = null;
      }
      ownerID_ = null;
      if (ownerIDBuilder_ != null) {
        ownerIDBuilder_.dispose();
        ownerIDBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assetmantle.schema.ids.base.SplitIdProto.internal_static_assetmantle_schema_ids_base_SplitID_descriptor;
    }

    @java.lang.Override
    public com.assetmantle.schema.ids.base.SplitID getDefaultInstanceForType() {
      return com.assetmantle.schema.ids.base.SplitID.getDefaultInstance();
    }

    @java.lang.Override
    public com.assetmantle.schema.ids.base.SplitID build() {
      com.assetmantle.schema.ids.base.SplitID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assetmantle.schema.ids.base.SplitID buildPartial() {
      com.assetmantle.schema.ids.base.SplitID result = new com.assetmantle.schema.ids.base.SplitID(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.assetmantle.schema.ids.base.SplitID result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetID_ = assetIDBuilder_ == null
            ? assetID_
            : assetIDBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ownerID_ = ownerIDBuilder_ == null
            ? ownerID_
            : ownerIDBuilder_.build();
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
      if (other instanceof com.assetmantle.schema.ids.base.SplitID) {
        return mergeFrom((com.assetmantle.schema.ids.base.SplitID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assetmantle.schema.ids.base.SplitID other) {
      if (other == com.assetmantle.schema.ids.base.SplitID.getDefaultInstance()) return this;
      if (other.hasAssetID()) {
        mergeAssetID(other.getAssetID());
      }
      if (other.hasOwnerID()) {
        mergeOwnerID(other.getOwnerID());
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
                  getAssetIDFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOwnerIDFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.assetmantle.schema.ids.base.AssetID assetID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.ids.base.AssetID, com.assetmantle.schema.ids.base.AssetID.Builder, com.assetmantle.schema.ids.base.AssetIDOrBuilder> assetIDBuilder_;
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     * @return Whether the assetID field is set.
     */
    public boolean hasAssetID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     * @return The assetID.
     */
    public com.assetmantle.schema.ids.base.AssetID getAssetID() {
      if (assetIDBuilder_ == null) {
        return assetID_ == null ? com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
      } else {
        return assetIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder setAssetID(com.assetmantle.schema.ids.base.AssetID value) {
      if (assetIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assetID_ = value;
      } else {
        assetIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder setAssetID(
        com.assetmantle.schema.ids.base.AssetID.Builder builderForValue) {
      if (assetIDBuilder_ == null) {
        assetID_ = builderForValue.build();
      } else {
        assetIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder mergeAssetID(com.assetmantle.schema.ids.base.AssetID value) {
      if (assetIDBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          assetID_ != null &&
          assetID_ != com.assetmantle.schema.ids.base.AssetID.getDefaultInstance()) {
          getAssetIDBuilder().mergeFrom(value);
        } else {
          assetID_ = value;
        }
      } else {
        assetIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder clearAssetID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assetID_ = null;
      if (assetIDBuilder_ != null) {
        assetIDBuilder_.dispose();
        assetIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public com.assetmantle.schema.ids.base.AssetID.Builder getAssetIDBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAssetIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public com.assetmantle.schema.ids.base.AssetIDOrBuilder getAssetIDOrBuilder() {
      if (assetIDBuilder_ != null) {
        return assetIDBuilder_.getMessageOrBuilder();
      } else {
        return assetID_ == null ?
            com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
      }
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.ids.base.AssetID, com.assetmantle.schema.ids.base.AssetID.Builder, com.assetmantle.schema.ids.base.AssetIDOrBuilder> 
        getAssetIDFieldBuilder() {
      if (assetIDBuilder_ == null) {
        assetIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.assetmantle.schema.ids.base.AssetID, com.assetmantle.schema.ids.base.AssetID.Builder, com.assetmantle.schema.ids.base.AssetIDOrBuilder>(
                getAssetID(),
                getParentForChildren(),
                isClean());
        assetID_ = null;
      }
      return assetIDBuilder_;
    }

    private com.assetmantle.schema.ids.base.IdentityID ownerID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.ids.base.IdentityID, com.assetmantle.schema.ids.base.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIDOrBuilder> ownerIDBuilder_;
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     * @return Whether the ownerID field is set.
     */
    public boolean hasOwnerID() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     * @return The ownerID.
     */
    public com.assetmantle.schema.ids.base.IdentityID getOwnerID() {
      if (ownerIDBuilder_ == null) {
        return ownerID_ == null ? com.assetmantle.schema.ids.base.IdentityID.getDefaultInstance() : ownerID_;
      } else {
        return ownerIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    public Builder setOwnerID(com.assetmantle.schema.ids.base.IdentityID value) {
      if (ownerIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ownerID_ = value;
      } else {
        ownerIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    public Builder setOwnerID(
        com.assetmantle.schema.ids.base.IdentityID.Builder builderForValue) {
      if (ownerIDBuilder_ == null) {
        ownerID_ = builderForValue.build();
      } else {
        ownerIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    public Builder mergeOwnerID(com.assetmantle.schema.ids.base.IdentityID value) {
      if (ownerIDBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          ownerID_ != null &&
          ownerID_ != com.assetmantle.schema.ids.base.IdentityID.getDefaultInstance()) {
          getOwnerIDBuilder().mergeFrom(value);
        } else {
          ownerID_ = value;
        }
      } else {
        ownerIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    public Builder clearOwnerID() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ownerID_ = null;
      if (ownerIDBuilder_ != null) {
        ownerIDBuilder_.dispose();
        ownerIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    public com.assetmantle.schema.ids.base.IdentityID.Builder getOwnerIDBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOwnerIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    public com.assetmantle.schema.ids.base.IdentityIDOrBuilder getOwnerIDOrBuilder() {
      if (ownerIDBuilder_ != null) {
        return ownerIDBuilder_.getMessageOrBuilder();
      } else {
        return ownerID_ == null ?
            com.assetmantle.schema.ids.base.IdentityID.getDefaultInstance() : ownerID_;
      }
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 2 [json_name = "ownerID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.ids.base.IdentityID, com.assetmantle.schema.ids.base.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIDOrBuilder> 
        getOwnerIDFieldBuilder() {
      if (ownerIDBuilder_ == null) {
        ownerIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.assetmantle.schema.ids.base.IdentityID, com.assetmantle.schema.ids.base.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIDOrBuilder>(
                getOwnerID(),
                getParentForChildren(),
                isClean());
        ownerID_ = null;
      }
      return ownerIDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:assetmantle.schema.ids.base.SplitID)
  }

  // @@protoc_insertion_point(class_scope:assetmantle.schema.ids.base.SplitID)
  private static final com.assetmantle.schema.ids.base.SplitID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assetmantle.schema.ids.base.SplitID();
  }

  public static com.assetmantle.schema.ids.base.SplitID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitID>
      PARSER = new com.google.protobuf.AbstractParser<SplitID>() {
    @java.lang.Override
    public SplitID parsePartialFrom(
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

  public static com.google.protobuf.Parser<SplitID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SplitID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assetmantle.schema.ids.base.SplitID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
