package com.techlabs.facade.pattren.circle;

import com.techlabs.facade.pattern.shape.IShapeable;

public class Circle implements IShapeable {

	@Override
	public void draw() {

		System.out.println("Drawing circle....");
	}
}
