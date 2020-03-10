package com.techlabs.tictactoe.board;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.mark.Mark;

class BoardTest {

	int size = 4;
	Board board = new Board(size);

	@Test
	void check_size_of_board() {

		System.out.println("Board size :" + board.getSize());
	}

	@Test
	void check_row_and_column_numbers_of_all_cells() {

		System.out.println("Row and column numbers");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(
						board.getCells()[i][j].getRowNumber() + "" + board.getCells()[i][j].getColumnNumber() + " ");
			}
			System.out.println();

		}
	}

	@Test
	void check_initial_value_all_cells() {

		System.out.println("Initial values :");
		display_board();

	}

	@Test
	void mark_all_cells_as_X()
	{

		System.out.println("marking all cells as X");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				board.getCells()[i][j].setMark(Mark.X);
			}
		}
		display_board();
	}
	
	@Test
	void check_if_borad_full(){
		
		System.out.println("marking all cells as O");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				board.getCells()[i][j].setMark(Mark.O);
			}
		}
		display_board();
		
		System.out.println("Checking board is full");
		if(board.checkIfBoardFull()) {
			System.out.println("board is full");
		}
		else if (board.checkIfBoardFull() == false) {
			System.out.println("board is not full");
		}
		
		System.out.println("marking one cell as blank");
		board.getCells()[0][0].setMark(Mark.BLANK); 
		
		System.out.println("Checking borad is full");
		if(board.checkIfBoardFull()) {
			System.out.println("board is full");
		}
		else if (board.checkIfBoardFull() == false) {
			System.out.println("board is not full");
		}
		
		
	}

	void display_board() {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(board.getCells()[i][j].getMark() + " ");
			}
			System.out.println();
		}
	}

}
