package es.romadie.da2d1a.ejercicio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoA implements CommandLineRunner {
    private final MessageService messageService;

    //Inyección por constructor
    public ProcesoA(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        String nombreClase = this.getClass().getName();
        messageService.showMessage("Ejecutando desde " + nombreClase);
    }
}
