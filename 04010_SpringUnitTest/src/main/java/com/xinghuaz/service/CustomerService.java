package com.xinghuaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xinghuaz.dao.CustomerDAO;

@Component
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}


	
}
