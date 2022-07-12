package com.zd.sga.cliente.ciclovidajpa;

import com.zd.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //inicia la transaccion
        //Paso 1. crea un nuevo objeto
        //objeto en estado transitivo
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@gmail.com", "88447755");

        //paso 2. incia la transaccion
        tx.begin();

        //paso 3. ejecutamos el sql
        em.persist(persona1);

        log.debug("Objeto persistido - aun sin commit: " + persona1);

        //paso 4. commit/rollback
        tx.commit();

        //Objeto en estado detached
        log.debug("Objeto persistido - estado de detached: " + persona1);

        //Cerramos el objeto em
        em.close();
    }
}
