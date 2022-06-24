/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author jonat
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5.0, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5, 2);
        System.out.println("resultado = " + resultado2);
        
        var resultado3 = Operaciones.sumar(6, 6L);       
        System.out.println("resultado3 = " + resultado3);
    }
}
