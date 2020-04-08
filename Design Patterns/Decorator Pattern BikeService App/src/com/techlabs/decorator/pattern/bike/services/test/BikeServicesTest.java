package com.techlabs.decorator.pattern.bike.services.test;

import com.techlabs.decorator.pattern.basic.bike.services.BasicBikeServices;
import com.techlabs.decorator.pattern.bikeservices.ChainAllignment;
import com.techlabs.decorator.pattern.bikeservices.OilChange;
import com.techlabs.decorator.pattern.ibikeservices.IBikeServices;

public class BikeServicesTest {
	
	public static void main(String[] args) {
		
		IBikeServices iBikeServices = new OilChange(new ChainAllignment(new BasicBikeServices()));
		
		System.out.println(iBikeServices.getDescription());
		System.out.println(iBikeServices.cost());
	}

}
