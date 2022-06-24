/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import sv.com.zabdieldev.peliculas.negocio.CatalogoPeliculasImpl;
import sv.com.zabdieldev.peliculas.negocio.ICatalogoPeliculas;

/**
 *
 * @author jonat
 */
public class Main {

    public static void main(String[] args) {
        var opcion = -1;
        Scanner entrada = new Scanner(System.in);
        ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion");
            System.out.println("1. Iniciar Catalogo de peliculas");
            System.out.println("2. Agregar Pelicula");
            System.out.println("3. Listar Peliculas");
            System.out.println("4. Buscar Pelicula");
            System.out.println("0. Salir");

            System.out.println("Escribe una de las opciones");
            //a diferiencia de los demas metodos next es 
            //que nextLine consume todo, hasta el salto de linea
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    catalogoPeliculas.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la pelicula a registrar");
                    var nombrePelicula = entrada.nextLine();
                    catalogoPeliculas.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la pelicula a buscar");
                    var buscar = entrada.nextLine();
                    catalogoPeliculas.buscarPelicula(buscar);
                    break;
                default:
                    System.out.println("Saliste del programa");
            }
        }
    }
}
