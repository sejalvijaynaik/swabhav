package com.techlabs.tictactoe.analyzer;

import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.mark.Mark;

public class ResultAnalyzerFixed3 implements IResultAnalyzable {

	private IBoardable iBoardable;
	private Mark mark;

	public ResultAnalyzerFixed3(IBoardable iBoardable) {
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
		if ((iBoardable.getCells1DArray()[0].getMark() == mark) && (iBoardable.getCells1DArray()[1].getMark() == mark)
				&& (iBoardable.getCells1DArray()[2].getMark() == mark)) {
			return true;
		}
		if ((iBoardable.getCells1DArray()[3].getMark() == mark) && (iBoardable.getCells1DArray()[4].getMark() == mark)
				&& (iBoardable.getCells1DArray()[5].getMark() == mark)) {
			return true;
		}
		if ((iBoardable.getCells1DArray()[6].getMark() == mark) && (iBoardable.getCells1DArray()[7].getMark() == mark)
				&& (iBoardable.getCells1DArray()[8].getMark() == mark)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkColumnsMatch() {
		if ((iBoardable.getCells1DArray()[0].getMark() == mark) && (iBoardable.getCells1DArray()[3].getMark() == mark)
				&& (iBoardable.getCells1DArray()[6].getMark() == mark)) {
			return true;
		}
		if ((iBoardable.getCells1DArray()[1].getMark() == mark) && (iBoardable.getCells1DArray()[4].getMark() == mark)
				&& (iBoardable.getCells1DArray()[7].getMark() == mark)) {
			return true;
		}
		if ((iBoardable.getCells1DArray()[2].getMark() == mark) && (iBoardable.getCells1DArray()[5].getMark() == mark)
				&& (iBoardable.getCells1DArray()[8].getMark() == mark)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkDiagonalMatch() {
		if ((iBoardable.getCells1DArray()[0].getMark() == mark) && (iBoardable.getCells1DArray()[4].getMark() == mark)
				&& (iBoardable.getCells1DArray()[8].getMark() == mark)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkReverseDiagonalMatch() {
		if ((iBoardable.getCells1DArray()[2].getMark() == mark) && (iBoardable.getCells1DArray()[4].getMark() == mark)
				&& (iBoardable.getCells1DArray()[6].getMark() == mark)) {
			return true;
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
