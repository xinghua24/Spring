package com.xinghua24.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value=WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestService {
	private static final Logger LOG = LoggerFactory.getLogger(RequestService.class);
	private int count;

	public RequestService() {
		LOG.info("RequestService init");
	}

	public String sayCount() {
		count++;
		return "RequestService count : " + count + "\n";
	}
}
