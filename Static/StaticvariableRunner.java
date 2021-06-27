package com.archa.workspace.Static;

class Player {
	private static int count;
	private String name;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}
}
public class StaticvariableRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(player1.getCount());
		Player player2 = new Player("Federer");

		System.out.println(player2.getCount());

	}

}
