package com.techlabs.abstractfactorypattern.shapefactories;

import com.techlabs.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.techlabs.abstractfactorypattern.shape.Shape;
import com.techlabs.abstractfactorypattern.shapes.Rectangle;
import com.techlabs.abstractfactorypattern.shapes.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {

		if (shapeName.equalsIgnoreCase("rectangle")) {

			return new Rectangle();
		}

		if (shapeName.equalsIgnoreCase("square")) {

			return new Square();
		}
		return null;
	}
}
