package com.ericsson.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ericsson.service.IndexService;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	@Autowired
	IndexService indexService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		System.out.println("goggggggggggggggggggg");
		indexService.test();
		return "/index/idx";
	}
}
