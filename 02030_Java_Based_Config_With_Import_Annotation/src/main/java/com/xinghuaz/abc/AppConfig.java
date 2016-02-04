package com.xinghuaz.abc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import( value={ AppOtherConfig.class})
public class AppConfig{

	@Bean  //name of the bean is beanA
	public BeanA beanA(){
		BeanA beanA = new BeanA();
		beanA.setName("Happy");
		return beanA;
	}
}