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
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Zabdiel");
        Persona persona2 = new Persona("Jonathan");
        
        imprimir(persona1);
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
