package com.techlabs.decorator.pattern.bike.services;

import com.techlabs.decorator.pattern.ibikeservices.IBikeServices;

public abstract class BikeServices extends IBikeServices {

	protected IBikeServices iBikeServices;

	public BikeServices(IBikeServices iBikeServices) {

		this.iBikeServices = iBikeServices;
	}

	public abstract String getDescription();
}
