package com.techlabs.tictactoe.analyzer;

import com.techlabs.tictactoe.board.BoardVariable;
import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.mark.Mark;

public interface IResultAnalyzable {
	
	public IBoardable getboard();
	public void setMark(Mark mark);
	public boolean checkRowsMatch();
	public boolean checkColumnsMatch();
	public boolean checkDiagonalMatch();
	public boolean checkReverseDiagonalMatch();
	public boolean checkStatus(Mark mark);
}
