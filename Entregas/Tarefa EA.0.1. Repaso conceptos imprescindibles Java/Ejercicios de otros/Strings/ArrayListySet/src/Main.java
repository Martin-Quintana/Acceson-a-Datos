import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> totalNumeros = new ArrayList();
        int media;
        int suma = 0;
        int numero = scan.nextInt();
        System.out.println("Introduce un numero");


        while (numero != 0){
            System.out.println("Introduce otro numero");
            totalNumeros.add(numero);
        }

        for (int i = 0; i > totalNumeros.size(); i++) {
            suma += totalNumeros.get(numero);
        }
        System.out.println(suma/totalNumeros.size());
    }
}
