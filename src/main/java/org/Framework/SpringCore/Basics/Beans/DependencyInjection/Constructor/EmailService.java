package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Constructor;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println("Email message sent: " + message);
    }
}
