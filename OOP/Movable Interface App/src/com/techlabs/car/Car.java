package com.techlabs.car;

import com.techlabs.imovable.IMovable;

public class Car implements IMovable {

	@Override
	public void move() {
		System.out.println("Car is moving");		
	}
}
