// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/consensus/types.proto

package com.tendermint.consensus;

/**
 * <pre>
 * BlockPart is sent when gossipping a piece of the proposed block.
 * </pre>
 *
 * Protobuf type {@code tendermint.consensus.BlockPart}
 */
public final class BlockPart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.consensus.BlockPart)
    BlockPartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockPart.newBuilder() to construct.
  private BlockPart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockPart() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockPart();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_BlockPart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_BlockPart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.consensus.BlockPart.class, com.tendermint.consensus.BlockPart.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_ = 0L;
  /**
   * <code>int64 height = 1 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ROUND_FIELD_NUMBER = 2;
  private int round_ = 0;
  /**
   * <code>int32 round = 2 [json_name = "round"];</code>
   * @return The round.
   */
  @java.lang.Override
  public int getRound() {
    return round_;
  }

  public static final int PART_FIELD_NUMBER = 3;
  private com.tendermint.types.Part part_;
  /**
   * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
   * @return Whether the part field is set.
   */
  @java.lang.Override
  public boolean hasPart() {
    return part_ != null;
  }
  /**
   * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
   * @return The part.
   */
  @java.lang.Override
  public com.tendermint.types.Part getPart() {
    return part_ == null ? com.tendermint.types.Part.getDefaultInstance() : part_;
  }
  /**
   * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.tendermint.types.PartOrBuilder getPartOrBuilder() {
    return part_ == null ? com.tendermint.types.Part.getDefaultInstance() : part_;
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
    if (height_ != 0L) {
      output.writeInt64(1, height_);
    }
    if (round_ != 0) {
      output.writeInt32(2, round_);
    }
    if (part_ != null) {
      output.writeMessage(3, getPart());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, height_);
    }
    if (round_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, round_);
    }
    if (part_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPart());
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
    if (!(obj instanceof com.tendermint.consensus.BlockPart)) {
      return super.equals(obj);
    }
    com.tendermint.consensus.BlockPart other = (com.tendermint.consensus.BlockPart) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (getRound()
        != other.getRound()) return false;
    if (hasPart() != other.hasPart()) return false;
    if (hasPart()) {
      if (!getPart()
          .equals(other.getPart())) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getRound();
    if (hasPart()) {
      hash = (37 * hash) + PART_FIELD_NUMBER;
      hash = (53 * hash) + getPart().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.consensus.BlockPart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.consensus.BlockPart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.BlockPart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.BlockPart parseFrom(
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
  public static Builder newBuilder(com.tendermint.consensus.BlockPart prototype) {
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
   * BlockPart is sent when gossipping a piece of the proposed block.
   * </pre>
   *
   * Protobuf type {@code tendermint.consensus.BlockPart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.consensus.BlockPart)
      com.tendermint.consensus.BlockPartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_BlockPart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_BlockPart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.consensus.BlockPart.class, com.tendermint.consensus.BlockPart.Builder.class);
    }

    // Construct using com.tendermint.consensus.BlockPart.newBuilder()
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
      height_ = 0L;
      round_ = 0;
      part_ = null;
      if (partBuilder_ != null) {
        partBuilder_.dispose();
        partBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_BlockPart_descriptor;
    }

    @java.lang.Override
    public com.tendermint.consensus.BlockPart getDefaultInstanceForType() {
      return com.tendermint.consensus.BlockPart.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.consensus.BlockPart build() {
      com.tendermint.consensus.BlockPart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.consensus.BlockPart buildPartial() {
      com.tendermint.consensus.BlockPart result = new com.tendermint.consensus.BlockPart(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.consensus.BlockPart result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.round_ = round_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.part_ = partBuilder_ == null
            ? part_
            : partBuilder_.build();
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
      if (other instanceof com.tendermint.consensus.BlockPart) {
        return mergeFrom((com.tendermint.consensus.BlockPart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.consensus.BlockPart other) {
      if (other == com.tendermint.consensus.BlockPart.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getRound() != 0) {
        setRound(other.getRound());
      }
      if (other.hasPart()) {
        mergePart(other.getPart());
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
              height_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              round_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPartFieldBuilder().getBuilder(),
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

    private long height_ ;
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      onChanged();
      return this;
    }

    private int round_ ;
    /**
     * <code>int32 round = 2 [json_name = "round"];</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }
    /**
     * <code>int32 round = 2 [json_name = "round"];</code>
     * @param value The round to set.
     * @return This builder for chaining.
     */
    public Builder setRound(int value) {

      round_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 round = 2 [json_name = "round"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      round_ = 0;
      onChanged();
      return this;
    }

    private com.tendermint.types.Part part_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Part, com.tendermint.types.Part.Builder, com.tendermint.types.PartOrBuilder> partBuilder_;
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     * @return Whether the part field is set.
     */
    public boolean hasPart() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     * @return The part.
     */
    public com.tendermint.types.Part getPart() {
      if (partBuilder_ == null) {
        return part_ == null ? com.tendermint.types.Part.getDefaultInstance() : part_;
      } else {
        return partBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPart(com.tendermint.types.Part value) {
      if (partBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        part_ = value;
      } else {
        partBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPart(
        com.tendermint.types.Part.Builder builderForValue) {
      if (partBuilder_ == null) {
        part_ = builderForValue.build();
      } else {
        partBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergePart(com.tendermint.types.Part value) {
      if (partBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          part_ != null &&
          part_ != com.tendermint.types.Part.getDefaultInstance()) {
          getPartBuilder().mergeFrom(value);
        } else {
          part_ = value;
        }
      } else {
        partBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPart() {
      bitField0_ = (bitField0_ & ~0x00000004);
      part_ = null;
      if (partBuilder_ != null) {
        partBuilder_.dispose();
        partBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.Part.Builder getPartBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPartFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.PartOrBuilder getPartOrBuilder() {
      if (partBuilder_ != null) {
        return partBuilder_.getMessageOrBuilder();
      } else {
        return part_ == null ?
            com.tendermint.types.Part.getDefaultInstance() : part_;
      }
    }
    /**
     * <code>.tendermint.types.Part part = 3 [json_name = "part", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Part, com.tendermint.types.Part.Builder, com.tendermint.types.PartOrBuilder> 
        getPartFieldBuilder() {
      if (partBuilder_ == null) {
        partBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.types.Part, com.tendermint.types.Part.Builder, com.tendermint.types.PartOrBuilder>(
                getPart(),
                getParentForChildren(),
                isClean());
        part_ = null;
      }
      return partBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.consensus.BlockPart)
  }

  // @@protoc_insertion_point(class_scope:tendermint.consensus.BlockPart)
  private static final com.tendermint.consensus.BlockPart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.consensus.BlockPart();
  }

  public static com.tendermint.consensus.BlockPart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockPart>
      PARSER = new com.google.protobuf.AbstractParser<BlockPart>() {
    @java.lang.Override
    public BlockPart parsePartialFrom(
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

  public static com.google.protobuf.Parser<BlockPart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockPart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.consensus.BlockPart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

