/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zd.sga.servicio;

import com.zd.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jonat
 */
@Local
public interface UsuarioService {

    public List<Usuario> listarUsuarios();

    public Usuario encontrarUsuarioPorId(Usuario usuario);

    public Usuario encontrarUsuarioPorUsername(Usuario usuario);

    public void registrarUsuario(Usuario usuario);

    public void modificarUsuario(Usuario usuario);

    public void eliminarUsuario(Usuario usuario);
}
