/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.www.test.ciclovida;

import com.zd.www.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jonat
 */
public class Estado4EliminarObjeto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable 
        Contacto contacto = null;

        //Recuperar el objeto de la base de datos
        //1. Transitivo
        contacto = em.find(Contacto.class, 3);

        em.getTransaction().begin();

        //3. remove
        em.remove(contacto);
        em.getTransaction().commit();

        //3. transitivo
        System.out.println("contacto = " + contacto);
    }
}
