package com.xinghuaz.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	BeanA beanA = context.getBean("beanA", BeanA.class);
    	System.out.println(beanA.getCalendar().getTimeZone());
    	
    	BeanB beanB = context.getBean("beanB", BeanB.class);
    	
    	context.close();
    }
}
