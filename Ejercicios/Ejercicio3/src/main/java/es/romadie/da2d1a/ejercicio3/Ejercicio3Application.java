package es.romadie.da2d1a.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio3Application.class, args);
    }

    //Como hay dos servicios que implementan MessageService si no se especifica cual es el principal sale error
    //Para ello se usa la notación @Primary, que indica que si se pide un MessageService pero no se especifica cúal
    // se usará ese
    // Para especificar otro se usa la notación @Qualifier
}
