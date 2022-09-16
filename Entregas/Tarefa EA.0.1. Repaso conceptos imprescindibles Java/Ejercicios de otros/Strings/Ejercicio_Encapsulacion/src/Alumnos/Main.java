package Alumnos;

public class Main {
    public static void main(String[] args) {

        AlumnoPrivate Alumno1 = new AlumnoPrivate();
        Alumno1.setEdad((byte) 19);
        Alumno1.setCurso("DAM");
        Alumno1.setNombre("Manolas");
        System.out.println(Alumno1.getNombre() + " tiene " + Alumno1.getEdad() + " anhos y pertenece a " + Alumno1.getCurso());

    }
}
