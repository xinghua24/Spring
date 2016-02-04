
A FactoryBean is useful to help Spring construct objects that it couldn¡¯t easily construct itself. 
For example, in order to inject a reference to a bean that was obtained from JNDI, the reference must first 
be obtained. You can use the JndiFactoryBean to obtain this reference in a consistent way. You may inject 
the result of a FactoryBean¡¯s getObject() method into any other property.



https://spring.io/blog/2011/08/09/what-s-a-factorybean
