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
public class testArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2]; 
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Zabdiel");
        
        System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas = "+ i + " " + personas[i]);
        }
    }
}
