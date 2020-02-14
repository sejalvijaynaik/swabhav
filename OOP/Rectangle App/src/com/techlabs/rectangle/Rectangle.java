package com.techlabs.rectangle;

public class Rectangle {
	private int length;
	private int breadth;
	private String color;
	private static final int RANGE_LOWER_BOUND = 1;
	private static final int RANGE_UPPER_BOUND = 100;
	private static final String BIG_RECTANGLE_COLOR = "black";
	private static final String SMALL_RECTANGLE_COLOR = "red";
	
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public String getColor() {
		return color;
	}

	public void setLength(int length) {
		this.length = length;
		this.length = checkDimensionRange(this.length);
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
		this.breadth = checkDimensionRange(this.breadth);
	}

	public void setColor(String color) {
		if(length >= 50) {
			this.color = checkColorRange(this.color, BIG_RECTANGLE_COLOR);
			return;
		}
		this.color = checkColorRange(this.color, SMALL_RECTANGLE_COLOR);
	}

	public double calculateArea() {
		double area = length * breadth;
		return area;
	}
	
	private int checkDimensionRange(int number) {
		return number < RANGE_LOWER_BOUND ? RANGE_LOWER_BOUND : 
			number > RANGE_UPPER_BOUND ? RANGE_UPPER_BOUND : number;
	}
	
	private String checkColorRange(String color, String defaultColor) {
		if(color.equalsIgnoreCase("red")) {
			return color;
		}
		if(color.equalsIgnoreCase("blue")) {
			return color;
		}
		if(color.equalsIgnoreCase("yellow")) {
			return color;
		}
		return color = defaultColor;
/*		return color = color.equalsIgnoreCase("red") ? color
				: color.equalsIgnoreCase("yellow") ? color : 
					color.equalsIgnoreCase("blue") ? color : defaultColor;*/
	}
}
