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

        aritmetica1.a = 2;
        aritmetica1.b = 3;
        aritmetica1.sumar();

        int resul = aritmetica1.sumarConRetorno();
        System.out.println("resul desde el otro metodo = " + resul);

    }
}
