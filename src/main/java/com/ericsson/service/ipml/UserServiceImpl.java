package com.ericsson.service.ipml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ericsson.dao.entity.SysUser;
import com.ericsson.dao.user.UserDao;
import com.ericsson.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	private Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDao userDao;

	@Override
	public void saveUser(SysUser sysUser) {
		int id = userDao.save(sysUser);
		LOGGER.debug("saved user id : {}", id);
	}


}
