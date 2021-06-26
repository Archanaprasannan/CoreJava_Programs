package com.archa.workspace.objectComposition2;

import java.util.ArrayList;

public class Book {
	private String id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(String id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;

	}

	public void addReview(Review reviews) {
		this.reviews.add(reviews);
	}

	@Override
	public String toString() {
		return String.format("id-[%s] name-[%s] author-[%s] Review-[%s]", id, name, author, reviews);
	}
}
