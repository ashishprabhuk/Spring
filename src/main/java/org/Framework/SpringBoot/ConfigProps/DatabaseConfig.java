package org.Framework.SpringBoot.ConfigProps;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// Configuration Properties -> from application.properties
// database.url
// database.username
// database.password

@ConfigurationProperties(prefix = "database")
@Component
public class DatabaseConfig {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
