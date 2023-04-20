// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensorservice.proto

package com.example.smartagritest;

/**
 * Protobuf type {@code com.example.smartagritest.HumidityReading}
 */
public  final class HumidityReading extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.smartagritest.HumidityReading)
    HumidityReadingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HumidityReading.newBuilder() to construct.
  private HumidityReading(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HumidityReading() {
    humidity_ = 0D;
    timestamp_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HumidityReading(
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
          case 9: {

            humidity_ = input.readDouble();
            break;
          }
          case 16: {

            timestamp_ = input.readInt64();
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
    return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_HumidityReading_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_HumidityReading_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.smartagritest.HumidityReading.class, com.example.smartagritest.HumidityReading.Builder.class);
  }

  public static final int HUMIDITY_FIELD_NUMBER = 1;
  private double humidity_;
  /**
   * <code>double humidity = 1;</code>
   */
  public double getHumidity() {
    return humidity_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 2;</code>
   */
  public long getTimestamp() {
    return timestamp_;
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
    if (humidity_ != 0D) {
      output.writeDouble(1, humidity_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(2, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (humidity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, humidity_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestamp_);
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
    if (!(obj instanceof com.example.smartagritest.HumidityReading)) {
      return super.equals(obj);
    }
    com.example.smartagritest.HumidityReading other = (com.example.smartagritest.HumidityReading) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getHumidity())
        == java.lang.Double.doubleToLongBits(
            other.getHumidity()));
    result = result && (getTimestamp()
        == other.getTimestamp());
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
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHumidity()));
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.smartagritest.HumidityReading parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.smartagritest.HumidityReading parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.smartagritest.HumidityReading parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.smartagritest.HumidityReading parseFrom(
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
  public static Builder newBuilder(com.example.smartagritest.HumidityReading prototype) {
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
   * Protobuf type {@code com.example.smartagritest.HumidityReading}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.smartagritest.HumidityReading)
      com.example.smartagritest.HumidityReadingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_HumidityReading_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_HumidityReading_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.smartagritest.HumidityReading.class, com.example.smartagritest.HumidityReading.Builder.class);
    }

    // Construct using com.example.smartagritest.HumidityReading.newBuilder()
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
      humidity_ = 0D;

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.smartagritest.SensorServiceProto.internal_static_com_example_smartagritest_HumidityReading_descriptor;
    }

    @java.lang.Override
    public com.example.smartagritest.HumidityReading getDefaultInstanceForType() {
      return com.example.smartagritest.HumidityReading.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.smartagritest.HumidityReading build() {
      com.example.smartagritest.HumidityReading result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.smartagritest.HumidityReading buildPartial() {
      com.example.smartagritest.HumidityReading result = new com.example.smartagritest.HumidityReading(this);
      result.humidity_ = humidity_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof com.example.smartagritest.HumidityReading) {
        return mergeFrom((com.example.smartagritest.HumidityReading)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.smartagritest.HumidityReading other) {
      if (other == com.example.smartagritest.HumidityReading.getDefaultInstance()) return this;
      if (other.getHumidity() != 0D) {
        setHumidity(other.getHumidity());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      com.example.smartagritest.HumidityReading parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.smartagritest.HumidityReading) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double humidity_ ;
    /**
     * <code>double humidity = 1;</code>
     */
    public double getHumidity() {
      return humidity_;
    }
    /**
     * <code>double humidity = 1;</code>
     */
    public Builder setHumidity(double value) {
      
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double humidity = 1;</code>
     */
    public Builder clearHumidity() {
      
      humidity_ = 0D;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 2;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.example.smartagritest.HumidityReading)
  }

  // @@protoc_insertion_point(class_scope:com.example.smartagritest.HumidityReading)
  private static final com.example.smartagritest.HumidityReading DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.smartagritest.HumidityReading();
  }

  public static com.example.smartagritest.HumidityReading getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HumidityReading>
      PARSER = new com.google.protobuf.AbstractParser<HumidityReading>() {
    @java.lang.Override
    public HumidityReading parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HumidityReading(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HumidityReading> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HumidityReading> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.smartagritest.HumidityReading getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

