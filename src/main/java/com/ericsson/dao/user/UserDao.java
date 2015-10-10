package com.ericsson.dao.user;

import java.util.List;

import com.ericsson.dao.entity.SysUser;
import com.ericsson.dao.entity.Test;

public interface UserDao {
	public int save(SysUser sysUser);
	
	public List<SysUser> query();
	
	public int saveTest(Test test);
}
