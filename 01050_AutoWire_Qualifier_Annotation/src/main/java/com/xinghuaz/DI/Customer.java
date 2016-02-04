package com.xinghuaz.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	@Autowired(required = true)
	@Qualifier("personx")
	private Person person;
	
	public Customer(){
	}
	
//	@Autowired
	public Customer(@Qualifier("personx") Person p ){
		this.person = p;
	}
	

	public Person getPerson() {
		return person;
	}
	


//	@Autowired
//	@Qualifier("personx")
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
	
	
}
