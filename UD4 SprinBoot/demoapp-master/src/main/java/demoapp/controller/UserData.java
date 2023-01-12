package demoapp.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class UserData {
    @Size(min=3, max=15)
    String nombre;

    @Min(18)
    private Integer edad;

    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


