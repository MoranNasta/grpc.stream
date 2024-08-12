package com.example.demo.grpc.stream.configuration;

import com.example.demo.grpc.stream.controller.ServerGrpcController;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfiguration {
    private final ServerGrpcController serverGrpcController;

    public ServerConfiguration(ServerGrpcController serverGrpcController) {
        this.serverGrpcController = serverGrpcController;
    }
    @Bean
    public Server grpcServer() {
        return ServerBuilder.forPort(9092)
                .addService(serverGrpcController)
                .build();
    }
}
