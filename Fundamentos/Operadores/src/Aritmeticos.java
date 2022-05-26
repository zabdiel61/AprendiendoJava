/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class Aritmeticos {
    public static void main(String[] args) {
        //operadores aritmeticos
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion= " + resultado);
        
        var resultado2 = 3D / b;
        System.out.println("resultado division= " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado = " + resultado);
        
        //par o impar
        if (b % 2 == 0) {
            System.out.println("es un numero par");
        } else  {
            System.out.println("es numero impar");
        }
     }
}
