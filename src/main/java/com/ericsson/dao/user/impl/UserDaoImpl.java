package com.ericsson.dao.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.ericsson.dao.BaseDao;
import com.ericsson.dao.entity.SysUser;
import com.ericsson.dao.user.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao{
	private Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);
	
	
	@Override
	public int save(final SysUser sysUser) {
		final String sql = "INSERT INTO SYS_USER ( LOGIN_ID, PASSWORD, NAME, PHONE, EMAIL, UPDATE_TIME, CREATE_TIME) VALUES (?,?,?,?,?, now(), now()) ";
		LOGGER.debug("insert table sys_user sql:"+sql);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		int status = jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				int i = 0;
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setString(++i, sysUser.getLoginId());
				ps.setString(++i, sysUser.getPassword());
				ps.setString(++i, sysUser.getName());
				ps.setString(++i, sysUser.getPhone());
				ps.setString(++i, sysUser.getEmail());
				
				return ps;
			}
		}, keyHolder);
		
		return status;
	}

	@Override
	public List<SysUser> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
