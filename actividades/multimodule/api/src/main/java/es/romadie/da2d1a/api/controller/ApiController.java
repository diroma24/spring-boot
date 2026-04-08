package es.romadie.da2d1a.api.controller;

import es.romadie.da2d1a.common.service.MessageService; // <--- Import del otro módulo
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EXPLICACIÓN MULTIMÓDULO:
 * Este controlador demuestra el ACOPLAMIENTO DE DEPENDENCIAS.
 * * 1. Inyección Trans-Módulo: Maven se encarga de que MessageService esté en el
 * classpath de este módulo. Spring se encarga de crear la instancia e inyectarla.
 * * 2. Separación de Responsabilidades: El controlador solo se preocupa de la HTTP,
 * la lógica de "qué decir" se la delega a Common.
 */

@RestController
public class ApiController {

    private final MessageService messageService;

    // Spring inyectará automáticamente el servicio de 'common'
    public ApiController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return messageService.getMessage() + " ... and it was delivered by the API module.";
    }
}