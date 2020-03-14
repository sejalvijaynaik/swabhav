package com.techlabs.tictactoe.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.analyzer.IResultAnalyzable;
import com.techlabs.tictactoe.analyzer.ResultAnalyzerFixed3;
import com.techlabs.tictactoe.board.BoardFixed3;
import com.techlabs.tictactoe.mark.Mark;

class ResultAnalyzerFixed3Test {
	IResultAnalyzable iResultAnalyzable = new ResultAnalyzerFixed3(new BoardFixed3());

	@Test
	void check_row_match() {

		iResultAnalyzable.getboard().getCells1DArray()[6].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[7].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[0].setMark(Mark.X);

		iResultAnalyzable.setMark(Mark.X);
		if (iResultAnalyzable.checkRowsMatch()) {
			System.out.println("Rows match");
		}
		else {
			System.out.println("rows dont match");
		}
	}
	
	@Test
	void check_column_match() {

		iResultAnalyzable.getboard().getCells1DArray()[1].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[4].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[7].setMark(Mark.X);

		iResultAnalyzable.setMark(Mark.X);
		if (iResultAnalyzable.checkColumnsMatch()) {
			System.out.println("Column match");
		}
		else {
			System.out.println("column doesnt match");
		}
	}
	
	@Test
	void check_diagonal_match() {

		iResultAnalyzable.getboard().getCells1DArray()[0].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[4].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[1].setMark(Mark.X);

		iResultAnalyzable.setMark(Mark.X);
		if (iResultAnalyzable.checkDiagonalMatch()) {
			System.out.println("Diagonal match");
		}
		else {
			System.out.println("Diagonal doesnt match");
		}
	}

	@Test
	void check_reverse_diagonal_match() {

		iResultAnalyzable.getboard().getCells1DArray()[2].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[4].setMark(Mark.X);
		iResultAnalyzable.getboard().getCells1DArray()[0].setMark(Mark.X);

		iResultAnalyzable.setMark(Mark.X);
		if (iResultAnalyzable.checkReverseDiagonalMatch()) {
			System.out.println("Reverse Diagonal match");
		}
		else {
			System.out.println("Reverse Diagonal doesnt match");
		}
	}
	@AfterEach
	void display_board() {

		for (int i = 0; i < iResultAnalyzable.getboard().getSize(); i++) {

			System.out.print(iResultAnalyzable.getboard().getCells1DArray()[i].getMark() + " ");
			if (((i + 1) % 3) == 0) {
				System.out.println();
			}
		}
	}
}
