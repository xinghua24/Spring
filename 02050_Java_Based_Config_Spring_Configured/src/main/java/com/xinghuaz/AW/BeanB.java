package com.xinghuaz.AW;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configurable(preConstruction = true)
@Component
@Scope(value="singleton")
public class BeanB {
	
	private String name;

	public String getName() {
		return name;
	}
	
	@PostConstruct
	public void postConst(){
		System.out.println("BeanB constructed");
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
