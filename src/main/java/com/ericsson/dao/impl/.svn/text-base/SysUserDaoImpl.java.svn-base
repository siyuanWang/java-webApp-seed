package com.ericsson.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ericsson.dao.BaseDao;
import com.ericsson.dao.entity.SysUser;
import com.ericsson.dao.SysUserDao;
@Repository("sysUserDao")
public class SysUserDaoImpl extends BaseDao implements SysUserDao{
	private Logger LOGGER = LoggerFactory.getLogger(SysUserDaoImpl.class);
	
	
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
