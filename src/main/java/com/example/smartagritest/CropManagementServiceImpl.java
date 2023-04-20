package com.example.smartagritest;


import io.grpc.stub.StreamObserver;

public class CropManagementServiceImpl extends CropManagementServiceGrpc.CropManagementServiceImplBase {

    @Override
    public void addCrop(AddCropRequest request, StreamObserver<AddCropResponse> responseObserver) {
        // Implement your logic for adding a crop here.

        AddCropResponse response = AddCropResponse.newBuilder()
                .setMessage("Crop added successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void removeCrop(RemoveCropRequest request, StreamObserver<RemoveCropResponse> responseObserver) {
        // Implement your logic for removing a crop here.

        RemoveCropResponse response = RemoveCropResponse.newBuilder()
                .setMessage("Crop removed successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateCrop(UpdateCropRequest request, StreamObserver<UpdateCropResponse> responseObserver) {
        // Implement your logic for updating a crop here.

        UpdateCropResponse response = UpdateCropResponse.newBuilder()
                .setMessage("Crop updated successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCropInfo(CropInfoRequest request, StreamObserver<CropInfoResponse> responseObserver) {
        // Implement your logic for getting crop information here.

        CropInfoResponse response = CropInfoResponse.newBuilder()
                .setName("Sample Crop")
                .setType("Sample Type")
                .setPlantingDate("2023-04-18")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void plantCrop(PlantCropRequest request, StreamObserver<PlantCropResponse> responseObserver) {
        // Implement your logic for planting a crop here.

        PlantCropResponse response = PlantCropResponse.newBuilder()
                .setMessage("Crop planted successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void harvestCrop(HarvestCropRequest request, StreamObserver<HarvestCropResponse> responseObserver) {
        // Implement your logic for harvesting a crop here.

        HarvestCropResponse response = HarvestCropResponse.newBuilder()
                .setMessage("Crop harvested successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void waterCrop(WaterCropRequest request, StreamObserver<WaterCropResponse> responseObserver) {
        // Implement your logic for watering a crop here.

        WaterCropResponse response = WaterCropResponse.newBuilder()
                .setMessage("Crop watered successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
