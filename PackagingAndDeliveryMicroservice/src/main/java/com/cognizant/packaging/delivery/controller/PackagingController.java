package com.cognizant.packaging.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackagingController {
	
	
	@GetMapping("/GetPackagingDeliveryCharge")
	public int packageDelivery() {
		
		return 0;
	}

}
