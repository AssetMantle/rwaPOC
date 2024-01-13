// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/mempool/types.proto

package com.tendermint.mempool;

/**
 * Protobuf type {@code tendermint.mempool.Txs}
 */
public final class Txs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.mempool.Txs)
    TxsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Txs.newBuilder() to construct.
  private Txs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Txs() {
    txs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Txs();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Txs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Txs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.mempool.Txs.class, com.tendermint.mempool.Txs.Builder.class);
  }

  public static final int TXS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> txs_;
  /**
   * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
   * @return A list containing the txs.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getTxsList() {
    return txs_;
  }
  /**
   * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
   * @return The count of txs.
   */
  public int getTxsCount() {
    return txs_.size();
  }
  /**
   * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
   * @param index The index of the element to return.
   * @return The txs at the given index.
   */
  public com.google.protobuf.ByteString getTxs(int index) {
    return txs_.get(index);
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
    for (int i = 0; i < txs_.size(); i++) {
      output.writeBytes(1, txs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < txs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(txs_.get(i));
      }
      size += dataSize;
      size += 1 * getTxsList().size();
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
    if (!(obj instanceof com.tendermint.mempool.Txs)) {
      return super.equals(obj);
    }
    com.tendermint.mempool.Txs other = (com.tendermint.mempool.Txs) obj;

    if (!getTxsList()
        .equals(other.getTxsList())) return false;
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
    if (getTxsCount() > 0) {
      hash = (37 * hash) + TXS_FIELD_NUMBER;
      hash = (53 * hash) + getTxsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.mempool.Txs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.mempool.Txs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.mempool.Txs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.mempool.Txs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.mempool.Txs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.mempool.Txs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.mempool.Txs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.mempool.Txs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.mempool.Txs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.mempool.Txs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.mempool.Txs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.mempool.Txs parseFrom(
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
  public static Builder newBuilder(com.tendermint.mempool.Txs prototype) {
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
   * Protobuf type {@code tendermint.mempool.Txs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.mempool.Txs)
      com.tendermint.mempool.TxsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Txs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Txs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.mempool.Txs.class, com.tendermint.mempool.Txs.Builder.class);
    }

    // Construct using com.tendermint.mempool.Txs.newBuilder()
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
      txs_ = java.util.Collections.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Txs_descriptor;
    }

    @java.lang.Override
    public com.tendermint.mempool.Txs getDefaultInstanceForType() {
      return com.tendermint.mempool.Txs.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.mempool.Txs build() {
      com.tendermint.mempool.Txs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.mempool.Txs buildPartial() {
      com.tendermint.mempool.Txs result = new com.tendermint.mempool.Txs(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tendermint.mempool.Txs result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        txs_ = java.util.Collections.unmodifiableList(txs_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.txs_ = txs_;
    }

    private void buildPartial0(com.tendermint.mempool.Txs result) {
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
      if (other instanceof com.tendermint.mempool.Txs) {
        return mergeFrom((com.tendermint.mempool.Txs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.mempool.Txs other) {
      if (other == com.tendermint.mempool.Txs.getDefaultInstance()) return this;
      if (!other.txs_.isEmpty()) {
        if (txs_.isEmpty()) {
          txs_ = other.txs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTxsIsMutable();
          txs_.addAll(other.txs_);
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
              com.google.protobuf.ByteString v = input.readBytes();
              ensureTxsIsMutable();
              txs_.add(v);
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

    private java.util.List<com.google.protobuf.ByteString> txs_ = java.util.Collections.emptyList();
    private void ensureTxsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        txs_ = new java.util.ArrayList<com.google.protobuf.ByteString>(txs_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @return A list containing the txs.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getTxsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(txs_) : txs_;
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @return The count of txs.
     */
    public int getTxsCount() {
      return txs_.size();
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @param index The index of the element to return.
     * @return The txs at the given index.
     */
    public com.google.protobuf.ByteString getTxs(int index) {
      return txs_.get(index);
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @param index The index to set the value at.
     * @param value The txs to set.
     * @return This builder for chaining.
     */
    public Builder setTxs(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTxsIsMutable();
      txs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @param value The txs to add.
     * @return This builder for chaining.
     */
    public Builder addTxs(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTxsIsMutable();
      txs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @param values The txs to add.
     * @return This builder for chaining.
     */
    public Builder addAllTxs(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureTxsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, txs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxs() {
      txs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:tendermint.mempool.Txs)
  }

  // @@protoc_insertion_point(class_scope:tendermint.mempool.Txs)
  private static final com.tendermint.mempool.Txs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.mempool.Txs();
  }

  public static com.tendermint.mempool.Txs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Txs>
      PARSER = new com.google.protobuf.AbstractParser<Txs>() {
    @java.lang.Override
    public Txs parsePartialFrom(
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

  public static com.google.protobuf.Parser<Txs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Txs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.mempool.Txs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
