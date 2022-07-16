/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.zd.domain.Persona;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jonat
 */
public class HolaMundoHibernate {

    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateEjemplo2");
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery(hql);
        List<Persona> personas = q.getResultList();
        for (Persona p : personas) {
            System.out.println("Persona: " + p);
        }
    }
}
