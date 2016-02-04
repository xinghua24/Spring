package com.xinghuaz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xinghuaz.dao.Customer;
import com.xinghuaz.dao.CustomerDAO;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	CustomerDAO customerDAO = context.getBean("customerDAO", CustomerDAO.class);
    	Customer customer = new Customer();
    	customer.setId(100);
    	customer.setName("dave");
    	customer.setAge(23);
    	customerDAO.insert(customer);
    	
    	Customer c = customerDAO.getById(100);
    	System.out.println(c);
    }
}
