package com.techlabs.tictactoe.board;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.mark.Mark;

class BoardTest {

	@Test
	void test() {

		int size = 4;
		Board board = new Board(size);

		int counter = 0;
		int boardTotalCells = board.getSize() * board.getSize();

		for (int i = 0; i < board.getSize(); i++) {

			for (int j = 0; j < board.getSize(); j++) {

				board.getCells()[i][j].setMark(Mark.X);
			}

		}

		if (!board.checkIfBoardFull()) {

			board.getCells()[0][2].setMark(Mark.O);

		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(board.getCells()[i][j].getMark());
			}
			System.out.println();
		}

		// System.out.println("Size entered :" + size);
		// System.out.println("Cells created :" + board.getCells()[0].length);

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(board.getCells()[i][j].getRowNumber() + ""
						+ board.getCells()[i][j].getColumnNumber() + " ");
			}
			System.out.println();

		}
	}

}
