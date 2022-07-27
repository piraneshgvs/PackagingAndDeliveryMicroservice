package com.cognizant.packaging.delivery.service;

import org.springframework.stereotype.Service;

import com.cognizant.packaging.delivery.constant.DeliveryItems;
import com.cognizant.packaging.delivery.constant.PackagingItems;

@Service
public class CalculatingService {
	

	
	public Long calculateCost(String component, Long count) {
		
		
		if(component.equals("Integral")) {
			
			return calculateIntegral(component, count);
			
		}
					
			return calculateAccessory(component, count);
		
	}
	
	
	private Long calculateIntegral(String component, Long count) {
		Long totalCost;
		totalCost = ((PackagingItems.INTEGRAL_ITEM*count)+PackagingItems.PROTECTIVE_SEATH+DeliveryItems.INTEGRAL_ITEM);
		return totalCost;
	}
	
	private Long calculateAccessory(String component, Long count) {
		Long totalCost;
		totalCost = ((PackagingItems.ACCESSORY*count)+PackagingItems.PROTECTIVE_SEATH+DeliveryItems.ACCESSORY);
		return totalCost;
	}

}
