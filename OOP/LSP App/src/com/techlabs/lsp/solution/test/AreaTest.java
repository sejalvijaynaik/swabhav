package com.techlabs.lsp.solution.test;

import com.techhlabs.lsp.solution.Rectangle;
import com.techhlabs.lsp.solution.Square;
import com.techhlabs.lsp.solution.iShapeable;

public class AreaTest {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 5);
		Square square = new Square(10);
		printShapeArea(rectangle);
		printShapeArea(square);
	}
	
	public static void printShapeArea(iShapeable iShapeable) {
		
		System.out.println("Area :" + iShapeable.area());
	}

}
