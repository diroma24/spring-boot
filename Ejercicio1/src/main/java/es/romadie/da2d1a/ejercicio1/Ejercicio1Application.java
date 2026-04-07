package es.romadie.da2d1a.ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio1Application.class, args);
    }

    //Si no se añaden beans no ocurre nada ya que no se añaden en ningún momento los componentes
    //Si se añade @Componente la aplicación ya los detecta y por lo tanto se llama a los métodos run
    //Por defecto se llama primero a ProcesoA - B - C
    //PAra cambiar el orden se usa @Order(1),(2)...
}
