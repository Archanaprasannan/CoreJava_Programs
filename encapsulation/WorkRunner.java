package com.archa.workspace.encapsulation;

public class WorkRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectivejava = new Book();
		Book coderjava = new Book();
		artOfComputerProgramming.setNoOfCopies(100);
		int value = artOfComputerProgramming.getNoOfCopies();

	}

}
