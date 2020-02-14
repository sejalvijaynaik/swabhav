package com.techlabs.circle;

public class Circle {
	private float radius;
	private BorderStyle border;

	public Circle(float radius) {
		this(radius, BorderStyle.SINGLE);
	}

	public Circle(float radius, BorderStyle border) {
		this.radius = radius;
		this.border = border;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public BorderStyle getBorder() {
		return border;
	}
	
	public double calculateCircumference() {
		return (2*radius*Math.PI);
	}
}
