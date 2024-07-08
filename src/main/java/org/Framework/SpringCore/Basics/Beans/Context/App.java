package org.Framework.SpringCore.Basics.Beans.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        /* The AnnotationConfigApplicationContext is created inside the try-with-resources block,
         ensuring that it is closed automatically at the end of the block. */

        // 1: Launch a Spring Context using try-with-resources
        try(var context = new AnnotationConfigApplicationContext(Person.class)){
            // 2: Configure the things that we want Spring to manage.
            // Person - @Configuration
            // Eg: personName - @Bean,...

            // 3: Retrieving Beans managed by Spring
            System.out.println(context.getBean("personName"));

            System.out.println("Custom Bean Name : " + context.getBean("workLocation"));
            System.out.println("Uses Primary Bean : " + context.getBean(Address.class)); //same as above but calling it using the class (if more than same type is present, it uses the @Primary bean, or it throws exception)

            System.out.println("Uses Primary Bean : " + context.getBean(Identity.class)); // will use the @Primary bean
            System.out.println("Identity-1 : " + context.getBean("identity1"));
            System.out.println("Identity-2 : " + context.getBean("identity2"));
            System.out.println("Identity-3 : " + context.getBean("identity3"));
            System.out.println("Identity-4 : " + context.getBean("identity4"));

            // Printing each Bean method names including custom bean methods
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }catch (Exception e) {
            System.err.println("Error initializing Spring context: " + e.getMessage());
        }
    }
}
