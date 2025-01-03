// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/consensus/wal.proto

package com.tendermint.consensus;

/**
 * <pre>
 * TimedWALMessage wraps WALMessage and adds Time for debugging purposes.
 * </pre>
 *
 * Protobuf type {@code tendermint.consensus.TimedWALMessage}
 */
public final class TimedWALMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.consensus.TimedWALMessage)
    TimedWALMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimedWALMessage.newBuilder() to construct.
  private TimedWALMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimedWALMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimedWALMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.consensus.WalProto.internal_static_tendermint_consensus_TimedWALMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.consensus.WalProto.internal_static_tendermint_consensus_TimedWALMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.consensus.TimedWALMessage.class, com.tendermint.consensus.TimedWALMessage.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp time_;
  /**
   * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The time.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }

  public static final int MSG_FIELD_NUMBER = 2;
  private com.tendermint.consensus.WALMessage msg_;
  /**
   * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
   * @return Whether the msg field is set.
   */
  @java.lang.Override
  public boolean hasMsg() {
    return msg_ != null;
  }
  /**
   * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
   * @return The msg.
   */
  @java.lang.Override
  public com.tendermint.consensus.WALMessage getMsg() {
    return msg_ == null ? com.tendermint.consensus.WALMessage.getDefaultInstance() : msg_;
  }
  /**
   * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
   */
  @java.lang.Override
  public com.tendermint.consensus.WALMessageOrBuilder getMsgOrBuilder() {
    return msg_ == null ? com.tendermint.consensus.WALMessage.getDefaultInstance() : msg_;
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
    if (time_ != null) {
      output.writeMessage(1, getTime());
    }
    if (msg_ != null) {
      output.writeMessage(2, getMsg());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTime());
    }
    if (msg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMsg());
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
    if (!(obj instanceof com.tendermint.consensus.TimedWALMessage)) {
      return super.equals(obj);
    }
    com.tendermint.consensus.TimedWALMessage other = (com.tendermint.consensus.TimedWALMessage) obj;

    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (hasMsg() != other.hasMsg()) return false;
    if (hasMsg()) {
      if (!getMsg()
          .equals(other.getMsg())) return false;
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
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    if (hasMsg()) {
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.consensus.TimedWALMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.TimedWALMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.consensus.TimedWALMessage parseFrom(
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
  public static Builder newBuilder(com.tendermint.consensus.TimedWALMessage prototype) {
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
   * TimedWALMessage wraps WALMessage and adds Time for debugging purposes.
   * </pre>
   *
   * Protobuf type {@code tendermint.consensus.TimedWALMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.consensus.TimedWALMessage)
      com.tendermint.consensus.TimedWALMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.consensus.WalProto.internal_static_tendermint_consensus_TimedWALMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.consensus.WalProto.internal_static_tendermint_consensus_TimedWALMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.consensus.TimedWALMessage.class, com.tendermint.consensus.TimedWALMessage.Builder.class);
    }

    // Construct using com.tendermint.consensus.TimedWALMessage.newBuilder()
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
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      msg_ = null;
      if (msgBuilder_ != null) {
        msgBuilder_.dispose();
        msgBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.consensus.WalProto.internal_static_tendermint_consensus_TimedWALMessage_descriptor;
    }

    @java.lang.Override
    public com.tendermint.consensus.TimedWALMessage getDefaultInstanceForType() {
      return com.tendermint.consensus.TimedWALMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.consensus.TimedWALMessage build() {
      com.tendermint.consensus.TimedWALMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.consensus.TimedWALMessage buildPartial() {
      com.tendermint.consensus.TimedWALMessage result = new com.tendermint.consensus.TimedWALMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.consensus.TimedWALMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.time_ = timeBuilder_ == null
            ? time_
            : timeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.msg_ = msgBuilder_ == null
            ? msg_
            : msgBuilder_.build();
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
      if (other instanceof com.tendermint.consensus.TimedWALMessage) {
        return mergeFrom((com.tendermint.consensus.TimedWALMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.consensus.TimedWALMessage other) {
      if (other == com.tendermint.consensus.TimedWALMessage.getDefaultInstance()) return this;
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      if (other.hasMsg()) {
        mergeMsg(other.getMsg());
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
                  getTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMsgFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The time.
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
      } else {
        timeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          time_ != null &&
          time_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeBuilder().mergeFrom(value);
        } else {
          time_ = value;
        }
      } else {
        timeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 1 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    private com.tendermint.consensus.WALMessage msg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.consensus.WALMessage, com.tendermint.consensus.WALMessage.Builder, com.tendermint.consensus.WALMessageOrBuilder> msgBuilder_;
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     * @return Whether the msg field is set.
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     * @return The msg.
     */
    public com.tendermint.consensus.WALMessage getMsg() {
      if (msgBuilder_ == null) {
        return msg_ == null ? com.tendermint.consensus.WALMessage.getDefaultInstance() : msg_;
      } else {
        return msgBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    public Builder setMsg(com.tendermint.consensus.WALMessage value) {
      if (msgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
      } else {
        msgBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    public Builder setMsg(
        com.tendermint.consensus.WALMessage.Builder builderForValue) {
      if (msgBuilder_ == null) {
        msg_ = builderForValue.build();
      } else {
        msgBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    public Builder mergeMsg(com.tendermint.consensus.WALMessage value) {
      if (msgBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          msg_ != null &&
          msg_ != com.tendermint.consensus.WALMessage.getDefaultInstance()) {
          getMsgBuilder().mergeFrom(value);
        } else {
          msg_ = value;
        }
      } else {
        msgBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    public Builder clearMsg() {
      bitField0_ = (bitField0_ & ~0x00000002);
      msg_ = null;
      if (msgBuilder_ != null) {
        msgBuilder_.dispose();
        msgBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    public com.tendermint.consensus.WALMessage.Builder getMsgBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMsgFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    public com.tendermint.consensus.WALMessageOrBuilder getMsgOrBuilder() {
      if (msgBuilder_ != null) {
        return msgBuilder_.getMessageOrBuilder();
      } else {
        return msg_ == null ?
            com.tendermint.consensus.WALMessage.getDefaultInstance() : msg_;
      }
    }
    /**
     * <code>.tendermint.consensus.WALMessage msg = 2 [json_name = "msg"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.consensus.WALMessage, com.tendermint.consensus.WALMessage.Builder, com.tendermint.consensus.WALMessageOrBuilder> 
        getMsgFieldBuilder() {
      if (msgBuilder_ == null) {
        msgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.consensus.WALMessage, com.tendermint.consensus.WALMessage.Builder, com.tendermint.consensus.WALMessageOrBuilder>(
                getMsg(),
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      return msgBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.consensus.TimedWALMessage)
  }

  // @@protoc_insertion_point(class_scope:tendermint.consensus.TimedWALMessage)
  private static final com.tendermint.consensus.TimedWALMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.consensus.TimedWALMessage();
  }

  public static com.tendermint.consensus.TimedWALMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimedWALMessage>
      PARSER = new com.google.protobuf.AbstractParser<TimedWALMessage>() {
    @java.lang.Override
    public TimedWALMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimedWALMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimedWALMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.consensus.TimedWALMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

