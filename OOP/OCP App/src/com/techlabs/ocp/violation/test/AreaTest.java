package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.Area;
import com.techlabs.ocp.violation.Circle;
import com.techlabs.ocp.violation.Rectangle;
import com.techlabs.ocp.violation.Square;

public class AreaTest {
	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
		Rectangle rectangle = new Rectangle(10, 5);
		Square square = new Square(10);
		
		Area area = new Area();
		
		double circleArea = area.calculateCircleArea(circle);
		double rectangleArea = area.calculateRectangleArea(rectangle);
		double squareArea = area.calculateSquareArea(square);
		
		System.out.println("Circle area :" + circleArea );
		System.out.println("Rectangle Area :" + rectangleArea);
		System.out.println("Square Area :" + squareArea);
	}

}
