/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.zd.sga.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //inicia la transaccion
        tx.begin();
        //insertar un nv registro en la bd
        //no se debe especificar el ID de la base de datos
        Persona persona = new Persona("Mario", "Hernandez", "mario@gmail.com", "77887744");
        log.debug("Objeto a persistir: " + persona);

        //persistimos el objeto
        em.persist(persona);

        //terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido: " + persona);
        em.close();

    }
}
