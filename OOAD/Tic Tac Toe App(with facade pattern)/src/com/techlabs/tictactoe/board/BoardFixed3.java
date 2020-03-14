package com.techlabs.tictactoe.board;

import com.techlabs.tictactoe.cell.Cell;
import com.techlabs.tictactoe.mark.Mark;

public class BoardFixed3 implements IBoardable{
	
	private Cell[] cells;
	private final static int BOARD_SIZE = 9;

	public BoardFixed3() {
		cells = new Cell[BOARD_SIZE];
		for (int i = 0; i < BOARD_SIZE; i++) {
			Cell cell = new Cell();
			cells[i] = cell;
		}
	}

	@Override
	public Cell[][] getCells2DArray() {
		return null;
	}

	@Override
	public Cell[] getCells1DArray() {
		return cells;
	}

	@Override
	public int getSize() {
		return BOARD_SIZE;
	}

	@Override
	public boolean checkIfBoardFull() {

		for (int i = 0; i < BOARD_SIZE; i++) {
				if (cells[i].getMark() == Mark.BLANK) {
					return false;
				}
			}
		return true;
	}
}
