package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String name;
    private String surname;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }
}
