package com.techlabs.condamint.decorator;

import com.techlabs.beverage.Beverage;

public abstract class CondamintDecorator extends Beverage {
	
	protected Beverage beverage;
	
	public CondamintDecorator(Beverage beverage) {

		this.beverage = beverage;
	}

	public abstract String getDescription();
}
