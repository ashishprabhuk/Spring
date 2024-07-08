package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Setter;

public class App {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
