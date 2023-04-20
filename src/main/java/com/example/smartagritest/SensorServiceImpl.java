package com.example.smartagritest;

import com.example.smartagritest.SensorServiceGrpc.SensorServiceImplBase;
import io.grpc.stub.StreamObserver;

public class SensorServiceImpl extends SensorServiceImplBase {

    @Override
    public void getTemperature(TemperatureRequest request, StreamObserver<TemperatureResponse> responseObserver) {
        // Implement your logic for getting the temperature reading from a sensor here.
        TemperatureReading temperatureReading = TemperatureReading.newBuilder()
                .setTemperature(23.5) // Example value
                .setTimestamp(System.currentTimeMillis())
                .build();

        TemperatureResponse response = TemperatureResponse.newBuilder()
                .setTemperatureReading(temperatureReading)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHumidity(HumidityRequest request, StreamObserver<HumidityResponse> responseObserver) {
        // Implement your logic for getting the humidity reading from a sensor here.
        HumidityReading humidityReading = HumidityReading.newBuilder()
                .setHumidity(60.0) // Example value
                .setTimestamp(System.currentTimeMillis())
                .build();

        HumidityResponse response = HumidityResponse.newBuilder()
                .setHumidityReading(humidityReading)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getLightLevel(LightLevelRequest request, StreamObserver<LightLevelResponse> responseObserver) {
        // Implement your logic for getting the light level reading from a sensor here.
        LightLevelReading lightLevelReading = LightLevelReading.newBuilder()
                .setLightLevel(300.0) // Example value
                .setTimestamp(System.currentTimeMillis())
                .build();

        LightLevelResponse response = LightLevelResponse.newBuilder()
                .setLightLevelReading(lightLevelReading)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setSensorConfiguration(SensorConfiguration request, StreamObserver<SensorConfigurationResponse> responseObserver) {
        // Implement your logic for setting the configuration for a sensor here.
        SensorConfigurationResponse response = SensorConfigurationResponse.newBuilder()
                .setStatus("Sensor configuration updated successfully.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setAlertThreshold(AlertThreshold request, StreamObserver<AlertThresholdResponse> responseObserver) {
        // Implement your logic for setting the alert threshold for a sensor here.
        AlertThresholdResponse response = AlertThresholdResponse.newBuilder()
                .setStatus("Alert threshold updated successfully.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
