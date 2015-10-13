package com.ericsson.controller;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ericsson.dao.entity.SysMenu;
import com.ericsson.service.SysMenuService;
import com.ericsson.service.SysUserService;

@Controller
@RequestMapping(value = "/menu")
public class SysMenuController {
	@Autowired SysUserService userService;
	@Autowired SysMenuService menuService;

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public ResponseEntity<String> index() {
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("text", "plain", Charset.forName("utf-8")));
		
		List<SysMenu> menus = menuService.query();
		final SerializerFeature[] serializerFeatures = { SerializerFeature.WriteNullStringAsEmpty,
				SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteMapNullValue};
		String returnJson = JSON.toJSONStringWithDateFormat(menus, "yyyy-MM-dd HH:mm:ss", serializerFeatures);
		System.out.println(returnJson);
		
		return new ResponseEntity<String>(returnJson, headers, HttpStatus.OK);
	}
}
