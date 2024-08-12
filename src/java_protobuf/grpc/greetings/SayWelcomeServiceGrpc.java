package grpc.greetings;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: src/main/resources/proto/greetings.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SayWelcomeServiceGrpc {

  private SayWelcomeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SayWelcomeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.greetings.Greetings.Empty,
      grpc.greetings.Greetings.User> getGetListUsersStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListUsersStream",
      requestType = grpc.greetings.Greetings.Empty.class,
      responseType = grpc.greetings.Greetings.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.greetings.Greetings.Empty,
      grpc.greetings.Greetings.User> getGetListUsersStreamMethod() {
    io.grpc.MethodDescriptor<grpc.greetings.Greetings.Empty, grpc.greetings.Greetings.User> getGetListUsersStreamMethod;
    if ((getGetListUsersStreamMethod = SayWelcomeServiceGrpc.getGetListUsersStreamMethod) == null) {
      synchronized (SayWelcomeServiceGrpc.class) {
        if ((getGetListUsersStreamMethod = SayWelcomeServiceGrpc.getGetListUsersStreamMethod) == null) {
          SayWelcomeServiceGrpc.getGetListUsersStreamMethod = getGetListUsersStreamMethod =
              io.grpc.MethodDescriptor.<grpc.greetings.Greetings.Empty, grpc.greetings.Greetings.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListUsersStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.greetings.Greetings.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.greetings.Greetings.User.getDefaultInstance()))
              .setSchemaDescriptor(new SayWelcomeServiceMethodDescriptorSupplier("GetListUsersStream"))
              .build();
        }
      }
    }
    return getGetListUsersStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SayWelcomeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceStub>() {
        @java.lang.Override
        public SayWelcomeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayWelcomeServiceStub(channel, callOptions);
        }
      };
    return SayWelcomeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SayWelcomeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceBlockingStub>() {
        @java.lang.Override
        public SayWelcomeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayWelcomeServiceBlockingStub(channel, callOptions);
        }
      };
    return SayWelcomeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SayWelcomeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SayWelcomeServiceFutureStub>() {
        @java.lang.Override
        public SayWelcomeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SayWelcomeServiceFutureStub(channel, callOptions);
        }
      };
    return SayWelcomeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getListUsersStream(grpc.greetings.Greetings.Empty request,
        io.grpc.stub.StreamObserver<grpc.greetings.Greetings.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListUsersStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SayWelcomeService.
   */
  public static abstract class SayWelcomeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SayWelcomeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SayWelcomeService.
   */
  public static final class SayWelcomeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SayWelcomeServiceStub> {
    private SayWelcomeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayWelcomeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayWelcomeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getListUsersStream(grpc.greetings.Greetings.Empty request,
        io.grpc.stub.StreamObserver<grpc.greetings.Greetings.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetListUsersStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SayWelcomeService.
   */
  public static final class SayWelcomeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SayWelcomeServiceBlockingStub> {
    private SayWelcomeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayWelcomeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayWelcomeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.greetings.Greetings.User> getListUsersStream(
        grpc.greetings.Greetings.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetListUsersStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SayWelcomeService.
   */
  public static final class SayWelcomeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SayWelcomeServiceFutureStub> {
    private SayWelcomeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SayWelcomeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SayWelcomeServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_LIST_USERS_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LIST_USERS_STREAM:
          serviceImpl.getListUsersStream((grpc.greetings.Greetings.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.greetings.Greetings.User>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetListUsersStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              grpc.greetings.Greetings.Empty,
              grpc.greetings.Greetings.User>(
                service, METHODID_GET_LIST_USERS_STREAM)))
        .build();
  }

  private static abstract class SayWelcomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SayWelcomeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.greetings.Greetings.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SayWelcomeService");
    }
  }

  private static final class SayWelcomeServiceFileDescriptorSupplier
      extends SayWelcomeServiceBaseDescriptorSupplier {
    SayWelcomeServiceFileDescriptorSupplier() {}
  }

  private static final class SayWelcomeServiceMethodDescriptorSupplier
      extends SayWelcomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SayWelcomeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SayWelcomeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SayWelcomeServiceFileDescriptorSupplier())
              .addMethod(getGetListUsersStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
