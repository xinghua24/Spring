## 5 types of bean scopes supported by Spring

* singleton 每 Return a single bean instance per Spring IoC container
* prototype 每 Return a new bean instance each time when requested
* request 每 Return a single bean instance per HTTP request. 
* session 每 Return a single bean instance per HTTP session. 
* globalSession 每 Return a single bean instance per global HTTP session. 


```xml
	
<!-- use prototype scope -->
	<bean id="customerService"
		class="com.xinghuaz.DI.CustomerService" scope="prototype">
	</bean>
```

Reference:  
[http://www.mkyong.com/spring/spring-bean-scopes-examples/](http://www.mkyong.com/spring/spring-bean-scopes-examples/)

