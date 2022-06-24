/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jonat
 */
public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];  //renglones - columnas
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 6;
        edades[1][0] = 7;
        
        System.out.println("edades = " + edades[0][1]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades = " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }
        
        System.out.println("********************************");
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "uva", "zanahoria"}};

//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas = " + i + "-"+ j + ": "+ frutas[i][j]);
//            }
//        }
        imprimir(frutas);
    }
    
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz = " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}
