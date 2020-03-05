package com.techlabs.abstractfactorypattern.factoryproducer;

import com.techlabs.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.techlabs.abstractfactorypattern.shapefactories.RoundedShapeFactory;
import com.techlabs.abstractfactorypattern.shapefactories.ShapeFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean rounded) {

		if (rounded) {
			return new RoundedShapeFactory();
		}
		return new ShapeFactory();
	}
}
