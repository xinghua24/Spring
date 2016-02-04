package com.xinghuaz.DI;

import java.util.Date;

public class Customer {
	private Date date;
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [date=" + date + ", person=" + person + "]";
	}

	

}
