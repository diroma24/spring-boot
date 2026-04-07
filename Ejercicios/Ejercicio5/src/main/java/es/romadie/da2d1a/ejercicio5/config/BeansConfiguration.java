package es.romadie.da2d1a.ejercicio5.config;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    public Faker faker() {
        return new Faker();
    }
}