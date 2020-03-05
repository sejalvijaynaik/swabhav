package com.techlabs.tictactoe.cell;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.mark.Mark;

class CellTest {

	@Test
	void test() {

		List<Cell> cells = new ArrayList<>();
		int size = 3;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Cell cell = new Cell(i, j);
				cells.add(cell);
			}
		}

		cells.get(4).setMark(Mark.X);
		if(!cells.get(4).checkCellTaken()) {
			cells.get(4).setMark(Mark.O);
		}
		int counter = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((cells.get(counter).getRowNumber() == i) && (cells.get(counter).getColumnNumber() == j)) {
					System.out.print(cells.get(counter).getMark());
				}
				counter++;
			}
			System.out.println();
		}
		
		counter = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(cells.get(counter).getRowNumber() + ""
						+ cells.get(counter).getColumnNumber() + " ");
				counter++;
			}
			System.out.println();

		}
	}

}
