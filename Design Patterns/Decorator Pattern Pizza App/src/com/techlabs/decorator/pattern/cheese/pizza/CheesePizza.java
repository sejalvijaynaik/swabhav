package com.techlabs.decorator.pattern.cheese.pizza;

import com.techabs.decorator.pattern.pizza.Pizza;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		description = "Cheeze Pizza";
	}
	
	@Override
	public double cost() {
		return 200.0;
	}
}
