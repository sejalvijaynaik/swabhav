package com.techlabs.ocp.solution;

public class Circle implements AreaInterface {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		double area = 2 * Math.PI * radius;
		return area;
	}

}
