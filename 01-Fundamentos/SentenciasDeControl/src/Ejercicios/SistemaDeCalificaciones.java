/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author zabdiel
 */
public class SistemaDeCalificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introdoce un valor entre 0 y 10");
        int valor = Integer.parseInt(entrada.nextLine());
        
        if (valor >= 9 && valor <= 10) {
            System.out.println("A");
        } else if (valor >= 8 && valor < 9) {
            System.out.println("B");
        } else if (valor >= 7 && valor < 8) {
            System.out.println("C");
        } else if (valor >= 6 && valor < 7) {
            System.out.println("D");
        } else if (valor >= 0 | valor < 6) {
            System.out.println("F");
        } else {
            System.out.println("valor desconocido");
        }
    }

}
