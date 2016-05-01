In this example, requestService bean is request scoped. sessionService bean is session scoped. They are injected into SingletonService. 


```xml
	<bean id="requestService" class="com.xinghua24.service.RequestService" scope="request">
		<aop:scoped-proxy/>
	</bean>
	<bean id="sessionService" class="com.xinghua24.service.SessionService" scope="session">
		<aop:scoped-proxy/>
	</bean>
	<bean id="prototypeService" class="com.xinghua24.service.PrototypeService" scope="prototype">
		<aop:scoped-proxy/>
	</bean>
	<bean id="singletonService" class="com.xinghua24.service.SingletonService">
	</bean>
```xml


Annotation based config, which has the same effect as the above XML config. It sets proxyMode = ScopedProxyMode.TARGET_CLASS. The bean will be configured by CGLIB.

```java
@Service
@Scope(value=WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestService {
	private static final Logger LOG = LoggerFactory.getLogger(RequestService.class);
	private int count;

	public RequestService() {
		LOG.info("RequestService init");
	}

	public String sayCount() {
		count++;
		return "RequestService count : " + count + "\n";
	}
}
```

if scoped-proxy element is missing then an exception is thrown: **Caused by: java.lang.IllegalStateException: No thread-bound request found**

Conclusion,  request scoped beans are created for every request. session scoped beans are created for every session. 

Prototype scoped bean can also inject into singleton beans like request or session scoped beans. 