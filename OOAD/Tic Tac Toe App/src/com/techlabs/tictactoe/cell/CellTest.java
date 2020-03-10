package com.techlabs.tictactoe.cell;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.mark.Mark;

class CellTest {

	int size = 3;
	Cell cell = new Cell(0, 0);

	@Test
	void check_if_initially_blank() {
		
		System.out.println("initial marking:");
		display_cells();
	}

	@Test
	void chech_rows_and_column_numbers() {

		System.out.println("Row number :" + cell.getRowNumber());
		System.out.println("Column number :" + cell.getColumnNumber());
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
