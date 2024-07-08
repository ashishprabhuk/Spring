package org.Framework.SpringCore.Advance.LazyInitializer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Application context loaded");

        // Requesting the lazy bean
        DatabaseService databaseService = context.getBean(DatabaseService.class);
        databaseService.connect();
    }
}
