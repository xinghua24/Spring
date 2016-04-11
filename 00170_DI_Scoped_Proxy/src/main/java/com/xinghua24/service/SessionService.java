package com.xinghua24.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionService {
	private static final Logger LOG = LoggerFactory.getLogger(SessionService.class);
	private int count;

	public SessionService() {
		LOG.info("SessionService init");
	}

	public String sayCount() {
		count++;
		return "SessionService count : " + count + "\n";
	}
}
