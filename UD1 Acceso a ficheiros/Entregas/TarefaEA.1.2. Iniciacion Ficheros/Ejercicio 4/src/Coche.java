public class Coche {
    private String name;
    private String model;


    public Coche(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + name + '\'' +
                ", modelo='" + model + '\'' +
                '}';
    }
}
