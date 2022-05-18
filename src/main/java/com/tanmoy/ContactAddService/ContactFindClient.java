package com.tanmoy.ContactAddService;

import com.tanmoy.ContactAddService.proto.findGrpc;
import com.tanmoy.ContactAddService.proto.Find.ApiResponse;
import com.tanmoy.ContactAddService.proto.Find.FindRequest;
import com.tanmoy.ContactAddService.proto.findGrpc.findBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ContactFindClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		// stubs - generate from proto
		findBlockingStub blockingStub = findGrpc.newBlockingStub(channel);

		FindRequest findRequest = FindRequest.newBuilder().setId(1).build();
		ApiResponse apiResponse = blockingStub.findContact(findRequest);
		System.out.println(apiResponse.getResponseMessage());
		System.out.println(apiResponse.getContact().toString());
		
		findRequest = FindRequest.newBuilder().setId(5).build();
		apiResponse = blockingStub.findContact(findRequest);
		System.out.println(apiResponse.getResponseMessage());
		System.out.println(apiResponse.getContact().toString());
	}

}
