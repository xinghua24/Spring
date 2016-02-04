package com.xinghuaz.AW;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configurable(preConstruction = true)
@Component
@Scope(value="prototype")
public class BeanA {
	private BeanB beanB;
	
	public BeanB getBeanB() {
		return beanB;
	}

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	@PostConstruct
	public void postConst(){
		System.out.println("BeanA constructed");
	}

	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}

}
