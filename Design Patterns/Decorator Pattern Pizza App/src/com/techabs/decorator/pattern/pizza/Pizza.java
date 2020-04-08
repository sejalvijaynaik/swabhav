package com.techabs.decorator.pattern.pizza;

public abstract class Pizza {
	
	protected String description = "Pizza";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
