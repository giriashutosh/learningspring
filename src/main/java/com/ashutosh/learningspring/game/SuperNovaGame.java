package com.ashutosh.learningspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("supernova")
public class SuperNovaGame implements GamingConsole{
    public void down(){
        System.out.println("supernova down");
    }
    public void jump(){
        System.out.println("supernova upward");
    }
    public void up(){
        System.out.println("supernova Up");
    }
    public void accelerate(){
        System.out.println("supernova Accelearate");
    }
    public void left(){
        System.out.println("supernova Back to Hole");
    }
    public void right(){
        System.out.println("supernova Go Back");
    }
}
