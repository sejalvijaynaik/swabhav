package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args){
		
		Rectangle small = new Rectangle();
		
		small.setLength(10);
		small.setBreadth(30);
	 // small.setLength(-20);
	//	small.setBreadth(102);
	//	small.setLength(0);
	//	small.setBreadth(100);
		small.setColor("green");
		
		System.out.println("--Small Rectangle Info--");
		printInfo(small);
		
		Rectangle big = new Rectangle();
		
		big.setLength(50);
		big.setBreadth(100);
		big.setColor("green");
		
		System.out.println("--Big Rectangle Info--");
		printInfo(big);
	}
	
	public static void printInfo(Rectangle rectangle) {
		
		System.out.println("Length :" + rectangle.getLength());
		System.out.println("Breadth :" + rectangle.getBreadth());
		System.out.println("Area :" + rectangle.calculateArea());
		System.out.println("Color :" + rectangle.getColor());
	}
}
