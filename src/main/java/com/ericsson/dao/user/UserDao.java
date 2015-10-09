package com.ericsson.dao.user;

import java.util.List;

import com.ericsson.dao.entity.SysUser;

public interface UserDao {
	public int save(SysUser sysUser);
	
	public List<SysUser> query();
}
