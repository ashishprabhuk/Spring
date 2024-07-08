package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Setter;

// Service Implementation
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message sent: " + message);
    }
}
