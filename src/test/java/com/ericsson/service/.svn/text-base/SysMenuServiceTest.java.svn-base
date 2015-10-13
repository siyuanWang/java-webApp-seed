package com.ericsson.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ericsson.service.BaseTestCase;
import com.ericsson.dao.entity.SysMenu;

public class SysMenuServiceTest extends BaseTestCase{
	@Autowired 
	private SysMenuService menuService;
	
	@Test
	public void testQueryMethod() {
		List<SysMenu> menus = menuService.query();
		final SerializerFeature[] serializerFeatures = { SerializerFeature.WriteNullStringAsEmpty,
				SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteMapNullValue};
		System.out.println(JSON.toJSONStringWithDateFormat(menus, "yyyy-MM-dd HH:mm:ss", serializerFeatures));
		Assert.assertNotEquals(0, menus.size());
	}
}
