package com.techlabs.house.blend.coffee;

import com.techlabs.beverage.Beverage;

public class HouseBlendCoffee extends Beverage {

	public HouseBlendCoffee() {

		description = "House blend coffee";
	}

	@Override
	public double cost() {
		return 300.0;
	}

}
