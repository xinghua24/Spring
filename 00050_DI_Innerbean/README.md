## Inner Bean
DI using an Inner Bean

```xml
	<bean id="customerBean" class="com.xinghuaz.DI.Customer">
		<property name="person">
			<bean class="com.xinghuaz.DI.Person">
				<property name="name" value="xing hua"></property>
				<property name="address" value="fjewoi rd"></property>
				<property name="age" value="20"></property>
			</bean>
		</property>
	</bean>
```