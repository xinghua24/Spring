

## use util:list to create ArrayList

```xml
		<!-- list -->
		<property name="list">
			<util:list  list-class="java.util.ArrayList">
				<value>1</value>
				<ref bean="personBean" />
				<bean class="com.xinghuaz.DI.Person">
					<property name="name" value="Alice"></property>
					<property name="address" value="alice rd"></property>
					<property name="age" value="10"></property>
				</bean>
			</util:list>
		</property>
```


Example base on http://www.mkyong.com/spring/spring-listfactorybean-example/
