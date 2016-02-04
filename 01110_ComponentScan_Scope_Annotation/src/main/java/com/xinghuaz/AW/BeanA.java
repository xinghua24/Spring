package com.xinghuaz.AW;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class BeanA {
	private BeanB beanB;

	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}

}
