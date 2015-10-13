package com.ericsson.dao;

import java.util.List;

import com.ericsson.dao.entity.SysUser;

public interface SysUserDao {
	public int save(SysUser sysUser);
	
	public List<SysUser> query();
}
