package com.techlabs.abstractfactorypattern.shapes;

import com.techlabs.abstractfactorypattern.shape.Shape;

public class RoundedSquare extends Shape {

	@Override
	public void draw() {

		System.out.println("Drawing rounded square");
	}

}
