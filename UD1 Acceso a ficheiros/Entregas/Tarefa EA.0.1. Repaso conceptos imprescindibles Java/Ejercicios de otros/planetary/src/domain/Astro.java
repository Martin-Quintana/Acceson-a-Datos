package domain;


public abstract class Astro {
    protected double radio_ecuatorial;
    protected double tiempo_rotacion;
    protected double masa;
    protected double temperatura_media;
    protected double gravedad;
    protected String name;

    public Astro(String name, double radio_ecuatorial, double tiempo_rotacion, double masa, double temperatura_media, double gravedad) {
        this.name = name;
        this.radio_ecuatorial = radio_ecuatorial;
        this.tiempo_rotacion = tiempo_rotacion;
        this.masa = masa;
        this.temperatura_media = temperatura_media;
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return
                "radio_ecuatorial=" + radio_ecuatorial + "\n" +
                "tiempo_rotacion=" + tiempo_rotacion + "\n" +
                "masa=" + masa + "\n" +
                "temperatura_media=" + temperatura_media + "\n" +
                "gravedad=" + gravedad;
    }
}
