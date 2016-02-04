package com.xinghuaz.DI;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	context.getBean("customerDAO", CustomerDAO.class);
    	DataSource dataSource = context.getBean("dataSource", DataSource.class);
    	System.out.println(dataSource.getConnection());
    	context.close();
    }
}
