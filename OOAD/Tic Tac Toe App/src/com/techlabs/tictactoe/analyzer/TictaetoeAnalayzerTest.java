package com.techlabs.tictactoe.analyzer;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.board.TicTacToeBoard;

class TictaetoeAnalayzerTest {

	@Test
	void test() {

		TicTacToeAnalyzer ticTacToeAnalyzer = new TicTacToeAnalyzer(new TicTacToeBoard());

		char xo;

		ticTacToeAnalyzer.addXO('X', 0, 2);
		ticTacToeAnalyzer.addXO('O', 1, 0);
		ticTacToeAnalyzer.addXO('X', 1, 1);
		ticTacToeAnalyzer.addXO('O', 1, 2);
		ticTacToeAnalyzer.addXO('X', 2, 0);

		ticTacToeAnalyzer.display();
		xo = ticTacToeAnalyzer.checkStatus();
		System.out.println(xo);

		




	}

}
