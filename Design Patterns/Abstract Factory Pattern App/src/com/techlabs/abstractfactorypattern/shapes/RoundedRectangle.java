package com.techlabs.abstractfactorypattern.shapes;

import com.techlabs.abstractfactorypattern.shape.Shape;

public class RoundedRectangle extends Shape{

	@Override
	public void draw() {

		System.out.println("Drawinf rounded rectangle");
	}

}
