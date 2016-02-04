package com.xinghuaz.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JdbcCustomerDAO extends NamedParameterJdbcDaoSupport implements CustomerDAO {


	private static final String insertSQL = "INSERT INTO CUSTOMER VALUES ( :id, :name, :age)";
	private static final String queryById = "select id, name, age from customer where id = :id";

	public JdbcCustomerDAO(DataSource dataSource){
		setDataSource(dataSource);
	}

	@Override
	public void insert(Customer customer) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", customer.getId());
		params.put("name", customer.getName());
		params.put("age", customer.getAge());
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource(params);
		getNamedParameterJdbcTemplate().update(insertSQL, sqlParameterSource);
		
	}

	@Override
	public Customer getById(int id) {
		Customer customer = null;
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			SqlParameterSource sqlParameterSource = new MapSqlParameterSource(params);
			customer = getNamedParameterJdbcTemplate().queryForObject(queryById, sqlParameterSource, new Mapper());
		} catch (IncorrectResultSizeDataAccessException e) {
			System.err.println("JdbcCustomerDAO.getById() do not return 1 row");
		}
		return customer;
	}

	private class Mapper implements RowMapper<Customer> {

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
