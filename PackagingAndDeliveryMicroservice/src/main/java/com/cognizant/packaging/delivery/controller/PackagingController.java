package com.cognizant.packaging.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.packaging.delivery.constant.GeneralConstant;
import com.cognizant.packaging.delivery.service.CalculatingService;


@RestController
public class PackagingController {
	
	@Autowired
	CalculatingService calculatingService;
	
	
	@GetMapping("/GetPackagingDeliveryCharge")
	public ResponseEntity<?> packageDelivery(@RequestParam String componentType,@RequestParam Long count)  {
		Long finalCost=0L;
		if(componentType!=null&&count>0) {
			  finalCost = calculatingService.calculateCost(componentType, count);
			  return new ResponseEntity<Long>(finalCost,HttpStatus.OK);
		}
	    
		return new ResponseEntity<>(GeneralConstant.EXCEPTION_MESSAGE, HttpStatus.BAD_REQUEST);
	}

}
