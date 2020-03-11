package com.techlabs.facade.pattern.square;

import com.techlabs.facade.pattern.shape.IShapeable;

public class Square implements IShapeable {

	@Override
	public void draw() {

		System.out.println("Drawing square .....");
	}
}
