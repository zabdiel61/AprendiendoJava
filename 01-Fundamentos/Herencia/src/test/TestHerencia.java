/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author jonat
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Zabdiel", 500.0);
        
        System.out.println("empleado1 = " + empleado1);
        
        Empleado empleado2 = new Empleado("Jona", 500.0);
        
        System.out.println("empleado2 = " + empleado2);
//        
        Date fecha = new Date();
//        
//        Cliente cliente1 = new Cliente("Jonathan", fecha, true);
//        
//        System.out.println("cliente1 = " + cliente1);
//        
        Cliente cliente2 = new Cliente(fecha, true, "Boris", 'M', 18, "Col Los Naranjos");
        
        System.out.println("cliente2 = " + cliente2);
        
        Cliente cliente3 = new Cliente(fecha, false, "Karla", 'F', 18, "Col Los Naranjos");
        
        System.out.println("cliente3 = " + cliente3);
    }
}
