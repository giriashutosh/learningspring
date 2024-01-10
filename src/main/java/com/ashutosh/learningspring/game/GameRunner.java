package com.ashutosh.learningspring.game;

public class GameRunner {
    //private MarioGame game;
    private GamingConsole game;
    public GameRunner(GamingConsole game){
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
