package com.ashutosh.learningspring.game;

public class SuperNovaGame implements GamingConsole{
    public void down(){
        System.out.println("Sit down");
    }
    public void jump(){
        System.out.println("jump upward");
    }
    public void up(){
        System.out.println("Go Up");
    }
    public void accelerate(){
        System.out.println("Accelearate");
    }
    public void left(){
        System.out.println("Back to Hole");
    }
    public void right(){
        System.out.println("Go Back");
    }
}
