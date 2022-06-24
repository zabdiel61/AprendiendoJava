/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;
import java.util.Scanner;

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
        Persona personaNueva = new Persona(4);
        personaDao.eliminar(personaNueva);
//listar
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona
                -> {
            System.out.println("Persona: " + persona);
        });
        
    }
}
