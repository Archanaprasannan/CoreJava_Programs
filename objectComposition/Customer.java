package com.archa.workspace.objectComposition;

public class Customer {
	private String name;
	private Address homeaddress;
	private Address workaddress;

	public Customer(String name, Address homeaddress) {
		super();
		this.name = name;
		this.homeaddress = homeaddress;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}

	@Override
	public String toString() {
		return String.format("name-[%s] homeaddress-[%s] workaddress-[%s]", name, homeaddress, workaddress);
	}
}
