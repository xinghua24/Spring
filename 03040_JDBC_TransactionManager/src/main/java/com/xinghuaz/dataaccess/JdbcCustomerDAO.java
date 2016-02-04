package com.xinghuaz.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private static final String insertSQL = "INSERT INTO CUSTOMER VALUES ( :id, :name, :age)";
	private static final String queryById = "select id, name, age from customer where id = :id";

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void insert(Customer customer) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", customer.getId());
		params.put("name", customer.getName());
		params.put("age", customer.getAge());
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource(params);
		namedParameterJdbcTemplate.update(insertSQL, sqlParameterSource);
	}

	@Override
	public Customer getById(int id) {
		Customer customer = null;
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			SqlParameterSource sqlParameterSource = new MapSqlParameterSource(params);
			customer = namedParameterJdbcTemplate.queryForObject(queryById, sqlParameterSource, new Mapper());
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
