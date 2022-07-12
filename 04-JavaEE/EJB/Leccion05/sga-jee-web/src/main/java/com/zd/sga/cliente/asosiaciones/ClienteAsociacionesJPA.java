/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.cliente.asosiaciones;

import com.zd.sga.domain.Persona;
import com.zd.sga.domain.Usuario;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jonat
 */
public class ClienteAsociacionesJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();

        //cerramos la conexion
        em.close();

        //imprimir todos los objetos de tipo persona
        for (Persona persona : personas) {
            log.debug("persona: " + persona);
            //recuperamos los usuarios de cada persona
            for (Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
            }
        }
    }
}
