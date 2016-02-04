# annotation-config enables auto wiring
To enable @Autowired, you have to register ¡®AutowiredAnnotationBeanPostProcessor¡®, and you can do it in two ways :

1. Include <context:annotation-config />  in bean configuration file.
2. Include AutowiredAnnotationBeanPostProcessor bean
<bean 
class="org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor"/>


There are three places to add @Autowired
1.field
2.Setter
3.Constructor


To autowire by name, the JSR-250 annotation @Resource can be used or Spring's @Qualifier annotation. 

@Qualifier annotation ¨C This annotation is used to avoid conflicts in bean mapping 
and we need to provide the bean name that will be used for autowiring. This way we can 
avoid issues where multiple beans are defined for same type. This annotation usually 
works with the @Autowired annotation. 


Remember, autowired by default use By Type to wire

# diff between annotaiton-config and component-scan
if <context:component-scan /> is defined, then <context:annotaiton-config /> is NOT Needed. component-scan does what annotation-config does and also scans package for components


