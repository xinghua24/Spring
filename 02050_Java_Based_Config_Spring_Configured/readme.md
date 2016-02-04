
## plugin
```xml
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>aspectj-maven-plugin</artifactId>
				<version>1.4</version>
				<configuration>
					<showWeaveInfo>true</showWeaveInfo>
					<source>1.6</source>
					<target>1.6</target>
					<Xlint>ignore</Xlint>
					<complianceLevel>1.6</complianceLevel>
					<encoding>UTF-8</encoding>
					<verbose>false</verbose>
					<aspectLibraries>
						<aspectLibrary>
							<groupId>org.springframework</groupId>
							<artifactId>spring-aspects</artifactId>
						</aspectLibrary>
					</aspectLibraries>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>compile</goal>
							<goal>test-compile</goal>
						</goals>
					</execution>
				</executions>
				<dependencies>
					<dependency>
						<groupId>org.aspectj</groupId>
						<artifactId>aspectjrt</artifactId>
						<version>1.7.2</version>
					</dependency>
					<dependency>
						<groupId>org.aspectj</groupId>
						<artifactId>aspectjtools</artifactId>
						<version>1.7.2</version>
					</dependency>
				</dependencies>
			</plugin>
```

## Spring-configured
add @EnableSpringConfigured Annotation to config file, the xml equivalent is 

 <context:spring-configured>
 


## Do not try to do LoadTime Weaving, instead, use the aspectj plugin  
@EnableLoadTimeWeaving
-javaagent:C:\EclipsWorkspaces\Spring\02050_Java_Based_Config_Spring_Configured\spring-instrument-3.0.4.RELEASE.jar

Example to look at  
[http://www.javacodegeeks.com/2013/09/spring-configurable-magic.html](http://www.javacodegeeks.com/2013/09/spring-configurable-magic.html)
