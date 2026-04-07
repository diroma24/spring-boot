package es.romadie.da2d1a.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoA implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    //Inyección por constructor
    public ProcesoA(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) {
        String clase = this.getClass().getName();
        String frase = faker.backToTheFuture().quote();

        messageService.showMessage(clase + " dice: \"" + frase + "\"");
    }
}
