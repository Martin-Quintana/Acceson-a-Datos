package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class AdiosService {
    public String adios(String nombre) { return "Hasta pronto " + nombre;}
}
