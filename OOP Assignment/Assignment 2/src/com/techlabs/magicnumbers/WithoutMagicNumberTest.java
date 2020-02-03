package com.techlabs.magicnumbers;

public class WithoutMagicNumberTest {
	public static void main(String[] args) {
		int length = 10, breadth = 10, radius = 10, side = 10;

		double squareArea = side * side;
		double rectangleArea = length * breadth;
		double triangleArea = 2 * radius * Math.PI;

		System.out.println("When 100 or above is an acceptable number :");
		checkAcceptance100(squareArea, rectangleArea, triangleArea);
		System.out.println();

		System.out.println("When 50 or more is an acceptable number :");
		checkAcceptance50(squareArea, rectangleArea, triangleArea);
		System.out.println();
	}

	private static void checkAcceptance50(double squareArea, double rectangleArea, double triangleArea) {
		if (squareArea >= 50) {
			System.out.println("The area of square is " + squareArea + " which is acceptable");
		} else {
			System.out.println("The area of square is " + squareArea + " which is not acceptable");
		}

		if (rectangleArea >= 50) {
			System.out.println("The area of rectangle is " + rectangleArea + " which is acceptable");
		} else {
			System.out.println("The area of rectangle is " + rectangleArea + " which is not acceptable");
		}

		if (triangleArea >= 50) {
			System.out.println("The area of triangle is " + triangleArea + " which is acceptable");
		} else {
			System.out.println("The area of triangle is " + triangleArea + " which is not acceptable");
		}
	}

	private static void checkAcceptance100(double squareArea, double rectangleArea, double triangleArea) {
		if (squareArea >= 100) {
			System.out.println("The area of square is " + squareArea + " which is acceptable");
		} else {
			System.out.println("The area of square is " + squareArea + " which is not acceptable");
		}

		if (rectangleArea >= 100) {
			System.out.println("The area of rectangle is " + rectangleArea + " which is acceptable");
		} else {
			System.out.println("The area of rectangle is " + rectangleArea + " which is not acceptable");
		}

		if (triangleArea >= 100) {
			System.out.println("The area of triangle is " + triangleArea + " which is acceptable");
		} else {
			System.out.println("The area of triangle is " + triangleArea + " which is not acceptable");
		}
	}
}
