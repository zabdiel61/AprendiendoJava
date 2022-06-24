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
public class TestFinal {

    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        System.out.println(Persona.CONSTANTE);

        final Persona persona1 = new Persona();
//        persona1= new Persona();
        persona1.setNombre("Jona");
        
        System.out.println("persona1 = " + persona1.getNombre());
    }
}
