/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author zabdiel
 */
public class Aritmetica {

    //atributos de nuestra clase
    int a;
    int b;

    //    constructor vacio
    public Aritmetica() {
        System.out.println("ejecutando constructor");
    }
    
    public Aritmetica(int a, int b){
        System.out.println("ejecutando constructor con argumentos");
        this.a = a;
        this.b = b;
    }

    //Metodo
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return sumarConRetorno();
    }
}
