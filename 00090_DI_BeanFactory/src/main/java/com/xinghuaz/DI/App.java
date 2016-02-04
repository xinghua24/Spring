package com.xinghuaz.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Car c = (Car) context.getBean("carBean");
    	System.out.println(c);
    	context.close();
    }
}
