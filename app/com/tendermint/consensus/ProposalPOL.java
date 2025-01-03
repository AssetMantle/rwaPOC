// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/consensus/types.proto

package com.tendermint.consensus;

/**
 * <pre>
 * ProposalPOL is sent when a previous proposal is re-proposed.
 * </pre>
 *
 * Protobuf type {@code tendermint.consensus.ProposalPOL}
 */
public final class ProposalPOL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.consensus.ProposalPOL)
    ProposalPOLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProposalPOL.newBuilder() to construct.
  private ProposalPOL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProposalPOL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProposalPOL();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_ProposalPOL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_ProposalPOL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.consensus.ProposalPOL.class, com.tendermint.consensus.ProposalPOL.Builder.class);
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

  public static final int PROPOSAL_POL_ROUND_FIELD_NUMBER = 2;
  private int proposalPolRound_ = 0;
  /**
   * <code>int32 proposal_pol_round = 2 [json_name = "proposalPolRound"];</code>
   * @return The proposalPolRound.
   */
  @java.lang.Override
  public int getProposalPolRound() {
    return proposalPolRound_;
  }

  public static final int PROPOSAL_POL_FIELD_NUMBER = 3;
  private com.tendermint.libs.bits.BitArray proposalPol_;
  /**
   * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
   * @return Whether the proposalPol field is set.
   */
  @java.lang.Override
  public boolean hasProposalPol() {
    return proposalPol_ != null;
  }
  /**
   * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
   * @return The proposalPol.
   */
  @java.lang.Override
  public com.tendermint.libs.bits.BitArray getProposalPol() {
    return proposalPol_ == null ? com.tendermint.libs.bits.BitArray.getDefaultInstance() : proposalPol_;
  }
  /**
   * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.tendermint.libs.bits.BitArrayOrBuilder getProposalPolOrBuilder() {
    return proposalPol_ == null ? com.tendermint.libs.bits.BitArray.getDefaultInstance() : proposalPol_;
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
    if (proposalPolRound_ != 0) {
      output.writeInt32(2, proposalPolRound_);
    }
    if (proposalPol_ != null) {
      output.writeMessage(3, getProposalPol());
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
    if (proposalPolRound_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, proposalPolRound_);
    }
    if (proposalPol_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProposalPol());
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
    if (!(obj instanceof com.tendermint.consensus.ProposalPOL)) {
      return super.equals(obj);
    }
    com.tendermint.consensus.ProposalPOL other = (com.tendermint.consensus.ProposalPOL) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (getProposalPolRound()
        != other.getProposalPolRound()) return false;
    if (hasProposalPol() != other.hasProposalPol()) return false;
    if (hasProposalPol()) {
      if (!getProposalPol()
          .equals(other.getProposalPol())) return false;
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
    hash = (37 * hash) + PROPOSAL_POL_ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getProposalPolRound();
    if (hasProposalPol()) {
      hash = (37 * hash) + PROPOSAL_POL_FIELD_NUMBER;
      hash = (53 * hash) + getProposalPol().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.consensus.ProposalPOL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.consensus.ProposalPOL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.ProposalPOL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.ProposalPOL parseFrom(
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
  public static Builder newBuilder(com.tendermint.consensus.ProposalPOL prototype) {
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
   * ProposalPOL is sent when a previous proposal is re-proposed.
   * </pre>
   *
   * Protobuf type {@code tendermint.consensus.ProposalPOL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.consensus.ProposalPOL)
      com.tendermint.consensus.ProposalPOLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_ProposalPOL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_ProposalPOL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.consensus.ProposalPOL.class, com.tendermint.consensus.ProposalPOL.Builder.class);
    }

    // Construct using com.tendermint.consensus.ProposalPOL.newBuilder()
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
      proposalPolRound_ = 0;
      proposalPol_ = null;
      if (proposalPolBuilder_ != null) {
        proposalPolBuilder_.dispose();
        proposalPolBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.consensus.TypesProto.internal_static_tendermint_consensus_ProposalPOL_descriptor;
    }

    @java.lang.Override
    public com.tendermint.consensus.ProposalPOL getDefaultInstanceForType() {
      return com.tendermint.consensus.ProposalPOL.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.consensus.ProposalPOL build() {
      com.tendermint.consensus.ProposalPOL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.consensus.ProposalPOL buildPartial() {
      com.tendermint.consensus.ProposalPOL result = new com.tendermint.consensus.ProposalPOL(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.consensus.ProposalPOL result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.proposalPolRound_ = proposalPolRound_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.proposalPol_ = proposalPolBuilder_ == null
            ? proposalPol_
            : proposalPolBuilder_.build();
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
      if (other instanceof com.tendermint.consensus.ProposalPOL) {
        return mergeFrom((com.tendermint.consensus.ProposalPOL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.consensus.ProposalPOL other) {
      if (other == com.tendermint.consensus.ProposalPOL.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getProposalPolRound() != 0) {
        setProposalPolRound(other.getProposalPolRound());
      }
      if (other.hasProposalPol()) {
        mergeProposalPol(other.getProposalPol());
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
              proposalPolRound_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getProposalPolFieldBuilder().getBuilder(),
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

    private int proposalPolRound_ ;
    /**
     * <code>int32 proposal_pol_round = 2 [json_name = "proposalPolRound"];</code>
     * @return The proposalPolRound.
     */
    @java.lang.Override
    public int getProposalPolRound() {
      return proposalPolRound_;
    }
    /**
     * <code>int32 proposal_pol_round = 2 [json_name = "proposalPolRound"];</code>
     * @param value The proposalPolRound to set.
     * @return This builder for chaining.
     */
    public Builder setProposalPolRound(int value) {

      proposalPolRound_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 proposal_pol_round = 2 [json_name = "proposalPolRound"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalPolRound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      proposalPolRound_ = 0;
      onChanged();
      return this;
    }

    private com.tendermint.libs.bits.BitArray proposalPol_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.libs.bits.BitArray, com.tendermint.libs.bits.BitArray.Builder, com.tendermint.libs.bits.BitArrayOrBuilder> proposalPolBuilder_;
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     * @return Whether the proposalPol field is set.
     */
    public boolean hasProposalPol() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     * @return The proposalPol.
     */
    public com.tendermint.libs.bits.BitArray getProposalPol() {
      if (proposalPolBuilder_ == null) {
        return proposalPol_ == null ? com.tendermint.libs.bits.BitArray.getDefaultInstance() : proposalPol_;
      } else {
        return proposalPolBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProposalPol(com.tendermint.libs.bits.BitArray value) {
      if (proposalPolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proposalPol_ = value;
      } else {
        proposalPolBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProposalPol(
        com.tendermint.libs.bits.BitArray.Builder builderForValue) {
      if (proposalPolBuilder_ == null) {
        proposalPol_ = builderForValue.build();
      } else {
        proposalPolBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeProposalPol(com.tendermint.libs.bits.BitArray value) {
      if (proposalPolBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          proposalPol_ != null &&
          proposalPol_ != com.tendermint.libs.bits.BitArray.getDefaultInstance()) {
          getProposalPolBuilder().mergeFrom(value);
        } else {
          proposalPol_ = value;
        }
      } else {
        proposalPolBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearProposalPol() {
      bitField0_ = (bitField0_ & ~0x00000004);
      proposalPol_ = null;
      if (proposalPolBuilder_ != null) {
        proposalPolBuilder_.dispose();
        proposalPolBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.libs.bits.BitArray.Builder getProposalPolBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getProposalPolFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.libs.bits.BitArrayOrBuilder getProposalPolOrBuilder() {
      if (proposalPolBuilder_ != null) {
        return proposalPolBuilder_.getMessageOrBuilder();
      } else {
        return proposalPol_ == null ?
            com.tendermint.libs.bits.BitArray.getDefaultInstance() : proposalPol_;
      }
    }
    /**
     * <code>.tendermint.libs.bits.BitArray proposal_pol = 3 [json_name = "proposalPol", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.libs.bits.BitArray, com.tendermint.libs.bits.BitArray.Builder, com.tendermint.libs.bits.BitArrayOrBuilder> 
        getProposalPolFieldBuilder() {
      if (proposalPolBuilder_ == null) {
        proposalPolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.libs.bits.BitArray, com.tendermint.libs.bits.BitArray.Builder, com.tendermint.libs.bits.BitArrayOrBuilder>(
                getProposalPol(),
                getParentForChildren(),
                isClean());
        proposalPol_ = null;
      }
      return proposalPolBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.consensus.ProposalPOL)
  }

  // @@protoc_insertion_point(class_scope:tendermint.consensus.ProposalPOL)
  private static final com.tendermint.consensus.ProposalPOL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.consensus.ProposalPOL();
  }

  public static com.tendermint.consensus.ProposalPOL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProposalPOL>
      PARSER = new com.google.protobuf.AbstractParser<ProposalPOL>() {
    @java.lang.Override
    public ProposalPOL parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProposalPOL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProposalPOL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.consensus.ProposalPOL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

