package com.reya.retail.retailShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RetailShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailShopApplication.class, args);
		System.out.println("Welcome retail shoping !!!");
	}

}
