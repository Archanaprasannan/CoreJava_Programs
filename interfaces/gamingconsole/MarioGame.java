package com.archa.workspace.interfaces.gamingconsole;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("Goes to the hole");

	}

	@Override
	public void left() {
		System.out.println("backward");

	}

	@Override
	public void right() {
		System.out.println("Forward");

	}

}
