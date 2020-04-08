package com.techlabs.decorator.pattern.ibikeservices;

public abstract class  IBikeServices {
	
	protected String description = "Unknown";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
