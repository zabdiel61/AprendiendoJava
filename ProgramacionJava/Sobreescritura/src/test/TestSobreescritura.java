/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author jonat
 */
public class TestSobreescritura {

    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Zabdiel", 100, "Contabilidad");
//        
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        Empleado empleado1 = new Empleado("Zabdiel", 1000);
        imprimir(empleado1);
//        System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        empleado1.obtenerDetalles();
        
        Gerente gerente2 = new Gerente("Karla", 10000, "Administracion");
        imprimir(gerente2);
//        System.out.println("gerente2 = " + gerente2.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
}
