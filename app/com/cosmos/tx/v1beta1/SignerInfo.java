// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package com.cosmos.tx.v1beta1;

/**
 * <pre>
 * SignerInfo describes the public key and signing mode of a single top-level
 * signer.
 * </pre>
 *
 * Protobuf type {@code cosmos.tx.v1beta1.SignerInfo}
 */
public final class SignerInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.tx.v1beta1.SignerInfo)
    SignerInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignerInfo.newBuilder() to construct.
  private SignerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignerInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignerInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.tx.v1beta1.TxProto.internal_static_cosmos_tx_v1beta1_SignerInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.tx.v1beta1.TxProto.internal_static_cosmos_tx_v1beta1_SignerInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.tx.v1beta1.SignerInfo.class, com.cosmos.tx.v1beta1.SignerInfo.Builder.class);
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.Any publicKey_;
  /**
   * <pre>
   * public_key is the public key of the signer. It is optional for accounts
   * that already exist in state. If unset, the verifier can use the required &#92;
   * signer address for this position and lookup the public key.
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   * @return Whether the publicKey field is set.
   */
  @java.lang.Override
  public boolean hasPublicKey() {
    return publicKey_ != null;
  }
  /**
   * <pre>
   * public_key is the public key of the signer. It is optional for accounts
   * that already exist in state. If unset, the verifier can use the required &#92;
   * signer address for this position and lookup the public key.
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   * @return The publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.Any getPublicKey() {
    return publicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : publicKey_;
  }
  /**
   * <pre>
   * public_key is the public key of the signer. It is optional for accounts
   * that already exist in state. If unset, the verifier can use the required &#92;
   * signer address for this position and lookup the public key.
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getPublicKeyOrBuilder() {
    return publicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : publicKey_;
  }

  public static final int MODE_INFO_FIELD_NUMBER = 2;
  private com.cosmos.tx.v1beta1.ModeInfo modeInfo_;
  /**
   * <pre>
   * mode_info describes the signing mode of the signer and is a nested
   * structure to support nested multisig pubkey's
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
   * @return Whether the modeInfo field is set.
   */
  @java.lang.Override
  public boolean hasModeInfo() {
    return modeInfo_ != null;
  }
  /**
   * <pre>
   * mode_info describes the signing mode of the signer and is a nested
   * structure to support nested multisig pubkey's
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
   * @return The modeInfo.
   */
  @java.lang.Override
  public com.cosmos.tx.v1beta1.ModeInfo getModeInfo() {
    return modeInfo_ == null ? com.cosmos.tx.v1beta1.ModeInfo.getDefaultInstance() : modeInfo_;
  }
  /**
   * <pre>
   * mode_info describes the signing mode of the signer and is a nested
   * structure to support nested multisig pubkey's
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
   */
  @java.lang.Override
  public com.cosmos.tx.v1beta1.ModeInfoOrBuilder getModeInfoOrBuilder() {
    return modeInfo_ == null ? com.cosmos.tx.v1beta1.ModeInfo.getDefaultInstance() : modeInfo_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 3;
  private long sequence_ = 0L;
  /**
   * <pre>
   * sequence is the sequence of the account, which describes the
   * number of committed transactions signed by a given address. It is used to
   * prevent replay attacks.
   * </pre>
   *
   * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
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
    if (publicKey_ != null) {
      output.writeMessage(1, getPublicKey());
    }
    if (modeInfo_ != null) {
      output.writeMessage(2, getModeInfo());
    }
    if (sequence_ != 0L) {
      output.writeUInt64(3, sequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (publicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPublicKey());
    }
    if (modeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModeInfo());
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, sequence_);
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
    if (!(obj instanceof com.cosmos.tx.v1beta1.SignerInfo)) {
      return super.equals(obj);
    }
    com.cosmos.tx.v1beta1.SignerInfo other = (com.cosmos.tx.v1beta1.SignerInfo) obj;

    if (hasPublicKey() != other.hasPublicKey()) return false;
    if (hasPublicKey()) {
      if (!getPublicKey()
          .equals(other.getPublicKey())) return false;
    }
    if (hasModeInfo() != other.hasModeInfo()) return false;
    if (hasModeInfo()) {
      if (!getModeInfo()
          .equals(other.getModeInfo())) return false;
    }
    if (getSequence()
        != other.getSequence()) return false;
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
    if (hasPublicKey()) {
      hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPublicKey().hashCode();
    }
    if (hasModeInfo()) {
      hash = (37 * hash) + MODE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getModeInfo().hashCode();
    }
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.tx.v1beta1.SignerInfo parseFrom(
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
  public static Builder newBuilder(com.cosmos.tx.v1beta1.SignerInfo prototype) {
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
   * SignerInfo describes the public key and signing mode of a single top-level
   * signer.
   * </pre>
   *
   * Protobuf type {@code cosmos.tx.v1beta1.SignerInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.tx.v1beta1.SignerInfo)
      com.cosmos.tx.v1beta1.SignerInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.tx.v1beta1.TxProto.internal_static_cosmos_tx_v1beta1_SignerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.tx.v1beta1.TxProto.internal_static_cosmos_tx_v1beta1_SignerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.tx.v1beta1.SignerInfo.class, com.cosmos.tx.v1beta1.SignerInfo.Builder.class);
    }

    // Construct using com.cosmos.tx.v1beta1.SignerInfo.newBuilder()
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
      publicKey_ = null;
      if (publicKeyBuilder_ != null) {
        publicKeyBuilder_.dispose();
        publicKeyBuilder_ = null;
      }
      modeInfo_ = null;
      if (modeInfoBuilder_ != null) {
        modeInfoBuilder_.dispose();
        modeInfoBuilder_ = null;
      }
      sequence_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.tx.v1beta1.TxProto.internal_static_cosmos_tx_v1beta1_SignerInfo_descriptor;
    }

    @java.lang.Override
    public com.cosmos.tx.v1beta1.SignerInfo getDefaultInstanceForType() {
      return com.cosmos.tx.v1beta1.SignerInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.tx.v1beta1.SignerInfo build() {
      com.cosmos.tx.v1beta1.SignerInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.tx.v1beta1.SignerInfo buildPartial() {
      com.cosmos.tx.v1beta1.SignerInfo result = new com.cosmos.tx.v1beta1.SignerInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.tx.v1beta1.SignerInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.publicKey_ = publicKeyBuilder_ == null
            ? publicKey_
            : publicKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.modeInfo_ = modeInfoBuilder_ == null
            ? modeInfo_
            : modeInfoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sequence_ = sequence_;
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
      if (other instanceof com.cosmos.tx.v1beta1.SignerInfo) {
        return mergeFrom((com.cosmos.tx.v1beta1.SignerInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.tx.v1beta1.SignerInfo other) {
      if (other == com.cosmos.tx.v1beta1.SignerInfo.getDefaultInstance()) return this;
      if (other.hasPublicKey()) {
        mergePublicKey(other.getPublicKey());
      }
      if (other.hasModeInfo()) {
        mergeModeInfo(other.getModeInfo());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
                  getPublicKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getModeInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              sequence_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.Any publicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> publicKeyBuilder_;
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     * @return Whether the publicKey field is set.
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     * @return The publicKey.
     */
    public com.google.protobuf.Any getPublicKey() {
      if (publicKeyBuilder_ == null) {
        return publicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : publicKey_;
      } else {
        return publicKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder setPublicKey(com.google.protobuf.Any value) {
      if (publicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        publicKey_ = value;
      } else {
        publicKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder setPublicKey(
        com.google.protobuf.Any.Builder builderForValue) {
      if (publicKeyBuilder_ == null) {
        publicKey_ = builderForValue.build();
      } else {
        publicKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder mergePublicKey(com.google.protobuf.Any value) {
      if (publicKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          publicKey_ != null &&
          publicKey_ != com.google.protobuf.Any.getDefaultInstance()) {
          getPublicKeyBuilder().mergeFrom(value);
        } else {
          publicKey_ = value;
        }
      } else {
        publicKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder clearPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      publicKey_ = null;
      if (publicKeyBuilder_ != null) {
        publicKeyBuilder_.dispose();
        publicKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public com.google.protobuf.Any.Builder getPublicKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getPublicKeyOrBuilder() {
      if (publicKeyBuilder_ != null) {
        return publicKeyBuilder_.getMessageOrBuilder();
      } else {
        return publicKey_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : publicKey_;
      }
    }
    /**
     * <pre>
     * public_key is the public key of the signer. It is optional for accounts
     * that already exist in state. If unset, the verifier can use the required &#92;
     * signer address for this position and lookup the public key.
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getPublicKeyFieldBuilder() {
      if (publicKeyBuilder_ == null) {
        publicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getPublicKey(),
                getParentForChildren(),
                isClean());
        publicKey_ = null;
      }
      return publicKeyBuilder_;
    }

    private com.cosmos.tx.v1beta1.ModeInfo modeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.tx.v1beta1.ModeInfo, com.cosmos.tx.v1beta1.ModeInfo.Builder, com.cosmos.tx.v1beta1.ModeInfoOrBuilder> modeInfoBuilder_;
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     * @return Whether the modeInfo field is set.
     */
    public boolean hasModeInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     * @return The modeInfo.
     */
    public com.cosmos.tx.v1beta1.ModeInfo getModeInfo() {
      if (modeInfoBuilder_ == null) {
        return modeInfo_ == null ? com.cosmos.tx.v1beta1.ModeInfo.getDefaultInstance() : modeInfo_;
      } else {
        return modeInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    public Builder setModeInfo(com.cosmos.tx.v1beta1.ModeInfo value) {
      if (modeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modeInfo_ = value;
      } else {
        modeInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    public Builder setModeInfo(
        com.cosmos.tx.v1beta1.ModeInfo.Builder builderForValue) {
      if (modeInfoBuilder_ == null) {
        modeInfo_ = builderForValue.build();
      } else {
        modeInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    public Builder mergeModeInfo(com.cosmos.tx.v1beta1.ModeInfo value) {
      if (modeInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          modeInfo_ != null &&
          modeInfo_ != com.cosmos.tx.v1beta1.ModeInfo.getDefaultInstance()) {
          getModeInfoBuilder().mergeFrom(value);
        } else {
          modeInfo_ = value;
        }
      } else {
        modeInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    public Builder clearModeInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      modeInfo_ = null;
      if (modeInfoBuilder_ != null) {
        modeInfoBuilder_.dispose();
        modeInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    public com.cosmos.tx.v1beta1.ModeInfo.Builder getModeInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getModeInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    public com.cosmos.tx.v1beta1.ModeInfoOrBuilder getModeInfoOrBuilder() {
      if (modeInfoBuilder_ != null) {
        return modeInfoBuilder_.getMessageOrBuilder();
      } else {
        return modeInfo_ == null ?
            com.cosmos.tx.v1beta1.ModeInfo.getDefaultInstance() : modeInfo_;
      }
    }
    /**
     * <pre>
     * mode_info describes the signing mode of the signer and is a nested
     * structure to support nested multisig pubkey's
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.tx.v1beta1.ModeInfo, com.cosmos.tx.v1beta1.ModeInfo.Builder, com.cosmos.tx.v1beta1.ModeInfoOrBuilder> 
        getModeInfoFieldBuilder() {
      if (modeInfoBuilder_ == null) {
        modeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.tx.v1beta1.ModeInfo, com.cosmos.tx.v1beta1.ModeInfo.Builder, com.cosmos.tx.v1beta1.ModeInfoOrBuilder>(
                getModeInfo(),
                getParentForChildren(),
                isClean());
        modeInfo_ = null;
      }
      return modeInfoBuilder_;
    }

    private long sequence_ ;
    /**
     * <pre>
     * sequence is the sequence of the account, which describes the
     * number of committed transactions signed by a given address. It is used to
     * prevent replay attacks.
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * sequence is the sequence of the account, which describes the
     * number of committed transactions signed by a given address. It is used to
     * prevent replay attacks.
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sequence is the sequence of the account, which describes the
     * number of committed transactions signed by a given address. It is used to
     * prevent replay attacks.
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sequence_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmos.tx.v1beta1.SignerInfo)
  }

  // @@protoc_insertion_point(class_scope:cosmos.tx.v1beta1.SignerInfo)
  private static final com.cosmos.tx.v1beta1.SignerInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.tx.v1beta1.SignerInfo();
  }

  public static com.cosmos.tx.v1beta1.SignerInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignerInfo>
      PARSER = new com.google.protobuf.AbstractParser<SignerInfo>() {
    @java.lang.Override
    public SignerInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignerInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignerInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.tx.v1beta1.SignerInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

