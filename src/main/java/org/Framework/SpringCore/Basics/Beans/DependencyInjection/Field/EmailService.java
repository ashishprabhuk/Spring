package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Field;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message){
        System.out.println("Email message sent: " + message);
    }
}
