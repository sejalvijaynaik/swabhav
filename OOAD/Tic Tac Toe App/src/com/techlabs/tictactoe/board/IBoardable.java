package com.techlabs.tictactoe.board;

import com.techlabs.tictactoe.cell.Cell;

public interface IBoardable {

	public Cell[][] getCells2DArray();

	public Cell[] getCells1DArray();

	public int getSize();

	public boolean checkIfBoardFull();
}
