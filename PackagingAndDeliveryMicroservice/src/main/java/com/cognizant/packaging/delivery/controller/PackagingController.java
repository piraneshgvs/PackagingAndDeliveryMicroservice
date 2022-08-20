package com.cognizant.packaging.delivery.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.packaging.delivery.constant.GeneralConstant;
import com.cognizant.packaging.delivery.service.CalculatingService;



@RestController
@RequestMapping("/api/packaging")
public class PackagingController {
	
	@Autowired
	CalculatingService calculatingService;
	
	private static final Logger logger = LoggerFactory.getLogger(PackagingController.class);
	
	@GetMapping("/getPackagingDeliveryCharge")
	public ResponseEntity<?> packageDelivery(@RequestParam(required=true) String componentType,@RequestParam(required=true) Long count)  {
		Long finalCost=0L;
		if(componentType.trim()!=null&&count>0) {
			  finalCost = calculatingService.calculateCost(componentType, count);
			  logger.info("Final cost : "+finalCost);
			  return new ResponseEntity<Long>(finalCost,HttpStatus.OK);
		}
	    
		return new ResponseEntity<>(GeneralConstant.EXCEPTION_MESSAGE, HttpStatus.BAD_REQUEST);
	}

}
