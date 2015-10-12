package com.ericsson.dao.user.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ericsson.dao.BaseDao;
import com.ericsson.dao.entity.SysUser;
import com.ericsson.dao.user.UserDao;
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao{
	private Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);
	
	
	@Override
	public int save(final SysUser sysUser) {
		saveObj(sysUser);
		int id = sysUser.getId();
		LOGGER.debug("saved user id : {}", id);
		return id;
	}

	@Override
	public List<SysUser> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
