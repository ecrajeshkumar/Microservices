package com.reya.retail.shopingProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class ShopingProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopingProductApplication.class, args);
	}

}
