import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLectorTexto {
    public static void main(String[] args) {

        try (BufferedReader lector = new BufferedReader(new FileReader("res\\lineas.txt"));) {
            String linea;
            while ((linea=lector.readLine()) != null)
                System.out.println(linea);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
