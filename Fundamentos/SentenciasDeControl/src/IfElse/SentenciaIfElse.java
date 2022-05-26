/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElse;

/**
 *
 * @author zabdiel
 */
public class SentenciaIfElse {
    public static void main(String[] args) {
        var condicion = true;
        
        if (condicion) {
            System.out.println("condi verdadera");
        } else {
            System.out.println("condi falsa");
        }
        
        var num = 2;
        var numTexto= "";
        
        if (num == 1) {
            numTexto = "numero Uno";
        } else if (num == 2) {
            numTexto = "numero Dos";
        } else if (num == 3) {
            numTexto = "numero Tres";
        } else if (num == 4) {
            numTexto = "numero Cuatro"; 
        } else{
            numTexto = "numero no encontrado";
        }
        
        System.out.println("numTexto = " + numTexto);
    }
}
