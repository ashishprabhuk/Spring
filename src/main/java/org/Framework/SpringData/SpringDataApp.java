package org.Framework.SpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataApp.class, args);
        System.out.println("JDBC or JPA App running...");
    }
}
