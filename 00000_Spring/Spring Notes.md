Spring Notes

# The three configuration styles
1. XML configuration 
2. Annotation Configuration with &lt;context:annotation-config/&gt; or &lt;context:component-scan/&gt;
3. Java based Configuration use @Configuration and @Bean

Java based Configuration is recommended 


# Bean Scope
Bean Scope is one of the following
- singleton
- prototype
- request
- session
- global
- application


# Topics
### 00 DI using XML based configuration
- ClassPathXmlApplicationContext
- scope
- collection and factory
- init and destroy method for beans, Annotation equivalent @PostConstruct and @PreDestroy


### 01 Annotaiton based Configuration
- @autowired by type and &lt;context:annotation-config /&gt;
- use @Qualifier to specify the name
- @Component, @Repository, @Service, @Controller and &lt;context:component-scan base-package="..." /&gt;
- @Lazy
- @Scope


### 02 Java based Configuration
- AnnotationConfigApplicationContext
- @Configuration, @Bean
- @ComponentScan 
- @ImportResource - not used offen
- @EnableSpringConfigured  &lt;context:spring-configured&gt; and @Configurable(preConstruction = true)

### 03 JDBC

### 04 Unit Test

### 05 AOP
