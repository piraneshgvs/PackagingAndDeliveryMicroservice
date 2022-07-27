package com.cognizant.packaging.delivery.service;

import org.springframework.stereotype.Service;

import com.cognizant.packaging.delivery.constant.DeliveryItems;
import com.cognizant.packaging.delivery.constant.PackagingItems;

@Service
public class CalculatingService {
	

	
	public int calculateCost(String component, int count) {
		
		
		if(component.equals("Integral")) {
			
			return calculateIntegral(component, count);
			
		}
					
			return calculateAccessory(component, count);
		
	}
	
	
	private int calculateIntegral(String component, int count) {
		int totalCost;
		totalCost = ((PackagingItems.INTEGRAL_ITEM*count)+PackagingItems.PROTECTIVE_SEATH+DeliveryItems.INTEGRAL_ITEM);
		return totalCost;
	}
	
	private int calculateAccessory(String component, int count) {
		int totalCost;
		totalCost = ((PackagingItems.ACCESSORY*count)+PackagingItems.PROTECTIVE_SEATH+DeliveryItems.ACCESSORY);
		return totalCost;
	}

}
