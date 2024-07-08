package org.Framework.SpringCore.Basics.Beans.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class CarFactoryConfig {

    @Bean
    @Primary
    public Engine engine(){
        return new Engine("V8 Engine");
    }

    @Bean
    @Qualifier("engine_suv")
    public Engine engine_suv(){
        return new Engine("Hybrid Engine");
    }

    @Bean
    public Tire tire(){
        return new Tire("All-Season Tires");
    }
}
