package com.ashutosh.learningspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //private MarioGame game;
    private GamingConsole game;
    public GameRunner(@Qualifier("supernova") GamingConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game:" + game);
        game.accelerate();
        game.down();
        game.jump();
        game.up();
        game.left();
        game.right();
    }
}
