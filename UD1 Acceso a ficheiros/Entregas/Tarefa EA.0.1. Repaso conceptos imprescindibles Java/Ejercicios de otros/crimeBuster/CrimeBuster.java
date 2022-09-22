import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Desktop;

public class CrimeBuster {

    static FileReader fr;
    static BufferedReader br;
    static Pattern unamePattern = Pattern.compile(""); // A VOSA EXPRESIÓN REGULAR PARA O USUARIO
    static Pattern passwordPattern = Pattern.compile(""); // A VOSA EXPRESIÓN REGULAR PARA O CONTRASINAL
    static Matcher mat;

    public static void main(String[] args) {

        Desktop d = Desktop.getDesktop();
        File[] files = getFiles();
        boolean usernameFound = false;
        boolean passwordFound = false;
        String usernameMatch;
        String passwordMatch;
        int filenr = 0;

        while(!usernameFound && filenr < files.length) {

            usernameMatch = findCriminalUsername(files[filenr]);
            usernameFound = usernameMatch.equals(Solucion.USERNAME.getValor());

            filenr++;

        }

        filenr = 0;

        while(!passwordFound && filenr < files.length) {

            passwordMatch = findCriminalPassword(files[filenr]);
            passwordFound = passwordMatch.equals(Solucion.PASSWORD.getValor());

            filenr++;

        }

        if(usernameFound && passwordFound) {

            System.out.println("Secuestrador atopado!\nUsuario: " + Solucion.USERNAME.getValor()
                                + "\nContrasinal: " + Solucion.PASSWORD.getValor());

            try {

                d.open(new File(".CrimeBuster.html"));

            } catch (IOException e) {

                e.printStackTrace();

            }

        } else {

            if(usernameFound) {

                

            }

        }

    }

    public static File[] getFiles() {

        File directory = new File("arquivos");

        return directory.listFiles();

    }

    public static String findCriminalUsername(File f) {

        String out = "";
        // AS VARIABLES QUE NECESITEDES


        try { // INICIALIZACIÓN DO LECTOR DO ARQUIVO

            fr = new FileReader(f);
            br = new BufferedReader(fr);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        // A VOSA SOLUCIÓN

        return out;

    }

    public static String findCriminalPassword(File f) {

        String out = "";
        // AS VARIABLES QUE NECESITEDES


        try { // INICIALIZACIÓN DO LECTOR DO ARQUIVO

            fr = new FileReader(f);
            br = new BufferedReader(fr);

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();

        }

        // A VOSA SOLUCIÓN

        return out;

    }

}
