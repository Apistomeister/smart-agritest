package com.example.smartagritest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sensorservice.proto")
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.smartagritest.SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.TemperatureRequest,
      com.example.smartagritest.TemperatureResponse> getGetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTemperature",
      requestType = com.example.smartagritest.TemperatureRequest.class,
      responseType = com.example.smartagritest.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.TemperatureRequest,
      com.example.smartagritest.TemperatureResponse> getGetTemperatureMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.TemperatureRequest, com.example.smartagritest.TemperatureResponse> getGetTemperatureMethod;
    if ((getGetTemperatureMethod = SensorServiceGrpc.getGetTemperatureMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetTemperatureMethod = SensorServiceGrpc.getGetTemperatureMethod) == null) {
          SensorServiceGrpc.getGetTemperatureMethod = getGetTemperatureMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.TemperatureRequest, com.example.smartagritest.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.SensorService", "getTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("getTemperature"))
                  .build();
          }
        }
     }
     return getGetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.HumidityRequest,
      com.example.smartagritest.HumidityResponse> getGetHumidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHumidity",
      requestType = com.example.smartagritest.HumidityRequest.class,
      responseType = com.example.smartagritest.HumidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.HumidityRequest,
      com.example.smartagritest.HumidityResponse> getGetHumidityMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.HumidityRequest, com.example.smartagritest.HumidityResponse> getGetHumidityMethod;
    if ((getGetHumidityMethod = SensorServiceGrpc.getGetHumidityMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetHumidityMethod = SensorServiceGrpc.getGetHumidityMethod) == null) {
          SensorServiceGrpc.getGetHumidityMethod = getGetHumidityMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.HumidityRequest, com.example.smartagritest.HumidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.SensorService", "getHumidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.HumidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.HumidityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("getHumidity"))
                  .build();
          }
        }
     }
     return getGetHumidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.LightLevelRequest,
      com.example.smartagritest.LightLevelResponse> getGetLightLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLightLevel",
      requestType = com.example.smartagritest.LightLevelRequest.class,
      responseType = com.example.smartagritest.LightLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.LightLevelRequest,
      com.example.smartagritest.LightLevelResponse> getGetLightLevelMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.LightLevelRequest, com.example.smartagritest.LightLevelResponse> getGetLightLevelMethod;
    if ((getGetLightLevelMethod = SensorServiceGrpc.getGetLightLevelMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetLightLevelMethod = SensorServiceGrpc.getGetLightLevelMethod) == null) {
          SensorServiceGrpc.getGetLightLevelMethod = getGetLightLevelMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.LightLevelRequest, com.example.smartagritest.LightLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.SensorService", "getLightLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.LightLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.LightLevelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("getLightLevel"))
                  .build();
          }
        }
     }
     return getGetLightLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.SensorConfiguration,
      com.example.smartagritest.SensorConfigurationResponse> getSetSensorConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setSensorConfiguration",
      requestType = com.example.smartagritest.SensorConfiguration.class,
      responseType = com.example.smartagritest.SensorConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.SensorConfiguration,
      com.example.smartagritest.SensorConfigurationResponse> getSetSensorConfigurationMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.SensorConfiguration, com.example.smartagritest.SensorConfigurationResponse> getSetSensorConfigurationMethod;
    if ((getSetSensorConfigurationMethod = SensorServiceGrpc.getSetSensorConfigurationMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getSetSensorConfigurationMethod = SensorServiceGrpc.getSetSensorConfigurationMethod) == null) {
          SensorServiceGrpc.getSetSensorConfigurationMethod = getSetSensorConfigurationMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.SensorConfiguration, com.example.smartagritest.SensorConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.SensorService", "setSensorConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.SensorConfiguration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.SensorConfigurationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("setSensorConfiguration"))
                  .build();
          }
        }
     }
     return getSetSensorConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.AlertThreshold,
      com.example.smartagritest.AlertThresholdResponse> getSetAlertThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setAlertThreshold",
      requestType = com.example.smartagritest.AlertThreshold.class,
      responseType = com.example.smartagritest.AlertThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.AlertThreshold,
      com.example.smartagritest.AlertThresholdResponse> getSetAlertThresholdMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.AlertThreshold, com.example.smartagritest.AlertThresholdResponse> getSetAlertThresholdMethod;
    if ((getSetAlertThresholdMethod = SensorServiceGrpc.getSetAlertThresholdMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getSetAlertThresholdMethod = SensorServiceGrpc.getSetAlertThresholdMethod) == null) {
          SensorServiceGrpc.getSetAlertThresholdMethod = getSetAlertThresholdMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.AlertThreshold, com.example.smartagritest.AlertThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.SensorService", "setAlertThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.AlertThreshold.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.AlertThresholdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("setAlertThreshold"))
                  .build();
          }
        }
     }
     return getSetAlertThresholdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    return new SensorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SensorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SensorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the temperature reading from a sensor
     * </pre>
     */
    public void getTemperature(com.example.smartagritest.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the humidity reading from a sensor
     * </pre>
     */
    public void getHumidity(com.example.smartagritest.HumidityRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.HumidityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHumidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the light level reading from a sensor
     * </pre>
     */
    public void getLightLevel(com.example.smartagritest.LightLevelRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.LightLevelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLightLevelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the configuration for a sensor
     * </pre>
     */
    public void setSensorConfiguration(com.example.smartagritest.SensorConfiguration request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.SensorConfigurationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetSensorConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the alert threshold for a sensor
     * </pre>
     */
    public void setAlertThreshold(com.example.smartagritest.AlertThreshold request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.AlertThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAlertThresholdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.TemperatureRequest,
                com.example.smartagritest.TemperatureResponse>(
                  this, METHODID_GET_TEMPERATURE)))
          .addMethod(
            getGetHumidityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.HumidityRequest,
                com.example.smartagritest.HumidityResponse>(
                  this, METHODID_GET_HUMIDITY)))
          .addMethod(
            getGetLightLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.LightLevelRequest,
                com.example.smartagritest.LightLevelResponse>(
                  this, METHODID_GET_LIGHT_LEVEL)))
          .addMethod(
            getSetSensorConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.SensorConfiguration,
                com.example.smartagritest.SensorConfigurationResponse>(
                  this, METHODID_SET_SENSOR_CONFIGURATION)))
          .addMethod(
            getSetAlertThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.AlertThreshold,
                com.example.smartagritest.AlertThresholdResponse>(
                  this, METHODID_SET_ALERT_THRESHOLD)))
          .build();
    }
  }

  /**
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractStub<SensorServiceStub> {
    private SensorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the temperature reading from a sensor
     * </pre>
     */
    public void getTemperature(com.example.smartagritest.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.TemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the humidity reading from a sensor
     * </pre>
     */
    public void getHumidity(com.example.smartagritest.HumidityRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.HumidityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHumidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the light level reading from a sensor
     * </pre>
     */
    public void getLightLevel(com.example.smartagritest.LightLevelRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.LightLevelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLightLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the configuration for a sensor
     * </pre>
     */
    public void setSensorConfiguration(com.example.smartagritest.SensorConfiguration request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.SensorConfigurationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetSensorConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the alert threshold for a sensor
     * </pre>
     */
    public void setAlertThreshold(com.example.smartagritest.AlertThreshold request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.AlertThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the temperature reading from a sensor
     * </pre>
     */
    public com.example.smartagritest.TemperatureResponse getTemperature(com.example.smartagritest.TemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the humidity reading from a sensor
     * </pre>
     */
    public com.example.smartagritest.HumidityResponse getHumidity(com.example.smartagritest.HumidityRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHumidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the light level reading from a sensor
     * </pre>
     */
    public com.example.smartagritest.LightLevelResponse getLightLevel(com.example.smartagritest.LightLevelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLightLevelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the configuration for a sensor
     * </pre>
     */
    public com.example.smartagritest.SensorConfigurationResponse setSensorConfiguration(com.example.smartagritest.SensorConfiguration request) {
      return blockingUnaryCall(
          getChannel(), getSetSensorConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the alert threshold for a sensor
     * </pre>
     */
    public com.example.smartagritest.AlertThresholdResponse setAlertThreshold(com.example.smartagritest.AlertThreshold request) {
      return blockingUnaryCall(
          getChannel(), getSetAlertThresholdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the temperature reading from a sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.TemperatureResponse> getTemperature(
        com.example.smartagritest.TemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the humidity reading from a sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.HumidityResponse> getHumidity(
        com.example.smartagritest.HumidityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHumidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the light level reading from a sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.LightLevelResponse> getLightLevel(
        com.example.smartagritest.LightLevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLightLevelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the configuration for a sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.SensorConfigurationResponse> setSensorConfiguration(
        com.example.smartagritest.SensorConfiguration request) {
      return futureUnaryCall(
          getChannel().newCall(getSetSensorConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the alert threshold for a sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.AlertThresholdResponse> setAlertThreshold(
        com.example.smartagritest.AlertThreshold request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEMPERATURE = 0;
  private static final int METHODID_GET_HUMIDITY = 1;
  private static final int METHODID_GET_LIGHT_LEVEL = 2;
  private static final int METHODID_SET_SENSOR_CONFIGURATION = 3;
  private static final int METHODID_SET_ALERT_THRESHOLD = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEMPERATURE:
          serviceImpl.getTemperature((com.example.smartagritest.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.TemperatureResponse>) responseObserver);
          break;
        case METHODID_GET_HUMIDITY:
          serviceImpl.getHumidity((com.example.smartagritest.HumidityRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.HumidityResponse>) responseObserver);
          break;
        case METHODID_GET_LIGHT_LEVEL:
          serviceImpl.getLightLevel((com.example.smartagritest.LightLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.LightLevelResponse>) responseObserver);
          break;
        case METHODID_SET_SENSOR_CONFIGURATION:
          serviceImpl.setSensorConfiguration((com.example.smartagritest.SensorConfiguration) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.SensorConfigurationResponse>) responseObserver);
          break;
        case METHODID_SET_ALERT_THRESHOLD:
          serviceImpl.setAlertThreshold((com.example.smartagritest.AlertThreshold) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.AlertThresholdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.smartagritest.SensorServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorService");
    }
  }

  private static final class SensorServiceFileDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier {
    SensorServiceFileDescriptorSupplier() {}
  }

  private static final class SensorServiceMethodDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorServiceFileDescriptorSupplier())
              .addMethod(getGetTemperatureMethod())
              .addMethod(getGetHumidityMethod())
              .addMethod(getGetLightLevelMethod())
              .addMethod(getSetSensorConfigurationMethod())
              .addMethod(getSetAlertThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
