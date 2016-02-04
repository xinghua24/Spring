package com.xinghuaz.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Customer c = (Customer) context.getBean("customerBean");
    	System.out.println(c);
    	context.close();
    }
}
