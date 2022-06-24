package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonat
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);

        } catch(OperacionExcepcion e)  {
            System.out.println("Ocurrio un error de tipo Operacion Exepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exeption: ");
            e.printStackTrace(System.out);//imprimir la pila de excepciones
            e.getMessage();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("resultado = " + resultado);

    }
}
