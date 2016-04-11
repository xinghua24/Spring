p schema is another way to inject value

## adding p schema

 xmlns:p="http://www.springframework.org/schema/p"
 
## define a bean's property using p schema

```xml
	<bean id="userBean" class="com.xinghuaz.DI.User"
	   p:name="XING HUA" p:age="18">
	</bean>
```