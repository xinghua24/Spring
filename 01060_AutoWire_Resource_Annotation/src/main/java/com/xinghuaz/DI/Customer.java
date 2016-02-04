package com.xinghuaz.DI;

import javax.annotation.Resource;

public class Customer {

	
	private Person person;
	
	public Customer(){
	}
	
	public Customer(Person p ){
		this.person = p;
	}
	
	public Person getPerson() {
		return person;
	}
	
	@Resource
	public void setPersonX(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
	
	
}
