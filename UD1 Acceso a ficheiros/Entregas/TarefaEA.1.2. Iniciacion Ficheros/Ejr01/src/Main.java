import java.io.File;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        Scanner   sc = new Scanner(System.in);
        System.out.println("Introduce un nombre del fichero : ");
        String nombreDir = sc.next();
        File dir = new File(nombreDir);
        String permisos = "";
        if (dir.canRead()){
            permisos += "r";
        }
        if(dir.canWrite()){
            permisos += "w";
        }
        if (dir.canExecute()){
            permisos+="x" ;
        }
        if (dir.isDirectory()){
            System.out.println("d"+permisos+" directorio");
        } else if (dir.isFile()) {
            System.out.println("-"+permisos+"- archivo");
        }else{
            System.out.println("Esta ruta no es un fichero ni un directorio");
        }
    }
}
