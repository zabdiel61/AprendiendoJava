/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.www.test.ciclovida;

import com.zd.www.domain.Contacto;
import javax.persistence.*;

/**
 *
 * @author jonat
 */
public class Estado2RecuperarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable 
        Contacto contacto = null;

        //Recuperar el objeto de la base de datos
        contacto = em.find(Contacto.class, 3);
        
        
        //detached
        System.out.println("contacto = " + contacto);
        
    }
}
