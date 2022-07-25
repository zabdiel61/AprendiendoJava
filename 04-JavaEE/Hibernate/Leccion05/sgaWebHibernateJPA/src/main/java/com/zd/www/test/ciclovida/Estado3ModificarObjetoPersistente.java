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
public class Estado3ModificarObjetoPersistente {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable 
        Contacto contacto = null;

        //Recuperar el objeto de la base de datos
        //1. Transitivo
        contacto = em.find(Contacto.class, 3);
        contacto.setEmail("zabjon@mail.com");

        //modificamos el 0bjeto
        em.getTransaction().begin();
        
        //2. persistente
        em.merge(contacto);
        em.getTransaction().commit();

        //3. detached
        System.out.println("contacto = " + contacto);
    }
}
