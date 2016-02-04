package com.xinghuaz.AW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Thread.sleep(2000);
    	CustomerService cs =  (CustomerService) context.getBean("customerService");
    	System.out.println(cs);

    }
}
