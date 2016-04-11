package com.xinghua24.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeService {
	private static final Logger LOG = LoggerFactory.getLogger(PrototypeService.class);
	private int count;

	public PrototypeService() {
		LOG.info("PrototypeService init");
	}

	public String sayCount() {
		count++;
		return "PrototypeService count : " + count + "\n";
	}
}
