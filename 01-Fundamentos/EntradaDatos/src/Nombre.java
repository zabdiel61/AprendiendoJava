
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class Nombre {
    public static void main(String[] args) {
        System.out.println("escribe tu nombre");
        Scanner entrada = new Scanner(System.in);
        var nombre = entrada.nextLine();
        System.out.println("tu nombre es = " + nombre);
    }
}
