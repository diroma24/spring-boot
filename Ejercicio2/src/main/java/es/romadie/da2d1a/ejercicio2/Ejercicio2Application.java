package es.romadie.da2d1a.ejercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Application.class, args);
    }

    //Ahora el Sout se da gracias al servicio de MessageService
    //Gracias a esto el ProcesoA ya no es el responsable de crear el objeto que muestra los mensajes
    //Esto es útil al hacer pruebas, puesto que se podrían pasar Mocks facilmente
}
