package org.example.Service;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;
public class DdtBeanDefinition implements ImportBeanDefinitionRegistrar {
  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
    BeanDefinitionBuilder builder =
            BeanDefinitionBuilder.genericBeanDefinition(DdtFactoryBean.class);
    AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();


    beanDefinition.getPropertyValues().add("clazz","org.example.Dao.UserDao");
    registry.registerBeanDefinition("xxx",beanDefinition);

  }
}