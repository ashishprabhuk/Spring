package org.Framework.SpringCore.Advance.Jakarta_CDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App.class)){
            System.out.println(context.getBean(MyAPI.class).getData());
        }
    }
}
