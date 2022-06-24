/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zabdiel
 */
public class Precedencia {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        
        var resultado = 4+5*6/3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6/ 3; // 54
        System.out.println("resultado = " + resultado);
    }
}
