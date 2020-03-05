package com.techlabs.tictactoe.analyzer;


import org.junit.jupiter.api.Test;
import com.techlabs.tictactoe.board.Board;
import com.techlabs.tictactoe.mark.Mark;

class ResultAnalyzerTest {

	@Test
	void test() {

		int size = 3;
		Board board = new Board(size);
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		
		resultAnalyzer.getboard().getCells()[0][0].setMark(Mark.X);
		resultAnalyzer.getboard().getCells()[1][1].setMark(Mark.X);
		resultAnalyzer.getboard().getCells()[2][2].setMark(Mark.X);
		
		for(int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				
				System.out.print(board.getCells()[i][j].getMark() + " ");
			}
			System.out.println();
		}
		
		boolean rowsMatch = resultAnalyzer.checkStatus(Mark.O);
		System.out.println(rowsMatch);
		
		

		

	}
}
