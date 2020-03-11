package com.techlabs.facade.pattern.shapemaker;

import com.techlabs.facade.pattern.rectangle.Rectangle;
import com.techlabs.facade.pattern.square.Square;
import com.techlabs.facade.pattren.circle.Circle;

public class ShapeMaker {
	
	private Square square;
	private Rectangle rectangle;
	private Circle circle;
	
	public ShapeMaker() {
	
		square = new Square();
		rectangle = new Rectangle();
		circle = new Circle();
	}
	
	public void drawSquare() {
		square.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawCircle() {
		circle.draw();
	}
}
