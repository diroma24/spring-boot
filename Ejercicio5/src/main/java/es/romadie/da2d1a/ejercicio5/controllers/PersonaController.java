package es.romadie.da2d1a.ejercicio5.controllers;

import es.romadie.da2d1a.ejercicio5.services.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    private final PersonaService personaService;

    // Se inyecta el servicio por constructor
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas") // URL del listado
    public String listado(Model model) {
        // Se obtienen 1023 personas y se guardan en el model
        model.addAttribute("lista", personaService.find(1023));
        return "personas/listado";
    }

    @GetMapping("/personas/una") // URL para una sola persona
    public String unaPersona(Model model) {
        // Obtenemos una sola persona
        model.addAttribute("p", personaService.findOne());
        return "personas/detalle";
    }
}