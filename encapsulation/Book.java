package com.archa.workspace.encapsulation;

public class Book {
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOFCopies) {
		this.noOfCopies = noOFCopies;
		System.out.println(noOFCopies);
		System.out.println(this.noOfCopies);

	}
}
