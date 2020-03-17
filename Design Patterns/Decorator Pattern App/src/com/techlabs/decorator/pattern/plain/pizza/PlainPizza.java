package com.techlabs.decorator.pattern.plain.pizza;

import com.techabs.decorator.pattern.pizza.Pizza;

public class PlainPizza extends Pizza {

	public PlainPizza() {
		description = "Plain Pizza";
	}
	
	@Override
	public double cost() {
		return 100.0;
	}
}
