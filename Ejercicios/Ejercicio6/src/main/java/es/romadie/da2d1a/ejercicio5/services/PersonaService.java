package es.romadie.da2d1a.ejercicio5.services;

import es.romadie.da2d1a.ejercicio5.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona> find(int count); // Devuelve una lista con el count de personas
    Persona findOne();             // Devuelve una sola persona
}