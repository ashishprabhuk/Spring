package org.Framework.SpringCore.Basics.Coupling.TightCoupling;

public class App {
    public static void main(String[] args) {
        var mario = new SuperMario();
        var contra = new SuperContra();
        var app = new GameRunner(contra);
        app.run();
    }
}
