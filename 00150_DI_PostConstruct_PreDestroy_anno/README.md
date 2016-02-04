
use of  PostConstruct PreDestroy annotation

application same as 00130

need to enable annotation
<context:annotation-config />


```	xml
	@PostConstruct
	public void init()  {
		System.out.println("init method after property are set: " + message );
	}
	

	@PreDestroy
	public void cleanup() {
		System.out.println("spring container is destroyed. CustoemrService clean up.");
	}
```


http://www.mkyong.com/spring/spring-init-method-and-destroy-method-example/

