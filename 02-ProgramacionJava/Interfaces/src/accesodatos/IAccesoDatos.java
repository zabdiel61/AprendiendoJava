/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package accesodatos;

/**
 *
 * @author jonat
 */
public interface IAccesoDatos {

    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
