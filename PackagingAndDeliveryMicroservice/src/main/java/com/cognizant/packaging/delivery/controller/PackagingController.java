package com.cognizant.packaging.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.packaging.delivery.service.CalculatingService;


@RestController
public class PackagingController {
	
	@Autowired
	CalculatingService calculatingService;
	
	@GetMapping("/GetPackagingDeliveryCharge")
	public int packageDelivery(@RequestParam String componentType, int count) {
		
	    int finalCost = calculatingService.calculateCost(componentType, count);
	    
		return finalCost;
	}

}
