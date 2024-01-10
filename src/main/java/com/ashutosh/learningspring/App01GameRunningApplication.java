package com.ashutosh.learningspring;

import com.ashutosh.learningspring.game.GameRunner;
import com.ashutosh.learningspring.game.PacMan;

public class App01GameRunningApplication {
    public static void main(String[] args) {
          //var game = new MarioGame();
          //var game = new SuperNovaGame();
          var game = new PacMan(); // 1. Object creation
          var gameRunner = new GameRunner(game);// 2. Object creation + wiring of Dependency
          gameRunner.run();
    }
}
