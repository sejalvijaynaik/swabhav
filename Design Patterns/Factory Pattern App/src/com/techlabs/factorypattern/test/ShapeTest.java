package com.techlabs.factorypattern.test;

import com.techlabs.factorypattern.shape.Shape;
import com.techlabs.factorypattern.shapefactory.ShapeFcatory;

public class ShapeTest {

	public static void main(String[] args) {

		ShapeFcatory shapeFcatory = new ShapeFcatory();

		Shape shape = shapeFcatory.getFactoty("rectangle");
		shape.draw();

		shape = shapeFcatory.getFactoty("square");
		shape.draw();

		shape = shapeFcatory.getFactoty("roundedrectangle");
		shape.draw();

		shape = shapeFcatory.getFactoty("roundedsquare");
		shape.draw();
	}
}
