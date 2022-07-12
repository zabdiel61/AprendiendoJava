/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.cliente.ciclovidajpa;

import com.zd.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jonat
 */
public class ActualizarObjetoSesionLargaJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //inicia la transaccion
        //Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //paso 2. ejecuta SQL de tipo select
        //el id proporcionado debe existir en la bd
        Persona persona1 = em.find(Persona.class, 2);

        //objeto en estado de detached
        log.debug("Objeto encontrado: " + persona1);

        //paso 3. setValue(nuevoValor)
        persona1.setEmail("chepe@.mail.com");
        persona1.setEmail("c.chepe@mail.com");

        //paso 4. termina la transaccion 1
        tx.commit();

        //objeto en estado de detached
        log.debug("Objeto modificado: " + persona1);

        //Cerramos el objeto em
        em.close();
    }
}
