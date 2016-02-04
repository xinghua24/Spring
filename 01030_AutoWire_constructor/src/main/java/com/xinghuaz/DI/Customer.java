package com.xinghuaz.DI;

public class Customer {
	private Person person;
	
	public Customer(Person p ){
		this.person = p;
	}
	

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
	
	
}
