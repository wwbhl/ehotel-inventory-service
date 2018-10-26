package com.bhl.ehotel.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EhotelInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhotelInventoryServiceApplication.class, args); 
	}
	
}
