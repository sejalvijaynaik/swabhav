package com.techlabs.condamints;

import com.techlabs.beverage.Beverage;
import com.techlabs.condamint.decorator.CondamintDecorator;

public class Mocha extends CondamintDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return (beverage.getDescription() + ", mocha");
	}

	@Override
	public double cost() {
		return (beverage.cost() + 150.0);
	}
}
