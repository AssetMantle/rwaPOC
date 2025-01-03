// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package com.ics23;

/**
 * <pre>
 *
 *NonExistenceProof takes a proof of two neighbors, one left of the desired key,
 *one right of the desired key. If both proofs are valid AND they are neighbors,
 *then there is no valid proof for the given key.
 * </pre>
 *
 * Protobuf type {@code ics23.NonExistenceProof}
 */
public final class NonExistenceProof extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ics23.NonExistenceProof)
    NonExistenceProofOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NonExistenceProof.newBuilder() to construct.
  private NonExistenceProof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NonExistenceProof() {
    key_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NonExistenceProof();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ics23.ProofsProto.internal_static_ics23_NonExistenceProof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ics23.ProofsProto.internal_static_ics23_NonExistenceProof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ics23.NonExistenceProof.class, com.ics23.NonExistenceProof.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * TODO: remove this as unnecessary??? we prove a range
   * </pre>
   *
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int LEFT_FIELD_NUMBER = 2;
  private com.ics23.ExistenceProof left_;
  /**
   * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
   * @return Whether the left field is set.
   */
  @java.lang.Override
  public boolean hasLeft() {
    return left_ != null;
  }
  /**
   * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
   * @return The left.
   */
  @java.lang.Override
  public com.ics23.ExistenceProof getLeft() {
    return left_ == null ? com.ics23.ExistenceProof.getDefaultInstance() : left_;
  }
  /**
   * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
   */
  @java.lang.Override
  public com.ics23.ExistenceProofOrBuilder getLeftOrBuilder() {
    return left_ == null ? com.ics23.ExistenceProof.getDefaultInstance() : left_;
  }

  public static final int RIGHT_FIELD_NUMBER = 3;
  private com.ics23.ExistenceProof right_;
  /**
   * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
   * @return Whether the right field is set.
   */
  @java.lang.Override
  public boolean hasRight() {
    return right_ != null;
  }
  /**
   * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
   * @return The right.
   */
  @java.lang.Override
  public com.ics23.ExistenceProof getRight() {
    return right_ == null ? com.ics23.ExistenceProof.getDefaultInstance() : right_;
  }
  /**
   * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
   */
  @java.lang.Override
  public com.ics23.ExistenceProofOrBuilder getRightOrBuilder() {
    return right_ == null ? com.ics23.ExistenceProof.getDefaultInstance() : right_;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (left_ != null) {
      output.writeMessage(2, getLeft());
    }
    if (right_ != null) {
      output.writeMessage(3, getRight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (left_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLeft());
    }
    if (right_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRight());
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
    if (!(obj instanceof com.ics23.NonExistenceProof)) {
      return super.equals(obj);
    }
    com.ics23.NonExistenceProof other = (com.ics23.NonExistenceProof) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (hasLeft() != other.hasLeft()) return false;
    if (hasLeft()) {
      if (!getLeft()
          .equals(other.getLeft())) return false;
    }
    if (hasRight() != other.hasRight()) return false;
    if (hasRight()) {
      if (!getRight()
          .equals(other.getRight())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (hasLeft()) {
      hash = (37 * hash) + LEFT_FIELD_NUMBER;
      hash = (53 * hash) + getLeft().hashCode();
    }
    if (hasRight()) {
      hash = (37 * hash) + RIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getRight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ics23.NonExistenceProof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.NonExistenceProof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.NonExistenceProof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.NonExistenceProof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.NonExistenceProof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.NonExistenceProof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.NonExistenceProof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ics23.NonExistenceProof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ics23.NonExistenceProof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ics23.NonExistenceProof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ics23.NonExistenceProof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ics23.NonExistenceProof parseFrom(
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
  public static Builder newBuilder(com.ics23.NonExistenceProof prototype) {
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
   *
   *NonExistenceProof takes a proof of two neighbors, one left of the desired key,
   *one right of the desired key. If both proofs are valid AND they are neighbors,
   *then there is no valid proof for the given key.
   * </pre>
   *
   * Protobuf type {@code ics23.NonExistenceProof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ics23.NonExistenceProof)
      com.ics23.NonExistenceProofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ics23.ProofsProto.internal_static_ics23_NonExistenceProof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ics23.ProofsProto.internal_static_ics23_NonExistenceProof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ics23.NonExistenceProof.class, com.ics23.NonExistenceProof.Builder.class);
    }

    // Construct using com.ics23.NonExistenceProof.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;
      left_ = null;
      if (leftBuilder_ != null) {
        leftBuilder_.dispose();
        leftBuilder_ = null;
      }
      right_ = null;
      if (rightBuilder_ != null) {
        rightBuilder_.dispose();
        rightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ics23.ProofsProto.internal_static_ics23_NonExistenceProof_descriptor;
    }

    @java.lang.Override
    public com.ics23.NonExistenceProof getDefaultInstanceForType() {
      return com.ics23.NonExistenceProof.getDefaultInstance();
    }

    @java.lang.Override
    public com.ics23.NonExistenceProof build() {
      com.ics23.NonExistenceProof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ics23.NonExistenceProof buildPartial() {
      com.ics23.NonExistenceProof result = new com.ics23.NonExistenceProof(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ics23.NonExistenceProof result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.left_ = leftBuilder_ == null
            ? left_
            : leftBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.right_ = rightBuilder_ == null
            ? right_
            : rightBuilder_.build();
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
      if (other instanceof com.ics23.NonExistenceProof) {
        return mergeFrom((com.ics23.NonExistenceProof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ics23.NonExistenceProof other) {
      if (other == com.ics23.NonExistenceProof.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.hasLeft()) {
        mergeLeft(other.getLeft());
      }
      if (other.hasRight()) {
        mergeRight(other.getRight());
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
              key_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLeftFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TODO: remove this as unnecessary??? we prove a range
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * TODO: remove this as unnecessary??? we prove a range
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: remove this as unnecessary??? we prove a range
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.ics23.ExistenceProof left_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ics23.ExistenceProof, com.ics23.ExistenceProof.Builder, com.ics23.ExistenceProofOrBuilder> leftBuilder_;
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     * @return Whether the left field is set.
     */
    public boolean hasLeft() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     * @return The left.
     */
    public com.ics23.ExistenceProof getLeft() {
      if (leftBuilder_ == null) {
        return left_ == null ? com.ics23.ExistenceProof.getDefaultInstance() : left_;
      } else {
        return leftBuilder_.getMessage();
      }
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    public Builder setLeft(com.ics23.ExistenceProof value) {
      if (leftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        left_ = value;
      } else {
        leftBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    public Builder setLeft(
        com.ics23.ExistenceProof.Builder builderForValue) {
      if (leftBuilder_ == null) {
        left_ = builderForValue.build();
      } else {
        leftBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    public Builder mergeLeft(com.ics23.ExistenceProof value) {
      if (leftBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          left_ != null &&
          left_ != com.ics23.ExistenceProof.getDefaultInstance()) {
          getLeftBuilder().mergeFrom(value);
        } else {
          left_ = value;
        }
      } else {
        leftBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    public Builder clearLeft() {
      bitField0_ = (bitField0_ & ~0x00000002);
      left_ = null;
      if (leftBuilder_ != null) {
        leftBuilder_.dispose();
        leftBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    public com.ics23.ExistenceProof.Builder getLeftBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLeftFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    public com.ics23.ExistenceProofOrBuilder getLeftOrBuilder() {
      if (leftBuilder_ != null) {
        return leftBuilder_.getMessageOrBuilder();
      } else {
        return left_ == null ?
            com.ics23.ExistenceProof.getDefaultInstance() : left_;
      }
    }
    /**
     * <code>.ics23.ExistenceProof left = 2 [json_name = "left"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ics23.ExistenceProof, com.ics23.ExistenceProof.Builder, com.ics23.ExistenceProofOrBuilder> 
        getLeftFieldBuilder() {
      if (leftBuilder_ == null) {
        leftBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ics23.ExistenceProof, com.ics23.ExistenceProof.Builder, com.ics23.ExistenceProofOrBuilder>(
                getLeft(),
                getParentForChildren(),
                isClean());
        left_ = null;
      }
      return leftBuilder_;
    }

    private com.ics23.ExistenceProof right_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ics23.ExistenceProof, com.ics23.ExistenceProof.Builder, com.ics23.ExistenceProofOrBuilder> rightBuilder_;
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     * @return Whether the right field is set.
     */
    public boolean hasRight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     * @return The right.
     */
    public com.ics23.ExistenceProof getRight() {
      if (rightBuilder_ == null) {
        return right_ == null ? com.ics23.ExistenceProof.getDefaultInstance() : right_;
      } else {
        return rightBuilder_.getMessage();
      }
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    public Builder setRight(com.ics23.ExistenceProof value) {
      if (rightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        right_ = value;
      } else {
        rightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    public Builder setRight(
        com.ics23.ExistenceProof.Builder builderForValue) {
      if (rightBuilder_ == null) {
        right_ = builderForValue.build();
      } else {
        rightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    public Builder mergeRight(com.ics23.ExistenceProof value) {
      if (rightBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          right_ != null &&
          right_ != com.ics23.ExistenceProof.getDefaultInstance()) {
          getRightBuilder().mergeFrom(value);
        } else {
          right_ = value;
        }
      } else {
        rightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    public Builder clearRight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      right_ = null;
      if (rightBuilder_ != null) {
        rightBuilder_.dispose();
        rightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    public com.ics23.ExistenceProof.Builder getRightBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRightFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    public com.ics23.ExistenceProofOrBuilder getRightOrBuilder() {
      if (rightBuilder_ != null) {
        return rightBuilder_.getMessageOrBuilder();
      } else {
        return right_ == null ?
            com.ics23.ExistenceProof.getDefaultInstance() : right_;
      }
    }
    /**
     * <code>.ics23.ExistenceProof right = 3 [json_name = "right"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ics23.ExistenceProof, com.ics23.ExistenceProof.Builder, com.ics23.ExistenceProofOrBuilder> 
        getRightFieldBuilder() {
      if (rightBuilder_ == null) {
        rightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ics23.ExistenceProof, com.ics23.ExistenceProof.Builder, com.ics23.ExistenceProofOrBuilder>(
                getRight(),
                getParentForChildren(),
                isClean());
        right_ = null;
      }
      return rightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ics23.NonExistenceProof)
  }

  // @@protoc_insertion_point(class_scope:ics23.NonExistenceProof)
  private static final com.ics23.NonExistenceProof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ics23.NonExistenceProof();
  }

  public static com.ics23.NonExistenceProof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NonExistenceProof>
      PARSER = new com.google.protobuf.AbstractParser<NonExistenceProof>() {
    @java.lang.Override
    public NonExistenceProof parsePartialFrom(
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

  public static com.google.protobuf.Parser<NonExistenceProof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NonExistenceProof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ics23.NonExistenceProof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

