/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.sga.web;

import com.zd.sga.domain.Usuario;
import com.zd.sga.servicio.UsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonat
 */
@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {

    @Inject
    UsuarioService usuarioService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        System.out.println("Imprimimos nuestra variable usuario: " + usuarios);
        req.setAttribute("usuarios", usuarios);
        req.getRequestDispatcher("/listadoUsuarios.jsp").forward(req, resp);
    }

}
