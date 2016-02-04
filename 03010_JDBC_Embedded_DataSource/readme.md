Embedded datasource type
- HSQL (default)
- H2
- Derby

spring-jdbc schema needs to be added to config file
		http://www.springframework.org/schema/jdbc
		http://www.springframework.org/schema/jdbc/spring-jdbc.xsd"


	<jdbc:embedded-database id="dataSource" type="H2">
		<jdbc:script location="classpath:schema.sql" />
		<jdbc:script location="classpath:data.sql" />
	</jdbc:embedded-database>

Reference:  
http://www.mkyong.com/spring/spring-embedded-database-examples/