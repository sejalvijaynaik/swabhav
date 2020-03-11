package com.techlabs.tictactoe.tests;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.cell.Cell;
import com.techlabs.tictactoe.mark.Mark;

class CellTest {

	int size = 3;
	Cell cell = new Cell();

	@Test
	void check_if_initially_blank() {
		
		System.out.println("initial marking:");
		display_cells();
	}

	@Test
	void set_mark_as_X() {
		System.out.println("After marking X:");
		cell.setMark(Mark.X);
		display_cells();
	}
	
	@Test
	void set_mark_as_O() {
		System.out.println("After marking O:");
		cell.setMark(Mark.O);
		display_cells();
	}

	void display_cells() {

		System.out.println(cell.getMark());
	}
}
