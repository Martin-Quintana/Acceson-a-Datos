import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<String, String> coches = new HashMap();
        try {
            FileReader fr = new FileReader("res\\coches.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ((linea = bf.readLine()) != null) {
                String[] coche = linea.split(" ");
                if (coches.containsKey(coche[0])){
                    coches.get(coche[0]).add;
                }
            }

            System.out.println("Modelos importadas correctamente");
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error de E/S");
            e.printStackTrace();
        }


    }
}