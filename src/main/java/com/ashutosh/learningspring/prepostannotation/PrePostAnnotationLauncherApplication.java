package com.ashutosh.learningspring.prepostannotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private Dependency dependency;

    public SomeClass(Dependency dependency){
        this.dependency = dependency;
        System.out.println("dependency are ready");
    }

    @PostConstruct
    public void initialization(){
        System.out.println(dependency.ready());
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("cleanup done");
    }
}

@Component
class Dependency{

    public String ready(){
        return "Initials are done";
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationLauncherApplication {

    public static void main(String[] args) {
        try(var context =
            new AnnotationConfigApplicationContext(PrePostAnnotationLauncherApplication.class)
            ){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }

    }
}
