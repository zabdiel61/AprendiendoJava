/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.www.servicio;

import com.zd.www.dao.PersonaDAO;
import com.zd.www.domain.Persona;
import java.util.List;

/**
 *
 * @author jonat
 */
public class ServicioPersonas {

    PersonaDAO personaDAO;

    public ServicioPersonas() {
        this.personaDAO = new PersonaDAO();
    }

    public List<Persona> listarPersonas() {
        return this.personaDAO.listar();
    }
}
