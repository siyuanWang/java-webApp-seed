package com.ericsson.dao;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.ericsson.dao.entity.SysUser;
import com.ericsson.dao.SysUserDao;

public class UserDaoTest extends BaseDaoTestCase{
	@Autowired 
	private SysUserDao userDao;
	
	@Test
	public void testSave() {
		Date date = new Date();
		SysUser sysUser = new SysUser("test-login-id", "123456", "test-name", "18888888888",
				"xxx@111.com", true, date, date, date, date);
		int id = userDao.save(sysUser);

		System.out.println(id);
		Assert.assertEquals(6, id);
	}
}
