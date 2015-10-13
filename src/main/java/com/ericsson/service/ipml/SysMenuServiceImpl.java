package com.ericsson.service.ipml;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ericsson.dao.entity.SysMenu;
import com.ericsson.dao.SysMenuDao;
import com.ericsson.service.SysMenuService;

@Service("sysMenuService")
@Transactional
public class SysMenuServiceImpl implements SysMenuService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SysMenuServiceImpl.class);

	@Autowired
	SysMenuDao sysMenuDao;


	@Override
	public List<SysMenu> query(String loginId) {
		List<SysMenu> beanList = queryByLoginId(loginId);
		beanList = filterMenuByType(beanList, 1);
		List<SysMenu> list = initIdxMenuTree(beanList, 0);
		return list;
	}
	
	@Override
	public List<SysMenu> query() {
		List<SysMenu> beanList = sysMenuDao.query();
		List<SysMenu> list = initIdxMenuTree(beanList, 0);
		return list;
	}
	
	/*
	 * 递归算法
	 */
	private List<SysMenu> initIdxMenuTree(List<SysMenu> beanList, Integer pid) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		for (SysMenu bean : beanList) {
			if (pid == bean.getPid()) {
				list.add(bean);
			}
		}
		if (list != null && !list.isEmpty()) {
			for (SysMenu bean : list) {
				List<SysMenu> childList = initIdxMenuTree(beanList, bean.getId());
				if (childList != null && !childList.isEmpty()) {
					bean.setHasChild(true);
					bean.setChildList(childList);
				}
			}
		}
		return list;
	}

	private List<SysMenu> filterMenuByType(List<SysMenu> list, int type) {
		List<SysMenu> filtedMenus = new ArrayList<SysMenu>();
		for(SysMenu sysMenu: list) {
			if(sysMenu.getType() == type) {
				filtedMenus.add(sysMenu);
			}
		}
		
		return filtedMenus;
	}
	
	private List<SysMenu> queryByLoginId(String loginId) {
		
		List<SysMenu> beanList = sysMenuDao.query();
		return beanList;
	}
}
