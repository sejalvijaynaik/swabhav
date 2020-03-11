package com.techlabs.tictactoe.game;

import java.util.List;

import com.techlabs.tictactoe.analyzer.IResultAnalyzable;
import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

public class GameVariable implements IGameable{

	private List<Player> players;
	private IBoardable iBoardable;
	private IResultAnalyzable iResultAnalyzable;
	private GameStatus gameStatus;
	private boolean addToken = true;
	Player currentPlayer;
	Player nextPlayer;

	public boolean isAddToken() {
		return addToken;
	}

	public GameVariable(List<Player> players, IBoardable iBoardable, IResultAnalyzable iResultAnalyzable) {
		this.players = players;
		this.iBoardable = iBoardable;
		this.iResultAnalyzable = iResultAnalyzable;
		gameStatus = GameStatus.INPROGRESS;
		this.players.get(0).setMark(Mark.X);
		this.players.get(1).setMark(Mark.O);
		currentPlayer = players.get(0);
		nextPlayer = players.get(1);
	}

	@Override
	public IBoardable getBoard() {
		return iBoardable;
	}

	@Override
	public List<Player> getPlayers() {
		return players;
	}

	@Override
	public IResultAnalyzable getResultAnalyzer() {
		return iResultAnalyzable;
	}

	@Override
	public GameStatus getGameStatus() {
		return gameStatus;
	}

	@Override
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	@Override
	public void play(int boardNumber) {

		Player tempPlayer;
		addToken = addXO(boardNumber, currentPlayer.getMark());

		if (iResultAnalyzable.checkStatus(currentPlayer.getMark())) {
			gameStatus = GameStatus.WIN;
			return;
		}
		if (iBoardable.checkIfBoardFull()) {
			gameStatus = GameStatus.DRAW;
			return;
		}
		
		tempPlayer =  currentPlayer;
		currentPlayer = nextPlayer;
		nextPlayer = tempPlayer;
	}

	@Override
	public boolean addXO(int boardNumber, Mark mark) {

		int cellCounter = 0;

		for (int i = 0; i < iBoardable.getSize(); i++) {
			for (int j = 0; j < iBoardable.getSize(); j++) {
				cellCounter++;
				if (cellCounter == boardNumber) {
					if (iBoardable.getCells2DArray()[i][j].checkCellTaken()) {
						return false;
					}
					iBoardable.getCells2DArray()[i][j].setMark(mark);
					return true;
				}
			}
		}
		return false;
	}
}
