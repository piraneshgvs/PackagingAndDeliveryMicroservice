package com.cognizant.packaging.delivery.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatingServiceTest {
	
	@InjectMocks
	CalculatingService calculatingService;
	
	@Test
	public void calculateCost() {
		
		assertEquals(950L,calculatingService.calculateCost("Integral", 5L));
		
	}
	
	@Test
	public void calculateCostAccessoryTest() {
		
		assertEquals(600L,calculatingService.calculateCost("Accessory", 5L));
		
	}

}
