// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package com.ibc.core.connection.v1;

/**
 * <pre>
 * MsgConnectionOpenInit defines the msg sent by an account on Chain A to
 * initialize a connection with Chain B.
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.MsgConnectionOpenInit}
 */
public final class MsgConnectionOpenInit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.MsgConnectionOpenInit)
    MsgConnectionOpenInitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgConnectionOpenInit.newBuilder() to construct.
  private MsgConnectionOpenInit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgConnectionOpenInit() {
    clientId_ = "";
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgConnectionOpenInit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.connection.v1.TxProto.internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.connection.v1.TxProto.internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.connection.v1.MsgConnectionOpenInit.class, com.ibc.core.connection.v1.MsgConnectionOpenInit.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
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

  public static final int COUNTERPARTY_FIELD_NUMBER = 2;
  private com.ibc.core.connection.v1.Counterparty counterparty_;
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return Whether the counterparty field is set.
   */
  @java.lang.Override
  public boolean hasCounterparty() {
    return counterparty_ != null;
  }
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return The counterparty.
   */
  @java.lang.Override
  public com.ibc.core.connection.v1.Counterparty getCounterparty() {
    return counterparty_ == null ? com.ibc.core.connection.v1.Counterparty.getDefaultInstance() : counterparty_;
  }
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.core.connection.v1.CounterpartyOrBuilder getCounterpartyOrBuilder() {
    return counterparty_ == null ? com.ibc.core.connection.v1.Counterparty.getDefaultInstance() : counterparty_;
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private com.ibc.core.connection.v1.Version version_;
  /**
   * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  @java.lang.Override
  public com.ibc.core.connection.v1.Version getVersion() {
    return version_ == null ? com.ibc.core.connection.v1.Version.getDefaultInstance() : version_;
  }
  /**
   * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
   */
  @java.lang.Override
  public com.ibc.core.connection.v1.VersionOrBuilder getVersionOrBuilder() {
    return version_ == null ? com.ibc.core.connection.v1.Version.getDefaultInstance() : version_;
  }

  public static final int DELAY_PERIOD_FIELD_NUMBER = 4;
  private long delayPeriod_ = 0L;
  /**
   * <code>uint64 delay_period = 4 [json_name = "delayPeriod", (.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
   * @return The delayPeriod.
   */
  @java.lang.Override
  public long getDelayPeriod() {
    return delayPeriod_;
  }

  public static final int SIGNER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <code>string signer = 5 [json_name = "signer"];</code>
   * @return The signer.
   */
  @java.lang.Override
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <code>string signer = 5 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (counterparty_ != null) {
      output.writeMessage(2, getCounterparty());
    }
    if (version_ != null) {
      output.writeMessage(3, getVersion());
    }
    if (delayPeriod_ != 0L) {
      output.writeUInt64(4, delayPeriod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, signer_);
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
    if (counterparty_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCounterparty());
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVersion());
    }
    if (delayPeriod_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, delayPeriod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, signer_);
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
    if (!(obj instanceof com.ibc.core.connection.v1.MsgConnectionOpenInit)) {
      return super.equals(obj);
    }
    com.ibc.core.connection.v1.MsgConnectionOpenInit other = (com.ibc.core.connection.v1.MsgConnectionOpenInit) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (hasCounterparty() != other.hasCounterparty()) return false;
    if (hasCounterparty()) {
      if (!getCounterparty()
          .equals(other.getCounterparty())) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (getDelayPeriod()
        != other.getDelayPeriod()) return false;
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    if (hasCounterparty()) {
      hash = (37 * hash) + COUNTERPARTY_FIELD_NUMBER;
      hash = (53 * hash) + getCounterparty().hashCode();
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (37 * hash) + DELAY_PERIOD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDelayPeriod());
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.connection.v1.MsgConnectionOpenInit parseFrom(
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
  public static Builder newBuilder(com.ibc.core.connection.v1.MsgConnectionOpenInit prototype) {
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
   * MsgConnectionOpenInit defines the msg sent by an account on Chain A to
   * initialize a connection with Chain B.
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.MsgConnectionOpenInit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.MsgConnectionOpenInit)
      com.ibc.core.connection.v1.MsgConnectionOpenInitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.connection.v1.TxProto.internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.connection.v1.TxProto.internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.connection.v1.MsgConnectionOpenInit.class, com.ibc.core.connection.v1.MsgConnectionOpenInit.Builder.class);
    }

    // Construct using com.ibc.core.connection.v1.MsgConnectionOpenInit.newBuilder()
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
      counterparty_ = null;
      if (counterpartyBuilder_ != null) {
        counterpartyBuilder_.dispose();
        counterpartyBuilder_ = null;
      }
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      delayPeriod_ = 0L;
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.connection.v1.TxProto.internal_static_ibc_core_connection_v1_MsgConnectionOpenInit_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.connection.v1.MsgConnectionOpenInit getDefaultInstanceForType() {
      return com.ibc.core.connection.v1.MsgConnectionOpenInit.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.connection.v1.MsgConnectionOpenInit build() {
      com.ibc.core.connection.v1.MsgConnectionOpenInit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.connection.v1.MsgConnectionOpenInit buildPartial() {
      com.ibc.core.connection.v1.MsgConnectionOpenInit result = new com.ibc.core.connection.v1.MsgConnectionOpenInit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.connection.v1.MsgConnectionOpenInit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.counterparty_ = counterpartyBuilder_ == null
            ? counterparty_
            : counterpartyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = versionBuilder_ == null
            ? version_
            : versionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.delayPeriod_ = delayPeriod_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.signer_ = signer_;
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
      if (other instanceof com.ibc.core.connection.v1.MsgConnectionOpenInit) {
        return mergeFrom((com.ibc.core.connection.v1.MsgConnectionOpenInit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.connection.v1.MsgConnectionOpenInit other) {
      if (other == com.ibc.core.connection.v1.MsgConnectionOpenInit.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCounterparty()) {
        mergeCounterparty(other.getCounterparty());
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.getDelayPeriod() != 0L) {
        setDelayPeriod(other.getDelayPeriod());
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
        bitField0_ |= 0x00000010;
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
              input.readMessage(
                  getCounterpartyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getVersionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              delayPeriod_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              signer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private com.ibc.core.connection.v1.Counterparty counterparty_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.connection.v1.Counterparty, com.ibc.core.connection.v1.Counterparty.Builder, com.ibc.core.connection.v1.CounterpartyOrBuilder> counterpartyBuilder_;
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     * @return Whether the counterparty field is set.
     */
    public boolean hasCounterparty() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     * @return The counterparty.
     */
    public com.ibc.core.connection.v1.Counterparty getCounterparty() {
      if (counterpartyBuilder_ == null) {
        return counterparty_ == null ? com.ibc.core.connection.v1.Counterparty.getDefaultInstance() : counterparty_;
      } else {
        return counterpartyBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCounterparty(com.ibc.core.connection.v1.Counterparty value) {
      if (counterpartyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        counterparty_ = value;
      } else {
        counterpartyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCounterparty(
        com.ibc.core.connection.v1.Counterparty.Builder builderForValue) {
      if (counterpartyBuilder_ == null) {
        counterparty_ = builderForValue.build();
      } else {
        counterpartyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeCounterparty(com.ibc.core.connection.v1.Counterparty value) {
      if (counterpartyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          counterparty_ != null &&
          counterparty_ != com.ibc.core.connection.v1.Counterparty.getDefaultInstance()) {
          getCounterpartyBuilder().mergeFrom(value);
        } else {
          counterparty_ = value;
        }
      } else {
        counterpartyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearCounterparty() {
      bitField0_ = (bitField0_ & ~0x00000002);
      counterparty_ = null;
      if (counterpartyBuilder_ != null) {
        counterpartyBuilder_.dispose();
        counterpartyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.connection.v1.Counterparty.Builder getCounterpartyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCounterpartyFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.connection.v1.CounterpartyOrBuilder getCounterpartyOrBuilder() {
      if (counterpartyBuilder_ != null) {
        return counterpartyBuilder_.getMessageOrBuilder();
      } else {
        return counterparty_ == null ?
            com.ibc.core.connection.v1.Counterparty.getDefaultInstance() : counterparty_;
      }
    }
    /**
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.connection.v1.Counterparty, com.ibc.core.connection.v1.Counterparty.Builder, com.ibc.core.connection.v1.CounterpartyOrBuilder> 
        getCounterpartyFieldBuilder() {
      if (counterpartyBuilder_ == null) {
        counterpartyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.connection.v1.Counterparty, com.ibc.core.connection.v1.Counterparty.Builder, com.ibc.core.connection.v1.CounterpartyOrBuilder>(
                getCounterparty(),
                getParentForChildren(),
                isClean());
        counterparty_ = null;
      }
      return counterpartyBuilder_;
    }

    private com.ibc.core.connection.v1.Version version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.connection.v1.Version, com.ibc.core.connection.v1.Version.Builder, com.ibc.core.connection.v1.VersionOrBuilder> versionBuilder_;
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     * @return The version.
     */
    public com.ibc.core.connection.v1.Version getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? com.ibc.core.connection.v1.Version.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    public Builder setVersion(com.ibc.core.connection.v1.Version value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    public Builder setVersion(
        com.ibc.core.connection.v1.Version.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    public Builder mergeVersion(com.ibc.core.connection.v1.Version value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          version_ != null &&
          version_ != com.ibc.core.connection.v1.Version.getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    public com.ibc.core.connection.v1.Version.Builder getVersionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    public com.ibc.core.connection.v1.VersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            com.ibc.core.connection.v1.Version.getDefaultInstance() : version_;
      }
    }
    /**
     * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.connection.v1.Version, com.ibc.core.connection.v1.Version.Builder, com.ibc.core.connection.v1.VersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.connection.v1.Version, com.ibc.core.connection.v1.Version.Builder, com.ibc.core.connection.v1.VersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private long delayPeriod_ ;
    /**
     * <code>uint64 delay_period = 4 [json_name = "delayPeriod", (.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
     * @return The delayPeriod.
     */
    @java.lang.Override
    public long getDelayPeriod() {
      return delayPeriod_;
    }
    /**
     * <code>uint64 delay_period = 4 [json_name = "delayPeriod", (.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
     * @param value The delayPeriod to set.
     * @return This builder for chaining.
     */
    public Builder setDelayPeriod(long value) {

      delayPeriod_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 delay_period = 4 [json_name = "delayPeriod", (.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelayPeriod() {
      bitField0_ = (bitField0_ & ~0x00000008);
      delayPeriod_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object signer_ = "";
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @return The signer.
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @return The bytes for signer.
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      signer_ = getDefaultInstance().getSigner();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signer_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.MsgConnectionOpenInit)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.MsgConnectionOpenInit)
  private static final com.ibc.core.connection.v1.MsgConnectionOpenInit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.connection.v1.MsgConnectionOpenInit();
  }

  public static com.ibc.core.connection.v1.MsgConnectionOpenInit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgConnectionOpenInit>
      PARSER = new com.google.protobuf.AbstractParser<MsgConnectionOpenInit>() {
    @java.lang.Override
    public MsgConnectionOpenInit parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgConnectionOpenInit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgConnectionOpenInit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.connection.v1.MsgConnectionOpenInit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

