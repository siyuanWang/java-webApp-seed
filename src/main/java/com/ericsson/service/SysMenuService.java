package com.ericsson.service;

import java.util.List;

import com.ericsson.dao.entity.SysMenu;

public interface SysMenuService {
	public List<SysMenu> query();
	public List<SysMenu> query(String loginId);
}
