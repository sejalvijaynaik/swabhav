package com.techlabs.ocp.solution;

public class Rectangle implements AreaInterface {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	@Override
	public double calculateArea() {
		double area = length * breadth;
		return area;
	}

}
