package org.Framework.SpringCore.Basics.Beans.BeanGame;

import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.Console;
import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GameConfig.class)){
            System.out.println(context.getBean(Console.class));
            context.getBean(GameRunner.class).run();
        }
    }
}