package com.reya.retail.shopingProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class ShopingProductController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String shopingProduct() {
		
		return "Welcome in shoping product !!!";
	}
	
	@GetMapping("/mobile")
	public String shopingMobile() {
		
		//String url = "http://localhost:9092/cart";
		String url = "http://cart-service/shopingCart";
		return restTemplate.getForObject(url, String.class);
	}

}
