package com.techlabs.decorator.pattern.basic.bike.services;

import com.techlabs.decorator.pattern.ibikeservices.IBikeServices;

public class BasicBikeServices extends IBikeServices {

	public BasicBikeServices() {

		description = "basic bike service";
	}
	@Override
	public double cost() {
		return 400.0;
	}
}
