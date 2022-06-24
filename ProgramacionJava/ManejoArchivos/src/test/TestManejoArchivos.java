/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import static manejoarchivos.ManejoArchivos.anexarArchivo;
import static manejoarchivos.ManejoArchivos.leerArchivo;

/**
 *
 * @author jonat
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
//        crearArchivo(nombreArchivo);
//            escribirArchivo(nombreArchivo, "Hola");

//        anexarArchivo(nombreArchivo, "Hola Mundo");
//        anexarArchivo(nombreArchivo, "adios");
        leerArchivo(nombreArchivo);
    }
}
