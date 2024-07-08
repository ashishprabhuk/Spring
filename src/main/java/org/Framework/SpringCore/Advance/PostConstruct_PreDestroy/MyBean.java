package org.Framework.SpringCore.Advance.PostConstruct_PreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized!");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is being destroyed!");
    }
}