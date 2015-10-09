package com.ericsson.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	/**
	 * 把查询结果封装成bean
	 * 
	 * @param dbeanType
	 * @param sql
	 * @return
	 */
	public <T> List<T> getObjectList(final Class<T> dbeanType, final String sql) {
		final List<T> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<T>(dbeanType));
		return list;
	}

	/**
	 * 把查询结果封装成bean
	 * 
	 * @param dbeanType
	 * @param sql
	 * @param args
	 * @return
	 */
	public <T> List<T> getObjectList(final Class<T> dbeanType, final String sql, final Object[] args) {
		final List<T> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<T>(dbeanType), args);
		return list;
	}
}
