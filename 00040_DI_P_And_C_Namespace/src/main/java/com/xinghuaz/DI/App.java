package com.xinghuaz.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	User user = (User) context.getBean("userBean");
    	user.sayHello();
    	System.out.println("user age: " + user.getAge());
    	
    	Person person = context.getBean("person", Person.class);
    	System.out.println(person);
    	context.close();
    }
}
