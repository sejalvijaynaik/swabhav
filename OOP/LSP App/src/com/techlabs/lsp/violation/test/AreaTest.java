package com.techlabs.lsp.violation.test;

import java.io.ObjectInputStream.GetField;

import com.techlabs.lsp.violation.Rectangle;
import com.techlabs.lsp.violation.Square;

public class AreaTest {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 5);
		Rectangle square = new Square(10);
		// areaDisplay(rectangle);
		// areaDisplay(square);
		if (shouldNotChangeLengthIfBreadthChanges(square)) {
			System.out.println("Square");
			
		}
		else {
			System.out.println("Rectangle");
		}
		
		//areaDisplay(square);
	}

	public static void areaDisplay(Rectangle rectangle) {
		System.out.println("Length :" + rectangle.getLength());
		System.out.println("Breadth :" + rectangle.getBreadth());
		double area = rectangle.calculateArea();
		System.out.println("Area :" + area);
	}

	public static boolean shouldNotChangeLengthIfBreadthChanges(Rectangle rectangle) {

		rectangle.setBreadth(rectangle.getLength() + 10);
		int after = rectangle.getBreadth();
		if (rectangle.getLength() == after) {
			return true;
		}
		return false;
	}
}
