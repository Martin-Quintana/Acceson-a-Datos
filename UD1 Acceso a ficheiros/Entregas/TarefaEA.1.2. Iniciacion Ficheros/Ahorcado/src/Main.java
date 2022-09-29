import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Main {

    private static Path SAVE_FILE = Path.of("game-data.bin");

    public static void main(String[] args) {

        Ahorcado juego;

        if (Files.exists(SAVE_FILE)) {

            juego = loadData();

        } else {

            String[] words = {"SERIALIZAR", "OBJETOS", "PALABRAS", "PRIVATE", "STATIC"};
            Random rnd = new Random();
            String palabra = words[rnd.nextInt(0, words.length)];

            juego = new Ahorcado(palabra);

        }

        if (juego.jugar() == 1) {

            saveData(juego);

        } else {

            if (Files.exists(SAVE_FILE)) {

                try {

                    Files.delete(SAVE_FILE);

                } catch (IOException ex) {

                    System.out.println("Error al borrar el archivo");

                }

            }

        }

    }

    private static void saveData(Ahorcado obj) {

        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(SAVE_FILE.toFile()));) {

            escritor.writeObject(obj);

        } catch (IOException ex) {

        }

    }

    private static Ahorcado loadData() {

        Ahorcado out = null;

        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(SAVE_FILE.toFile()));) {

            Object obj = lector.readObject();

            if (obj instanceof Ahorcado) {

                out = (Ahorcado) obj;

            }

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }


        return out;
    }

}