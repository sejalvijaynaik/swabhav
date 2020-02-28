package com.techlabs.ocp.violation;

public class Area {

	public double calculateSquareArea(Square square) {

		double area = square.getSide() * square.getSide();
		return area;
	}

	public double calculateRectangleArea(Rectangle rectangle) {

		double area = rectangle.getBreadth() * rectangle.getLength();
		return area;
	}

	public double calculateCircleArea(Circle circle) {

		double area = 2 * Math.PI * circle.getRadius();
		return area;
	}
}
