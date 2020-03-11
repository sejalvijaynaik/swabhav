package com.techlabs.facade.pattern.rectangle;

import com.techlabs.facade.pattern.shape.IShapeable;

public class Rectangle implements IShapeable {

	@Override
	public void draw() {

		System.out.println("Drawing rectangle");
	}
}
