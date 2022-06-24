/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author zabdiel
 */
public class MayorDeDosNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("proporciona el numero 1: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("proporciona el numero 2 ");
        var num2 = Integer.parseInt(entrada.nextLine());
        
        var resultado = num1 > num2 ? "el numero mayor es: " + num1 : "el numero mayor es: " + num2;
        
        System.out.println("resultado = " + resultado);
    }
}
