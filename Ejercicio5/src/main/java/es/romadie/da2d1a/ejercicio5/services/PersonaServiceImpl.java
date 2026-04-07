package es.romadie.da2d1a.ejercicio5.services;

import es.romadie.da2d1a.ejercicio5.Persona;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service //Bena de servicio
public class PersonaServiceImpl implements PersonaService {

    private final Faker faker;

    // Se inyecta Faker por constructor
    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        Persona p = new Persona();
        p.setNombre(faker.name().firstName());
        p.setApellidos(faker.name().lastName());
        p.setDni(faker.idNumber().valid());

        // Fecha de nacimiento aleatoria
        p.setFechaNacimiento(faker.date().birthday(18, 65)
                .toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

        return p;
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            personas.add(findOne());
        }
        return personas;
    }
}
