package entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCourse")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "beginDate")
    private Date beginDate;
    @Column(name = "endDate")
    private Date enDate;

    //Contructor Vacio
    public Course() {
    }

    //Metodo equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (id != course.id) return false;
        if (!description.equals(course.description)) return false;
        if (!beginDate.equals(course.beginDate)) return false;
        return enDate.equals(course.enDate);
    }


    //Metodo hasCode()
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + description.hashCode();
        result = 31 * result + beginDate.hashCode();
        result = 31 * result + enDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", beginDate=" + beginDate +
                ", enDate=" + enDate +
                '}';
    }
}
