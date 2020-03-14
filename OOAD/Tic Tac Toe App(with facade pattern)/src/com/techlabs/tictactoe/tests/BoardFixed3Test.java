package com.techlabs.tictactoe.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.board.BoardFixed3;
import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.mark.Mark;

class BoardFixed3Test {

	IBoardable iBoardable = new BoardFixed3();

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
	void check_if_borad_full() {

		System.out.println("marking all cells as O");
		for (int i = 0; i < iBoardable.getSize(); i++) {
				iBoardable.getCells1DArray()[i].setMark(Mark.O);
		}
		
		display_board();

		System.out.println("Checking board is full");
		if (iBoardable.checkIfBoardFull()) {
			System.out.println("board is full");
		} else if (iBoardable.checkIfBoardFull() == false) {
			System.out.println("board is not full");
		}

		System.out.println("marking one cell as blank");
		iBoardable.getCells1DArray()[0].setMark(Mark.BLANK);
		System.out.println("Checking borad is full");
		if (iBoardable.checkIfBoardFull()) {
			System.out.println("board is full");
		} else if (iBoardable.checkIfBoardFull() == false) {
			System.out.println("board is not full");
		}
	}

	void display_board() {

		for (int i = 0; i < iBoardable.getSize(); i++) {
			System.out.print(iBoardable.getCells1DArray()[i].getMark() + " ");
			if (((i + 1) % 3) == 0) {
				System.out.println();
			}
		}
	}
}
