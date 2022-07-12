/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.servicio;

import com.zd.sga.datos.UsuarioDAO;
import com.zd.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jonat
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.findAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario encontrarUsuarioPorUsername(Usuario usuario) {
        return null;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
    }

}
