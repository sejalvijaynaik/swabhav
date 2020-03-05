package com.techlabs.tictactoe.cell;

import com.techlabs.tictactoe.mark.Mark;

public class Cell {

	private Mark mark;
	private int rowNumber;
	private int columnNumber;

	public Cell(int rowNumber, int columnNumber) {
		this.mark = Mark.BLANK;
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}

	public Mark getMark() {
		return mark;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	public boolean checkCellTaken() {
		if(this.mark != Mark.BLANK) {
			return true;
		}
		return false;
	}
}
