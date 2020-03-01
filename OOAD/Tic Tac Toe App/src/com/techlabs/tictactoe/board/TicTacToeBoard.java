package com.techlabs.tictactoe.board;

public class TicTacToeBoard {

	private char[][] boardArray;

	public TicTacToeBoard() {
		boardArray = new char[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				boardArray[i][j] = '*';
			}
		}
	}

	public char[][] getBoardArray() {
		return boardArray;
	}

	public void setBoardArray(char[][] boardArray) {
		this.boardArray = boardArray;
	}
}
