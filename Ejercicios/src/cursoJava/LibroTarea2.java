/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro.tarea.pkg2;

import java.util.Scanner;

/**
 *
 * @author zabdiel
 */
public class LibroTarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        var titulo = "";
        var autor = "";
        
        System.out.println("Proporcione el titulo");
        titulo = entrada.nextLine();
        System.out.println("Proporcione el autor");
        autor = entrada.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
        
    }
    
}
