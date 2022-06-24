/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author jonat
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dias.LUNES : " + Dias.LUNES);
//        
//        indicarDiaDeLaSemana(Dias.LUNES);

        System.out.println("Continente no. 4 : " + Continentes.AMERICA);
        System.out.println("No. paises en el 4to continente: " + Continentes.AMERICA.getPaises());
    }
    
    private static void indicarDiaDeLaSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
