package com.techhlabs.lsp.solution;

public class Square implements iShapeable{

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		return (side * side);
	}
}
