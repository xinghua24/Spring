package com.xinghuaz.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xinghuaz.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	BeanA beanA = context.getBean("beanA", BeanA.class);
    	System.out.println(beanA);
    	
    	BeanB beanB = context.getBean("beanB", BeanB.class);
    	System.out.println(beanB);
    	
    	BeanB beanB2 = context.getBean("beanB", BeanB.class);
    	
    	//check if beanB and beanB2 are the same. If it has a scope of prototype they are NOT the same
    	System.out.println( beanB == beanB2? "BeanB and BeanB2 are the same!\n" : "BeanB and BeanB2 are NOT the same!\n");
    	
    }
    

}
