/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author jonat
 */
public class UsuarioCRUD {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //insertar
        Usuario usuario = new Usuario("jon", "mon07");
        Usuario usuarioNuevo = new Usuario("jon", "mon07");
        var numResgistros = usuarioDAO.insertar(usuario);
        numResgistros += usuarioDAO.insertar(usuarioNuevo);
        System.out.println("numResgistros = " + numResgistros);
        //actualizar
//        Usuario usuario = new Usuario(2, "Jonathan", "mono008");
//        usuarioDAO.actualizar(usuario);
//        Usuario usuario = new Usuario(2);
//        usuarioDAO.borrar(usuario);
        //listar
        List<Usuario> usuarios = usuarioDAO.listar();
        for (var user : usuarios) {
            System.out.println(user);
        }
    }
}
