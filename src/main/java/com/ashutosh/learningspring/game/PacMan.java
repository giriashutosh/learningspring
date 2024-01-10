package com.ashutosh.learningspring.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
    public void down(){
        System.out.println("Down to earth pacman");
    }
    public void jump(){
        System.out.println("jump pacman");
    }
    public void up(){
        System.out.println("pacman Up");
    }
    public void accelerate(){
        System.out.println("pacman Accelearate!!");
    }
    public void left(){
        System.out.println("pacman Left");
    }
    public void right(){
        System.out.println("pacman right");
    }
}
