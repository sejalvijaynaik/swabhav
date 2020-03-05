package com.techlabs.tictactoe.userinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.tictactoe.analyzer.ResultAnalyzer;
import com.techlabs.tictactoe.board.Board;
import com.techlabs.tictactoe.game.Game;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

public class TicTacToeUserInterface {

	Game game;
	Scanner input = new Scanner(System.in);
	List<Player> players;
	boolean addToken;

	public TicTacToeUserInterface() {

		players = new ArrayList<Player>();
		addToken = true;
	}

	public void playUI() {

		System.out.println("Enter the size of the game");
		int size = input.nextInt();

		System.out.println("Enter player 1 id:");
		int playerId = input.nextInt();

		System.out.println("Enter player 1 name :");
		String playerName = input.next();

		Player player1 = new Player(playerId, playerName);

		System.out.println("Enter player 2 id:");
		playerId = input.nextInt();

		System.out.println("Enter player 2 name :");
		playerName = input.next();

		Player player2 = new Player(playerId, playerName);

		players.add(player1);
		players.add(player2);

		game = new Game(players, size);

		System.out.println("------------Game starts-------------");
		display();

		while (game.getGameStatus() == GameStatus.INPROGRESS) {

			for (int i = 0; i < 2; i++) {
				do {
					if (addToken == false) {
						System.out.println("Cell taken, enter some other board number");
						display();
					}
					System.out.println(
							game.getPlayers().get(i).getName() + " play : " + game.getPlayers().get(i).getMark());
					System.out.println("Enter the cell number to be marked");
					int userCellNumberInput = input.nextInt();
					
					addToken = game.addXO(userCellNumberInput, game.getPlayers().get(i).getMark());
					
				} while (addToken == false);

				display();
				
				if(game.getResultAnalyzer().checkStatus(game.getPlayers().get(i).getMark())) {
					System.out.println(game.getPlayers().get(i).getName() + " WINS!!!");
					game.setGameStatus(GameStatus.WIN);
					input.close();
					return;
				}
				
				if (game.getBoard().checkIfBoardFull()) {
					System.out.println("No one wins, its a draw");
					game.setGameStatus(GameStatus.DRAW);
					input.close();
					return;
				}
			}
		}
	}

	public void display() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game.getResultAnalyzer().getboard().getCells()[i][j].getMark() + " ");
			}
			System.out.println();
		}
	}
}
