package com.xinghuaz.AW;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println(new BeanB());
		
		BeanA beanA= new BeanA();
		System.out.println(beanA);
		
		BeanA beanA2= new BeanA();
		System.out.println(beanA2);
		
//		System.out.println(beanA == beanA2);
		
	}
}
