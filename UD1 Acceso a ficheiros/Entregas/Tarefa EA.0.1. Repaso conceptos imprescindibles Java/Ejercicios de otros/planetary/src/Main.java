import domain.Planeta;
import domain.Satelite;

public class Main {
    public static void main(String[] args) {

        Planeta tierra = new Planeta("La Tierra", 50000., 4322., 123445, 1234, 54235423, 213213, 124325, true);
        Satelite luna = new Satelite("Luna", 12314, 123123, 123123, 123123, 123123, 123123, 123123, tierra);

        System.out.println(luna.datos());
        System.out.println(tierra.datos());
    }
}