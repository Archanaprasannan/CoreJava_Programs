package com.archa.workspace.Static;

class Player1 {
	private static int count;
	private String name;

	public Player1(String name) {
		super();
		this.name = name;
		count++;
	}

	//make method as static
	public static int getCount() {
		return count;
	}
}
public class StaticMethodRunner {

	public static void main(String[] args) {

		Player1 player1 = new Player1("Ronaldo");
		System.out.println(player1.getCount());
		Player1 player2 = new Player1("Federer");

		System.out.println(player2.getCount());
		//accessing the static method

	}


}


