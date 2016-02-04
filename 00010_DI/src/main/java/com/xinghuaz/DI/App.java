package com.xinghuaz.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//load application context from classpath. notice classpath: can be omitted 
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
    	
    	User user = (User) context.getBean("userBean");
    	
    	user.sayHello();
    	
    	context.close();
    }
}
