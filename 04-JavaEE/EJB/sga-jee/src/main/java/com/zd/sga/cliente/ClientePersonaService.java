/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.cliente;

import com.zd.sga.domain.Persona;
import com.zd.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;

/**
 *
 * @author jonat
 */
public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");

        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaServiceRemote = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.zd.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaServiceRemote.listarPersonas();
            
            for(Persona persona: personas){
                System.out.println("persona = " + persona);
            }
            
            System.out.println("\n Fin de la llamada al EJB desde el cliente");

        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
