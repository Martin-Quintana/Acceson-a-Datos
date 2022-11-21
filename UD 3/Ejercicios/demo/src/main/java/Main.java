import entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Anna");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
