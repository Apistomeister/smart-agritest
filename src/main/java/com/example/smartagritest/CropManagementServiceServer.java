package com.example.smartagritest;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CropManagementServiceServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        CropManagementServiceImpl cropManagementService = new CropManagementServiceImpl();
        int port = 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(cropManagementService)
                .build()
                .start();

        System.out.println("Crop Management Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server due to JVM shutdown");
            server.shutdown();
        }));

        server.awaitTermination();
    }
}
