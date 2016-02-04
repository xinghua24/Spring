package com.xinghuaz.AW;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinghuaz.service.CustomerService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CustomerServiceTest {

	// you don't need to provide annotation for spring to detect @Autowired dependency
	@Autowired
	private CustomerService customerService;
	
	@Test
    public void customerServiceTest()
    {
    	System.out.println(customerService);
    	Assert.assertEquals("some source", customerService.getCustomerDAO().getSource());
    }

}
