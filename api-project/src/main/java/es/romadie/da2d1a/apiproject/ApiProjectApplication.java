package es.romadie.da2d1a.apiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EXPLICACIÓN MULTIPROYECTO:
 * 'scanBasePackages' es OBLIGATORIO aquí.
 * Por defecto, Spring solo busca en 'es.romadie.da2d1a.apiproject'.
 * Como la librería está en 'es.romadie.da2d1a.commonlib', hay que añadirlo
 * para que Spring encuentre el @Service y lo pueda inyectar en el controlador.
 */
@SpringBootApplication(scanBasePackages = {
        "es.romadie.da2d1a.apiproject",
        "es.romadie.da2d1a.commonlib"
})
public class ApiProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiProjectApplication.class, args);
    }
}