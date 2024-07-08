package org.Framework.SpringCore.Basics.Coupling.TightCoupling;

public class GameRunner {
//    SuperMario game;
    SuperContra game;
    public GameRunner(SuperContra game){
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
