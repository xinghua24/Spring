package com.xinghuaz.bo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	CustomerBo customerBo = context.getBean("customerBo", CustomerBo.class);
    	customerBo.addCustomer();
    	context.close();
    }
}
