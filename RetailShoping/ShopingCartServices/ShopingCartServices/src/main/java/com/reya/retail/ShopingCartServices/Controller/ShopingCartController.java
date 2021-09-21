package com.reya.retail.ShopingCartServices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class ShopingCartController {
	
	@GetMapping
	public String myCart() {
		
		return "Please select your choice !!!";
	}
}
