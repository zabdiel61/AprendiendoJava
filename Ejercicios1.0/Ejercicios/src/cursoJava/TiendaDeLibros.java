/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoJava;

import java.util.Scanner;

/**
 *
 * @author zabdiel
 */
public class TiendaDeLibros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido a esta tienda de libros");
        System.out.println("a continuacion introduce los datos del libro");
        System.out.println("Nombre: ");
        var nombre = entrada.nextLine();
        System.out.println("id: ");
        var id = entrada.nextLine();
        System.out.println("precio: ");
        var precio = Double.parseDouble(entrada.next());
        System.out.println("prorporciona el envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        
    }
    
}
