package com.xinghuaz.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	User user = (User) context.getBean("userBean");
    	user.sayHello();
    	
    	Car car = (Car) context.getBean("carBean");
    	System.out.println("the owner is " + car.getUser().getName());
    	System.out.println( "the price of the car is " + car.getPrice());
    	
    	context.close();
    }
}
