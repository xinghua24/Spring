## PropertyPlaceholderConfigurer
class: org.springframework.beans.factory.config.PropertyPlaceholderConfigurer

You can use PropertyPlaceholderConfigurer class to externalize the deployment details into a properties file,
  and access from bean configuration file via a special format ¨C ${variable}

http://www.mkyong.com/spring/spring-propertyplaceholderconfigurer-example/


```
jdbc.driverClassName=org.h2.Driver
jdbc.url=jdbc:h2:mem:test;DB_CLOSE_DELAY=-1
jdbc.username=
jdbc.password=
```

## ApplicationContext.xml

```xml
<beans xmlns="...">

	<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
		<property name="location">
			<value>database.properties</value>
		</property>
	</bean>
	
	<bean id="customerDAO" class="com.xinghuaz.DI.CustomerDAO">
		<property name="dataSource" ref="dataSource" />
	</bean>

	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName" value="${jdbc.driverClassName}"></property>
		<property name="url" value="${jdbc.url}"></property>
		<property name="username" value="${jdbc.username}"></property>
		<property name="password" value="${jdbc.password}"></property>
	</bean>
</beans>
```