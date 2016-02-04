see ApplicationContext.xml
Auto-wire a bean by property name. In this case, since the name of ¡°person¡± bean is same with 
the name of the ¡°customer¡± bean¡¯s property (¡°person¡±), so, Spring will auto wired it via setter method 
¨C ¡°setPerson(Person person)¡°.


```xml
	<bean id="customer" class="com.xinghuaz.DI.Customer" autowire="byName" />
	<bean id="person" class="com.xinghuaz.DI.Person">
		<property name="name" value="xing hua"></property>
		<property name="address" value="fjewoi rd"></property>
		<property name="age" value="20"></property>
	</bean>
```