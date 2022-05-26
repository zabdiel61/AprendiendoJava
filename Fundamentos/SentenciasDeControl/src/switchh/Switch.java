/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchh;

/**
 *
 * @author zabdiel
 */
public class Switch {
    public static void main(String[] args) {
        var num = 3;
        var numText = "valor no encontrado";
        
        switch (num) {
            case 1:
                numText = "numero uno";
                break;
            case 2:
                numText = "numero dos";
                break;
            default:
                numText = "Caso no encontrado";
        }
        
        System.out.println("numText = " + numText);
    }
}
