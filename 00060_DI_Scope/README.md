## 5 types of bean scopes supported by Spring

* singleton �C Return a single bean instance per Spring IoC container
* prototype �C Return a new bean instance each time when requested
* request �C Return a single bean instance per HTTP request. 
* session �C Return a single bean instance per HTTP session. 
* globalSession �C Return a single bean instance per global HTTP session. 


```xml
	
<!-- use prototype scope -->
	<bean id="customerService"
		class="com.xinghuaz.DI.CustomerService" scope="prototype">
	</bean>
```

Reference:  
[http://www.mkyong.com/spring/spring-bean-scopes-examples/](http://www.mkyong.com/spring/spring-bean-scopes-examples/)

