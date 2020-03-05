package com.techlabs.abstractfactorypattern.shapefactories;

import com.techlabs.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.techlabs.abstractfactorypattern.shape.Shape;
import com.techlabs.abstractfactorypattern.shapes.RoundedRectangle;
import com.techlabs.abstractfactorypattern.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {

		if (shapeName.equalsIgnoreCase("rectangle")) {

			return new RoundedRectangle();
		}

		if (shapeName.equalsIgnoreCase("square")) {

			return new RoundedSquare();
		}
		return null;
	}

}
