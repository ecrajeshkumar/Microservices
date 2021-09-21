package com.reya.retail.shopingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class ShopingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopingCartApplication.class, args);
	}

}
