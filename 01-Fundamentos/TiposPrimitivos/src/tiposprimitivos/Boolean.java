/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author zabdiel
 */
public class Boolean {
    public static void main(String[] args) {
        //tipos Boolean
        boolean varBollean = false;
        System.out.println("varBollean = " + varBollean);
        
        if (varBollean) {
            System.out.println("es verdadero"); //boolean se les conoce como bandera
        } else{
            System.out.println("es falso");
        }
        
        var edad  = 17;
        //var esAdulto = edad >= 18; //regresara un boolean
        
        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }
    }
}
