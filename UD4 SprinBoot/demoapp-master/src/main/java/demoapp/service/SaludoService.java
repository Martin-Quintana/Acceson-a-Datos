package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }
    public String edad(String edad) { return " tienes " + edad + " anhos";
    }

}