package com.techlabs.tictactoe.analyzer;

import com.techlabs.tictactoe.board.Board;
import com.techlabs.tictactoe.mark.Mark;

public class ResultAnalyzer {

	private Board board;
	private int countMark = 0;
	private Mark mark;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public Board getboard() {
		return board;
	}
	
	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public boolean checkRowsMatch() {

		countMark = 0;

		for (int i = 0; i < board.getSize(); i++) {

			for (int j = 0; j < board.getSize(); j++) {

				if (board.getCells()[i][j].getMark() == mark) {
					countMark++;
				}
			}
			if (countMark == board.getSize()) {
				return true;
			} else {
				countMark = 0;
			}
		}
		return false;
	}

	public boolean checkColumnsMatch() {

		countMark = 0;

		for (int i = 0; i < board.getSize(); i++) {

			for (int j = 0; j < board.getSize(); j++) {

				if (board.getCells()[j][i].getMark() == mark) {
					countMark++;
				}
			}
			if (countMark == board.getSize()) {
				return true;
			} else {
				countMark = 0;
			}
		}
		return false;
	}

	public boolean checkDiagonalMatch() {

		countMark = 0;

		for (int i = 0; i < board.getSize(); i++) {

			if (board.getCells()[i][i].getMark() == mark) {
				countMark++;

			}
		}

		if (countMark == board.getSize()) {
			return true;
		} else {
			countMark = 0;
		}
		return false;
	}

	public boolean checkReverseDiagonalMatch() {

		countMark = 0;

		for (int i = 0, j = board.getSize() - 1; i < board.getSize() && j >= 0; i++, j--) {

			if (board.getCells()[i][j].getMark() == mark) {
				countMark++;
			}
		}

		if (countMark == board.getSize()) {
			return true;
		} else {
			countMark = 0;
		}
		return false;
	}

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
