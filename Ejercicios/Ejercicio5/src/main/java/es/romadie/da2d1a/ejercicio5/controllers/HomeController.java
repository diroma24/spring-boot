package es.romadie.da2d1a.ejercicio5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controlador web
public class HomeController {

    @GetMapping("/") // Mapeo la URL raíz
    public String index() {
        return "index"; // Se busca un archivo llamado index.html en templates
    }
}