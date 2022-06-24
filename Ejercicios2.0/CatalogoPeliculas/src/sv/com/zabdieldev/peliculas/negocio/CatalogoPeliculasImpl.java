/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.zabdieldev.peliculas.negocio;

import sv.com.zabdieldev.peliculas.datos.AccesoDatosImpl;
import sv.com.zabdieldev.peliculas.datos.IAccesoDatos;
import sv.com.zabdieldev.peliculas.domain.Pelicula;
import sv.com.zabdieldev.peliculas.excepciones.AccesoDatosEx;


/**
 *
 * @author jonat
 */
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos iAccesoDatos;

    public CatalogoPeliculasImpl() {
        this.iAccesoDatos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = iAccesoDatos.existe(NOMBRE_RECURSO);
            iAccesoDatos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de Acceso a datos");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = iAccesoDatos.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas) {
                System.out.println("pelicula: " + pelicula.getNombre());
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {

            resultado = iAccesoDatos.buscar(NOMBRE_RECURSO, buscar);

        } catch (AccesoDatosEx ex) {
            System.out.println("Error en acceso a datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.iAccesoDatos.existe(NOMBRE_RECURSO)) {
                iAccesoDatos.borrar(NOMBRE_RECURSO);
                iAccesoDatos.crear(NOMBRE_RECURSO);
            } else {
                iAccesoDatos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }

}
