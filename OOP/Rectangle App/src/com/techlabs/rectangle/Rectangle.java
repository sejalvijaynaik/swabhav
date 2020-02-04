package com.techlabs.rectangle;

public class Rectangle {
	private int length;
	private int breadth;
	private int area;
	private String color;

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getArea() {
		return area;
	}

	public String getColor() {
		return color;
	}

	public void setLength(int length) {
		this.length = length;
		if (this.length < 1) {
			this.length = 1;
		} else if (this.length > 100) {
			this.length = 100;
		}
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
		if (this.breadth < 1) {
			this.breadth = 1;
		} else if (this.breadth > 100) {
			this.breadth = 100;
		}
	}

	public void setColor(String color) {
		this.color = color;
		if (length >= 50) {
			this.color = color.equalsIgnoreCase("red") ? "red"
					: color.equalsIgnoreCase("yellow") ? "yellow" : color.equalsIgnoreCase("blue") ? "blue" : "black";
		} else {
			this.color = color.equalsIgnoreCase("red") ? "red"
					: color.equalsIgnoreCase("yellow") ? "yellow" : color.equalsIgnoreCase("blue") ? "blue" : "red";
		}
	}

	public double calculateArea() {
		area = length * breadth;
		return area;
	}
}
