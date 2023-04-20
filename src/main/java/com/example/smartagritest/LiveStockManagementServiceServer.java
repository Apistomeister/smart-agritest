package com.example.smartagritest;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class LiveStockManagementServiceServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        LiveStockManagementServiceImpl livestockManagementService = new LiveStockManagementServiceImpl();
        int port = 50052;

        Server server = ServerBuilder.forPort(port)
                .addService(livestockManagementService)
                .build()
                .start();

        System.out.println("Livestock Management Server started, listening on " + port);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server due to JVM shutdown");
            server.shutdown();
        }));

        server.awaitTermination();
    }
}
