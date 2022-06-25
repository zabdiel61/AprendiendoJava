/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingresar nombre");
//        String nombre = entrada.nextLine();
//        System.out.println("Ingresar apellido");
//        String apellido = entrada.nextLine();
//        System.out.println("Ingresar email");
//        String email = entrada.nextLine();
//        System.out.println("Ingresar telefono");
//        String telefono = entrada.nextLine();
//        Persona personaNueva = new Persona(nombre, apellido, email, telefono);
//        personaDao.insertar(personaNueva);
//actualizar
//        Persona personaNueva = new Persona(1, "Zabdiel", "Hernan", "jona@gmail.com", "88779955");
//        personaDao.actualizar(personaNueva);
//eliminar
//        Persona personaNueva = new Persona(4);
//        personaDao.eliminar(personaNueva);
////listar
//        List<Persona> personas = personaDao.seleccionar();
//        personas.forEach(persona
//                -> {
//            System.out.println("Persona: " + persona);
//        });
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDAO = new PersonaDAO(conexion);

            Persona cambiopersona = new Persona();
            cambiopersona.setIdPersona(2);
            cambiopersona.setNombre("Chepe Mario");
            cambiopersona.setApellido("Hernandez");
            cambiopersona.setEmail("mario@gmail.com");
            cambiopersona.setTelefono("22445522");
            personaDAO.actualizar(cambiopersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Jose");
            nuevaPersona.setApellido("Alvarado");
            personaDAO.insertar(nuevaPersona);

            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollBack");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }

    }
}
