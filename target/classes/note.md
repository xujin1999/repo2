##常用依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">
</beans>
```
##注解说明

- @Autowired 默认使用类型自动装配,然后使用名字
- @Resource 默认使用Name自动装配,然后使用类型
- @Nullable 值可以为空

## 注解生效
```xml
    <context:annotation-config></context:annotation-config>
    <context:component-scan base-package="org.example"/>
```
