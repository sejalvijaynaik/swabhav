package com.techlabs.tictactoe.board;

import com.techlabs.tictactoe.cell.Cell;
import com.techlabs.tictactoe.mark.Mark;

public class BoardVariable implements IBoardable{

	private Cell[][] cells;
	private int size;

	public BoardVariable(int size) {

		this.size = size;
		cells = new Cell[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Cell cell = new Cell();
				cells[i][j] = cell;
			}
		}
	}
	
	@Override
	public Cell[][] getCells2DArray() {
		return cells;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	@Override
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

	@Override
	public Cell[] getCells1DArray() {
		return null;
	}
}
