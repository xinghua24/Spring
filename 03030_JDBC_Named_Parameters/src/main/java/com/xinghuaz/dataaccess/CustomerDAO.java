package com.xinghuaz.dataaccess;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public interface CustomerDAO {
	public void insert( Customer customer);
	public Customer getById( int id );
}
