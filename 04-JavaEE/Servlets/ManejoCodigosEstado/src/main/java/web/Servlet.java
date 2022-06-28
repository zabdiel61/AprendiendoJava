/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author jonat
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Simular los valores correctos
        String usuarioOk = "juan";
        String passwordOk = "123";

        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        if (usuarioOk.equals(usuario) && passwordOk.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>password: " + password);
            out.print("</h1>");
        }else{
            resp.sendError(resp.SC_UNAUTHORIZED, "las credenciales son incorrectas");
        }
        out.close();
    }

}
