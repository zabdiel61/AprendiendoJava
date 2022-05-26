/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

/**
 *
 * @author zabdiel
 */
public class CicloDoWhile {
    public static void main(String[] args) {
        var contador = 0;
        
        do {            
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
    }
}
