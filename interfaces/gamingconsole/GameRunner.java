package com.archa.workspace.interfaces.gamingconsole;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole game = new ChessGame();// polymorphism

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
