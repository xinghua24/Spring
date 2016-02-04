package com.xinghuaz.DI;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{
	private String make;
	private int year;

	public void setMake(String make) {
		this.make = make;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public Car getObject() throws Exception {
		Car c = null;
		if( year  > 0 ){
			c = new Car();
			c.setYear(year);
			c.setMake(make);
		}
		return c;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
	
	
}
