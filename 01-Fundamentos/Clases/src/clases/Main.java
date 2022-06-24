/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author zabdiel
 */
public class Main {
    public static void main(String[] args) {
        Persona person = new Persona();
        
        person.nombre = "zabdiel";
        person.ocupacion = "vendedor";
        
        person.desplegarInformacion();
        
        Persona person2 = new Persona();
        
        System.out.println(person2);
        System.out.println(person);
        
        person2.desplegarInformacion();
    }
}
