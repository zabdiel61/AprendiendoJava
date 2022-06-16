/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package argumentosvariables;

/**
 *
 * @author jonat
 */
public class TestArgumentos {
    public static void main(String[] args) {
        imprimirNumeros(3, 4);
        imprimirNumeros(5);
        
        variosParametros("Zabdiel", 2, 4);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento : " + numeros[i]);
        }
    }
}
