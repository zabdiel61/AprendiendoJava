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
public class Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("proporciona el alto: ");
        var alto = Integer.parseInt(entrada.nextLine());
        System.out.println("proporciona el ancho: ");
        var ancho = Integer.parseInt(entrada.nextLine());
        
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
