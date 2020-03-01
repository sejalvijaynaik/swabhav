package com.techlabs.tictactoe.analyzer;

import com.techlabs.tictactoe.board.TicTacToeBoard;

public class TicTacToeAnalyzer {

	private TicTacToeBoard ticTacToeBoard;
	int countForX, countForO;

	public TicTacToeAnalyzer(TicTacToeBoard ticTacToeBoard) {
		this.ticTacToeBoard = ticTacToeBoard;
	}

	public TicTacToeBoard getTicTacToeBoard() {
		return ticTacToeBoard;
	}

	public void addXO(char xo, int row, int column) {

		ticTacToeBoard.getBoardArray()[row][column] = xo;
	}

	public char checkStatus() {

		countForX = 0;
		countForO = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (ticTacToeBoard.getBoardArray()[i][j] == 'X') {
					countForX++;
				} else if (ticTacToeBoard.getBoardArray()[i][j] == 'O') {
					countForO++;
				}
			}
			if (countForX == 3) {
				return 'X';
			} else {
				countForX = 0;
			}
			if (countForO == 3) {
				return 'O';
			} else {
				countForO = 0;
			}

			for (int j = 0; j < 3; j++) {

				if (ticTacToeBoard.getBoardArray()[j][i] == 'X') {
					countForX++;
				} else if (ticTacToeBoard.getBoardArray()[j][i] == 'O') {
					countForO++;
				}
			}

			if (countForX == 3) {
				return 'X';
			} else {
				countForX = 0;
			}
			if (countForO == 3) {
				return 'O';
			} else {
				countForO = 0;
			}
		}

		for (int i = 0; i < 3; i++) {

			if (ticTacToeBoard.getBoardArray()[i][i] == 'X') {
				countForX++;
			} else if (ticTacToeBoard.getBoardArray()[i][i] == 'O') {
				countForO++;

			}
		}
		if (countForX == 3) {
			return 'X';
		} else {
			countForX = 0;
		}
		if (countForO == 3) {
			return 'O';
		} else {
			countForO = 0;
		}

		for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {

			if (ticTacToeBoard.getBoardArray()[i][j] == 'X') {
				countForX++;
			} else if (ticTacToeBoard.getBoardArray()[i][j] == 'O') {
				countForO++;
			}
		}

		if (countForX == 3) {
			return 'X';
		} else {
			countForX = 0;
		}
		if (countForO == 3) {
			return 'O';
		} else {
			countForO = 0;
		}
		return '*';
	}

	public boolean checkIfBoardFull() {

		boolean boradFull = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (ticTacToeBoard.getBoardArray()[i][j] == '*') {
					return boradFull;
				}
			}
		}
		boradFull = true;
		return boradFull;
	}
	
	public boolean checkCellTaken(int row, int column) {
		
		boolean cellTaken = false;
		if(ticTacToeBoard.getBoardArray()[row][column] != '*') {
			cellTaken = true;
			return cellTaken;
		}
		return cellTaken;
	}
}
