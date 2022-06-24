/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

/**
 *
 * @author zabdiel
 */
public class BreakyContinue {
    public static void main(String[] args) {
//        for (var contador = 0; contador < 10; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }
        
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                continue; //saltar a la siguiente iteracion
            }
            System.out.println("contador = " + contador);
        }
    }
}
