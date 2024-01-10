package com.ashutosh.learningspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole{
    public void down(){
        System.out.println("mario Down");
    }
    public void jump(){
        System.out.println("mario jump");
    }
    public void up(){
        System.out.println("mario Up");
    }
    public void accelerate(){
        System.out.println("mario Accelearate");
    }
    public void left(){
        System.out.println("mario Left");
    }
    public void right(){
        System.out.println("mario right");
    }
}
