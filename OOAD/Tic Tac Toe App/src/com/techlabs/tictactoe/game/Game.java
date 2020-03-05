package com.techlabs.tictactoe.game;

import java.util.List;

import com.techlabs.tictactoe.analyzer.ResultAnalyzer;
import com.techlabs.tictactoe.board.Board;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

public class Game {

	List<Player> players;
	Board board;
	ResultAnalyzer resultAnalyzer;
	GameStatus gameStatus;

	public Game(List<Player> players, int size) {
		this.players = players;
		board = new Board(size);
		resultAnalyzer = new ResultAnalyzer(board);
		gameStatus = GameStatus.INPROGRESS;
		this.players.get(0).setMark(Mark.X);
		this.players.get(1).setMark(Mark.O);
	}

	public Board getBoard() {
		return board;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public ResultAnalyzer getResultAnalyzer() {
		return resultAnalyzer;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public void play() {

	}

	public boolean addXO(int boardNumber, Mark mark) {

		int cellCounter = 0;

		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				cellCounter++;
				if (cellCounter == boardNumber) {
					if (board.getCells()[i][j].checkCellTaken()) {
						return false;
					}
					board.getCells()[i][j].setMark(mark);
					return true;
				}
			}
		}
		return false;
	}
}
