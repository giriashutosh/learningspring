package com.ashutosh.learningspring;

import com.ashutosh.learningspring.game.GameRunner;
import com.ashutosh.learningspring.game.GamingConsole;
import com.ashutosh.learningspring.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
