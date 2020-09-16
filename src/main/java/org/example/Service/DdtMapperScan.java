package org.example.Service;

import org.springframework.context.annotation.Import;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(DdtBeanDefinition.class)
public @interface DdtMapperScan {

  String [] value() default {};

}
