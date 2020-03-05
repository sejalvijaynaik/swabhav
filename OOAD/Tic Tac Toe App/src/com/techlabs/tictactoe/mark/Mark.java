package com.techlabs.tictactoe.mark;

public enum Mark {

	X, O, BLANK;

	@Override
	public String toString() {

		switch (this) {

		case X:
			return "X";
		case O:
			return "O";
		case BLANK:
			return "*";
		}
		return null;
	}
}
