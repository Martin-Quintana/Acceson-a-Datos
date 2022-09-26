import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class EjemploCrearBorrarFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        Path fichero = Paths.get(nombre);
        // Files.exists(fichero)
        try {
            try {
                Files.createFile(fichero);
                System.out.println("Se ha creado el fichero");
            } catch (FileAlreadyExistsException ex) {
                System.out.println("El fichero ya existía");
            }



            System.out.println("Ruta absoluta: " + fichero.toAbsolutePath());
            System.out.print("Quieres borrar el fichero " + fichero + "(s/N)? ");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                Files.delete(fichero);
                System.out.println("Se ha borrado el fichero.");
            } else {
                System.out.println("Se ha conservado el fichero.");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
