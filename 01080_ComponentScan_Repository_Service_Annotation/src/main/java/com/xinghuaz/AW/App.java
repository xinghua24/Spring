package com.xinghuaz.AW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	//remember, the bean's id will have the name of the class with the lower case first letter
    	CustomerService cs =  (CustomerService) context.getBean("customerService");
    	System.out.println(cs);

    }
}
