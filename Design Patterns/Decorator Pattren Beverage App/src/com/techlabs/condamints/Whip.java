package com.techlabs.condamints;

import com.techlabs.beverage.Beverage;
import com.techlabs.condamint.decorator.CondamintDecorator;

public class Whip extends CondamintDecorator {
	
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return (beverage.getDescription() + ", whip");
	}

	@Override
	public double cost() {
		return (beverage.cost() + 50.0);
	}
}
