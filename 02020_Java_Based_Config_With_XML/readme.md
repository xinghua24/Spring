JavaConfig mix with XML

#1. use java config as primary.  import xml
@ImportResource("ApplicationContext.xml")

#2.use XML config as primary.  import java config
	<bean class="com.xinghuaz.DI.AppConfig" />
	<context:annotation-config />