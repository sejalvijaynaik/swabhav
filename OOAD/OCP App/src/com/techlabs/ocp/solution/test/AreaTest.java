package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.Area;
import com.techlabs.ocp.solution.AreaInterface;
import com.techlabs.ocp.solution.Circle;
import com.techlabs.ocp.solution.Rectangle;
import com.techlabs.ocp.solution.Square;

public class AreaTest {
	public static void main(String[] args) {
		
		Area area = new Area(new Circle(10));
		double areaNumber = area.calculateArea();
		System.out.println("Circle area :" + areaNumber );
		
		area = new Area(new Rectangle(10, 5));
		areaNumber = area.calculateArea();
		System.out.println("Rectangle Area :" + areaNumber);
		
		area = new Area(new Square(10));
		areaNumber = area.calculateArea();
		System.out.println("Square Area :" + areaNumber);
	}

}
