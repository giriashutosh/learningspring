package com.ashutosh.learningspring;

import com.ashutosh.learningspring.game.GameRunner;
import com.ashutosh.learningspring.game.GamingConsole;
import com.ashutosh.learningspring.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GameSpringBeans {
    public static void main(String[] args) {
        try(var context =
            new AnnotationConfigApplicationContext(GamingConfiguration.class)
            ){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
