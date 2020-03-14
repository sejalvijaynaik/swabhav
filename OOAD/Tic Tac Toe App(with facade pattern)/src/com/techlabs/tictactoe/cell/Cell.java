package com.techlabs.tictactoe.cell;

import com.techlabs.tictactoe.mark.Mark;

public class Cell {

	private Mark mark;

	public Cell() {
		this.mark = Mark.BLANK;
	}

	public Mark getMark() {
		return mark;
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
