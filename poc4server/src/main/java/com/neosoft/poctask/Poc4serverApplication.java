package com.neosoft.poctask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Poc4serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Poc4serverApplication.class, args);
		
		System.out.println("this is server");
	}

}
