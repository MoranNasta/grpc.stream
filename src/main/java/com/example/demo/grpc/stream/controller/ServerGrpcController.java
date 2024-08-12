package com.example.demo.grpc.stream.controller;

import grpc.greetings.Greetings;
import grpc.greetings.SayWelcomeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ServerGrpcController extends  SayWelcomeServiceGrpc.SayWelcomeServiceImplBase {
    @Override
    public void getListUsersStream(Greetings.Empty request, StreamObserver<Greetings.User> responseObserver) {
        for (int i = 0; i < 2000; i++)
        {

                Greetings.User.Builder user = Greetings.User.newBuilder().setId(i).setFirstName("moran" + i).setLastName("nasta" + i);
                user.setAddress("beirut").setPhoneNumber(i * 84521).setEmail("morannasta" + i + "@gmmail.com").setPassed(true).setLanguage("eng").setFullName("moran_nasta" + i);
                user.setMiddleName("middle").setMonth("august").setTime((int) System.currentTimeMillis()).setType("apple");
                user.setCountry("lebanon").setHaveHouse(true).setReligious(true);
                if (i == 2) user.setFirst(true);
                else user.setFirst(false);

                if (i == 9998) user.setFinished(true);
                else user.setFinished(false);
                if (i % 5 == 0) user.setSmart(true);
                else user.setSmart(false);
                if (i % 6 == 0) user.setAlive(true);
                else user.setAlive(false);
                responseObserver.onNext(user.build());
            

        }
        responseObserver.onCompleted();

    }
}
