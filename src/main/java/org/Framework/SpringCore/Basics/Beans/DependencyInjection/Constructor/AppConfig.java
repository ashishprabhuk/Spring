package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }

    @Bean
    public App getMyApplication() {
        return new App(getMessageService());
    }
}