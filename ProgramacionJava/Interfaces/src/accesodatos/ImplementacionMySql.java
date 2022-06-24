/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author jonat
 */
public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }

}
