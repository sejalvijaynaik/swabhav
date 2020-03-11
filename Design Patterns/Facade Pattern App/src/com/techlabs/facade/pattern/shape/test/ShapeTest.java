package com.techlabs.facade.pattern.shape.test;

import com.techlabs.facade.pattern.shapemaker.ShapeMaker;

public class ShapeTest {

	public static void main(String[] args) {

		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
