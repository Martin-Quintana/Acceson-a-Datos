import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Game g2;
        try (var ois = new ObjectInputStream(new FileInputStream("games.bin")) {



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}