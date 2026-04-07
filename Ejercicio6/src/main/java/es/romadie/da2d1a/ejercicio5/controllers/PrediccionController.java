package es.romadie.da2d1a.ejercicio5.controllers;

import org.springframework.ui.Model;
import es.romadie.da2d1a.ejercicio5.services.MeteoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrediccionController {
    private final MeteoService meteoService;

    public PrediccionController(MeteoService meteoService) {
        this.meteoService = meteoService;
    }

    @GetMapping("/prediccion")
    public String verPrediccion(Model model) {
        model.addAttribute("semana", meteoService.getPrevisionSemana());
        return "prediccion";
    }
}