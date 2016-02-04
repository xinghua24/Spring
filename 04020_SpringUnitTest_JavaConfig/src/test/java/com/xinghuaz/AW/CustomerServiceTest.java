package com.xinghuaz.AW;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinghuaz.AW.CustomerServiceTest.CustomerServiceConfiguration;
import com.xinghuaz.dao.CustomerDAO;
import com.xinghuaz.service.CustomerService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CustomerServiceConfiguration.class})
public class CustomerServiceTest {

	// you don't need to provide annotation for spring to detect @Autowired dependency
	@Autowired
	private CustomerService customerService;
	
	@Test
    public void customerServiceTest()
    {
    	System.out.println(customerService);
    	Assert.assertEquals("some data source", customerService.getCustomerDAO().getSource());
    }

	@Configuration
	public static class CustomerServiceConfiguration {
		
		@Bean
		public CustomerService customerService(){
			CustomerService cs = new CustomerService();
			cs.setCustomerDAO(customerDAO());
			return cs;
		}
		
		@Bean 
		public CustomerDAO customerDAO(){
			CustomerDAO dao = new CustomerDAO();
			dao.setSource("some data source");
			return dao;
		}
	}
}
