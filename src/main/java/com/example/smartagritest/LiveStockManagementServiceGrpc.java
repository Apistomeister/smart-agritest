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
    comments = "Source: livestockmanagement.proto")
public final class LiveStockManagementServiceGrpc {

  private LiveStockManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.smartagritest.LiveStockManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.AddLiveStockRequest,
      com.example.smartagritest.AddLiveStockResponse> getAddLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addLivestock",
      requestType = com.example.smartagritest.AddLiveStockRequest.class,
      responseType = com.example.smartagritest.AddLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.AddLiveStockRequest,
      com.example.smartagritest.AddLiveStockResponse> getAddLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.AddLiveStockRequest, com.example.smartagritest.AddLiveStockResponse> getAddLivestockMethod;
    if ((getAddLivestockMethod = LiveStockManagementServiceGrpc.getAddLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getAddLivestockMethod = LiveStockManagementServiceGrpc.getAddLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getAddLivestockMethod = getAddLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.AddLiveStockRequest, com.example.smartagritest.AddLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "addLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.AddLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.AddLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("addLivestock"))
                  .build();
          }
        }
     }
     return getAddLivestockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.RemoveLiveStockRequest,
      com.example.smartagritest.RemoveLiveStockResponse> getRemoveLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeLivestock",
      requestType = com.example.smartagritest.RemoveLiveStockRequest.class,
      responseType = com.example.smartagritest.RemoveLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.RemoveLiveStockRequest,
      com.example.smartagritest.RemoveLiveStockResponse> getRemoveLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.RemoveLiveStockRequest, com.example.smartagritest.RemoveLiveStockResponse> getRemoveLivestockMethod;
    if ((getRemoveLivestockMethod = LiveStockManagementServiceGrpc.getRemoveLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getRemoveLivestockMethod = LiveStockManagementServiceGrpc.getRemoveLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getRemoveLivestockMethod = getRemoveLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.RemoveLiveStockRequest, com.example.smartagritest.RemoveLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "removeLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.RemoveLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.RemoveLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("removeLivestock"))
                  .build();
          }
        }
     }
     return getRemoveLivestockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.UpdateLiveStockRequest,
      com.example.smartagritest.UpdateLiveStockResponse> getUpdateLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLivestock",
      requestType = com.example.smartagritest.UpdateLiveStockRequest.class,
      responseType = com.example.smartagritest.UpdateLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.UpdateLiveStockRequest,
      com.example.smartagritest.UpdateLiveStockResponse> getUpdateLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.UpdateLiveStockRequest, com.example.smartagritest.UpdateLiveStockResponse> getUpdateLivestockMethod;
    if ((getUpdateLivestockMethod = LiveStockManagementServiceGrpc.getUpdateLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getUpdateLivestockMethod = LiveStockManagementServiceGrpc.getUpdateLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getUpdateLivestockMethod = getUpdateLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.UpdateLiveStockRequest, com.example.smartagritest.UpdateLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "updateLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.UpdateLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.UpdateLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("updateLivestock"))
                  .build();
          }
        }
     }
     return getUpdateLivestockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.GetLiveStockRequest,
      com.example.smartagritest.GetLiveStockResponse> getGetLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLivestock",
      requestType = com.example.smartagritest.GetLiveStockRequest.class,
      responseType = com.example.smartagritest.GetLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.GetLiveStockRequest,
      com.example.smartagritest.GetLiveStockResponse> getGetLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.GetLiveStockRequest, com.example.smartagritest.GetLiveStockResponse> getGetLivestockMethod;
    if ((getGetLivestockMethod = LiveStockManagementServiceGrpc.getGetLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getGetLivestockMethod = LiveStockManagementServiceGrpc.getGetLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getGetLivestockMethod = getGetLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.GetLiveStockRequest, com.example.smartagritest.GetLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "getLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.GetLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.GetLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("getLivestock"))
                  .build();
          }
        }
     }
     return getGetLivestockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.FeedLiveStockRequest,
      com.example.smartagritest.FeedLiveStockResponse> getFeedLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedLivestock",
      requestType = com.example.smartagritest.FeedLiveStockRequest.class,
      responseType = com.example.smartagritest.FeedLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.FeedLiveStockRequest,
      com.example.smartagritest.FeedLiveStockResponse> getFeedLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.FeedLiveStockRequest, com.example.smartagritest.FeedLiveStockResponse> getFeedLivestockMethod;
    if ((getFeedLivestockMethod = LiveStockManagementServiceGrpc.getFeedLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getFeedLivestockMethod = LiveStockManagementServiceGrpc.getFeedLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getFeedLivestockMethod = getFeedLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.FeedLiveStockRequest, com.example.smartagritest.FeedLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "feedLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.FeedLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.FeedLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("feedLivestock"))
                  .build();
          }
        }
     }
     return getFeedLivestockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.WaterLiveStockRequest,
      com.example.smartagritest.WaterLiveStockResponse> getWaterLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "waterLivestock",
      requestType = com.example.smartagritest.WaterLiveStockRequest.class,
      responseType = com.example.smartagritest.WaterLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.WaterLiveStockRequest,
      com.example.smartagritest.WaterLiveStockResponse> getWaterLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.WaterLiveStockRequest, com.example.smartagritest.WaterLiveStockResponse> getWaterLivestockMethod;
    if ((getWaterLivestockMethod = LiveStockManagementServiceGrpc.getWaterLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getWaterLivestockMethod = LiveStockManagementServiceGrpc.getWaterLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getWaterLivestockMethod = getWaterLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.WaterLiveStockRequest, com.example.smartagritest.WaterLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "waterLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.WaterLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.WaterLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("waterLivestock"))
                  .build();
          }
        }
     }
     return getWaterLivestockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.VaccinateLiveStockRequest,
      com.example.smartagritest.VaccinateLiveStockResponse> getVaccinateLivestockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vaccinateLivestock",
      requestType = com.example.smartagritest.VaccinateLiveStockRequest.class,
      responseType = com.example.smartagritest.VaccinateLiveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.VaccinateLiveStockRequest,
      com.example.smartagritest.VaccinateLiveStockResponse> getVaccinateLivestockMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.VaccinateLiveStockRequest, com.example.smartagritest.VaccinateLiveStockResponse> getVaccinateLivestockMethod;
    if ((getVaccinateLivestockMethod = LiveStockManagementServiceGrpc.getVaccinateLivestockMethod) == null) {
      synchronized (LiveStockManagementServiceGrpc.class) {
        if ((getVaccinateLivestockMethod = LiveStockManagementServiceGrpc.getVaccinateLivestockMethod) == null) {
          LiveStockManagementServiceGrpc.getVaccinateLivestockMethod = getVaccinateLivestockMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.VaccinateLiveStockRequest, com.example.smartagritest.VaccinateLiveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.LiveStockManagementService", "vaccinateLivestock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.VaccinateLiveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.VaccinateLiveStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LiveStockManagementServiceMethodDescriptorSupplier("vaccinateLivestock"))
                  .build();
          }
        }
     }
     return getVaccinateLivestockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LiveStockManagementServiceStub newStub(io.grpc.Channel channel) {
    return new LiveStockManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LiveStockManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LiveStockManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LiveStockManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LiveStockManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LiveStockManagementServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Add a new livestock to the system
     * </pre>
     */
    public void addLivestock(com.example.smartagritest.AddLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.AddLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLivestockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove an existing livestock from the system
     * </pre>
     */
    public void removeLivestock(com.example.smartagritest.RemoveLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.RemoveLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveLivestockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing livestock in the system
     * </pre>
     */
    public void updateLivestock(com.example.smartagritest.UpdateLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.UpdateLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLivestockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get information about a specific livestock in the system
     * </pre>
     */
    public void getLivestock(com.example.smartagritest.GetLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.GetLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLivestockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Feed a specific livestock in the system
     * </pre>
     */
    public void feedLivestock(com.example.smartagritest.FeedLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.FeedLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeedLivestockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Water a specific livestock in the system
     * </pre>
     */
    public void waterLivestock(com.example.smartagritest.WaterLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.WaterLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWaterLivestockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vaccinate a specific livestock in the system
     * </pre>
     */
    public void vaccinateLivestock(com.example.smartagritest.VaccinateLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.VaccinateLiveStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVaccinateLivestockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.AddLiveStockRequest,
                com.example.smartagritest.AddLiveStockResponse>(
                  this, METHODID_ADD_LIVESTOCK)))
          .addMethod(
            getRemoveLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.RemoveLiveStockRequest,
                com.example.smartagritest.RemoveLiveStockResponse>(
                  this, METHODID_REMOVE_LIVESTOCK)))
          .addMethod(
            getUpdateLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.UpdateLiveStockRequest,
                com.example.smartagritest.UpdateLiveStockResponse>(
                  this, METHODID_UPDATE_LIVESTOCK)))
          .addMethod(
            getGetLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.GetLiveStockRequest,
                com.example.smartagritest.GetLiveStockResponse>(
                  this, METHODID_GET_LIVESTOCK)))
          .addMethod(
            getFeedLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.FeedLiveStockRequest,
                com.example.smartagritest.FeedLiveStockResponse>(
                  this, METHODID_FEED_LIVESTOCK)))
          .addMethod(
            getWaterLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.WaterLiveStockRequest,
                com.example.smartagritest.WaterLiveStockResponse>(
                  this, METHODID_WATER_LIVESTOCK)))
          .addMethod(
            getVaccinateLivestockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.VaccinateLiveStockRequest,
                com.example.smartagritest.VaccinateLiveStockResponse>(
                  this, METHODID_VACCINATE_LIVESTOCK)))
          .build();
    }
  }

  /**
   */
  public static final class LiveStockManagementServiceStub extends io.grpc.stub.AbstractStub<LiveStockManagementServiceStub> {
    private LiveStockManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LiveStockManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveStockManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LiveStockManagementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new livestock to the system
     * </pre>
     */
    public void addLivestock(com.example.smartagritest.AddLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.AddLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLivestockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove an existing livestock from the system
     * </pre>
     */
    public void removeLivestock(com.example.smartagritest.RemoveLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.RemoveLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveLivestockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing livestock in the system
     * </pre>
     */
    public void updateLivestock(com.example.smartagritest.UpdateLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.UpdateLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLivestockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get information about a specific livestock in the system
     * </pre>
     */
    public void getLivestock(com.example.smartagritest.GetLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.GetLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLivestockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Feed a specific livestock in the system
     * </pre>
     */
    public void feedLivestock(com.example.smartagritest.FeedLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.FeedLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeedLivestockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Water a specific livestock in the system
     * </pre>
     */
    public void waterLivestock(com.example.smartagritest.WaterLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.WaterLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWaterLivestockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vaccinate a specific livestock in the system
     * </pre>
     */
    public void vaccinateLivestock(com.example.smartagritest.VaccinateLiveStockRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.VaccinateLiveStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVaccinateLivestockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LiveStockManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<LiveStockManagementServiceBlockingStub> {
    private LiveStockManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LiveStockManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveStockManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LiveStockManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new livestock to the system
     * </pre>
     */
    public com.example.smartagritest.AddLiveStockResponse addLivestock(com.example.smartagritest.AddLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLivestockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove an existing livestock from the system
     * </pre>
     */
    public com.example.smartagritest.RemoveLiveStockResponse removeLivestock(com.example.smartagritest.RemoveLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveLivestockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing livestock in the system
     * </pre>
     */
    public com.example.smartagritest.UpdateLiveStockResponse updateLivestock(com.example.smartagritest.UpdateLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLivestockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get information about a specific livestock in the system
     * </pre>
     */
    public com.example.smartagritest.GetLiveStockResponse getLivestock(com.example.smartagritest.GetLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLivestockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Feed a specific livestock in the system
     * </pre>
     */
    public com.example.smartagritest.FeedLiveStockResponse feedLivestock(com.example.smartagritest.FeedLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeedLivestockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Water a specific livestock in the system
     * </pre>
     */
    public com.example.smartagritest.WaterLiveStockResponse waterLivestock(com.example.smartagritest.WaterLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getWaterLivestockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vaccinate a specific livestock in the system
     * </pre>
     */
    public com.example.smartagritest.VaccinateLiveStockResponse vaccinateLivestock(com.example.smartagritest.VaccinateLiveStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getVaccinateLivestockMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LiveStockManagementServiceFutureStub extends io.grpc.stub.AbstractStub<LiveStockManagementServiceFutureStub> {
    private LiveStockManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LiveStockManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveStockManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LiveStockManagementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new livestock to the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.AddLiveStockResponse> addLivestock(
        com.example.smartagritest.AddLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLivestockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove an existing livestock from the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.RemoveLiveStockResponse> removeLivestock(
        com.example.smartagritest.RemoveLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveLivestockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing livestock in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.UpdateLiveStockResponse> updateLivestock(
        com.example.smartagritest.UpdateLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLivestockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get information about a specific livestock in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.GetLiveStockResponse> getLivestock(
        com.example.smartagritest.GetLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLivestockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Feed a specific livestock in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.FeedLiveStockResponse> feedLivestock(
        com.example.smartagritest.FeedLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeedLivestockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Water a specific livestock in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.WaterLiveStockResponse> waterLivestock(
        com.example.smartagritest.WaterLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWaterLivestockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vaccinate a specific livestock in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.VaccinateLiveStockResponse> vaccinateLivestock(
        com.example.smartagritest.VaccinateLiveStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVaccinateLivestockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_LIVESTOCK = 0;
  private static final int METHODID_REMOVE_LIVESTOCK = 1;
  private static final int METHODID_UPDATE_LIVESTOCK = 2;
  private static final int METHODID_GET_LIVESTOCK = 3;
  private static final int METHODID_FEED_LIVESTOCK = 4;
  private static final int METHODID_WATER_LIVESTOCK = 5;
  private static final int METHODID_VACCINATE_LIVESTOCK = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LiveStockManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LiveStockManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_LIVESTOCK:
          serviceImpl.addLivestock((com.example.smartagritest.AddLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.AddLiveStockResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LIVESTOCK:
          serviceImpl.removeLivestock((com.example.smartagritest.RemoveLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.RemoveLiveStockResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LIVESTOCK:
          serviceImpl.updateLivestock((com.example.smartagritest.UpdateLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.UpdateLiveStockResponse>) responseObserver);
          break;
        case METHODID_GET_LIVESTOCK:
          serviceImpl.getLivestock((com.example.smartagritest.GetLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.GetLiveStockResponse>) responseObserver);
          break;
        case METHODID_FEED_LIVESTOCK:
          serviceImpl.feedLivestock((com.example.smartagritest.FeedLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.FeedLiveStockResponse>) responseObserver);
          break;
        case METHODID_WATER_LIVESTOCK:
          serviceImpl.waterLivestock((com.example.smartagritest.WaterLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.WaterLiveStockResponse>) responseObserver);
          break;
        case METHODID_VACCINATE_LIVESTOCK:
          serviceImpl.vaccinateLivestock((com.example.smartagritest.VaccinateLiveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.VaccinateLiveStockResponse>) responseObserver);
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

  private static abstract class LiveStockManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LiveStockManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.smartagritest.LiveStockManagementProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LiveStockManagementService");
    }
  }

  private static final class LiveStockManagementServiceFileDescriptorSupplier
      extends LiveStockManagementServiceBaseDescriptorSupplier {
    LiveStockManagementServiceFileDescriptorSupplier() {}
  }

  private static final class LiveStockManagementServiceMethodDescriptorSupplier
      extends LiveStockManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LiveStockManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LiveStockManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LiveStockManagementServiceFileDescriptorSupplier())
              .addMethod(getAddLivestockMethod())
              .addMethod(getRemoveLivestockMethod())
              .addMethod(getUpdateLivestockMethod())
              .addMethod(getGetLivestockMethod())
              .addMethod(getFeedLivestockMethod())
              .addMethod(getWaterLivestockMethod())
              .addMethod(getVaccinateLivestockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
