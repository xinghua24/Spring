package com.xinghua24.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinghua24.service.PrototypeService;
import com.xinghua24.service.RequestService;
import com.xinghua24.service.SessionService;
import com.xinghua24.service.SingletonService;

@Controller
public class HomeController {
	private SingletonService singletonService;
	
	private RequestService requestService;
	
	private SessionService sessionService;
	
	private PrototypeService prototypeService;
	
	
	@Autowired
	public  HomeController(SingletonService singletonService, RequestService requestService,
			SessionService sessionService, PrototypeService prototypeService) {
		this.singletonService = singletonService;
		this.requestService = requestService;
		this.sessionService = sessionService;
		this.prototypeService = prototypeService;
	}



	@RequestMapping("/")
	@ResponseBody()
	public String home( HttpServletResponse response){
		response.setContentType("text/plain");
		StringBuilder sb = new StringBuilder();
		sb.append(singletonService.sayCount()).append(" /n");
		sb.append(requestService.sayCount()).append(" /n");
		sb.append(sessionService.sayCount()).append(" /n");
		sb.append(prototypeService.sayCount()).append(" /n");
		return sb.toString();
	}
}