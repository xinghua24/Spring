
use of init-method destroy-method attribute

```xml
	<bean class="com.xinghuaz.DI.CustomerService" id="customerService" 
		init-method="init" destroy-method="cleanup">
		<property name="message" value="customer messageeeeeeeeeeee" />
	</bean>	
```

http://www.mkyong.com/spring/spring-init-method-and-destroy-method-example/

