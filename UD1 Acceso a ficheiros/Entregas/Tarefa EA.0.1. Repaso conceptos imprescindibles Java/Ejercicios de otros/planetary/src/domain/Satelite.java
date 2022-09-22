package domain;

import java.util.ArrayList;
import java.util.List;

public class Satelite extends Astro {
    private double distancia_planeta;
    private double orbita_planetaria;
    private Planeta planeta_atractor;

    public Satelite(String name, double radio_ecuatorial, double tiempo_rotacion, double masa, double temperatura_media,
                    double gravedad, double distancia_planeta, double orbita_planetaria, Planeta planeta_atractor) {
        super(name, radio_ecuatorial, tiempo_rotacion, masa, temperatura_media, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta_atractor = planeta_atractor;
        planeta_atractor.getLista_satelites().add(this);
    }

    public double getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(double distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public double getOrbita_planetaria() {
        return orbita_planetaria;
    }

    public void setOrbita_planetaria(double orbita_planetaria) {
        this.orbita_planetaria = orbita_planetaria;
    }

    public Planeta getPlaneta_atractor() {
        return planeta_atractor;
    }

    public void setPlaneta_atractor(Planeta planeta_atractor) {
        planeta_atractor.getLista_satelites().add(this);
        this.planeta_atractor = planeta_atractor;
    }

    @Override
    public String toString() {
        return super.name;
    }

    public String datos() {
        return "\n==============================\n" +
                this.toString() +
                "\n==============================\n" +
                "\tdistancia_planeta=" + distancia_planeta + "\n" +
                "\torbita_planetaria=" + orbita_planetaria + "\n" +
                "\tplaneta_atractor=" + planeta_atractor.getName() + "\n" +
                "\tradio_ecuatorial=" + radio_ecuatorial + "\n" +
                "\ttiempo_rotacion=" + tiempo_rotacion + "\n" +
                "\tmasa=" + masa + "\n" +
                "\ttemperatura_media=" + temperatura_media + "\n" +
                "\tgravedad=" + gravedad +
                "\n==============================\n";
    }
}
