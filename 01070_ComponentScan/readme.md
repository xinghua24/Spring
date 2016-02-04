# config in ApplicationContext
```xml
	<context:component-scan base-package="com.xinghuaz.AW" />
```

# name of the component
By default, Spring will lower case the first character of the component �C from ��CustomerService�� to ��customerService��. 
And you can retrieve this component with name ��customerService��.

	CustomerService cust = (CustomerService)context.getBean("customerService");
	
# Other types of Components
Auto Components Scan Annotation Types
In Spring 2.5, there are 4 types of auto components scan annotation types

@Component �C Indicates a auto scan component.
@Repository �C Indicates DAO component in the persistence layer.
@Service �C Indicates a Service component in the business layer.
@Controller �C Indicates a controller component in the presentation layer.

So, which one to use? It��s really doesn��t matter.
for readability, you should always declare @Repository,@Service or @Controller 
for a specified layer to make your code more easier to read
