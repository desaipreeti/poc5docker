package com.neosoft.poctask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class Poc4microservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Poc4microservice2Application.class, args);
		
		System.out.println("microservice2");
	}

}
