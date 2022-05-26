/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dominio.*;

/**
 *
 * @author jonat
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Zabdiel", 5000.00, false);
        persona1.setNombre("Jonathan");
//        System.out.println(persona1.getNombre());
//        System.out.println(persona1.getSueldo());
//        System.out.println(persona1.isEliminado());
//        System.out.println(persona1.toString());
        System.out.println("persona1 = " + persona1);
    }
}
