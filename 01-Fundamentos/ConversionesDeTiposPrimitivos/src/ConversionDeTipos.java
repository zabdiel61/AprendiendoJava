
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author zabdiel
 */
public class ConversionDeTipos {

    public static void main(String[] args) {
        //convertir tipo String a un tipo int
        var edad = Integer.parseInt("20"); //21
        //var edad = "20"; // 201
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //pedir un valor
        Scanner entrada = new Scanner(System.in);
        System.out.println("proporciona tu edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("tu edad es de = " + edad);

        //convertir de int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(0); //regresa solo un caracter
        System.out.println("caracter = " + caracter);

        System.out.println("proporciona un caracter");
        caracter = entrada.nextLine().charAt(0);// solo recuperar el primer caracter
        System.out.println("caracter = " + caracter);
    }
}
