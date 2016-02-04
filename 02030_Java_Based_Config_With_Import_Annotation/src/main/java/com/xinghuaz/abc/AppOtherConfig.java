package com.xinghuaz.abc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppOtherConfig{
	@Bean(name="beanB")
	public BeanB beanB(){
		BeanB beanB = new BeanB();
		beanB.setName("XXX");
		return beanB;
	}
}