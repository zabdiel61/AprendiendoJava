/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;

/**
 *
 * @author jonat
 */
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 =  new Empleado("Zabdiel", 5000);
        Empleado empleado2 =  new Empleado("Zabdiel", 5000);
        
        if (empleado1 == empleado2) {
            System.out.println("tienen la misma referencia en memoria");
        } else {
            System.out.println("tienen distinta referencia en memoria");
        }
        
        if (empleado1.equals(empleado2)) {
            System.out.println("Los Objetos son iguales en contenido");
        } else {
            System.out.println("los objetos son distintos en contenido");
        }
        
        
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("el valor has code es igual");
        } else {
            System.out.println("el valor hash code es distinto");
        }
       
        
    }
}
