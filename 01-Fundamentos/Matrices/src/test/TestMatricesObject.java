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
public class TestMatricesObject {
    public static void main(String[] args) {
        Persona personas[][] = new Persona[2][2];
        personas[0][0] = new Persona("Zabdiel");
        personas[0][1] = new Persona("Boris");
        personas[1][0] = new Persona("Jonathan");
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz = " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}
