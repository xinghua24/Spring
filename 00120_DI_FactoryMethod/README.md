create a bean using factory bean and factory method

```xml
	<bean class="com.xinghuaz.DI.BeanB" id="beanB" 
		factory-bean="customeFactory" 
		factory-method="getBeanInstance">
	</bean>
```

use of factory-method and factory-bean attribute

