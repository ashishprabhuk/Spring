package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        App app = context.getBean(App.class);
        app.processMessage("Hello, Constructor Injection!");
    }
}
