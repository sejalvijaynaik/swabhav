package com.techlabs.tictactoe.game;

import java.util.List;

import com.techlabs.tictactoe.analyzer.IResultAnalyzable;
import com.techlabs.tictactoe.board.IBoardable;
import com.techlabs.tictactoe.gamestatus.GameStatus;
import com.techlabs.tictactoe.mark.Mark;
import com.techlabs.tictactoe.player.Player;

public interface IGameable {
	
	public boolean isAddToken();
	public IBoardable getBoard();
	public List<Player> getPlayers();
	public IResultAnalyzable getResultAnalyzer();
	public GameStatus getGameStatus();
	public Player getCurrentPlayer();
	public void play(int boardNumber);
	public boolean addXO(int boardNumber, Mark mark);
}
