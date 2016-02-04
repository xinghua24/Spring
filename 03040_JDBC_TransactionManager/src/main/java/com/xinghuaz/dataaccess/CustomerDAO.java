package com.xinghuaz.dataaccess;

public interface CustomerDAO {
	public void insert( Customer customer);
	public Customer getById( int id );
}
