/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author jonat
 */
public class TestJavaBeans {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Zabdiel");
        persona.setApellido("Hernandez");
        
        System.out.println("persona = " + persona);
    }
}
