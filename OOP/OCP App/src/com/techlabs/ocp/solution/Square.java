package com.techlabs.ocp.solution;

public class Square implements AreaInterface {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double calculateArea() {
		double area = side * side;
		return area;
	}

}
