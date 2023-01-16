package demoapp.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserData {
    @NotNull
    @Size(min=3, max=15)
    String nombre;

    @NotNull
    @Min(18)
    private Integer edad;

    public Integer getEdad() {
        return edad;
    }

    @NotNull
    @Pattern(regexp = "[0-9]{8}[A-Z]")
    public String dni;


    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}


