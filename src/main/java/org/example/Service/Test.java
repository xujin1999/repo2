package org.example.Service;
import org.example.Application;
import org.example.Dao.UserDao;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
//    UserDao mapper = (UserDao) DdtSession.queryMapper(UserDao.class);
//    mapper.findUserById(1);
    
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    Object o = DdtSession.queryMapper(UserDao.class);
    context.getBeanFactory().registerSingleton("UserDao",o);
    context.register(Application.class);
    context.refresh();

    UserDao bean = context.getBean(UserDao.class);
    bean.findUserById(1);
  }
}
