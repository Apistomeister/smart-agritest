// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensorservice.proto

package com.example.smartagritest;

/**
 * Protobuf type {@code com.example.smartagritest.LightLevelRequest}
 */
public  final class LightLevelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.smartagritest.LightLevelRequest)
    LightLevelRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightLevelRequest.newBuilder() to construct.
  private LightLevelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightLevelRequest() {
    sensorName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightLevelRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sensorName_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_LightLevelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_LightLevelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.smartagritest.LightLevelRequest.class, com.example.smartagritest.LightLevelRequest.Builder.class);
  }

  public static final int SENSOR_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object sensorName_;
  /**
   * <code>string sensor_name = 1;</code>
   */
  public java.lang.String getSensorName() {
    java.lang.Object ref = sensorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sensorName_ = s;
      return s;
    }
  }
  /**
   * <code>string sensor_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSensorNameBytes() {
    java.lang.Object ref = sensorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sensorName_ = b;
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
    if (!getSensorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sensorName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSensorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sensorName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.smartagritest.LightLevelRequest)) {
      return super.equals(obj);
    }
    com.example.smartagritest.LightLevelRequest other = (com.example.smartagritest.LightLevelRequest) obj;

    boolean result = true;
    result = result && getSensorName()
        .equals(other.getSensorName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SENSOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSensorName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.smartagritest.LightLevelRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.smartagritest.LightLevelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.smartagritest.LightLevelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.smartagritest.LightLevelRequest parseFrom(
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
  public static Builder newBuilder(com.example.smartagritest.LightLevelRequest prototype) {
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
   * Protobuf type {@code com.example.smartagritest.LightLevelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.smartagritest.LightLevelRequest)
      com.example.smartagritest.LightLevelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_LightLevelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_LightLevelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.smartagritest.LightLevelRequest.class, com.example.smartagritest.LightLevelRequest.Builder.class);
    }

    // Construct using com.example.smartagritest.LightLevelRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sensorName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_LightLevelRequest_descriptor;
    }

    @java.lang.Override
    public com.example.smartagritest.LightLevelRequest getDefaultInstanceForType() {
      return com.example.smartagritest.LightLevelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.smartagritest.LightLevelRequest build() {
      com.example.smartagritest.LightLevelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.smartagritest.LightLevelRequest buildPartial() {
      com.example.smartagritest.LightLevelRequest result = new com.example.smartagritest.LightLevelRequest(this);
      result.sensorName_ = sensorName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.smartagritest.LightLevelRequest) {
        return mergeFrom((com.example.smartagritest.LightLevelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.smartagritest.LightLevelRequest other) {
      if (other == com.example.smartagritest.LightLevelRequest.getDefaultInstance()) return this;
      if (!other.getSensorName().isEmpty()) {
        sensorName_ = other.sensorName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.example.smartagritest.LightLevelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.smartagritest.LightLevelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sensorName_ = "";
    /**
     * <code>string sensor_name = 1;</code>
     */
    public java.lang.String getSensorName() {
      java.lang.Object ref = sensorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sensorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sensor_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSensorNameBytes() {
      java.lang.Object ref = sensorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sensorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sensor_name = 1;</code>
     */
    public Builder setSensorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sensorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sensor_name = 1;</code>
     */
    public Builder clearSensorName() {
      
      sensorName_ = getDefaultInstance().getSensorName();
      onChanged();
      return this;
    }
    /**
     * <code>string sensor_name = 1;</code>
     */
    public Builder setSensorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sensorName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.smartagritest.LightLevelRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.smartagritest.LightLevelRequest)
  private static final com.example.smartagritest.LightLevelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.smartagritest.LightLevelRequest();
  }

  public static com.example.smartagritest.LightLevelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightLevelRequest>
      PARSER = new com.google.protobuf.AbstractParser<LightLevelRequest>() {
    @java.lang.Override
    public LightLevelRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightLevelRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightLevelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightLevelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.smartagritest.LightLevelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

