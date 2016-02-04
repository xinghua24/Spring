package com.xinghuaz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xinghuaz.dataaccess.Customer;
import com.xinghuaz.dataaccess.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	CustomerService customerService = context.getBean("customerService", CustomerService.class);
    	Customer customer = new Customer();
    	customer.setId(100);
    	customer.setName("dave");
    	customer.setAge(23);
    	try {
			customerService.insert(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Customer c = customerService.getById(100);
    	System.out.println(c);
    }
}
