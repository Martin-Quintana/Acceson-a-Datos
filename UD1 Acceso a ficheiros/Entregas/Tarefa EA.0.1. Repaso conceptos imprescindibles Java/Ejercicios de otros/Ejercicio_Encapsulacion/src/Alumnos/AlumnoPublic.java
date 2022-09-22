package Alumnos;

public class AlumnoPublic {
    public String nombre;
    public byte edad;
    public String curso = "DAM";

    public AlumnoPublic(String nombre, byte edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
