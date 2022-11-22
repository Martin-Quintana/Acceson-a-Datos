package entities;

import jakarta.persistence.*;

import java.util.List;

//Poner para poder crear una clase de tipo entity y que la use la base de datos
@Entity
@Table(name = "courses")
public class Course {
    //Es la primary Key
    @Id
    //Para que el ID se autoincremente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Relacion de uno a muchos
    @OneToMany(mappedBy = "course")
    private List<Student> ListStundent;

    @Column(name = "nombre")
    private String name;



    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    //Setter de nombre
    public void setName(String name) {
        this.name = name;
    }
}
