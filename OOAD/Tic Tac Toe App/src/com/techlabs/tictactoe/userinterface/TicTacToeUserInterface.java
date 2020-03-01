package com.techlabs.tictactoe.userinterface;

import java.util.Scanner;

import com.techlabs.tictactoe.analyzer.TicTacToeAnalyzer;
import com.techlabs.tictactoe.board.TicTacToeBoard;

public class TicTacToeUserInterface {

	TicTacToeAnalyzer ticTacToeAnalyzer;
	Scanner input = new Scanner(System.in);
	boolean cellTaken = false;

	public TicTacToeUserInterface() {
		ticTacToeAnalyzer = new TicTacToeAnalyzer(new TicTacToeBoard());
	}

	public void UserPlay() {

		System.out.println("Game starts");
		display();
		char xo = '*';
		boolean boardFull;

		while (xo == '*') {

			do {
				if(cellTaken) {
					System.out.println("Cell taken, enter some other row and column");
				}
				System.out.println("User 1 turn (X)");
				xo = userInput('X');
			} while (cellTaken);
			
			if (xo == 'X') {
				System.out.println("User 1 wins!!!!!");
				input.close();
				return;
			}
			boardFull = ticTacToeAnalyzer.checkIfBoardFull();
			if (boardFull) {
				System.out.println("No one wins");
				return;
			}

			do {
				if(cellTaken) {
					System.out.println("Cell taken, enter some other row and column");
				}
				System.out.println("User 2 turn (O)");
				xo = userInput('O');
			} while (cellTaken);

			if (xo == 'O') {
				System.out.println("User 2 wins!!!!!");
				input.close();
				return;
			}
			boardFull = ticTacToeAnalyzer.checkIfBoardFull();
			if (boardFull) {
				System.out.println("No one wins");
				return;
			}
		}
	}

	public char userInput(char userXO) {
		char xo = '*';
		int rowInput, columnInput;
		String rowInputInString, columnInputInStirng;

		System.out.println("Enter the row number");
		rowInputInString = input.nextLine();
		rowInput = Integer.parseInt(rowInputInString);

		System.out.println("Enter column number");
		columnInputInStirng = input.nextLine();
		columnInput = Integer.parseInt(columnInputInStirng);

		cellTaken = ticTacToeAnalyzer.checkCellTaken(rowInput, columnInput);
		if (cellTaken) {
			return xo;
		}

		ticTacToeAnalyzer.addXO(userXO, rowInput, columnInput);
		xo = ticTacToeAnalyzer.checkStatus();
		display();

		return xo;
	}

	public void display() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ticTacToeAnalyzer.getTicTacToeBoard().getBoardArray()[i][j] + " ");
			}
			System.out.println();
		}
	}
}
