package test;

import domain.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonat
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades[] =  {5, 6, 8};
        
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Zabdiel"), new Persona("Jonathan"), new Persona("Zabjon")};
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
