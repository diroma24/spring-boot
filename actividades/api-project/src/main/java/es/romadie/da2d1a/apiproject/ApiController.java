package es.romadie.da2d1a.apiproject;

// IMPORTANTE: Esta importación viene de tu otro proyecto (common-lib)
import es.romadie.da2d1a.commonlib.service.SharedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EXPLICACIÓN MULTIPROYECTO:
 * 1. Dependencia Externa: Aunque SharedService no está en tus carpetas de este proyecto,
 * puedes importarlo porque Maven lo ha añadido al "classpath" desde tu carpeta .m2.
 * 2. Inyección de Dependencias: Spring Boot creará un Bean de SharedService y lo
 * inyectará aquí igual que si fuera una clase local.
 */
@RestController
public class ApiController {

    private final SharedService sharedService;

    // Constructor para inyección de dependencias
    public ApiController(SharedService sharedService) {
        this.sharedService = sharedService;
    }

    @GetMapping("/hello-api")
    public String sayHello() {
        // Usamos la lógica que reside en el proyecto 'common-lib'
        return sharedService.getSharedMessage() + " -> Respondido por el API Project";
    }
}