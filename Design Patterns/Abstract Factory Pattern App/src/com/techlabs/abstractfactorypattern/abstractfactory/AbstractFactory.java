package com.techlabs.abstractfactorypattern.abstractfactory;

import com.techlabs.abstractfactorypattern.shape.Shape;

public abstract class AbstractFactory {
	
	public abstract Shape getShape(String shapeName);

}
