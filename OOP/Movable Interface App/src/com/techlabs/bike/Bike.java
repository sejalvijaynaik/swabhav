package com.techlabs.bike;

import com.techlabs.imovable.IMovable;

public class Bike implements IMovable {

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}
}
