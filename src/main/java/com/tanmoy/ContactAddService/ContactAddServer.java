package com.tanmoy.ContactAddService;

import java.io.IOException;

import com.tanmoy.ContactAddService.service.ContactAddService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ContactAddServer {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Grpc contact add server started");
		Server server = ServerBuilder.forPort(9091).addService(new ContactAddService()).build();
		server.start();
		System.out.println("Grpc contact add server started at port: " + server.getPort());
		server.awaitTermination();
	}

}
