package es.romadie.da2d1a.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public Faker faker() {
        // Spring ejecuta esta función una vez y guardará el objeto
        return new Faker();
    }
}