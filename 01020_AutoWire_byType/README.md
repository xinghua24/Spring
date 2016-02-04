see ApplicationContext.xml
Auto-wire a bean by property data type. In this case, since the data type of ¡°person¡± bean is same as 
the data type of the ¡°customer¡± bean¡¯s property (Person object), so, Spring will auto wired it via setter method
 ¨C ¡°setPerson(Person person)¡°.

```xml
	<bean id="customer" class="com.xinghuaz.DI.Customer" autowire="byType" />
	<bean id="personBean" class="com.xinghuaz.DI.Person">
		<property name="name" value="xing hua"></property>
		<property name="address" value="fjewoi rd"></property>
		<property name="age" value="20"></property>
	</bean>
```