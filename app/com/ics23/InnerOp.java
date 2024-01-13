// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package com.ics23;

/**
 * <pre>
 *
 *InnerOp represents a merkle-proof step that is not a leaf.
 *It represents concatenating two children and hashing them to provide the next result.
 *
 *The result of the previous step is passed in, so the signature of this op is:
 * innerOp(child) -&gt; output
 *
 *The result of applying InnerOp should be:
 * output = op.hash(op.prefix || child || op.suffix)
 *
 * where the || operator is concatenation of binary data,
 *and child is the result of hashing all the tree below this step.
 *
 *Any special data, like prepending child with the length, or prepending the entire operation with
 *some value to differentiate from leaf nodes, should be included in prefix and suffix.
 *If either of prefix or suffix is empty, we just treat it as an empty string
 * </pre>
 *
 * Protobuf type {@code ics23.InnerOp}
 */
public final class InnerOp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ics23.InnerOp)
    InnerOpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InnerOp.newBuilder() to construct.
  private InnerOp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InnerOp() {
    hash_ = 0;
    prefix_ = com.google.protobuf.ByteString.EMPTY;
    suffix_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InnerOp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ics23.ProofsProto.internal_static_ics23_InnerOp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ics23.ProofsProto.internal_static_ics23_InnerOp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ics23.InnerOp.class, com.ics23.InnerOp.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private int hash_ = 0;
  /**
   * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
   * @return The enum numeric value on the wire for hash.
   */
  @java.lang.Override public int getHashValue() {
    return hash_;
  }
  /**
   * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override public com.ics23.HashOp getHash() {
    com.ics23.HashOp result = com.ics23.HashOp.forNumber(hash_);
    return result == null ? com.ics23.HashOp.UNRECOGNIZED : result;
  }

  public static final int PREFIX_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString prefix_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes prefix = 2 [json_name = "prefix"];</code>
   * @return The prefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrefix() {
    return prefix_;
  }

  public static final int SUFFIX_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString suffix_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes suffix = 3 [json_name = "suffix"];</code>
   * @return The suffix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSuffix() {
    return suffix_;
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
    if (hash_ != com.ics23.HashOp.NO_HASH.getNumber()) {
      output.writeEnum(1, hash_);
    }
    if (!prefix_.isEmpty()) {
      output.writeBytes(2, prefix_);
    }
    if (!suffix_.isEmpty()) {
      output.writeBytes(3, suffix_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hash_ != com.ics23.HashOp.NO_HASH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hash_);
    }
    if (!prefix_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, prefix_);
    }
    if (!suffix_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, suffix_);
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
    if (!(obj instanceof com.ics23.InnerOp)) {
      return super.equals(obj);
    }
    com.ics23.InnerOp other = (com.ics23.InnerOp) obj;

    if (hash_ != other.hash_) return false;
    if (!getPrefix()
        .equals(other.getPrefix())) return false;
    if (!getSuffix()
        .equals(other.getSuffix())) return false;
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
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + hash_;
    hash = (37 * hash) + PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPrefix().hashCode();
    hash = (37 * hash) + SUFFIX_FIELD_NUMBER;
    hash = (53 * hash) + getSuffix().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ics23.InnerOp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.InnerOp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.InnerOp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.InnerOp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.InnerOp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.InnerOp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.InnerOp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ics23.InnerOp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ics23.InnerOp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ics23.InnerOp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ics23.InnerOp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ics23.InnerOp parseFrom(
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
  public static Builder newBuilder(com.ics23.InnerOp prototype) {
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
   *InnerOp represents a merkle-proof step that is not a leaf.
   *It represents concatenating two children and hashing them to provide the next result.
   *
   *The result of the previous step is passed in, so the signature of this op is:
   * innerOp(child) -&gt; output
   *
   *The result of applying InnerOp should be:
   * output = op.hash(op.prefix || child || op.suffix)
   *
   * where the || operator is concatenation of binary data,
   *and child is the result of hashing all the tree below this step.
   *
   *Any special data, like prepending child with the length, or prepending the entire operation with
   *some value to differentiate from leaf nodes, should be included in prefix and suffix.
   *If either of prefix or suffix is empty, we just treat it as an empty string
   * </pre>
   *
   * Protobuf type {@code ics23.InnerOp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ics23.InnerOp)
      com.ics23.InnerOpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ics23.ProofsProto.internal_static_ics23_InnerOp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ics23.ProofsProto.internal_static_ics23_InnerOp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ics23.InnerOp.class, com.ics23.InnerOp.Builder.class);
    }

    // Construct using com.ics23.InnerOp.newBuilder()
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
      hash_ = 0;
      prefix_ = com.google.protobuf.ByteString.EMPTY;
      suffix_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ics23.ProofsProto.internal_static_ics23_InnerOp_descriptor;
    }

    @java.lang.Override
    public com.ics23.InnerOp getDefaultInstanceForType() {
      return com.ics23.InnerOp.getDefaultInstance();
    }

    @java.lang.Override
    public com.ics23.InnerOp build() {
      com.ics23.InnerOp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ics23.InnerOp buildPartial() {
      com.ics23.InnerOp result = new com.ics23.InnerOp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ics23.InnerOp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hash_ = hash_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.prefix_ = prefix_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.suffix_ = suffix_;
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
      if (other instanceof com.ics23.InnerOp) {
        return mergeFrom((com.ics23.InnerOp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ics23.InnerOp other) {
      if (other == com.ics23.InnerOp.getDefaultInstance()) return this;
      if (other.hash_ != 0) {
        setHashValue(other.getHashValue());
      }
      if (other.getPrefix() != com.google.protobuf.ByteString.EMPTY) {
        setPrefix(other.getPrefix());
      }
      if (other.getSuffix() != com.google.protobuf.ByteString.EMPTY) {
        setSuffix(other.getSuffix());
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
              hash_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              prefix_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              suffix_ = input.readBytes();
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

    private int hash_ = 0;
    /**
     * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
     * @return The enum numeric value on the wire for hash.
     */
    @java.lang.Override public int getHashValue() {
      return hash_;
    }
    /**
     * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
     * @param value The enum numeric value on the wire for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashValue(int value) {
      hash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
     * @return The hash.
     */
    @java.lang.Override
    public com.ics23.HashOp getHash() {
      com.ics23.HashOp result = com.ics23.HashOp.forNumber(hash_);
      return result == null ? com.ics23.HashOp.UNRECOGNIZED : result;
    }
    /**
     * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(com.ics23.HashOp value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      hash_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.HashOp hash = 1 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hash_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString prefix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes prefix = 2 [json_name = "prefix"];</code>
     * @return The prefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPrefix() {
      return prefix_;
    }
    /**
     * <code>bytes prefix = 2 [json_name = "prefix"];</code>
     * @param value The prefix to set.
     * @return This builder for chaining.
     */
    public Builder setPrefix(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      prefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes prefix = 2 [json_name = "prefix"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefix() {
      bitField0_ = (bitField0_ & ~0x00000002);
      prefix_ = getDefaultInstance().getPrefix();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString suffix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes suffix = 3 [json_name = "suffix"];</code>
     * @return The suffix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSuffix() {
      return suffix_;
    }
    /**
     * <code>bytes suffix = 3 [json_name = "suffix"];</code>
     * @param value The suffix to set.
     * @return This builder for chaining.
     */
    public Builder setSuffix(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      suffix_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes suffix = 3 [json_name = "suffix"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuffix() {
      bitField0_ = (bitField0_ & ~0x00000004);
      suffix_ = getDefaultInstance().getSuffix();
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


    // @@protoc_insertion_point(builder_scope:ics23.InnerOp)
  }

  // @@protoc_insertion_point(class_scope:ics23.InnerOp)
  private static final com.ics23.InnerOp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ics23.InnerOp();
  }

  public static com.ics23.InnerOp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InnerOp>
      PARSER = new com.google.protobuf.AbstractParser<InnerOp>() {
    @java.lang.Override
    public InnerOp parsePartialFrom(
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

  public static com.google.protobuf.Parser<InnerOp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InnerOp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ics23.InnerOp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
