package com.xinghuaz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.xinghuaz.abc.BeanA;
import com.xinghuaz.abc.BeanB;

@Configuration
public class AppConfig{

		@Bean  //name of the bean is beanA
		public BeanA beanA(){
			BeanA beanA = new BeanA();
			beanA.setName("Happy");
			return beanA;
		}
		
		@Bean(name="beanB")
		public BeanB beanB(){
			return new BeanB(beanA());
		}
}