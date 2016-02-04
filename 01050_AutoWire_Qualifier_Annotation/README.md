To autowire by name, the JSR-250 annotation @Resource can be used or Spring's @Qualifier annotation. 

@Qualifier takes a bean's id as argument

In this example the person bean with id "personx" will be used to wire customer bean

	@Autowired(required = true)
	@Qualifier("personx")
	private Person person;


