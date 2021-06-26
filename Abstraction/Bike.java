package com.archa.workspace.abstarction;

public class Bike {
	private int speed;

	Bike() {
		this(5);// calling constructor from inside another constructor
	}

	Bike(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increasespeed(int howmuch) {
		setSpeed(this.speed + howmuch);
	}

	public void decreasespeed(int howmuch) {
		setSpeed(this.speed - howmuch);
	}

}