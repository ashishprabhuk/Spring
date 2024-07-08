package org.Framework.SpringCore.Basics.Beans.SimpleApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class App{
    public static void main(String[] args) {
        try( var context = new AnnotationConfigApplicationContext(App.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Max Number in Database: " + context.getBean(BusinessCalculation.class).findMax());
        }
    }
}
