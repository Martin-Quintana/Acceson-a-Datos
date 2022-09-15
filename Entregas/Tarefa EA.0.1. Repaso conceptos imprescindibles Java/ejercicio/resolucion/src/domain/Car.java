package domain;

public class Car {
    private String name;
    private String model;
    private String color;
    private int year;

    public Car(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + name + '\'' +
                ", modelo='" + model + '\'' +
                ", color='" + color + '\'' +
                ", año=" + year +
                '}';
    }
}
