package com.ericsson.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ericsson.dao.user.UserDao;
import com.ericsson.service.IndexService;

@Service("indexService")
@Transactional
public class IndexServiceImpl implements IndexService{
	@Autowired
	private UserDao userDao;

	@Override
	public void test() {
		com.ericsson.dao.entity.Test test = new com.ericsson.dao.entity.Test();
		test.setName("testName");
		userDao.saveTest(test);
	}

}
