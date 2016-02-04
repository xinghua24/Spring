

In Spring, InitializingBean and DisposableBean are two marker interfaces, a useful way for Spring to perform certain actions upon bean initialization and destruction.

For bean implemented InitializingBean, it will run afterPropertiesSet() after all bean properties have been set.

For bean implemented DisposableBean, it will run destroy() after Spring container is released the bean.


http://www.mkyong.com/spring/spring-initializingbean-and-disposablebean-example/
