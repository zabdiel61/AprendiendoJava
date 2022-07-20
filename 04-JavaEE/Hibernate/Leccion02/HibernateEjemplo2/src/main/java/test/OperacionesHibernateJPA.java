/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.zd.dao.PersonaDAO;
import com.zd.domain.Persona;

/**
 *
 * @author jonat
 */
public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        Persona persona = new Persona();
        persona.setIdPersona(19);
        persona = personaDAO.buscarPersonaPorId(persona);
        System.out.println("persona encontrada: " + persona);
//        persona.setNombre("Reina");
//        persona.setApellido("Albayero");
//        persona.setEmail("Reina@gmail.com");
//        persona.setTelefono("78445522");
        personaDAO.eliminar(persona);
        personaDAO.listar();

//        personaDAO.modificar(persona);
    }

}
