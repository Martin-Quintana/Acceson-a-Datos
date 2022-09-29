import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        //Path del archivo de coches
        var rutaArchivo = Path.of("res\\coches.txt");

        //Lista de Strings
        List<String> lineas; //Se podria igualar a null pero es redundante
        HashMap<String, ArrayList<String>> mym = new HashMap<>();
        try {
            lineas = Files.readAllLines(rutaArchivo);//Para que se lean todas la lineas
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Divide el String en marca y modelo
        lineas.forEach((linea) -> {
            //System.out.println(linea);
            String[] parts = linea.split(" ", 2);
            String marca = parts[0];
            String modelo = parts[1];
            //Opcion 1
            mym.putIfAbsent(marca, new ArrayList<>());
            mym.get(marca).add(modelo);
        });

        //Array para guardar marcas y modelos
        ArrayList<String> lineasSalida = new ArrayList<>();

        mym.forEach((marca, modelos) -> {
            var resultado = "";
            resultado += marca;
            resultado += ": ";
            modelos.sort(null);
            resultado += String.join(", ", modelos);//Quitar corchetes
            lineasSalida.add(resultado);
        });

        lineasSalida.sort(null);
        System.out.println(String.join(System.lineSeparator(), lineasSalida));

        var salida = String.join(System.lineSeparator(), lineasSalida);
        //Almacenar en un nuevo fichero
        try {
            Files.writeString(Path.of("res\\marcas.txt"), salida);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
