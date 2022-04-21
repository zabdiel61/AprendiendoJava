/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author zabdiel
 */
public class Char {
    public static void main(String[] args) {
        //tipo char
        char micaracter = 'a';
        System.out.println("micaracter = " + micaracter);
        
        char varChar = '\u0025'; // con la pleca y u indicamos que se usara el unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varChar = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //tipo var
        var mivarcaracter = 'a';
        System.out.println("micaracter = " + mivarcaracter);
        
        var varvarChar = '\u0025';
        System.out.println("varChar = " + varvarChar);
        
        var varvarCharDecimal = 33; // lo hara de tipo int a menos que se haga una conversion (char)
        System.out.println("varChar = " + varvarCharDecimal);
        
        var varvarCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varvarCharSimbolo);
        
        //int si soporta valores de tipo char
        int miVariableEnteraSimbolo = '!';
        System.out.println("miVariableEnteraSimbolo = " + miVariableEnteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
    }
    
}
