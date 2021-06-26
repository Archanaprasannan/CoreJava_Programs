package com.archa.workspace.abstarction;

public class BikeRunner {

	public static void main(String[] args) {
		Bike honda = new Bike(100);
		Bike ducati = new Bike(100);
		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());

		// honda.setSpeed(100);
		honda.increasespeed(100);
		// ducati.setSpeed(200);
		ducati.decreasespeed(100);
		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());
	}

}
