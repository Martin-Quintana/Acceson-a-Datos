import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int NUM_MAX_ERRORES = 5;
    private int numErrores;
    private String palabraSecreta;
    private String[] acertadas;

    public Ahorcado(String palabraSecreta) {
        this.numErrores = 0;
        this.palabraSecreta = palabraSecreta;
        acertadas = new String[palabraSecreta.length()];
        Arrays.fill(acertadas, "-");
    }

    public int jugar() {

        int out = 0;
        Scanner in = new Scanner(System.in);
        String sigLetra;
        boolean acabada = false;

        while (!acabada) {

            System.out.println("Fallos restantes: " + (NUM_MAX_ERRORES - numErrores));

            for (String s : acertadas) {

                System.out.print(s);

            }

            System.out.println();

            System.out.println("Introduce una letra o escribe \"exit\" para salir y guardar");

            sigLetra = in.nextLine();

            if (sigLetra.equals("exit")) {

                out = 1;
                acabada = true;

            } else if (sigLetra.length() == 1) {

                comprobarLetras(sigLetra.charAt(0));
                acabada = comprobarFinal();

            } else {

                System.out.println("Introduce solo una letra");

            }

        }

        return out;
    }

    private void comprobarLetras(char letra) {

        letra = Character.toUpperCase(letra);

        if (palabraSecreta.contains(Character.toString(letra))) {

            int index = palabraSecreta.indexOf(Character.toString(letra));

            while (index != -1) {

                acertadas[index] = Character.toString(letra);
                index = palabraSecreta.indexOf(Character.toString(letra), index + 1);

            }

        } else {

            numErrores++;

        }

    }

    private boolean comprobarFinal() {

        boolean out = false;

        if (comprobarFinalVictoria()) {

            System.out.println("Ganaste");
            out = true;

        } else if (comprobarFinalDerrota()) {

            System.out.println("Perdiste");
            out = true;

        }

        return out;
    }

    private boolean comprobarFinalVictoria() {

        int correctas = 0;
        boolean acabada = false;

        for (int i = 0; i < palabraSecreta.length(); i++) {

            if (Character.toString(palabraSecreta.charAt(i)).toLowerCase().equals(acertadas[i].toLowerCase())) {

                correctas++;

            }

        }

        if (correctas == palabraSecreta.length()) {

            acabada = true;

        }

        return acabada;
    }

    private boolean comprobarFinalDerrota() {
        return NUM_MAX_ERRORES <= numErrores;
    }

}
