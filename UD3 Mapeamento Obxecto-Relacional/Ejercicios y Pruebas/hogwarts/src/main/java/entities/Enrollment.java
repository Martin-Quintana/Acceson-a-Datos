package entities;

import jakarta.persistence.*;

@Entity
@IdClass(EnrollmentPK.class)
public class Enrollment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "person_enrollment")
    private int personEnrollment;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "course_enrollment")
    private int courseEnrollment;

    public int getPersonEnrollment() {
        return personEnrollment;
    }

    public void setPersonEnrollment(int personEnrollment) {
        this.personEnrollment = personEnrollment;
    }

    public int getCourseEnrollment() {
        return courseEnrollment;
    }

    public void setCourseEnrollment(int courseEnrollment) {
        this.courseEnrollment = courseEnrollment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enrollment that = (Enrollment) o;

        if (personEnrollment != that.personEnrollment) return false;
        if (courseEnrollment != that.courseEnrollment) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personEnrollment;
        result = 31 * result + courseEnrollment;
        return result;
    }
}
