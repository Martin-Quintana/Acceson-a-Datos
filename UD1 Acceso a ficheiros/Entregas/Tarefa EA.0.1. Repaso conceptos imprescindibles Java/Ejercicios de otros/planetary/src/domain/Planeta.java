package domain;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {

    private double distancia_sol;
    private double orbita_sol;
    private boolean tiene_satelites;
    private List<Satelite> lista_satelites;
    private String name;


    public Planeta(String name, double radio_ecuatorial, double tiempo_rotacion, double masa, double temperatura_media,
                   double gravedad, double distancia_sol, double orbita_sol, boolean tiene_satelites) {
        super(name, radio_ecuatorial, tiempo_rotacion, masa, temperatura_media, gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita_sol = orbita_sol;
        this.tiene_satelites = tiene_satelites;
        this.lista_satelites = new ArrayList<>();
    }

    public double getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(double distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public double getOrbita_sol() {
        return orbita_sol;
    }

    public void setOrbita_sol(double orbita_sol) {
        this.orbita_sol = orbita_sol;
    }

    public boolean isTiene_satelites() {
        return tiene_satelites;
    }

    public void setTiene_satelites(boolean tiene_satelites) {
        this.tiene_satelites = tiene_satelites;
    }

    public List<Satelite> getLista_satelites() {
        return lista_satelites;
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.name;
    }

    public String datos() {
        String sat = "";
        for (Satelite x : lista_satelites) {
            sat += x +" ";
        }
        return "\n==============================\n" +
                this.toString() +
                "\n==============================\n" +
                "\tdistancia_sol=" + distancia_sol + "\n" +
                "\torbita_sol=" + orbita_sol + "\n" +
                "\ttiene_satelites=" + tiene_satelites + "\n" +
                "\tradio_ecuatorial=" + radio_ecuatorial + "\n" +
                "\ttiempo_rotacion=" + tiempo_rotacion + "\n" +
                "\tmasa=" + masa + "\n" +
                "\ttemperatura_media=" + temperatura_media + "\n" +
                "\tgravedad=" + gravedad + "\n" +
                "\tsatélites=" + sat + "\n" +
                "\n==============================\n";
    }
}
