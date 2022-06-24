/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.com.zabdieldev.peliculas.datos;

import java.io.*;

import java.util.*;

import sv.com.zabdieldev.peliculas.domain.Pelicula;
import sv.com.zabdieldev.peliculas.excepciones.*;

/**
 *
 * @author jonat
 */
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        //creamos un archivo segun el nombre enviado por el metodo
        var archivo = new File(nombreRecurso);
        //comprobamos si existe el archivo y devolvemos si es true o false
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        //verificamos el archivo
        var archivo = new File(nombreRecurso);
        //se instancia un objeto de tipo lista de objetos Pelicula
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            //nos apoyamos de buffer por que File no lee lineas completas
            var entrada = new BufferedReader(new FileReader(archivo));
            //Definimos la variable de lectula para cada linea del archivo
            String linea = entrada.readLine();
            //while, marcara true si la variable linea es distinto a null, 
            //es decir si llega a la ultima linea del archivo sin contenido
            while (linea != null) {
                //instanciamos un objeto tipo pelicula 
                //y le asignamos la linea al atributo nombre del constructor
                Pelicula pelicula = new Pelicula(linea);
                //agregamos el todos los objetos pelicula a la lista
                peliculas.add(pelicula);
                //pasamos a la siguiente linea hasta que el while marque false
                linea = entrada.readLine();
            }
            //terminamos
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar Peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar Peliculas: " + ex.getMessage());
        }
        //retornamos la lista peliculas
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        //archivo
        var archivo = new File(nombreRecurso);

        try {
            //indicamos variable salida para mandar informacion al archivo
            //y ademas pasamos el segundo argumento para indicar que vamos a anexar informacion
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            //anexamos la informacion imprimiendo una nueva linea
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo" + pelicula.getNombre());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion en escribir Peliculas: " + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        //archivo
        var archivo = new File(nombreRecurso);

        //variable para almacenar resultado si la pelicula existe
        String resultado = null;

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            //variable que almacenara el indice de cada linea
            var indice = 1;
            while (linea != null) {
                //si buscar es distinto a null
                //y si buscar es igual al contenido de la linea del indice 
                //ya sea en mayusculas o minusculas entonces entra al if
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "La pelicula encontrada " + linea + " econtrada en el indice " + indice;
                    break;
                }
                //pasamos a la siguiente linea
                linea = entrada.readLine();
                //incrementamos el indice hasta encontrar y para el while
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar Peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar Peliculas: " + ex.getMessage());
        }

        //en caso de no encontrarse retornamos la variable resultado
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);

        try {
            var salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("el archivo: " + nombreRecurso + " se ha creado correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Excepcion en creacion de archivo: " + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) {
        var archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("se ha borrado el archivo: " + nombreRecurso);
        }
    }

}
