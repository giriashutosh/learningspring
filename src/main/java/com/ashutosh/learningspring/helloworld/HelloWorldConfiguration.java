package com.ashutosh.learningspring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods , constructor,
//equals, hashcode and toString are automatically created

record Person(String name, int age, Address address){};
record Address(String firstLane, String City){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Vinod";
    }

    @Bean
    public int age(){
        return 29;
    }

    @Bean
    @Primary
    public Person person(){
        return  new Person("vinod", 29, new Address("Vijay nagar", "Ghaziabad"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person3Qualifiers(String name, int age, @Qualifier("address2")Address address){
        return new Person(name, age, address);
    }

    @Bean // can customize bean name as per need (name = "custom name")
    @Primary
    public Address address(){
        return  new Address("Vijay nagar", "Ghaziabad");
    }

    @Bean("address2")
    @Qualifier("address2")
    public Address address2(){
        return  new Address("Laxmi nagar", "Delhi");
    }
}
