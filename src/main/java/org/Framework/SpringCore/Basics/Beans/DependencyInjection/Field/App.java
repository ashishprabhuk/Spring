package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Field;

import org.springframework.beans.factory.annotation.Autowired;

public class App {
    // Field injection (@Autowired), eliminating the need for explicit setter or constructor injection.
    @Autowired
    private MessageService messageService;

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
