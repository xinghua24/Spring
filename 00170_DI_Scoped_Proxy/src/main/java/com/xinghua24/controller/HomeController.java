package com.xinghua24.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinghua24.service.SingletonService;

@Controller
public class HomeController {
	@Autowired
	private SingletonService singletonService;
	
	
	@RequestMapping("/")
	@ResponseBody()
	public String home( HttpServletResponse response){
		response.setContentType("text/plain");
		return singletonService.sayCount();
	}
}