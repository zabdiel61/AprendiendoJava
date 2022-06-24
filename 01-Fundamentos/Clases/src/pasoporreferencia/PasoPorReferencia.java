/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author jonat
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre = "Zabdiel";
        
        System.out.println("persona1 = " + persona1.nombre);
        
        cambiaValor(persona1);
        System.out.println("persona1 = " + persona1.nombre);
    }
    
    public static void cambiaValor(Persona persona){
        persona.nombre = "Jonathan";
    }
}
