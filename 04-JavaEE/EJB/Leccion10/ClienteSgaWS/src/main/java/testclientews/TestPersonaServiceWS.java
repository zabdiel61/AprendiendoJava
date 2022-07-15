/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWS;
import java.util.List;

/**
 *
 * @author jonat
 */
public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWS personaServiceWS = new PersonaServiceImplService().getPersonaServiceImplPort();

        System.out.println("Ejecutando servicio de listar personas ws");

        List<Persona> personas = personaServiceWS.listarPersonas();

        for (Persona p : personas) {
            System.out.println("persona: " + p.getIdPersona() + ", nombre: " + p.getNombre() + ", apellido: " + p.getApellido());
        }
    }
}
