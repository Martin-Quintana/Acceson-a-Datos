package entities;


import jakarta.persistence.*;

//Poner para poder crear una clase de tipo entity y que la use la base de datos
@Entity

//Poner el nombre de la tabla
@Table(name = "students")
public class Student {
    //Es la primary key
    @Id
    //Para que el id se autoincremnte
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStundent;


    //Relacion de muchos a uno
    @ManyToOne
    //Unimos columnas 
    @JoinColumn(name = "idCourse")
    private Student student;


    //Poner el nombre de la columna
    @Column(name = "nombre")
    private String name;
    private String surname;

    //Constructor vacio
    public Student() {

    }
    //Constructor con "nombre"
    public Student(String name) {
        this.name = name;
    }

    //Setter de name
    public void setName(String name) {
        this.name = name;
    }
}
