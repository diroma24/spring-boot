package es.romadie.da2d1a.ejercicio3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProcesoB implements CommandLineRunner {
    private final MessageService messageService;

    //Inyección por constructor
    public ProcesoB(@Qualifier("systemErrMessageService")
                    MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        String nombreClase = this.getClass().getName();
        messageService.showMessage("Ejecutando desde " + nombreClase);
    }
}
