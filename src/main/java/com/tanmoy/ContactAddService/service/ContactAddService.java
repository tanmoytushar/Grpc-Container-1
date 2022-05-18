package com.tanmoy.ContactAddService.service;

import com.tanmoy.ContactAddService.proto.Add.ApiResponse;
import com.tanmoy.ContactAddService.proto.ContactOuterClass.Contact;
import com.tanmoy.ContactAddService.proto.addGrpc.addImplBase;
import com.tanmoy.ContactAddService.repo.ContactRepository;

import io.grpc.stub.StreamObserver;

public class ContactAddService extends addImplBase {
	
	@Override
	public void addContact(Contact request, StreamObserver<ApiResponse> responseObserver) {
		ContactRepository repository = new ContactRepository();
		
		int id = repository.addContact(request);
		
		ApiResponse.Builder response = ApiResponse.newBuilder();
		
		if(id != 0) {
			response.setResponseCode(1).setResponseMessage("Success").setContact(request);
		} else {
			response.setResponseCode(0).setResponseMessage("Failed");
		}
		// setting response value to response observer
		responseObserver.onNext(response.build());
		// closing response observer
		responseObserver.onCompleted();
	}

}
