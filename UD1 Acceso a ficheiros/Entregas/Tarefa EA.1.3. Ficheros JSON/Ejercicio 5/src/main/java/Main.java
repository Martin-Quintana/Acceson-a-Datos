import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("spanish", "english"));
        Game g = new Game("WoW", "World of WarCraft...", l);

        try (ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("games.bin"))) {

            f.writeObject(g);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            System.err.println("No se ha creado el archivo games.bin");
        }

        

        //Leer el archivo .bin
        Game g2;

        try (var ois = new ObjectInputStream(new FileInputStream("games.bin"))) {
            g2 = (Game) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Transformar el archivo .bin a .xml
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(new File("games.bin"), g2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("games.xml"), g2);

    }
}