package com.xinghuaz.dataaccess;

import org.springframework.transaction.annotation.Transactional;

public class CustomerService {
	private CustomerDAO customerDAO;
	
	@Transactional(readOnly=false, rollbackFor=Exception.class)
	public void insert( Customer customer) throws Exception{
		customerDAO.insert(customer);
		throw new Exception("some exception");
	}
	
	@Transactional(readOnly=true, rollbackFor=Exception.class)
	public Customer getById( int id ){
		return customerDAO.getById(id);
	}

	
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	
}
