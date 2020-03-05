package com.techlabs.tictactoe.board;

import com.techlabs.tictactoe.cell.Cell;
import com.techlabs.tictactoe.mark.Mark;

public class Board {

	private Cell[][] cells;
	private int size;

	public Board(int size) {

		this.size = size;
		cells = new Cell[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Cell cell = new Cell(i, j);
				cells[i][j] = cell;
			}
		}
	}

	public Cell[][] getCells() {
		return cells;
	}

	public int getSize() {
		return size;
	}

	public boolean checkIfBoardFull() {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (cells[i][j].getMark() == Mark.BLANK) {
					return false;
				}
			}
		}
		return true;
	}
}
