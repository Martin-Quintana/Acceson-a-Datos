import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("spanish", "english"));
        Game g1 = new Game("WoW", "World of WarCraft...", l);

        try (ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("games.bin"))) {

            f.writeObject(g1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            System.err.println("No se ha creado el archivo games.bin");

        }
        ObjectMapper om = new ObjectMapper();


    }
}