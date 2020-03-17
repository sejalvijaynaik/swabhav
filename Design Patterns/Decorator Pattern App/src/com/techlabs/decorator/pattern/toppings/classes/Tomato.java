package com.techlabs.decorator.pattern.toppings.classes;

import com.techabs.decorator.pattern.pizza.Pizza;
import com.techlabs.decorator.pattern.toppings.decorator.ToppingsDecorator;

public class Tomato extends ToppingsDecorator {

	Pizza pizza;
	
	public Tomato(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {

		return (pizza.getDescription() + ", tomato");
	}

	@Override
	public double cost() {

		return (pizza.cost() + 80.0);
	}
}
