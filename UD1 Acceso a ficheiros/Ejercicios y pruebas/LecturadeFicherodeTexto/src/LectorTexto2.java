import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


    public class LectorTexto2 {
        public static void main(String[] args) {

            try (var lector = new Scanner(new BufferedReader(new FileReader("res\\lineas.txt")));) {
                while (lector.hasNextLine())
                    System.out.println(lector.nextLine());
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }

        }
}
