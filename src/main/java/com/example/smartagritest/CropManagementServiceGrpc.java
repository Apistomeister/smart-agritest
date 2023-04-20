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
    comments = "Source: cropmanagementservice.proto")
public final class CropManagementServiceGrpc {

  private CropManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.smartagritest.CropManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.AddCropRequest,
      com.example.smartagritest.AddCropResponse> getAddCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCrop",
      requestType = com.example.smartagritest.AddCropRequest.class,
      responseType = com.example.smartagritest.AddCropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.AddCropRequest,
      com.example.smartagritest.AddCropResponse> getAddCropMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.AddCropRequest, com.example.smartagritest.AddCropResponse> getAddCropMethod;
    if ((getAddCropMethod = CropManagementServiceGrpc.getAddCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getAddCropMethod = CropManagementServiceGrpc.getAddCropMethod) == null) {
          CropManagementServiceGrpc.getAddCropMethod = getAddCropMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.AddCropRequest, com.example.smartagritest.AddCropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "addCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.AddCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.AddCropResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("addCrop"))
                  .build();
          }
        }
     }
     return getAddCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.RemoveCropRequest,
      com.example.smartagritest.RemoveCropResponse> getRemoveCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeCrop",
      requestType = com.example.smartagritest.RemoveCropRequest.class,
      responseType = com.example.smartagritest.RemoveCropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.RemoveCropRequest,
      com.example.smartagritest.RemoveCropResponse> getRemoveCropMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.RemoveCropRequest, com.example.smartagritest.RemoveCropResponse> getRemoveCropMethod;
    if ((getRemoveCropMethod = CropManagementServiceGrpc.getRemoveCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getRemoveCropMethod = CropManagementServiceGrpc.getRemoveCropMethod) == null) {
          CropManagementServiceGrpc.getRemoveCropMethod = getRemoveCropMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.RemoveCropRequest, com.example.smartagritest.RemoveCropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "removeCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.RemoveCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.RemoveCropResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("removeCrop"))
                  .build();
          }
        }
     }
     return getRemoveCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.UpdateCropRequest,
      com.example.smartagritest.UpdateCropResponse> getUpdateCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCrop",
      requestType = com.example.smartagritest.UpdateCropRequest.class,
      responseType = com.example.smartagritest.UpdateCropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.UpdateCropRequest,
      com.example.smartagritest.UpdateCropResponse> getUpdateCropMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.UpdateCropRequest, com.example.smartagritest.UpdateCropResponse> getUpdateCropMethod;
    if ((getUpdateCropMethod = CropManagementServiceGrpc.getUpdateCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getUpdateCropMethod = CropManagementServiceGrpc.getUpdateCropMethod) == null) {
          CropManagementServiceGrpc.getUpdateCropMethod = getUpdateCropMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.UpdateCropRequest, com.example.smartagritest.UpdateCropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "updateCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.UpdateCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.UpdateCropResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("updateCrop"))
                  .build();
          }
        }
     }
     return getUpdateCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.CropInfoRequest,
      com.example.smartagritest.CropInfoResponse> getGetCropInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCropInfo",
      requestType = com.example.smartagritest.CropInfoRequest.class,
      responseType = com.example.smartagritest.CropInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.CropInfoRequest,
      com.example.smartagritest.CropInfoResponse> getGetCropInfoMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.CropInfoRequest, com.example.smartagritest.CropInfoResponse> getGetCropInfoMethod;
    if ((getGetCropInfoMethod = CropManagementServiceGrpc.getGetCropInfoMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getGetCropInfoMethod = CropManagementServiceGrpc.getGetCropInfoMethod) == null) {
          CropManagementServiceGrpc.getGetCropInfoMethod = getGetCropInfoMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.CropInfoRequest, com.example.smartagritest.CropInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "getCropInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.CropInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.CropInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("getCropInfo"))
                  .build();
          }
        }
     }
     return getGetCropInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.PlantCropRequest,
      com.example.smartagritest.PlantCropResponse> getPlantCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "plantCrop",
      requestType = com.example.smartagritest.PlantCropRequest.class,
      responseType = com.example.smartagritest.PlantCropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.PlantCropRequest,
      com.example.smartagritest.PlantCropResponse> getPlantCropMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.PlantCropRequest, com.example.smartagritest.PlantCropResponse> getPlantCropMethod;
    if ((getPlantCropMethod = CropManagementServiceGrpc.getPlantCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getPlantCropMethod = CropManagementServiceGrpc.getPlantCropMethod) == null) {
          CropManagementServiceGrpc.getPlantCropMethod = getPlantCropMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.PlantCropRequest, com.example.smartagritest.PlantCropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "plantCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.PlantCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.PlantCropResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("plantCrop"))
                  .build();
          }
        }
     }
     return getPlantCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.HarvestCropRequest,
      com.example.smartagritest.HarvestCropResponse> getHarvestCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "harvestCrop",
      requestType = com.example.smartagritest.HarvestCropRequest.class,
      responseType = com.example.smartagritest.HarvestCropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.HarvestCropRequest,
      com.example.smartagritest.HarvestCropResponse> getHarvestCropMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.HarvestCropRequest, com.example.smartagritest.HarvestCropResponse> getHarvestCropMethod;
    if ((getHarvestCropMethod = CropManagementServiceGrpc.getHarvestCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getHarvestCropMethod = CropManagementServiceGrpc.getHarvestCropMethod) == null) {
          CropManagementServiceGrpc.getHarvestCropMethod = getHarvestCropMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.HarvestCropRequest, com.example.smartagritest.HarvestCropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "harvestCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.HarvestCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.HarvestCropResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("harvestCrop"))
                  .build();
          }
        }
     }
     return getHarvestCropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.smartagritest.WaterCropRequest,
      com.example.smartagritest.WaterCropResponse> getWaterCropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "waterCrop",
      requestType = com.example.smartagritest.WaterCropRequest.class,
      responseType = com.example.smartagritest.WaterCropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.smartagritest.WaterCropRequest,
      com.example.smartagritest.WaterCropResponse> getWaterCropMethod() {
    io.grpc.MethodDescriptor<com.example.smartagritest.WaterCropRequest, com.example.smartagritest.WaterCropResponse> getWaterCropMethod;
    if ((getWaterCropMethod = CropManagementServiceGrpc.getWaterCropMethod) == null) {
      synchronized (CropManagementServiceGrpc.class) {
        if ((getWaterCropMethod = CropManagementServiceGrpc.getWaterCropMethod) == null) {
          CropManagementServiceGrpc.getWaterCropMethod = getWaterCropMethod = 
              io.grpc.MethodDescriptor.<com.example.smartagritest.WaterCropRequest, com.example.smartagritest.WaterCropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.smartagritest.CropManagementService", "waterCrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.WaterCropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.smartagritest.WaterCropResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CropManagementServiceMethodDescriptorSupplier("waterCrop"))
                  .build();
          }
        }
     }
     return getWaterCropMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CropManagementServiceStub newStub(io.grpc.Channel channel) {
    return new CropManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CropManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CropManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CropManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CropManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CropManagementServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Add a new crop
     * </pre>
     */
    public void addCrop(com.example.smartagritest.AddCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.AddCropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCropMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove an existing crop
     * </pre>
     */
    public void removeCrop(com.example.smartagritest.RemoveCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.RemoveCropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveCropMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing crop
     * </pre>
     */
    public void updateCrop(com.example.smartagritest.UpdateCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.UpdateCropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCropMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get information about a crop
     * </pre>
     */
    public void getCropInfo(com.example.smartagritest.CropInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.CropInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCropInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Plant a new crop
     * </pre>
     */
    public void plantCrop(com.example.smartagritest.PlantCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.PlantCropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlantCropMethod(), responseObserver);
    }

    /**
     * <pre>
     * Harvest an existing crop
     * </pre>
     */
    public void harvestCrop(com.example.smartagritest.HarvestCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.HarvestCropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHarvestCropMethod(), responseObserver);
    }

    /**
     * <pre>
     * Water an existing crop
     * </pre>
     */
    public void waterCrop(com.example.smartagritest.WaterCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.WaterCropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWaterCropMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddCropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.AddCropRequest,
                com.example.smartagritest.AddCropResponse>(
                  this, METHODID_ADD_CROP)))
          .addMethod(
            getRemoveCropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.RemoveCropRequest,
                com.example.smartagritest.RemoveCropResponse>(
                  this, METHODID_REMOVE_CROP)))
          .addMethod(
            getUpdateCropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.UpdateCropRequest,
                com.example.smartagritest.UpdateCropResponse>(
                  this, METHODID_UPDATE_CROP)))
          .addMethod(
            getGetCropInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.CropInfoRequest,
                com.example.smartagritest.CropInfoResponse>(
                  this, METHODID_GET_CROP_INFO)))
          .addMethod(
            getPlantCropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.PlantCropRequest,
                com.example.smartagritest.PlantCropResponse>(
                  this, METHODID_PLANT_CROP)))
          .addMethod(
            getHarvestCropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.HarvestCropRequest,
                com.example.smartagritest.HarvestCropResponse>(
                  this, METHODID_HARVEST_CROP)))
          .addMethod(
            getWaterCropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.smartagritest.WaterCropRequest,
                com.example.smartagritest.WaterCropResponse>(
                  this, METHODID_WATER_CROP)))
          .build();
    }
  }

  /**
   */
  public static final class CropManagementServiceStub extends io.grpc.stub.AbstractStub<CropManagementServiceStub> {
    private CropManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CropManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CropManagementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new crop
     * </pre>
     */
    public void addCrop(com.example.smartagritest.AddCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.AddCropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove an existing crop
     * </pre>
     */
    public void removeCrop(com.example.smartagritest.RemoveCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.RemoveCropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing crop
     * </pre>
     */
    public void updateCrop(com.example.smartagritest.UpdateCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.UpdateCropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get information about a crop
     * </pre>
     */
    public void getCropInfo(com.example.smartagritest.CropInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.CropInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCropInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Plant a new crop
     * </pre>
     */
    public void plantCrop(com.example.smartagritest.PlantCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.PlantCropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlantCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Harvest an existing crop
     * </pre>
     */
    public void harvestCrop(com.example.smartagritest.HarvestCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.HarvestCropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHarvestCropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Water an existing crop
     * </pre>
     */
    public void waterCrop(com.example.smartagritest.WaterCropRequest request,
        io.grpc.stub.StreamObserver<com.example.smartagritest.WaterCropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWaterCropMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CropManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<CropManagementServiceBlockingStub> {
    private CropManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CropManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CropManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new crop
     * </pre>
     */
    public com.example.smartagritest.AddCropResponse addCrop(com.example.smartagritest.AddCropRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove an existing crop
     * </pre>
     */
    public com.example.smartagritest.RemoveCropResponse removeCrop(com.example.smartagritest.RemoveCropRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveCropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing crop
     * </pre>
     */
    public com.example.smartagritest.UpdateCropResponse updateCrop(com.example.smartagritest.UpdateCropRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get information about a crop
     * </pre>
     */
    public com.example.smartagritest.CropInfoResponse getCropInfo(com.example.smartagritest.CropInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCropInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Plant a new crop
     * </pre>
     */
    public com.example.smartagritest.PlantCropResponse plantCrop(com.example.smartagritest.PlantCropRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlantCropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Harvest an existing crop
     * </pre>
     */
    public com.example.smartagritest.HarvestCropResponse harvestCrop(com.example.smartagritest.HarvestCropRequest request) {
      return blockingUnaryCall(
          getChannel(), getHarvestCropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Water an existing crop
     * </pre>
     */
    public com.example.smartagritest.WaterCropResponse waterCrop(com.example.smartagritest.WaterCropRequest request) {
      return blockingUnaryCall(
          getChannel(), getWaterCropMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CropManagementServiceFutureStub extends io.grpc.stub.AbstractStub<CropManagementServiceFutureStub> {
    private CropManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CropManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CropManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CropManagementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.AddCropResponse> addCrop(
        com.example.smartagritest.AddCropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove an existing crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.RemoveCropResponse> removeCrop(
        com.example.smartagritest.RemoveCropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveCropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.UpdateCropResponse> updateCrop(
        com.example.smartagritest.UpdateCropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get information about a crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.CropInfoResponse> getCropInfo(
        com.example.smartagritest.CropInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCropInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Plant a new crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.PlantCropResponse> plantCrop(
        com.example.smartagritest.PlantCropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlantCropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Harvest an existing crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.HarvestCropResponse> harvestCrop(
        com.example.smartagritest.HarvestCropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHarvestCropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Water an existing crop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.smartagritest.WaterCropResponse> waterCrop(
        com.example.smartagritest.WaterCropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWaterCropMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CROP = 0;
  private static final int METHODID_REMOVE_CROP = 1;
  private static final int METHODID_UPDATE_CROP = 2;
  private static final int METHODID_GET_CROP_INFO = 3;
  private static final int METHODID_PLANT_CROP = 4;
  private static final int METHODID_HARVEST_CROP = 5;
  private static final int METHODID_WATER_CROP = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CropManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CropManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CROP:
          serviceImpl.addCrop((com.example.smartagritest.AddCropRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.AddCropResponse>) responseObserver);
          break;
        case METHODID_REMOVE_CROP:
          serviceImpl.removeCrop((com.example.smartagritest.RemoveCropRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.RemoveCropResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CROP:
          serviceImpl.updateCrop((com.example.smartagritest.UpdateCropRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.UpdateCropResponse>) responseObserver);
          break;
        case METHODID_GET_CROP_INFO:
          serviceImpl.getCropInfo((com.example.smartagritest.CropInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.CropInfoResponse>) responseObserver);
          break;
        case METHODID_PLANT_CROP:
          serviceImpl.plantCrop((com.example.smartagritest.PlantCropRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.PlantCropResponse>) responseObserver);
          break;
        case METHODID_HARVEST_CROP:
          serviceImpl.harvestCrop((com.example.smartagritest.HarvestCropRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.HarvestCropResponse>) responseObserver);
          break;
        case METHODID_WATER_CROP:
          serviceImpl.waterCrop((com.example.smartagritest.WaterCropRequest) request,
              (io.grpc.stub.StreamObserver<com.example.smartagritest.WaterCropResponse>) responseObserver);
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

  private static abstract class CropManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CropManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.smartagritest.CropManagementServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CropManagementService");
    }
  }

  private static final class CropManagementServiceFileDescriptorSupplier
      extends CropManagementServiceBaseDescriptorSupplier {
    CropManagementServiceFileDescriptorSupplier() {}
  }

  private static final class CropManagementServiceMethodDescriptorSupplier
      extends CropManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CropManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CropManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CropManagementServiceFileDescriptorSupplier())
              .addMethod(getAddCropMethod())
              .addMethod(getRemoveCropMethod())
              .addMethod(getUpdateCropMethod())
              .addMethod(getGetCropInfoMethod())
              .addMethod(getPlantCropMethod())
              .addMethod(getHarvestCropMethod())
              .addMethod(getWaterCropMethod())
              .build();
        }
      }
    }
    return result;
  }
}
