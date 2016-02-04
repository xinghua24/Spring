Spring also has unit testing support and it can reduce the size of your test classes if you can use them. 
Most unit tests are annotated with @RunWith(SpringJUnit4ClassRunner.class) and @ContextConfiguration. 
The @ContextConfiguration default to loading an XML configuration file from the package and name of the test 
plus '-context.xml'.

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CustomerServiceTest {

	// you don't need to provide annotation for spring to detect @Autowired dependency
	@Autowired
	private CustomerService customerService;
	
	@Test
    public void customerServiceTest()
    {
    	System.out.println(customerService);
    	Assert.assertEquals("some source", customerService.getCustomerDAO().getSource());
    }

}
```