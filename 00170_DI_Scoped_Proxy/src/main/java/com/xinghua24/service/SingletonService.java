package com.xinghua24.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
	private static final Logger LOG = LoggerFactory.getLogger(SingletonService.class);
	
	private int count;
	
	public SingletonService(){
		LOG.info("SingletonService init()");
	}
	
	public String sayCount(){
		count++;
		return "SingletonService count : " + count + "\n" ;
	}
	
}
