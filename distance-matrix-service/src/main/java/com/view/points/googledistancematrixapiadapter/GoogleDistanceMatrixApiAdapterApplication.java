package com.view.points.googledistancematrixapiadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GoogleDistanceMatrixApiAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleDistanceMatrixApiAdapterApplication.class, args);
	}

}
