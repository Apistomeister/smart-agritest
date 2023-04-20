package com.example.smartagritest;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SensorServiceServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        SensorServiceImpl sensorService = new SensorServiceImpl();
        int port = 50053;

        Server server = ServerBuilder.forPort(port)
                .addService(sensorService)
                .build()
                .start();

        System.out.println("Sensor Service Server started, listening on " + port);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server due to JVM shutdown");
            server.shutdown();
        }));

        server.awaitTermination();
    }
}
