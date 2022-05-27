/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

import com.zd.mundopc.*;

/**
 *
 * @author jonat
 */
public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("Acer", 24);
        Teclado teclado1 = new Teclado("usb", "logitech");
        Raton raton1 = new Raton("USB", "Fintech");
        Computadora computadora1 = new Computadora("Acer", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
        
        System.out.println("********************");
        
        Monitor monitor2 = new Monitor("Samsumg", 28);
        Teclado teclado2 = new Teclado("vga", "logitech");
        Raton raton2 = new Raton("USB", "razer");
        Computadora computadora2 = new Computadora("HP", monitor2, teclado2, raton2);
        
        Orden orden2 = new Orden();
        
        orden2.agregarComputadora(computadora1);
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();
    }
}
