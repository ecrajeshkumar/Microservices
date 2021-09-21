package com.reya.retail.shopingCart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopingCart")
public class ShopingCartController {
	
	@GetMapping
	public String shopingCart() {
		
		return "Welcome in shoping cart !!!";
	}

}
