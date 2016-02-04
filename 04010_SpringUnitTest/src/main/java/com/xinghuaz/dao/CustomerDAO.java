package com.xinghuaz.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {
	
	private String source;

	
	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	@Override
	public String toString() {
		return "CustomerDAO [source=" + source + "]";
	}




}
