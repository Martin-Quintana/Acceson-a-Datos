package entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class EnrollmentPK implements Serializable {
    @Column(name = "person_enrollment")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personEnrollment;
    @Column(name = "course_enrollment")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        EnrollmentPK that = (EnrollmentPK) o;

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
