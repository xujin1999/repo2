package org.example.Service;

import org.apache.ibatis.annotations.Select;
import org.springframework.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

public class DdtInvocation implements InvocationHandler {
  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    Select annotation = method.getAnnotation(Select.class);
    if(annotation!=null){
      String s = annotation.value()[0];
      System.out.println(s);
    }
    return null;
  }
}
