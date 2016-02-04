package com.xinghuaz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	
	private DataSource dataSource;
	
	private static final String updateSql = "INSERT INTO CUSTOMER VALUES (?, ?, ?)";
	private static final String queryById = "select id, name, age from customer where id = ?";

	@Override
	public void insert(Customer customer) {
		getJdbcTemplate().update(updateSql, new Object[]{customer.getId(), customer.getName(), customer.getAge()});
	}
	
	

	@Override
	public Customer getById(int id) {
		Customer customer = null;
		try{
			customer =(Customer)( getJdbcTemplate().queryForObject(queryById, new Object[]{id}, new Mapper()));
		}catch(IncorrectResultSizeDataAccessException e){
			System.err.println("JdbcCustomerDAO.getById() do not return 1 row");
		}
		return customer;
	}



	private class Mapper implements RowMapper<Customer>{

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer cust = new Customer();
			cust.setId(rs.getInt("id"));
			cust.setName(rs.getString("name"));
			
			cust.setAge(rs.getInt("age"));
			return cust;
		}
		
	}
}
