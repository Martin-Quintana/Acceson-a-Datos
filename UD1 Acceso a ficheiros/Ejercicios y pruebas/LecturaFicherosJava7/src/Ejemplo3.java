import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejemplo3 {
    public static void main(String[] args) {
        try {
            String lineas = Files.readString ( Paths.get ( "res\\lineas.txt " ) ) ;
            System.out.println ( lineas ) ;
        } catch ( IOException e ) {
            System.out.println ( " No se ha podido abrir el fichero . " ) ;
        }
    }
}
