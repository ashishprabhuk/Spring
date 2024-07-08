package org.Framework.SpringCore.Basics.Coupling.LooseCoupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner{
    Console game;
//    public GameRunner(Console game){
    public GameRunner(@Qualifier("SuperContra") Console game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
