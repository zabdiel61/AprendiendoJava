/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class PruebaCaja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int ancho, alto, profundo;
        
        System.out.println("Ingrese los datos de la caja");
        System.out.println("ingrese el ancho de la caja: ");
        ancho = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese el alto de la caja: ");
        alto = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese la profundidad de la caja: ");
        profundo = Integer.parseInt(entrada.nextLine());
        
        Caja caja = new Caja(ancho, alto, profundo);
        
        System.out.println("el volumen de la caja es de: " + caja.calcularVolumen());
    }
}
