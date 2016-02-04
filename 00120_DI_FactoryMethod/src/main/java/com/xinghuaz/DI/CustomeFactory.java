package com.xinghuaz.DI;

public class CustomeFactory {

	public CustomeFactory() {
		System.out.println( "CustomeFactory constructor");
	}

	public BeanB getBeanInstance(){
		System.out.println("creating BeanB");
		return new BeanB();
	}
}
