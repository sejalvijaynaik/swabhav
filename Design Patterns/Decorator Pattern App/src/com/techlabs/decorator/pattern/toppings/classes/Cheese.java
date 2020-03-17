package com.techlabs.decorator.pattern.toppings.classes;

import com.techabs.decorator.pattern.pizza.Pizza;
import com.techlabs.decorator.pattern.toppings.decorator.ToppingsDecorator;

public class Cheese extends ToppingsDecorator {
	
	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {

		return (pizza.getDescription() + ", cheese");
	}

	@Override
	public double cost() {

	return (pizza.cost() + 50.0);
	}
}
