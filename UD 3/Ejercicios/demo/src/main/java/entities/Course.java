package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Poner para poder crear una clase de tipo entity y que la use la base de datos
@Entity
public class Course {
    //Es la primary Key
    @Id
    //Para que el ID se autoincremente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;

    //Contructor con name
    public Course(String name) {
        this.name = name;
    }

    //Constructor vacio
    public Course() {
    }

    //Setter de nombre
    public void setName(String name) {
        this.name = name;
    }
}
