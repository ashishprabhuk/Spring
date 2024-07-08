package org.Framework.SpringCore.Basics.Beans.BeanGame_Spring;

import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.Console;
import org.Framework.SpringCore.Basics.Coupling.LooseCoupling.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.Framework.SpringCore.Basics.Coupling.LooseCoupling")
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(App.class);
        System.out.println("Using Spring");
        System.out.print("Right Key: ");
        context.getBean(Console.class).right();
        context.getBean(GameRunner.class).run();
    }
}

/*
- In Comparison to the normal BeanGame package, we can minimize the code using Spring.
- By using @Component and @ComponentScan, we can autowire the required Beans from it
and inject it to the required dependency.
*/