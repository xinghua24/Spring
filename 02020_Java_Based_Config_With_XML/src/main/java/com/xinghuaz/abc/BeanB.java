package com.xinghuaz.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	
	BeanA beanA;
	
	@Autowired
	public BeanB(BeanA beanA){
		this.beanA = beanA;
	}

	public BeanA getBeanA() {
		return beanA;
	}


	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

	@Override
	public String toString() {
		return "BeanB [beanA=" + beanA + "]";
	}
	
	
}
