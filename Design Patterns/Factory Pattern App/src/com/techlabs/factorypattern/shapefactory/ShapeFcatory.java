package com.techlabs.factorypattern.shapefactory;

import com.techlabs.factorypattern.shape.Shape;
import com.techlabs.factorypattern.shapes.Rectangle;
import com.techlabs.factorypattern.shapes.RoundedRectangle;
import com.techlabs.factorypattern.shapes.RoundedSquare;
import com.techlabs.factorypattern.shapes.Square;

public class ShapeFcatory {

	public Shape getFactoty(String shapeName) {

		if (shapeName.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		if (shapeName.equalsIgnoreCase("square")) {
			return new Square();
		}
		if (shapeName.equalsIgnoreCase("roundedrectangle")) {
			return new RoundedRectangle();
		}
		if (shapeName.equalsIgnoreCase("roundedsquare")) {
			return new RoundedSquare();
		}
		return null;
	}
}
