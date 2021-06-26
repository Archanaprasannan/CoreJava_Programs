package com.archa.workspace.inheritance;

public class Person {
	private String name;
	private String email;
	private String phnNum;

	public Person(String name) {
		super();
		System.out.println("person constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhnNum() {
		return phnNum;
	}

	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}

	@Override
	public String toString() {
		return name + " # " + email + " # " + phnNum;
	}



}
