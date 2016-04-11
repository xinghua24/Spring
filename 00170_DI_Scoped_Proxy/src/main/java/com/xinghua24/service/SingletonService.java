package com.xinghua24.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
	private static final Logger LOG = LoggerFactory.getLogger(SingletonService.class);
	
	private int count;
	
	@Autowired
	private RequestService requestService;
	
	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private PrototypeService prototypeService;
	
	public SingletonService(){
		LOG.info("SingletonService init()");
	}
	
	public String sayCount(){
		count++;
		String myCount =  "SingletonService count : " + count + "\n" ;
		return myCount + requestService.sayCount() + sessionService.sayCount() + prototypeService.sayCount();
	}

	public RequestService getRequestService() {
		return requestService;
	}

	public void setRequestService(RequestService requestService) {
		this.requestService = requestService;
	}

	public SessionService getSessionService() {
		return sessionService;
	}

	public void setSessionService(SessionService sessionService) {
		this.sessionService = sessionService;
	}

	public PrototypeService getPrototypeService() {
		return prototypeService;
	}

	public void setPrototypeService(PrototypeService prototypeService) {
		this.prototypeService = prototypeService;
	}
	
	
}
