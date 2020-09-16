package org.example.Service;

import org.example.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
  @Test
  public void t1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
    UserDao bean = context.getBean(UserDao.class);
    System.out.println(bean.findUserById(1));
  }
}
