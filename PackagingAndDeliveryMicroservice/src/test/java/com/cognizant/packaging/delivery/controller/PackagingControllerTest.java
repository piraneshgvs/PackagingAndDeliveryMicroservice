package com.cognizant.packaging.delivery.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cognizant.packaging.delivery.service.CalculatingService;

@SpringBootTest
public class PackagingControllerTest {
	
	
	@InjectMocks
	PackagingController packagingController;
	
	@Mock
	CalculatingService calculatingService;
	
	
	@Test
	public void packageDeliveryTest() {
		
		when(calculatingService.calculateCost("Integral", 5L)).thenReturn(950L);
		ResponseEntity<?> finalCost = packagingController.packageDelivery("Integral", 5L);
		assertEquals(950L, finalCost.getBody());
	}
	
	@Test
	public void packageDeliveryAccessoryTest() {
		when(calculatingService.calculateCost("Accessory", 852L)).thenReturn(85300L);
		ResponseEntity<?> finalCost = packagingController.packageDelivery("Accessory", 852L);
		assertEquals(85300L, finalCost.getBody());
		
	}
	
	@Test
	public void packageDeliveryStatusTest() {
		ResponseEntity<?> finalCost = packagingController.packageDelivery("Accessory", 0L);
		assertEquals(HttpStatus.BAD_REQUEST,finalCost.getStatusCode());
		
	}

}
