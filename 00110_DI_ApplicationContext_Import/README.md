In a large project structure, the Spring¡¯s bean configuration files are located in different folders 
for easy maintainability and modular.

solution: use import element in config file to import the different modules

```xml
	<import resource="moduleA.xml"/>
	<import resource="moduleB.xml"/>
```
	
http://www.mkyong.com/spring/load-multiple-spring-bean-configuration-file/
