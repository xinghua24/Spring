package com.xinghuaz.AW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	BeanA beanA = context.getBean("beanA", BeanA.class);
    	BeanA beanA2 = context.getBean("beanA", BeanA.class);
    	System.out.println( (beanA == beanA2)? "same instance" : "diff instance" );

    	
    	BeanB beanB = context.getBean("beanB", BeanB.class);
    	BeanB beanB2 = context.getBean("beanB", BeanB.class);
    	System.out.println( (beanB == beanB2)? "same instance" : "diff instance" );
    }
}
