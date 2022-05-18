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
    comments = "Source: add.proto")
public final class addGrpc {

  private addGrpc() {}

  public static final String SERVICE_NAME = "add";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact,
      com.tanmoy.ContactAddService.proto.Add.ApiResponse> getAddContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addContact",
      requestType = com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact.class,
      responseType = com.tanmoy.ContactAddService.proto.Add.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact,
      com.tanmoy.ContactAddService.proto.Add.ApiResponse> getAddContactMethod() {
    io.grpc.MethodDescriptor<com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact, com.tanmoy.ContactAddService.proto.Add.ApiResponse> getAddContactMethod;
    if ((getAddContactMethod = addGrpc.getAddContactMethod) == null) {
      synchronized (addGrpc.class) {
        if ((getAddContactMethod = addGrpc.getAddContactMethod) == null) {
          addGrpc.getAddContactMethod = getAddContactMethod = 
              io.grpc.MethodDescriptor.<com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact, com.tanmoy.ContactAddService.proto.Add.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "add", "addContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanmoy.ContactAddService.proto.Add.ApiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new addMethodDescriptorSupplier("addContact"))
                  .build();
          }
        }
     }
     return getAddContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static addStub newStub(io.grpc.Channel channel) {
    return new addStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static addBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new addBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static addFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new addFutureStub(channel);
  }

  /**
   */
  public static abstract class addImplBase implements io.grpc.BindableService {

    /**
     */
    public void addContact(com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact request,
        io.grpc.stub.StreamObserver<com.tanmoy.ContactAddService.proto.Add.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact,
                com.tanmoy.ContactAddService.proto.Add.ApiResponse>(
                  this, METHODID_ADD_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class addStub extends io.grpc.stub.AbstractStub<addStub> {
    private addStub(io.grpc.Channel channel) {
      super(channel);
    }

    private addStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new addStub(channel, callOptions);
    }

    /**
     */
    public void addContact(com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact request,
        io.grpc.stub.StreamObserver<com.tanmoy.ContactAddService.proto.Add.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class addBlockingStub extends io.grpc.stub.AbstractStub<addBlockingStub> {
    private addBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private addBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new addBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tanmoy.ContactAddService.proto.Add.ApiResponse addContact(com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact request) {
      return blockingUnaryCall(
          getChannel(), getAddContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class addFutureStub extends io.grpc.stub.AbstractStub<addFutureStub> {
    private addFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private addFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new addFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanmoy.ContactAddService.proto.Add.ApiResponse> addContact(
        com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact request) {
      return futureUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CONTACT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final addImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(addImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CONTACT:
          serviceImpl.addContact((com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact) request,
              (io.grpc.stub.StreamObserver<com.tanmoy.ContactAddService.proto.Add.ApiResponse>) responseObserver);
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

  private static abstract class addBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    addBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tanmoy.ContactAddService.proto.Add.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("add");
    }
  }

  private static final class addFileDescriptorSupplier
      extends addBaseDescriptorSupplier {
    addFileDescriptorSupplier() {}
  }

  private static final class addMethodDescriptorSupplier
      extends addBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    addMethodDescriptorSupplier(String methodName) {
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
      synchronized (addGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new addFileDescriptorSupplier())
              .addMethod(getAddContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
