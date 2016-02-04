package com.xinghuaz.DI;

public class CustomerService {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public void init()  {
		System.out.println("init method after property are set: " + message );
	}
	

	public void cleanup() {
		System.out.println("spring container is destroyed. CustoemrService clean up.");
	}

	
}
