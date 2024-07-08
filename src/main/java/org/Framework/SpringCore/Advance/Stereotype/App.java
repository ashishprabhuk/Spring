package org.Framework.SpringCore.Advance.Stereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App.class)){
            var component = context.getBean(MyComponent.class);
            component.doSomething();

            var service = context.getBean(MyService.class);
            service.performService();

            var repo = context.getBean(MyRepository.class);
            repo.save("Data 1");
            repo.save("Data 2");
            repo.save("Data 3");
            System.out.println(repo.findAll());
        }
    }
}
