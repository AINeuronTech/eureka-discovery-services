package com.commerce.eurekadiscoverymicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryMicroservicesApplication.class, args);
	}

}
