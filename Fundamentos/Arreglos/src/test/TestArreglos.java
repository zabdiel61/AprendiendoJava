/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonat
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        
//        edades[3] = 5;
        
        for (int i = 0; i < edades.length; i++) {
            var resultado = edades[i];
            System.out.println("resultado = " + i + " :" + resultado);
        }
        
        String frutas[] = {"manzana", "platano", "uva", "durazno"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
