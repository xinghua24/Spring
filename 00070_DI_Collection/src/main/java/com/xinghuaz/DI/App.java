package com.xinghuaz.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	CustomerCollection c = (CustomerCollection) context.getBean("customers");
    	System.out.println(c);

    }
}
