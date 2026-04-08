package es.romadie.da2d1a.web.controller;

import es.romadie.da2d1a.common.service.MessageService;
import org.springframework.stereotype.Controller; // Nota: @Controller, no @RestController
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private final MessageService messageService;

    public WebController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/index")
    public String index(Model model) {
        // Pasamos el mensaje de common a la vista HTML
        model.addAttribute("msg", messageService.getMessage());
        return "index"; // Esto buscará index.html en templates
    }
}