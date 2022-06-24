/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author jonat
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Zabdiel", 1000);
        deterneminarTipo(empleado1);
        System.out.println("********");
        empleado1 = new Gerente("Karla", 10000, "Administracion");
        deterneminarTipo(empleado1);

    }

    public static void deterneminarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
//            Gerente gerente = (Gerente) empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("gerente = " + ((Gerente) empleado).getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
            //error en tiempo de ejecucion
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("es de tipo Object");
        }
    }
}
