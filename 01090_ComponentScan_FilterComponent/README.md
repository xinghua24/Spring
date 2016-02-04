use Spring ¡°filtering¡± to scan and register components¡¯ name which matched defined ¡°regex¡±

```xml
	<context:component-scan base-package="com.xinghuaz">
		<context:include-filter type="regex" expression="com.xinghuaz.dao.*DAO.*"/>
		<context:include-filter type="regex" expression="com.xinghuaz.services.*Service.*"/>
	</context:component-scan>
```