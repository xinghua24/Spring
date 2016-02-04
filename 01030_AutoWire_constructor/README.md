
Auto-wire a bean by property data type in constructor argument. In this case, 
since the data type of ¡°person¡± bean is same as the constructor argument data type in ¡°customer¡± 
bean¡¯s property (Person object), so, Spring auto wired it via constructor method ¨C ¡°public Customer(Person person)¡°.

http://www.mkyong.com/spring/spring-auto-wiring-beans-in-xml/


```xml
	<bean id="customer" class="com.xinghuaz.DI.Customer" autowire="constructor" />
	<bean id="personBean" class="com.xinghuaz.DI.Person">
		<property name="name" value="xing hua"></property>
		<property name="address" value="fjewoi rd"></property>
		<property name="age" value="20"></property>
	</bean>
```