import entity.HousePoints;
import entity.Person;

import javax.persistence.*;
import java.util.List;


public class    Main {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        consulta1(em);
//        consulta2(em);
//        consulta3(em);

    }

    //Punto uno consulta parametrizada
    public static void consulta1(EntityManager em){
        Query query= em.createQuery("select p from Person p inner join p.courses c where c.teacher.id=:profesorID");
        query.setParameter("profesorID",99);
        List<Person> personas= query.getResultList();
        for(Person persona: personas){
            System.out.println(persona.getFirstName());
        }
    }

    //Punto 2 consultas nominales
    public static void consulta2(EntityManager em){

        Query query1 = em.createNamedQuery("personMaxPointsGiver", HousePoints.class);
        query1.getResultList();
        System.out.println(query1);
        List<Person> personass = query1.getResultList();
        System.out.println("Personas: " + personass.toString());

        Query query2 = em.createNamedQuery("personMaxPointsReciver");
        query2.getResultList();
        System.out.println(query2);
        List<Person> personasss = query2.getResultList();
        System.out.println("Personas: " + personasss.toString());

    }
    //punto 3 Nativo
    public static void consulta3(EntityManager em){
        Query query3 = em.createNativeQuery("select * from person as p inner join house as h where p.house_id = h.id");
        List<Person> list = query3.getResultList();
        for (Person p : list) {
            System.out.println("Person:" + p.toString());
        }

        Query query4 = em.createNativeQuery("select * from person as p left outer join house as h on p.house_id = h.id where h.id=2");
        List<Person> lists = query4.getResultList();
        for (Person p : lists) {
            System.out.println("Person:" + p.toString());
        }

        Query query5 = em.createNativeQuery("select * from person as p where p.house_id = (select h.id from house as h where h.id=2)");
        List<Person> listss = query4.getResultList();
        for (Person p : listss) {
            System.out.println("Person:" + p.toString());
        }

    }





}
