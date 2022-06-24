/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonat
 */
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolventes  de tipos primitivos 
        
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        se uitlizan en lugar de los primitivos porque las clases 
        contienen atributos y metodos a diferiencia de los tipos 
        primitivos solamente almacenan un valor pero no tienen ni 
        atributos ni metodos
        */
        
        Integer entero = 10;//AutoBoxing
        
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2 = entero; // Unboxing
        System.out.println("entero2 = " + entero2);
        
    }
}
