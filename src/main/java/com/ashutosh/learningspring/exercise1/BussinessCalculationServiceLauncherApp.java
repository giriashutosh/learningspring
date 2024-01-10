package com.ashutosh.learningspring.exercise1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
public class BussinessCalculationServiceLauncherApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BussinessCalculationServiceLauncherApp.class)){
            System.out.println(context.getBean(BussinessCalculationService.class).findMax());
        }
    }
}
