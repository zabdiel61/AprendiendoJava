/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zd.sga.datos;

import com.zd.sga.domain.Usuario;
import java.util.List;

/**
 *
 * @author jonat
 */
public interface UsuarioDAO {

    public List<Usuario> findAllUsuarios();

    public Usuario findUsuarioById(Usuario usuario);

    public Usuario findUsuarioByUsername(Usuario usuario);

    public void insertUsuario(Usuario usuario);

    public void updateUsuario(Usuario usuario);

    public void deleteUsuario(Usuario usuario);

}
