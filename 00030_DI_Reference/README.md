
In Spring, A bean can use other beans as its property in the same or different bean configuration file.

see carBean

```xml
	<bean id="carBean" class="com.xinghuaz.SimpleDI.Car">
		<property name="price" value="2000"></property>
		<property name="user" ref="userBean"></property>
	</bean>
	
xml