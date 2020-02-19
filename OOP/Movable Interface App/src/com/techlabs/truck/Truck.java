package com.techlabs.truck;

import com.techlabs.imovable.IMovable;

public class Truck implements IMovable {

	@Override
	public void move() {
		System.out.println("Truck is moving");
	}
}
