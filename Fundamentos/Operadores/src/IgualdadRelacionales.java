/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class IgualdadRelacionales {

    public static void main(String[] args) {
        var a = 2;
        var b = 3;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena1 = "hola";
        var cadena2 = "hola";
        var e = cadena1 == cadena2; // se compara la referencia de memoria del objeto

        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2); // si es igual en contenido

        System.out.println("f = " + f);

        var g = a >= b;
        System.out.println("g = " + g);

        if (a % b == 0) {
            System.out.println("es numero par");
        } else {
            System.out.println("es numero impar");
        }

        var edad = 20;
        var adulto = 18;

        if (edad >= adulto) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
    }
}
