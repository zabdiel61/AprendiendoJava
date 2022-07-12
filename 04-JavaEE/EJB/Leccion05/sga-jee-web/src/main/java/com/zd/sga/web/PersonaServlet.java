package com.zd.sga.web;

import com.zd.sga.domain.Persona;
import com.zd.sga.servicio.PersonaService;
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
@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("Imprimimos nuestra variable persona: " + personas);
        req.setAttribute("personas", personas);
        req.getRequestDispatcher("/listadoPersonas.jsp").forward(req, resp);
    }
    
}
