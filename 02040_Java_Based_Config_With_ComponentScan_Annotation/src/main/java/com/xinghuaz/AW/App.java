package com.xinghuaz.AW;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BeanA beanA = context.getBean("beanA", BeanA.class);
		System.out.println(beanA);
		BeanB beanB = context.getBean("beanB", BeanB.class);
		System.out.println(beanB);
	}
}
