package com.techlabs.tictactoe.tests;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.board.BoardVariable;
import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.mark.Mark;

class BoardVariableTest {

	int size = 4;
	IBoardable iBoardable = new BoardVariable(size);

	@Test
	void check_size_of_board() {

		System.out.println("Board size :" + iBoardable.getSize());
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

				iBoardable.getCells2DArray()[i][j].setMark(Mark.X);
			}
		}
		display_board();
	}
	
	@Test
	void check_if_borad_full(){
		
		System.out.println("marking all cells as O");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				iBoardable.getCells2DArray()[i][j].setMark(Mark.O);
			}
		}
		display_board();
		
		System.out.println("Checking board is full");
		if(iBoardable.checkIfBoardFull()) {
			System.out.println("board is full");
		}
		else if (iBoardable.checkIfBoardFull() == false) {
			System.out.println("board is not full");
		}
		
		System.out.println("marking one cell as blank");
		iBoardable.getCells2DArray()[0][0].setMark(Mark.BLANK); 
		
		System.out.println("Checking borad is full");
		if(iBoardable.checkIfBoardFull()) {
			System.out.println("board is full");
		}
		else if (iBoardable.checkIfBoardFull() == false) {
			System.out.println("board is not full");
		}
		
		
	}

	void display_board() {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(iBoardable.getCells2DArray()[i][j].getMark() + " ");
			}
			System.out.println();
		}
	}

}
