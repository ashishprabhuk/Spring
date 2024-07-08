package org.Framework.SpringCore.Basics.Beans.BeanGame;

import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.Console;
import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.GameRunner;
import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.SuperMario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean
    public Console game(){
        var game = new SuperMario();
        return game;
    }

    @Bean
    public GameRunner gameRunner(Console game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
