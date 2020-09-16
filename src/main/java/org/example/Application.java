package org.example;

import org.example.Service.DdtMapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("classpath:beans1.xml")
@ComponentScan("org.example")
@Configuration
//@DdtMapperScan({"org.example.Dao"})
public class Application {}
