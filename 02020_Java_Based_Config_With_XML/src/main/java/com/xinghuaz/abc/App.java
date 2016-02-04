package com.xinghuaz.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
//    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	BeanA beanA = context.getBean("beanA", BeanA.class);
    	System.out.println(beanA);
    	
    	BeanB beanB = context.getBean("beanB", BeanB.class);
    	System.out.println(beanB);
    	
    }
    

}
