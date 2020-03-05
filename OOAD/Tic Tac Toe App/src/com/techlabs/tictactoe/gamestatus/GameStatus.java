package com.techlabs.tictactoe.gamestatus;

public enum GameStatus {
	
	WIN,
	DRAW,
	INPROGRESS;
	
	@Override
	public String toString() {

		switch (this) {

		case WIN:
			return "WIN!!!";
		case DRAW:
			return "DRAW!!!";
		case INPROGRESS:
			return "IN PROGRESS";
		}
		return null;
	}

}
