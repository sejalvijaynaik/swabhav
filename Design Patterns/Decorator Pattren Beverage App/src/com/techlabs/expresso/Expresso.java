package com.techlabs.expresso;

import com.techlabs.beverage.Beverage;

public class Expresso extends Beverage {

	public Expresso() {

		description = "Expresso";
	}

	@Override
	public double cost() {
		return 200.0;
	}

}
