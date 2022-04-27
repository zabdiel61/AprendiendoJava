/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author jonat
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 2; //por default es 0
        aritmetica1.b = 3;
        aritmetica1.sumar();

        int resul = aritmetica1.sumarConRetorno();
        System.out.println("resul desde el otro metodo = " + resul);
        
        int sunaArgumentos = aritmetica1.sumarConArgumentos(4, 4);
        System.out.println("sunaArgumentos = " + sunaArgumentos);
        
        Aritmetica aritmetica2 = new Aritmetica(1, 5);
        
        aritmetica2.sumar();

    }
}
