package com.xinghuaz.DI;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerService implements InitializingBean, DisposableBean{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method after property are set: " + message );
	}
	

	@Override
	public void destroy() throws Exception {
		System.out.println("spring container is destroyed. CustoemrService clean up.");
	}

	
}
