package com.zd.sga.cliente.cascade;

import com.zd.sga.domain.Persona;
import com.zd.sga.domain.Usuario;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersistenciaCascadaJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //paso 1. crear un objeto
        //en estado transitido, ya no esta persistido en la bd
        Persona persona1 = new Persona("Hugo", "Hernandez", "hernandez@mail.com", "55887711");

        //crear objeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("hhernandez", "123", persona1);

        //paso 3. persistimos el objeto usuario unicamente
        em.persist(usuario1);

        //paso 4 commit en transaccion
        tx.commit();

        //objetos en estaod de detached
        log.debug("objeto persona: " + persona1);
        log.debug("objeto usuario: " + usuario1);

        em.close();

    }
}
