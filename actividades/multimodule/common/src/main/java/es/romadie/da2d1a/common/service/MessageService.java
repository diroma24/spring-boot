package es.romadie.da2d1a.common.service;

import org.springframework.stereotype.Service;

/**
 * EXPLICACIÓN MULTIMÓDULO:
 * Esta clase reside en el módulo 'common'.
 * * 1. Reutilización: Al estar aquí, cualquier otro módulo (api, web, batch)
 * que declare a 'common' como dependencia en su pom.xml podrá usar esta clase.
 * * 2. Escaneo de Componentes: Aunque esta clase tiene @Service, Spring Boot no la
 * detectará automáticamente desde otro módulo a menos que configuremos el
 * 'scanBasePackages' en la clase principal del módulo que arranca.
 */


@Service
public class MessageService {
    public String getMessage() {
        return "Hello! This message comes from the COMMON module.";
    }
}