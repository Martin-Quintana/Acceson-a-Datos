import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero : ");
        String dir = sc.next();
        try (BufferedReader lector = new BufferedReader(new FileReader(dir+".txt"));) {
            String linea = " ";
            String palabras[]= {};
            while ((linea=lector.readLine()) != null){
            System.out.println(linea);
            palabras = linea.split(" ");
            }
            Arrays.sort(palabras);
            try (PrintWriter escritor = new PrintWriter(dir+"_sort.txt")) {
                for (int i = 1; i <palabras.length; i++) {
                    escritor.println(palabras[i]);
                }
                System.out.println("Se creó un archivo llamado "+dir+"_short.txt");
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}

