package com.xinghuaz.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	@Autowired(required=true)
//	@Qualifier("personx")   //use personx bean to wire person
	private Person person;
	
	public Customer(){
	}
	
//	@Autowired(required=true)
	public Customer(@Qualifier("personx") Person personx ){
		this.person = personx;
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
