package org.Framework.SpringCore.Basics.Coupling.LooseCoupling;

public class App {
    public static void main(String[] args) {
        var mario = new SuperMario(); //object creation
        var contra = new SuperContra(); //object creation
        var app = new GameRunner(mario);
        //object creation + wiring of dependencies
        //Game(mario, contra) is a dependency of GameRunner
        app.run();
    }
}
