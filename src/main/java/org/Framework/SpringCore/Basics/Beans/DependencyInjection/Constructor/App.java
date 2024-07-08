package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Constructor;

// Client Class
public class App {
    private MessageService messageService;

    // Constructor Injection
    public App(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMessage(String message){
        messageService.sendMessage(message);
    }
}
