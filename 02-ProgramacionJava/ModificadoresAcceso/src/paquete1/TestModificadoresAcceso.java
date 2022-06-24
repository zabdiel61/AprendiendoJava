/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author jonat
 */
public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();

//        System.out.println("clase1 = " + clase1.atributoPublico);
//        
//        clase1.metodoProtected();
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
}
