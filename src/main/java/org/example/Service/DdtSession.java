package org.example.Service;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.stereotype.Component;

@Component
public class DdtSession {
  public static Object queryMapper(Class clazz){
    Class cls[]={clazz};
    //本类类加载器、接口(UserDao参数)、自定义InvocationHandler

    Object o = Proxy.newProxyInstance(DdtSession.class.getClassLoader(),
                                        cls,new DdtInvocation());

    return o;
  }
}
