package com.tanmoy.ContactAddService.proto;

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
    comments = "Source: find.proto")
public final class findGrpc {

  private findGrpc() {}

  public static final String SERVICE_NAME = "find";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tanmoy.ContactAddService.proto.Find.FindRequest,
      com.tanmoy.ContactAddService.proto.Find.ApiResponse> getFindContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findContact",
      requestType = com.tanmoy.ContactAddService.proto.Find.FindRequest.class,
      responseType = com.tanmoy.ContactAddService.proto.Find.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanmoy.ContactAddService.proto.Find.FindRequest,
      com.tanmoy.ContactAddService.proto.Find.ApiResponse> getFindContactMethod() {
    io.grpc.MethodDescriptor<com.tanmoy.ContactAddService.proto.Find.FindRequest, com.tanmoy.ContactAddService.proto.Find.ApiResponse> getFindContactMethod;
    if ((getFindContactMethod = findGrpc.getFindContactMethod) == null) {
      synchronized (findGrpc.class) {
        if ((getFindContactMethod = findGrpc.getFindContactMethod) == null) {
          findGrpc.getFindContactMethod = getFindContactMethod = 
              io.grpc.MethodDescriptor.<com.tanmoy.ContactAddService.proto.Find.FindRequest, com.tanmoy.ContactAddService.proto.Find.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "find", "findContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanmoy.ContactAddService.proto.Find.FindRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanmoy.ContactAddService.proto.Find.ApiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new findMethodDescriptorSupplier("findContact"))
                  .build();
          }
        }
     }
     return getFindContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static findStub newStub(io.grpc.Channel channel) {
    return new findStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static findBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new findBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static findFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new findFutureStub(channel);
  }

  /**
   */
  public static abstract class findImplBase implements io.grpc.BindableService {

    /**
     */
    public void findContact(com.tanmoy.ContactAddService.proto.Find.FindRequest request,
        io.grpc.stub.StreamObserver<com.tanmoy.ContactAddService.proto.Find.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanmoy.ContactAddService.proto.Find.FindRequest,
                com.tanmoy.ContactAddService.proto.Find.ApiResponse>(
                  this, METHODID_FIND_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class findStub extends io.grpc.stub.AbstractStub<findStub> {
    private findStub(io.grpc.Channel channel) {
      super(channel);
    }

    private findStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new findStub(channel, callOptions);
    }

    /**
     */
    public void findContact(com.tanmoy.ContactAddService.proto.Find.FindRequest request,
        io.grpc.stub.StreamObserver<com.tanmoy.ContactAddService.proto.Find.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class findBlockingStub extends io.grpc.stub.AbstractStub<findBlockingStub> {
    private findBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private findBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new findBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tanmoy.ContactAddService.proto.Find.ApiResponse findContact(com.tanmoy.ContactAddService.proto.Find.FindRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class findFutureStub extends io.grpc.stub.AbstractStub<findFutureStub> {
    private findFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private findFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected findFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new findFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanmoy.ContactAddService.proto.Find.ApiResponse> findContact(
        com.tanmoy.ContactAddService.proto.Find.FindRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_CONTACT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final findImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(findImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_CONTACT:
          serviceImpl.findContact((com.tanmoy.ContactAddService.proto.Find.FindRequest) request,
              (io.grpc.stub.StreamObserver<com.tanmoy.ContactAddService.proto.Find.ApiResponse>) responseObserver);
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

  private static abstract class findBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    findBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tanmoy.ContactAddService.proto.Find.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("find");
    }
  }

  private static final class findFileDescriptorSupplier
      extends findBaseDescriptorSupplier {
    findFileDescriptorSupplier() {}
  }

  private static final class findMethodDescriptorSupplier
      extends findBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    findMethodDescriptorSupplier(String methodName) {
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
      synchronized (findGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new findFileDescriptorSupplier())
              .addMethod(getFindContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
