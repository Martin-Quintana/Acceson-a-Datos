package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    //Manda un saludo en la clase saludo.html
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }

    //Dice que edad tienes la cual se ha introducido desde el formulario
    public String edad(String edad) { return " tienes " + edad + " anhos";
    }

}