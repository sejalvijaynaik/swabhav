package com.techlabs.decorator.pattern.toppings.decorator;

import com.techabs.decorator.pattern.pizza.Pizza;

public abstract class ToppingsDecorator extends Pizza {

	public abstract String getDescription();
	
}
