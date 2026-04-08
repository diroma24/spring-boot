package es.romadie.da2d1a.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EXPLICACIÓN MULTIMÓDULO:
 * Esta es la "llave de contacto" del módulo API.
 * * 1. scanBasePackages: Por defecto, Spring solo busca clases en 'es.romadie.da2d1a.api'.
 * Como nuestro MessageService está en 'es.romadie.da2d1a.common', necesitamos
 * decirle que escanee desde la raíz 'es.romadie.da2d1a' para que encuentre el @Service.
 * * 2. Independencia: Este módulo genera su propio JAR ejecutable que contiene dentro
 * el código compilado de 'common'.
 */


@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

}
