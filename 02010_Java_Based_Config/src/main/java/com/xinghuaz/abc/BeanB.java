package com.xinghuaz.abc;

public class BeanB {
	BeanA beanA;
	
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
