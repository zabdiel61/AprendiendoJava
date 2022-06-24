/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class Ternario {

    public static void main(String[] args) {
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "numero es par" : "numero es impar";
        System.out.println("resultado = " + resultado);
    }
}
