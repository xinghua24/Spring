## add MySQL dependencies
	<!-- mysql -->
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>5.1.10</version>
	</dependency>

---
## specify the connection param in database.properties file
	jdbc.driverClassName=com.mysql.jdbc.Driver
	jdbc.url=jdbc:mysql://localhost:3306/xingblog
	jdbc.username=root
	jdbc.password=password

