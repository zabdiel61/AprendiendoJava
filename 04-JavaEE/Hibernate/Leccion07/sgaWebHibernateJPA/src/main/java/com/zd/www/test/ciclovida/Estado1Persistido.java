package com.zd.www.test.ciclovida;

import com.zd.www.domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("zjona@mail.com");
        contacto.setTelefono("77889944");

        //2. persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();

        //3. detached (separado de la bd)
        System.out.println("contacto: " + contacto);
    }
}
