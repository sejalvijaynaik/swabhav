package com.techlabs.lsp.violation;

public class Square extends Rectangle {

	private int side;

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setLength(int side) {
		super.setLength(side);
		super.setBreadth(side);
	}

	@Override
	public void setBreadth(int side) {
		super.setLength(side);
		super.setBreadth(side);
	}

	public int getSide() {
		return side;
	}
}
