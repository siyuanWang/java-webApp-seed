package com.ericsson.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ericsson.dao.BaseDao;
import com.ericsson.dao.entity.SysMenu;
import com.ericsson.dao.SysMenuDao;

@Repository("sysMenuDao")
public class SysMenuDaoImpl extends BaseDao implements SysMenuDao {

	@Override
	public List<SysMenu> query() {
		Criteria cri = getCurrentSession().createCriteria(SysMenu.class);
		cri.addOrder(Order.asc("pid")).addOrder(Order.asc("id"));
		@SuppressWarnings("unchecked")
		List<SysMenu> list = cri.list();
		return list;
	}

	@Override
	public List<SysMenu> query(List<Integer> menuIds) {
		Criteria cri = getCurrentSession().createCriteria(SysMenu.class);
		cri.add(Restrictions.in("id", menuIds));
		cri.addOrder(Order.asc("pid")).addOrder(Order.asc("ordernum"));
		@SuppressWarnings("unchecked")
		List<SysMenu> list = cri.list();
		return list;
	}

	
}
