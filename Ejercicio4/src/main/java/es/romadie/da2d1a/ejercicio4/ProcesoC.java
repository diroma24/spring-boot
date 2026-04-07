package es.romadie.da2d1a.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ProcesoC implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    //Inyección por constructor
    public ProcesoC(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        String nombreClase = this.getClass().getName();
        String frase = faker.backToTheFuture().quote();
        messageService.showMessage(nombreClase + " dice: \"" + frase + "\"");
    }
}
