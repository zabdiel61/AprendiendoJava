/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.cliente;

import com.zd.sga.domain.Persona;
import com.zd.sga.servicio.PersonaServiceRemote;
import javax.naming.*;
import org.apache.logging.log4j.*;

/**
 *
 * @author jonat
 */
public class PruebaManejoTransacciones {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!com.zd.sga.servicio.PersonaServiceRemote");
            log.debug("iniciando prueba Manjejo Transaccional persona service");

            //buscar un objeto persona
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
            log.debug("persona recuperada: " + persona1);
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
    }
}
