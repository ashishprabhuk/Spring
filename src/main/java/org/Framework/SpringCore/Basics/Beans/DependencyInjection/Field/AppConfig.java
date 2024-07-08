package org.Framework.SpringCore.Basics.Beans.DependencyInjection.Field;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring Configuration
@Configuration
class AppConfig {
    @Bean
    public MessageService messageService() {
        return new EmailService();
    }

    @Bean
    public App myApplication() {
        return new App();
    }
}