package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idStudent")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "identification")
    private String dni;
    @Column(name = "phone")
    private int phone;

    //Constructor vacio
    public Student() {
    }


    //Metodo equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (phone != student.phone) return false;
        if (!name.equals(student.name)) return false;
        return dni.equals(student.dni);
    }

    //Metodo hashCode() (No creo que lo utilice)
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + dni.hashCode();
        result = 31 * result + phone;
        return result;
    }


    //Metodo toString()
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", phone=" + phone +
                '}';
    }
}
