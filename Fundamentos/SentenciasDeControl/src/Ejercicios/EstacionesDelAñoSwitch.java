/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author zabdiel
 */
public class EstacionesDelAñoSwitch {
    public static void main(String[] args) {
        var mes = 1;
        var estacion = "estacion desoncida";
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "invierno"; 
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("estacion = " + estacion);
    }
}
