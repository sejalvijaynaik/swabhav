package com.techlabs.decorator.pattern.bikeservices;

import com.techlabs.decorator.pattern.bike.services.BikeServices;
import com.techlabs.decorator.pattern.ibikeservices.IBikeServices;

public class ChainAllignment extends BikeServices {
	
	public ChainAllignment(IBikeServices iBikeServices) {
		super(iBikeServices);
	}

	@Override
	public String getDescription() {
		return (iBikeServices.getDescription() + "chain allignment");
	}

	@Override
	public double cost() {
		return (iBikeServices.cost() + 500.0);
	}
}
