To enable AspectJ, you need aspectjrt.jar, aspectjweaver.jar and spring-aop.jar. need the following dependency
```xml
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aop</artifactId>
			<version>${spring.version}</version>
		</dependency>
		
		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjrt</artifactId>
			<version>1.7.2</version>
		</dependency>

		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjweaver</artifactId>
			<version>1.7.2</version>
		</dependency>

		<dependency>
			<groupId>aopalliance</groupId>
			<artifactId>aopalliance</artifactId>
			<version>1.0</version>
		</dependency>
```
		
also need to define
	<aop:aspectj-autoproxy />
	
Common AspectJ annotations :
* @Before �C Run before the method execution
* @After �C Run after the method returned a result
* @AfterReturning �C Run after the method returned a result, intercept the returned result as well.
* @AfterThrowing �C Run after the method throws an exception
* @Around �C Run around the method execution, combine all three advices above.

http://www.mkyong.com/spring3/spring-aop-aspectj-annotation-example/
		