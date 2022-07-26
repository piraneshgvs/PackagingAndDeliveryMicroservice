package com.cognizant.packaging.delivery.service;

import org.springframework.stereotype.Service;

import com.cognizant.packaging.delivery.constant.DeliveryItems;
import com.cognizant.packaging.delivery.constant.PackagingItems;

@Service
public class CalculatingService {
	

	
	public int calculateCost(String component, int count) {
		
		int totalCost=0;
		
		if(component.equals("Integral")) {
			totalCost = ((PackagingItems.INTEGRAL_ITEM*count)+PackagingItems.PROTECTIVE_SEATH+DeliveryItems.INTEGRAL_ITEM);
			
		}
		else if(component.equals("Accessory")) {
			totalCost = ((PackagingItems.ACCESSORY*count)+PackagingItems.PROTECTIVE_SEATH+DeliveryItems.ACCESSORY);
			
		}
		
		return totalCost;
		
	}

}
