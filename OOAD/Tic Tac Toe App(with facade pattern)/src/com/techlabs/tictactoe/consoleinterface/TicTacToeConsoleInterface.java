package com.techlabs.tictactoe.consoleinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.tictactoe.analyzer.IResultAnalyzable;
import com.techlabs.tictactoe.analyzer.ResultAnalyzerFixed3;
import com.techlabs.tictactoe.analyzer.ResultAnalyzerVariable;
import com.techlabs.tictactoe.board.BoardFixed3;
import com.techlabs.tictactoe.board.BoardVariable;
import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.game.GameFixed3;
import com.techlabs.tictactoe.game.GameVariable;
import com.techlabs.tictactoe.game.IGameable;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

public class TicTacToeConsoleInterface {

	IGameable iGameable;
	Scanner input = new Scanner(System.in);
	List<Player> players;
	boolean addToken;

	public TicTacToeConsoleInterface() {

		players = new ArrayList<Player>();
	}

	public void start() {
		
		System.out.println("Enter the size of the game");
		int size = input.nextInt();
		
		System.out.println("Enter player 1 name :");
		String playerName = input.next();

		Player player1 = new Player(playerName);

		System.out.println("Enter player 2 name :");
		playerName = input.next();

		Player player2 = new Player(playerName);

		players.add(player1);
		players.add(player2);
		
		if(size == 3) {
			iGameable = new GameFixed3(players);
		}
		else {
			iGameable = new GameVariable(players, size);
		}

		System.out.println("------------Game starts-------------");
		if(iGameable instanceof GameFixed3) {
			display1DArrayCells();
		}
		else {
			display2DArrayCells();
		}

		while (iGameable.getGameStatus() == GameStatus.INPROGRESS) {

			do {
				if (iGameable.isAddToken() == false) {
					System.out.println("Cell taken, enter some other board number");
					if(iGameable instanceof GameFixed3) {
						display1DArrayCells();
					}
					else {
						display2DArrayCells();
					}

				}
				System.out.println(iGameable.getCurrentPlayer().getName() + " play : " + iGameable.getCurrentPlayer().getMark());
				System.out.println("Enter the cell number to be marked");
				int userCellNumberInput = input.nextInt();

				iGameable.play(userCellNumberInput);

			} while (iGameable.isAddToken() == false);

			if(iGameable instanceof GameFixed3) {
				display1DArrayCells();
			}
			else {
				display2DArrayCells();
			}


			if (iGameable.getGameStatus() == GameStatus.WIN) {
				System.out.println(iGameable.getCurrentPlayer().getName() + " WINS!!!");
				input.close();
				return;
			}

			if (iGameable.getGameStatus() == GameStatus.DRAW) {
				System.out.println("No one wins, its a draw");
				input.close();
				return;
			}
		}
	}

	public void display2DArrayCells() {

		for (int i = 0; i < iGameable.getBoard().getSize(); i++) {
			for (int j = 0; j < iGameable.getBoard().getSize(); j++) {
				System.out.print(iGameable.getResultAnalyzer().getboard().getCells2DArray()[i][j].getMark() + " ");
			}
			System.out.println();
		}
	}
	public void display1DArrayCells() {

		for (int i = 0; i < iGameable.getBoard().getSize(); i++) {
			System.out.print(iGameable.getBoard().getCells1DArray()[i].getMark() + " ");
			if (((i + 1) % 3) == 0) {
				System.out.println();
			}
		}
	}
}
