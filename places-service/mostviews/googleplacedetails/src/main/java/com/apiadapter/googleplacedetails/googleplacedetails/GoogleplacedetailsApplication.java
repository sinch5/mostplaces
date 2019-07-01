package com.apiadapter.googleplacedetails.googleplacedetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoogleplacedetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleplacedetailsApplication.class, args);
	}

}
