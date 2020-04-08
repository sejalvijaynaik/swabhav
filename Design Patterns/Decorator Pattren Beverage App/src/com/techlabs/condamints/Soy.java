package com.techlabs.condamints;

import com.techlabs.beverage.Beverage;
import com.techlabs.condamint.decorator.CondamintDecorator;

public class Soy extends CondamintDecorator {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return (beverage.getDescription() + ", soy");
	}

	@Override
	public double cost() {
		return (beverage.cost() + 80.0);
	}
}
