package com.ericsson.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ericsson.dao.entity.SysUser;
import com.ericsson.service.SysUserService;

@Controller
@RequestMapping(value = "/user")
public class SysUserController {
	@Autowired
	SysUserService userService;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		Date date = new Date();
		SysUser sysUser = new SysUser("administrator1", "123456", "wsy", "17601612994", "wsy2355883@163.com"
				, true, date, date, date, date);
		userService.saveUser(sysUser);
		return "/index/idx";
	}
}
