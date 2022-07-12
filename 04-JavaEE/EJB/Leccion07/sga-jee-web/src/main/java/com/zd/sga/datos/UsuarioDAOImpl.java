/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.datos;

import com.zd.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jonat
 */
@Stateless
public class UsuarioDAOImpl implements UsuarioDAO {

    //implementamos la unidad de persistencia
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario findUsuarioByUsername(Usuario usuario) {
        return null;
    }

    @Override
    public void insertUsuario(Usuario usuario) {
    }

    @Override
    public void updateUsuario(Usuario usuario) {
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
    }

}
