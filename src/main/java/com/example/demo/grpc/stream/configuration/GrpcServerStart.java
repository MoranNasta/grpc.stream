package com.example.demo.grpc.stream.configuration;

import io.grpc.Server;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class GrpcServerStart {

    private final Server server;

    public GrpcServerStart(Server GrpcServerStart) {
        this.server = GrpcServerStart;
    }
    @PostConstruct
    public void start() throws Exception {
        server.start();
        System.out.println("gRPC server started on port: " + server.getPort());
    }


}
