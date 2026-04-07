package es.romadie.da2d1a.ejercicio5.services;

import es.romadie.da2d1a.ejercicio5.PrediccionDia;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MeteoServiceImpl implements MeteoService {
    private final Faker faker;

    public MeteoServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public List<PrediccionDia> getPrevisionSemana() {
        List<PrediccionDia> semana = new ArrayList<>();
        LocalDate hoy = LocalDate.now();

        for (int i = 0; i < 7; i++) {
            PrediccionDia dia = new PrediccionDia();
            dia.setFecha(hoy.plusDays(i));
            dia.setProbabilidadPrecipitacion(faker.number().numberBetween(0, 101));
            dia.setTempMin(faker.number().numberBetween(0, 11));
            dia.setTempMax(faker.number().numberBetween(10, 21));
            dia.setNivelUV(faker.number().numberBetween(0, 6));
            semana.add(dia);
        }
        return semana;
    }
}
