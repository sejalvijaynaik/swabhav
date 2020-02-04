package com.techlabs.magicnumbers;

public class WithMagicNumberTest {
	final static  int START_RANGE = 1;
	final static  int END_RANGE = 100;
	public static void main(String[] args) {
		
		int length = 10, breadth = 10, radius = 10, side = 10;
		
		double squareArea = side * side;
		double rectangleArea = length * breadth;
		double triangleArea = 2 * radius * Math.PI;
		
		String square = "square", triangle ="triangle", rectangle = "rectangle";

		checkAcceptance(square, squareArea);
		checkAcceptance(triangle, triangleArea);
		checkAcceptance(rectangle, rectangleArea);
	}

	private static void checkAcceptance(String shape, double area) {
		if (area>=START_RANGE && area<=END_RANGE) {
			System.out.println("The area of " + shape + " is " + area + " which is acceptable");
		} else {
			System.out.println("The area of " + shape + " is " + area + " which is not acceptable");
		}
	}
}
