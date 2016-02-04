package com.xinghuaz.AW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	@Autowired
	private BeanB beanB;

	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}

}
