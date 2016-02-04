package com.xinghuaz.DI;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	@PostConstruct
	public void init()  {
		System.out.println("init method after property are set: " + message );
	}
	

	@PreDestroy
	public void cleanup() {
		System.out.println("spring container is destroyed. CustoemrService clean up.");
	}

	
}
