package com.xinghuaz.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	CustomerService cs = context.getBean("customerService", CustomerService.class);
    	context.close();
    }
}
