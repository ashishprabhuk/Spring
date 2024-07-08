package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring Configuration
@Configuration
public class AppConfig {
    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }

    @Bean
    public App getMyApplication() {
        App app = new App();
        app.setMessageService(getMessageService());
        return app;
    }
}