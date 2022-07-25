package com.zd.www.test.cascade;

import com.zd.www.domain.Alumno;
import com.zd.www.domain.Contacto;
import com.zd.www.domain.Domicilio;
import javax.persistence.*;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        Domicilio domicilio = null;
        domicilio = em.find(Domicilio.class, 2);
//        domicilio.setCalle("Nogales");
//        domicilio.setNoCalle("10");
//        domicilio.setPais("Mexico");

        Contacto contacto = new Contacto();
        contacto = em.find(Contacto.class, 1);
//        contacto.setEmail("jona@mail.com");
//        contacto.setTelefono("77889944");

        Alumno alumno = new Alumno();
        alumno.setNombre("Zabjon61");
        alumno.setApellido("Hernan");
        alumno.setContacto(contacto);
        alumno.setDomicilio(domicilio);

        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();

        System.out.println("alumno = " + alumno);
    }

}
