package com.indi.micropro.mpaccountmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MpAccountManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpAccountManagementServiceApplication.class, args);
	}

}
