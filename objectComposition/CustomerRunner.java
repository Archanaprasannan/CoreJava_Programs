package com.archa.workspace.objectComposition;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeaddress = new Address("line1", "hyderabad", "234567");
		Customer customer = new Customer("Ranga", homeaddress);
		Address workaddress = new Address("line2", "banglore", "123456");
		customer.setWorkaddress(workaddress);
		System.out.println(customer);


	}

}
