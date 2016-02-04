package com.xinghuaz.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Customer c1 = (Customer) context.getBean("customerBean1");
    	System.out.println(c1);
    	
    	//not working
//    	Customer c2 = (Customer) context.getBean("customerBean2");
//    	System.out.println(c2);
    	
    	
    	context.close();
    }
}
