package com.xinghuaz.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	CustomerService c = (CustomerService) context.getBean("customerService");
    	c.setMessage("message by custA");
    	System.out.println(c);
    	
    	CustomerService c2 = (CustomerService) context.getBean("customerService");
    	System.out.println(c2);
    	context.close();
    }
}
