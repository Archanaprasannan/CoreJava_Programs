package com.archa.workspace.objectComposition2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book("123", "Big magic", "Elizabath Gilbert");
		book.addReview(new Review(12, "awesome", 5));
		System.out.println(book);

	}

}
