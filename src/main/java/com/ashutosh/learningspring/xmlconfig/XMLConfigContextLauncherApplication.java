package com.ashutosh.learningspring.xmlconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



public class XMLConfigContextLauncherApplication {

    public static void main(String[] args) {
        try(var context =
            new ClassPathXmlApplicationContext("contextConfiguration.xml")
            ){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean("name"));
        }

    }
}
