package com.techlabs.circle.test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f);
		printInfo(c1);

		Circle c2 = new Circle(6.6f, BorderStyle.DOTTED);
		printInfo(c2);

		Circle c3 = new Circle(4.5f);
		printInfo(c3);

		Circle c4 = new Circle(2.3f, BorderStyle.DOUBLE);
		printInfo(c4);

		Circle[] circles = { c1, c2, c3, c4 };
		System.out.println("----Display Circles with circles array----");
		printInfo(circles);
		
		Circle bigCircle = findBiggerCircle(circles);
		System.out.println("----Biggest Circle----");
		printInfo(bigCircle);
	}

	public static void printInfo(Circle circle) {
		System.out.println("----Circle Info----");
		System.out.println("Radius :" + circle.getRadius());
		System.out.println("Border :" + circle.getBorder());
		System.out.println("Circumference :" + circle.calculateCircumference());
	}

	public static void printInfo(Circle[] circles) {
		for (Circle tempCircle : circles) {
			printInfo(tempCircle);
		}
	}

	public static Circle findBiggerCircle(Circle[] circles) {
		float bigRadius = circles[0].getRadius();
		Circle bigCircle = circles[0];
		for(Circle tempCircle : circles) {
			if(tempCircle.getRadius() > bigRadius) {
				bigRadius = tempCircle.getRadius();
				bigCircle = tempCircle;
			}
		}
		return bigCircle;
	}
}
