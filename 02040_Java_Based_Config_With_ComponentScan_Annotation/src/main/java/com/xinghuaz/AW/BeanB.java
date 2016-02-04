package com.xinghuaz.AW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	
	
	private String name;


	public String getName() {
		return name;
	}

	@Autowired
	public void setName(@Value("some name") String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
	}
	
	
}
