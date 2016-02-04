package com.xinghuaz.AW;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CustomerDAO {
	
	public CustomerDAO() {
		System.out.println("CustomerDAO()");
	}

	@Override
	public String toString() {
		return "CustomerDAO []";
	}

}
