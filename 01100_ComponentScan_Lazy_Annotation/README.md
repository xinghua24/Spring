Lazy Annotation can be used to postpone the beans that takes too much resources and may not be used in the application.
But it also delays the discovery of beans that has errors in initialization.

```java

@Component
@Lazy
public class CustomerDAO {
	...
}
```