/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author jonat
 */
public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Zabdiel", 1000, TipoEscritura.CLASICO);

//        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());

        //DownCasting
        ((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        //upcasting, no es necesario hacer la conversion explicita
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());

    }
}
