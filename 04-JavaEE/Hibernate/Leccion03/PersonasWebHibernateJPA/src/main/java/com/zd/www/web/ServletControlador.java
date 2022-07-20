/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zd.www.web;

import com.zd.www.domain.Persona;
import com.zd.www.servicio.ServicioPersonas;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicioPersonas servicioPersonas = new ServicioPersonas();

        List<Persona> personas = servicioPersonas.listarPersonas();

        req.setAttribute("personas", personas);

        req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
    }

}
