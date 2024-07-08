package org.Framework.SpringCore.Advance.LazyInitializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public DatabaseService databaseService() {
        return new DatabaseService();
    }
}