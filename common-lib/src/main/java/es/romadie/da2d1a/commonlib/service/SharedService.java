package es.romadie.da2d1a.commonlib.service;

import org.springframework.stereotype.Service;

/**
 * EXPLICACIÓN MULTIPROYECTO:
 * Al ser un proyecto independiente, este servicio se empaquetará en un JAR.
 * Para que otros proyectos lo vean, debemos ejecutar 'mvn install'.
 */
@Service
public class SharedService {
    public String getSharedMessage() {
        return "Mensaje desde la librería INDEPENDIENTE";
    }
}