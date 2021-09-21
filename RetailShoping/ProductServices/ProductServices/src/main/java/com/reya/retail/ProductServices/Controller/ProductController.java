package com.reya.retail.ProductServices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping
	public String product() {
		
		return "Welcome product service !!!";
	}
}