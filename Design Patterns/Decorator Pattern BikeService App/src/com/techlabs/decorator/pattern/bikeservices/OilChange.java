package com.techlabs.decorator.pattern.bikeservices;

import com.techlabs.decorator.pattern.bike.services.BikeServices;
import com.techlabs.decorator.pattern.ibikeservices.IBikeServices;

public class OilChange extends BikeServices {
	
	public OilChange(IBikeServices iBikeServices) {
		super(iBikeServices);
	}

	@Override
	public String getDescription() {
		return (iBikeServices.getDescription() + "oil change");
	}

	@Override
	public double cost() {
		return (iBikeServices.cost() + 600.0);
	}
}
