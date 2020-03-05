package com.techlabs.abstractfactorypattern.test;

import com.techlabs.abstractfactorypattern.abstractfactory.AbstractFactory;
import com.techlabs.abstractfactorypattern.factoryproducer.FactoryProducer;
import com.techlabs.abstractfactorypattern.shape.Shape;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
		System.out.println(abstractFactory);
		Shape shape = abstractFactory.getShape("rectangle");
		shape.draw();

		shape = abstractFactory.getShape("square");
		shape.draw();

		abstractFactory = FactoryProducer.getFactory(true);
		shape = abstractFactory.getShape("rectangle");
		shape.draw();

		shape = abstractFactory.getShape("square");
		shape.draw();
	}
}
