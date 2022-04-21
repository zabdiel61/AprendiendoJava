/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author zabdiel
 */
public class InferenciaDeTipos {
    
    public static void main(String[] args) {
        var numeroEntero = 10; // aunque sea con va si es entero sera tipo int
        System.out.println("numeroEnetero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F; //sino se le pone la F al final sera de tipo double
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
