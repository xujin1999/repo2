package org.example.Service;

import org.springframework.beans.factory.FactoryBean;

public class DdtFactoryBean implements FactoryBean {
  Class clazz;

  @Override
  public Object getObject() throws Exception {
    Object mapper = DdtSession.queryMapper(clazz);
    return mapper;
  }

  @Override
  public Class<?> getObjectType() {
    return clazz;
  }

  public void setClazz(Class clazz) {
    this.clazz = clazz;
  }
}
