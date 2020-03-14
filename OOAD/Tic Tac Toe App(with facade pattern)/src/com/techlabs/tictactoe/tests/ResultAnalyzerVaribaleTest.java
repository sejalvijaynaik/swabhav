package com.techlabs.tictactoe.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.analyzer.ResultAnalyzerVariable;
import com.techlabs.tictactoe.board.BoardVariable;
import com.techlabs.tictactoe.mark.Mark;

class ResultAnalyzerVaribaleTest {

	int size = 3;
	ResultAnalyzerVariable resultAnalyzer = new ResultAnalyzerVariable(new BoardVariable(size));

	@Test
	void check_row_match() {

		resultAnalyzer.getboard().getCells2DArray()[0][0].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[0][1].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[2][2].setMark(Mark.X);

		resultAnalyzer.setMark(Mark.X);
		if (resultAnalyzer.checkRowsMatch()) {
			System.out.println("Rows match");
		}
		else {
			System.out.println("rows dont match");
		}
	}
	
	@Test
	void check_column_match() {

		resultAnalyzer.getboard().getCells2DArray()[0][2].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[1][2].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[2][2].setMark(Mark.X);

		resultAnalyzer.setMark(Mark.X);
		if (resultAnalyzer.checkColumnsMatch()) {
			System.out.println("Column match");
		}
		else {
			System.out.println("column doesnt match");
		}
	}
	
	@Test
	void check_diagonal_match() {

		resultAnalyzer.getboard().getCells2DArray()[0][0].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[1][1].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[2][2].setMark(Mark.X);

		resultAnalyzer.setMark(Mark.X);
		if (resultAnalyzer.checkDiagonalMatch()) {
			System.out.println("Diagonal match");
		}
		else {
			System.out.println("Diagonal doesnt match");
		}
	}
	
	@Test
	void check_reverse_diagonal_match() {

		resultAnalyzer.getboard().getCells2DArray()[0][2].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[1][1].setMark(Mark.X);
		resultAnalyzer.getboard().getCells2DArray()[2][0].setMark(Mark.X);

		resultAnalyzer.setMark(Mark.X);
		if (resultAnalyzer.checkReverseDiagonalMatch()) {
			System.out.println("Reverse Diagonal match");
		}
		else {
			System.out.println("Reverse Diagonal doesnt match");
		}
	}

	@AfterEach
	void display_board() {

		for (int i = 0; i < resultAnalyzer.getboard().getSize(); i++) {
			for (int j = 0; j < resultAnalyzer.getboard().getSize(); j++) {

				System.out.print(resultAnalyzer.getboard().getCells2DArray()[i][j].getMark() + " ");
			}
			System.out.println();
		}
	}
}
