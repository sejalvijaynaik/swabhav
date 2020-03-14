package com.techlabs.tictactoe.analyzer;

import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.mark.Mark;

public class ResultAnalyzerVariable implements IResultAnalyzable {

	private IBoardable iBoardable;
	private int countMark = 0;
	private Mark mark;

	public ResultAnalyzerVariable(IBoardable iBoardable) {
		this.iBoardable = iBoardable;
	}

	@Override
	public IBoardable getboard() {
		return iBoardable;
	}

	@Override
	public void setMark(Mark mark) {
		this.mark = mark;
	}

	@Override
	public boolean checkRowsMatch() {

		countMark = 0;
		for (int i = 0; i < iBoardable.getSize(); i++) {
			for (int j = 0; j < iBoardable.getSize(); j++) {
				if (iBoardable.getCells2DArray()[i][j].getMark() == mark) {
					countMark++;
				}
			}
			if (countMark == iBoardable.getSize()) {
				return true;
			} else {
				countMark = 0;
			}
		}
		return false;
	}

	@Override
	public boolean checkColumnsMatch() {

		countMark = 0;
		for (int i = 0; i < iBoardable.getSize(); i++) {
			for (int j = 0; j < iBoardable.getSize(); j++) {
				if (iBoardable.getCells2DArray()[j][i].getMark() == mark) {
					countMark++;
				}
			}
			if (countMark == iBoardable.getSize()) {
				return true;
			} else {
				countMark = 0;
			}
		}
		return false;
	}

	@Override
	public boolean checkDiagonalMatch() {

		countMark = 0;
		for (int i = 0; i < iBoardable.getSize(); i++) {
			if (iBoardable.getCells2DArray()[i][i].getMark() == mark) {
				countMark++;
			}
		}
		if (countMark == iBoardable.getSize()) {
			return true;
		} else {
			countMark = 0;
		}
		return false;
	}

	@Override
	public boolean checkReverseDiagonalMatch() {

		countMark = 0;
		for (int i = 0, j = iBoardable.getSize() - 1; i < iBoardable.getSize() && j >= 0; i++, j--) {
			if (iBoardable.getCells2DArray()[i][j].getMark() == mark) {
				countMark++;
			}
		}
		if (countMark == iBoardable.getSize()) {
			return true;
		} else {
			countMark = 0;
		}
		return false;
	}

	@Override
	public boolean checkStatus(Mark mark) {

		this.mark = mark;
		if (checkRowsMatch()) {
			return true;
		}
		if (checkColumnsMatch()) {
			return true;
		}
		if (checkDiagonalMatch()) {
			return true;
		}
		if (checkReverseDiagonalMatch()) {
			return true;
		}
		return false;
	}
}