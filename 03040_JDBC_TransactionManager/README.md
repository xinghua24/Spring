```xml
	<bean id="transactionManager"
		class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<property name="dataSource" ref="dataSource" />
	</bean>
```

```java
@Transactional(readOnly=false, rollbackFor=Exception.class)
```

http://www.studytrails.com/frameworks/spring/spring-declarative-transactions-annotation.jsp

